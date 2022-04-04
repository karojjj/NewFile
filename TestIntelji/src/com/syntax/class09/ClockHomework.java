package com.syntax.class09;

public class ClockHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String time;
		for (int hours= 0; hours < 24; hours++) {
			for (int min = 0; min <= 59; min++) {
				if (hours<10 && min<10) {
					time="0"+hours+":"+"0"+min;
					System.out.println(time);
				} else if(hours<10 && min>=10) {
					time="0"+hours+":"+min;
					System.out.println(time);
				} else if(hours>=10 && min<10) {
					time=hours+":"+"0"+min;
					System.out.println(time);
				} else {
					time=hours+":"+min;
					System.out.println(time);
				}
			
				}
			}
		}
	}

