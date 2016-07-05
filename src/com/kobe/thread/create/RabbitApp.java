package com.kobe.thread.create;

public class RabbitApp {
	public static void main(String[] args) {
		//创建子类对象
		Rabbit rab = new Rabbit();
		Tortoise tor = new Tortoise();
		//调用start方法
		rab.start();
		tor.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("main----->"+i);
		}
	}

}
