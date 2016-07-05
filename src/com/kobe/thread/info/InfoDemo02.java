package com.kobe.thread.info;
/**
 * ���ȼ�������
 * MAX_PRIORITY 10
 * NORM_PRIORITY 5
	MIN_PRIORITY 1
	
	setPriority(newPriority)�������ȼ�
 * @author ko
 *
 */
public class InfoDemo02 {

	public static void main(String[] args) throws InterruptedException {
		MyThread it = new MyThread();
		Thread p1 = new Thread(it, "����1");
		
		MyThread it2 = new MyThread();
		Thread p2 = new Thread(it2, "����2");
		
		p1.setPriority(Thread.MIN_PRIORITY);//�������ȼ�
		p2.setPriority(Thread.MAX_PRIORITY);//�������ȼ�
		p1.start();
		p2.start();
		
		Thread.sleep(1000);
		
		it.stop();
		it2.stop();

	}

}
