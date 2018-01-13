package weather;

import org.apache.commons.math3.stat.regression.SimpleRegression;

public class SnowDayPrediction {
    public static void main(String[] args) {

        // creating regression object, passing true to have intercept term
        SimpleRegression simpleRegression = new SimpleRegression(true);

        // passing data to the model
        // model will be fitted automatically by the class 
        simpleRegression.addData(new double[][] {
        	{30	,100},
        	{50	,100},
        	{26	,100},
        	{37	,100},
        	{38	,100},
        	{30	,100},
        	{48	,100},
        	{27	,100},
        	{26	,100},
        	{24	,100},
        	{27	,100},
        	{27	,100},
        	{29	,100},
        	{30	,100},
        	{40	,100},
        	{28	,100},
        	{25	,100},
        	{26	,100},
        	{36	,100},
        	{32	,100},
        	{31	,100},
        	{25	,100},
        	{36	,100},
        	{10	,0},
        	{9	,0},
        	{8	,0},
        	{7	,0},
        	{6	,0},
        	{5	,0},
        	{4	,0},
        	{3	,0}
        });
        
        // querying for model parameters
        //System.out.println("slope = " + simpleRegression.getSlope());
        //System.out.println("intercept = " + simpleRegression.getIntercept());

        String cityIdSyracuse = "5140405";
        String cityIdNashua = "5090046";
		WeatherData weatherData = WeatherQuery.getForecastWeatherForSchool(cityIdNashua);
		
		System.out.println("\nForcast Weather Summary: ");
		System.out.println("School Starts: "+weatherData.getTime());
		System.out.println("Temp: "+String.format( "%.2f", weatherData.getTemp())+" \u00b0F");
		System.out.println("Wind: "+String.format( "%.2f", weatherData.getWindSpeed())+" mph");
		System.out.println("Weather: "+weatherData.getSnowCondition());
		System.out.println("Snow: "+String.format( "%.2f", weatherData.getSnowVolume())+" mm/3h");
        
        
        // trying to run model for unknown data
        System.out.println("\nSchool Closing Chance: " + String.format( "%.2f", simpleRegression.predict(calculateScore(weatherData))) + "%");
        //System.out.println("Significance: "+simpleRegression.getSignificance());
        System.out.println("Slope Standard Error: "+String.format( "%.2f", simpleRegression.getSlopeStdErr()));
        System.out.println("Slope 95% Confidence Interval: "+String.format( "%.2f", simpleRegression.getSlopeConfidenceInterval()));
        System.out.println("Slope 99% Confidence Interval: "+String.format( "%.2f",simpleRegression.getSlopeConfidenceInterval(0.01)));
    }
    
    private static int calculateScore(WeatherData weatherData) {
    	double temp = weatherData.getTemp();
    	double wind = weatherData.getWindSpeed();
    	double snow = weatherData.getSnowVolume();
    	String snowContition = weatherData.getSnowCondition();
    	
    	int snowScore = 0;
    	if(snowContition.equals("light snow")) {
    		if(snow > 1) {
    			snowScore = 1;
    		}
    	}
    	else if(snowContition.equals("snow")) {
    		snowScore = 2;
    	}else if(snowContition.equals("heavy snow")) {
    		snowScore = 3;
    	}
    	
    	int tempScore = 0;
    	if(temp < 10) {
    		tempScore = 4;
    	}else if(temp >= 10 && temp < 20) {
    		tempScore = 3;
    	}else if(temp >= 20 && temp < 30) {
    		tempScore = 2;
    	}else if(temp >= 30) {
    		tempScore = 1;
    	}
    	
    	int windScore = 0;
    	if(wind < 1) {
    		windScore = 1;
    	}else if(wind >= 1 && wind < 5) {
    		windScore = 2;
    	}else if(wind >= 5 && wind < 10) {
    		windScore = 3;
    	}else if(wind >= 10) {
    		windScore = 4;
    	}
    	
    	return snowScore*10 + tempScore*2 + windScore;
    }
}
