package com.kobe.thread.info;
/**
 * Thread.currentThread() ����ǰ�߳�
 * setName():��������
 * getName():��ȡ����
 * isAlive():�ж�״̬
 * @author ko
 *
 */
public class InfoDemo01 {

	public static void main(String[] args) throws InterruptedException {
		MyThread it = new MyThread();
		Thread proxy = new Thread(it,"����");
		proxy.setName("test");
		System.out.println(proxy.getName());
		System.out.println(Thread.currentThread().getName());//main
		
		proxy.start();
		System.out.println("�������״̬��"+proxy.isAlive());
		Thread.sleep(200);
		it.stop();
		Thread.sleep(100);
		System.out.println("ֹͣ���״̬��"+proxy.isAlive());
	}

}
