class Clock{

	private int hour;
	private int minutes;
	private int second;
	
	
	
	
	public Clock(int hour, int minutes, int second){
		if(hour > 0){
		this.hour = hour;
	}
		if(minutes > 0){
			this.minutes = minutes;
		}
		if(second > 0){
			this.second = second;
		}
	}
	
	public void setHour(int hourH){
		if(hourH > 23){
			hour = hour * 0;
		} else{
			hour = hourH;
		}
	}
	public int getHour(){
		return hour;
	}
	
	public void setMinutes(int minutesM){
		if(minutesM > 59){
			minutes = minutes * 0;
		}else{
			minutes = minutesM;
		}
	}
	public int getMinutes(){
		return minutes;
	}
	
	public void setSecond(int secondS){
		if(secondS > 59){
			second = second * 0;
		}else{
			second = secondS;
		}
	}
	public int getSecond(){
		return second;
	}
	
	public int displayTime(){
		
		return hour;
	}
	public int displayTime1(){
		
		return minutes;
	}
	public int displayTime2(){
		
		return second;
	}
		




}
