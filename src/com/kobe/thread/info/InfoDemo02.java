package com.kobe.thread.info;
/**
 * 优先级：概率
 * MAX_PRIORITY 10
 * NORM_PRIORITY 5
	MIN_PRIORITY 1
	
	setPriority(newPriority)设置优先级
 * @author ko
 *
 */
public class InfoDemo02 {

	public static void main(String[] args) throws InterruptedException {
		MyThread it = new MyThread();
		Thread p1 = new Thread(it, "挨踢1");
		
		MyThread it2 = new MyThread();
		Thread p2 = new Thread(it2, "挨踢2");
		
		p1.setPriority(Thread.MIN_PRIORITY);//设置优先级
		p2.setPriority(Thread.MAX_PRIORITY);//设置优先级
		p1.start();
		p2.start();
		
		Thread.sleep(1000);
		
		it.stop();
		it2.stop();

	}

}
