package com.kobe.thread.schedule;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
  * �˽�
  * Timer() 
  	schedule(TimerTask task, Date time) 
  	schedule(TimerTask task, Date firstTime, long period) 
  	��ѧ quartz
  * @author ko
  *
  */
public class TimeDemo01 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				System.out.println("so easy-----");
			}
		}, new Date(System.currentTimeMillis()+1000));

	}

}
