package com.kobe.thread.create;
/**
 * �Ƽ�Runnable�����߳�
 * 1�����ⵥ�̳еľ�����
 * 2�����ڹ�����Դ
 * 
 * ʹ��Runable �����߳�
 * 1.�� ʵ��Runable�ӿ�+��run() ---> ��ʵ��ɫ��
 * 2.�������߳�   ʹ�þ�̬����
 * 1���������ǽ�ɫ��
 * 2�����������ɫ+���ǽ�ɫ������
 * 3������.start()�����߳�
 * @author ko
 *
 */
public class Programmer implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("һ����helloworld");
		}
		
	}

}
