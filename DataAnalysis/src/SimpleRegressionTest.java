import org.apache.commons.math3.stat.regression.SimpleRegression;

public class SimpleRegressionTest {
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

        // trying to run model for unknown data
        System.out.println("Prediction for 30= " + simpleRegression.predict(30));
        //System.out.println("Significance: "+simpleRegression.getSignificance());
        System.out.println("Slope Standard Error: "+simpleRegression.getSlopeStdErr());
        System.out.println("Slope 95% Confidence Interval: "+simpleRegression.getSlopeConfidenceInterval());
        System.out.println("Slope 99% Confidence Interval: "+simpleRegression.getSlopeConfidenceInterval(0.01));
    }
}
