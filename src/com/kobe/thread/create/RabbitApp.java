package com.kobe.thread.create;

public class RabbitApp {
	public static void main(String[] args) {
		//�����������
		Rabbit rab = new Rabbit();
		Tortoise tor = new Tortoise();
		//����start����
		rab.start();
		tor.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("main----->"+i);
		}
	}

}
