package com.kobe.thread.create;

public class ProgrammerApp {
	public static void main(String[] args) {
		/**
		 *  1��������ʵ��ɫ��
			2�����������ɫ+���ǽ�ɫ������
			3������.start()�����߳�
		 */
		
		//1��������ʵ��ɫ��
		Programmer pro = new Programmer();
		//2�����������ɫ+���ǽ�ɫ������
		Thread proxy = new Thread(pro);
		//3������.start()�����߳�
		proxy.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("һ����qq......");
		}
		
	}

}
