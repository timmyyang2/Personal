package weather;

import java.util.ArrayList;

public class WeatherData {

	private String cityId = "";
	private ArrayList<String> weatherInfoList = new ArrayList<String>();
	
	private String currTime = "";	
	private int hoursAhead;
	private String time = "";
	private String snowCondition = "";
	private double snowVolume = 0;
	private double temp = -1000;
	private double windSpeed = 0;
	
	public WeatherData(String cityId) {
		this.cityId = cityId;
	}
	
	public String getCityId() {
		return cityId;
	}
	
	public void setCurrTime(String currTime) {
		this.currTime = currTime;
	}
	
	public String getCurrTime() {
		return currTime;
	}
	
	public void setHoursAhead(int hoursAhead) {
		this.hoursAhead = hoursAhead;
	}
	
	public int getHoursAhead() {
		return hoursAhead;
	}
	
	public void setSnowCondition(String snowCondition) {
		if(!this.snowCondition.equals("")) {
			if(this.snowCondition.equals("light snow")) {
				if(snowCondition.equals("snow") || snowCondition.equals("heavy snow")) {
					this.snowCondition = snowCondition;
				}
			}
			else if(this.snowCondition.equals("snow")) {
				if(snowCondition.equals("heavy snow")) {
					this.snowCondition = snowCondition;
				}
			}
		}else {
			this.snowCondition = snowCondition;
		}
	}
	
	public String getSnowCondition() {
		return snowCondition;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setSnowVolume(double snowVolume) {
		if(snowVolume > this.snowVolume) {
			this.snowVolume = snowVolume;
		}
	}
	
	public double getSnowVolume() {
		return snowVolume;
	}
	
	public void setTemp(double temp) {
		if(this.temp == -1000) {
			this.temp = temp;
		}else {
			if(temp < this.temp) {
				this.temp = temp;
			}
		}
	}
	
	public double getTemp() {
		return temp;
	}
	
	public void setWindSpeed(double windSpeed) {
		if(windSpeed > this.windSpeed) {
			this.windSpeed = windSpeed;
		}
	}
	
	public double getWindSpeed() {
		return windSpeed;
	}
	
	public void addInfo(String weatherInfo) {
		weatherInfoList.add(weatherInfo);
	}
	
	public ArrayList<String> getWeatherInfoList(){
		return weatherInfoList;
	}
}
