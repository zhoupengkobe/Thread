package com.kobe.thread.status;

public class YieldDemo01 extends Thread{

	public static void main(String[] args) {
		YieldDemo01 demo = new YieldDemo01();
		new Thread(demo).start();
		for (int i = 0; i < 1000; i++) {
			if (i%20==0) {
				//ÔÝÍ£±¾Ïß³Ìmain
				Thread.yield();
			}
			System.out.println("main..."+i);
		}

	}
	
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("yield..."+i);
		}
	}

}
