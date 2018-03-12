package weather;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map.Entry;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class WeatherQuery {

	public static WeatherData getForecastWeather(String cityId, Date currTime, int hoursAhead) {
		WeatherData weatherData = new WeatherData(cityId);
		weatherData.setCurrTime(currTime.toString());
		weatherData.setHoursAhead(hoursAhead);
		weatherData.addInfo("Current Time: "+ weatherData.getCurrTime() +" -> Approximately " + weatherData.getHoursAhead() +" Hours Ahead");
		weatherData.addInfo("--------------------------------------------------------------------------");
		try {
			String url = "http://api.openweathermap.org/data/2.5/forecast/?id="+cityId+"&appid=55392635d8d4537554a7817c85e25d24";
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);
	
			InputStream inputStream = response.getEntity().getContent();
	
			JsonReader reader = Json.createReader(inputStream);
			JsonObject jsonObj = reader.readObject();
			JsonValue jsonValue = jsonObj.get("list");
			int index = hoursAhead/3;
			if(index == 0) {
				index = 1;
			}
			
		 	if(jsonValue.getValueType() == JsonValue.ValueType.ARRAY) {
		 		for(int i=index-1; i<=index+2; i++){ // 9-12 hour range, set the greatest values
			 		JsonValue hourlyValue = ((JsonArray) jsonValue).get(i);
			 		if(hourlyValue.getValueType() == JsonValue.ValueType.OBJECT) {
			 			for (Entry<String, JsonValue> nextEntry : ((JsonObject) hourlyValue).entrySet()) {
			 				String key = nextEntry.getKey();
			 				JsonValue fieldValue = nextEntry.getValue();
			 				if(key.equals("dt")) {
			 					Date date = new Date(Long.parseLong(fieldValue.toString())*1000L);
			 					if(date.toString().contains("07:00:00") || date.toString().contains("08:00:00")) {
			 						weatherData.setTime(date.toString());
			 						weatherData.addInfo("\nSchool Time: "+ weatherData.getTime());
			 					}else {
			 						weatherData.addInfo("\nOther time: "+date.toString());
			 					}
			 				}
			 				if(key.equals("weather")) {
			 					JsonValue weatherValue = ((JsonArray) fieldValue).get(0);
			 					for (Entry<String, JsonValue> weatherEntry : ((JsonObject) weatherValue).entrySet()) {
					 				String weatherFieldKey = weatherEntry.getKey();
					 				JsonValue weatherFieldValue = weatherEntry.getValue();
					 				if(weatherFieldKey.equals("description")) {
					 					String snowCondition = weatherFieldValue.toString();
					 					weatherData.setSnowCondition(snowCondition);
					 					weatherData.addInfo("Weather: "+ snowCondition);
					 					break;
					 				}
			 					}
			 				}
			 				if(key.equals("main") || key.equals("wind") ||  key.equals("snow")) {
			 					for (Entry<String, JsonValue> nextEntry2 : ((JsonObject) fieldValue).entrySet()) {
			 						if(nextEntry2.getKey().equalsIgnoreCase("temp")) {
			 							double temp = (Double.parseDouble(nextEntry2.getValue().toString())-273)*9/5+32; //convert from Kelvin to Fahrenheit
			 							weatherData.setTemp(temp);
			 							weatherData.addInfo("Temp: "+  String.format( "%.2f", temp) +" \u00b0F");
			 						}
			 						else if(nextEntry2.getKey().equalsIgnoreCase("speed")) {
			 							double windSpeed = Double.parseDouble(nextEntry2.getValue().toString())*3600/1609.34;
			 							weatherData.setWindSpeed(windSpeed);
			 							weatherData.addInfo("Wind: "+ String.format( "%.2f", windSpeed) + " mph");
			 						}
			 						else if(nextEntry2.getKey().equalsIgnoreCase("3h")) {
			 							double snowVolume = Double.parseDouble(nextEntry2.getValue().toString());
			 							weatherData.setSnowVolume(snowVolume);  
			 							weatherData.addInfo("Snow: "+ String.format( "%.02f", snowVolume)+ " mm/3h");
			 						}	
			 					}
			 				}	
			 			}
			 		}
		 		}
		 	}
		}catch(Exception e) {
			System.out.println("Error getting the weather data. "+e.getMessage());
		}
		return weatherData;
	}
	
	public static WeatherData getForecastWeatherForSchool(String cityId) {
		Calendar rightNow = Calendar.getInstance();
		int hour = rightNow.get(Calendar.HOUR_OF_DAY);
		int hoursAhead = 24 - hour + 7;
		if(hour < 7) {
			hoursAhead = 7 - hour;
		}
		return getForecastWeather(cityId, rightNow.getTime(), hoursAhead);
	}
	
	public static WeatherData getCurrentWeather(String cityId) {
		Calendar rightNow = Calendar.getInstance();
		Date currTime = rightNow.getTime();
		WeatherData weatherData = new WeatherData(cityId);
		weatherData.setCurrTime(currTime.toString());
		weatherData.addInfo("\nCurrent Time: "+ weatherData.getCurrTime());

		try {
			String url = "http://api.openweathermap.org/data/2.5/weather/?id="+cityId+"&appid=55392635d8d4537554a7817c85e25d24";
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);
	
			InputStream inputStream = response.getEntity().getContent();
	
			JsonReader reader = Json.createReader(inputStream);
			JsonObject jsonObj = reader.readObject();
			
			JsonValue jsonValue0 = jsonObj.get("weather");
			JsonValue weatherValue = ((JsonArray) jsonValue0).get(0);
			for (Entry<String, JsonValue> weatherEntry : ((JsonObject) weatherValue).entrySet()) {
 				String weatherFieldKey = weatherEntry.getKey();
 				JsonValue weatherFieldValue = weatherEntry.getValue();
 				if(weatherFieldKey.equals("description")) {
 					String snowCondition = weatherFieldValue.toString();
 					weatherData.setSnowCondition(snowCondition);
 					weatherData.addInfo("Weather: "+ snowCondition);
 					break;
 				}
			}
			
			JsonValue jsonValue = jsonObj.get("main");
			for (Entry<String, JsonValue> nextEntry : ((JsonObject) jsonValue).entrySet()) {
				if(nextEntry.getKey().equalsIgnoreCase("temp")) {
					double temp = (Double.parseDouble(nextEntry.getValue().toString())-273)*9/5+32; //convert from Kelvin to Fahrenheit
					weatherData.setTemp(temp);
					weatherData.addInfo("Temp: "+  String.format( "%.2f", weatherData.getTemp()) +" \u00b0F");
				}
			}
			
			JsonValue jsonValue2 = jsonObj.get("wind");
			for (Entry<String, JsonValue> nextEntry : ((JsonObject) jsonValue2).entrySet()) {
				if(nextEntry.getKey().equalsIgnoreCase("speed")) {
					double windSpeed = Double.parseDouble(nextEntry.getValue().toString())*3600/1609.34;;
					weatherData.setWindSpeed(windSpeed);
					weatherData.addInfo("Wind: "+ String.format( "%.2f", weatherData.getWindSpeed()) + " mph");
				}
			}
			
			JsonValue jsonValue3 = jsonObj.get("snow");
			if(jsonValue3 != null) {
				for (Entry<String, JsonValue> nextEntry : ((JsonObject) jsonValue3).entrySet()) {
					if(nextEntry.getKey().equalsIgnoreCase("3h")) {
						double snowVolume = Double.parseDouble(nextEntry.getValue().toString());
						//weatherData.setSnowVolume(snowVolume*0.000061024/3);  //convert from mm to inches
						weatherData.setSnowVolume(snowVolume);
						weatherData.addInfo("Snow: "+ String.format( "%.02f", weatherData.getSnowVolume())+ " mm/3h");
					}
				}
			}
		}catch(Exception e) {
			System.out.println("Error getting the weather data. "+e.getMessage());
			e.printStackTrace();
		}
		return weatherData;
	}
	
	public static void main(String[] args) {
		
		String cityId = "5090046"; // For Nashua, NH
		//String cityId = "5140405";
		WeatherData weatherData = getForecastWeatherForSchool(cityId);
		ArrayList<String> weatherInfoList = weatherData.getWeatherInfoList(); 
		for(int i=0; i<weatherInfoList.size(); i++) {
			System.out.println(weatherInfoList.get(i));
		}
		
		System.out.println("\nForcast Summary: ");
		System.out.println("School Starts: "+weatherData.getTime());
		System.out.println("Temp: "+String.format( "%.2f", weatherData.getTemp())+" \u00b0F");
		System.out.println("Wind: "+String.format( "%.2f", weatherData.getWindSpeed())+" mph");
		System.out.println("Weather: "+weatherData.getSnowCondition());
		System.out.println("Snow: "+String.format( "%.2f", weatherData.getSnowVolume())+" mm/3h");
		
		WeatherData weatherData2 = getCurrentWeather(cityId);
		ArrayList<String> weatherInfoList2 = weatherData2.getWeatherInfoList(); 
		for(int i=0; i<weatherInfoList2.size(); i++) {
			System.out.println(weatherInfoList2.get(i));
		}
	}
}
