package com.kobe.thread.syn;

import java.awt.geom.FlatteningPathIterator;

public class SynDemo01 {

	public static void main(String[] args) {
		// ��ʵ��ɫ
		Web12306 web = new Web12306();
		// ����
		Thread t1 = new Thread(web, "·�˼�");
		Thread t2 = new Thread(web, "��ţ��");
		Thread t3 = new Thread(web, "����ʦ");
		// �����߳�
		t1.start();
		t2.start();
		t3.start();

	}

}

class Web12306 implements Runnable {
	private int num = 10;
	private boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			test6();
		}

	}
//�̲߳���ȫ	
public void test6(){
	   	
		if(num<=0){
			flag=false; //����ѭ��
			return ;
		}
		 //a  b  c 	
		synchronized(this){
			try {
				Thread.sleep(500); //ģ�� ��ʱ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������"+num--);
		}
	}
	
	//�̲߳���ȫ  ������Դ����ȷ
		public void test5(){
			//a  b  c
			synchronized((Integer)num){
				if(num<=0){
					flag=false; //����ѭ��
					return ;
				}
				try {
					Thread.sleep(500); //ģ�� ��ʱ
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"������"+num--);
			}
		}
	
	//������Χ����ȷ �̲߳���ȫ
		public void test4(){
			//   c  1
			synchronized(this){
				//b
				if(num<=0){
					flag=false; //����ѭ��
					return ;
				}
			}
			// b
			try {
				Thread.sleep(500); //ģ�� ��ʱ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������"+num--);
		}//a -->1
	
	// �̰߳�ȫ   ������ȷ
	public synchronized void test2() {
		if (num <= 0) {
			flag = false; // ����ѭ��
			return;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "������" + num--);
	}
	
	//�̰߳�ȫ  ������ȷ
		public void test3(){
			//a  b  c
			synchronized(this){
				if(num<=0){
					flag=false; //����ѭ��
					return ;
				}
				try {
					Thread.sleep(500); //ģ�� ��ʱ
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"������"+num--);
			}
		}
	
	// �̲߳���ȫ
	public void test1() {
		if (num <= 0) {
			flag = false; // ����ѭ��
			return;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "������" + num--);
	}

}
