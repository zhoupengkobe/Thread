package com.kobe.thread.create;
/**
 * 模拟龟兔赛跑
 * 1.创建多线程  继承Thread +重写run(线程体)
 * 2.使用线程：创建子类对象 +  对象.start() 线程启动
 * @author ko
 *
 */
public class Rabbit extends Thread{

	public void run(){
		//线程体
		for (int i = 0; i < 100; i++) {
			System.out.println("兔子跑了"+i+"步");
		}
	}

	
}


class Tortoise extends Thread{

	public void run(){
		//线程体
		for (int i = 0; i < 100; i++) {
			System.out.println("乌龟跑了"+i+"步");
		}
	}

	
}
