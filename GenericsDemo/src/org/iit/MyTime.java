package org.iit;

public class MyTime {

	public int hour, min, second;

	public MyTime(int hour, int min, int second) {
		// TODO Auto-generated constructor stub
		this.hour = hour;
		this.min = min;
		this.second = second;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		
		sb.append(hour+":"+min+":"+second);
		
		
		return sb.toString();
	}

}
