package com.kobe.thread.pro;
/**
 * һ����������ͬ����Դ
 * ������������ģʽ���źŵƷ�
 * wait(): �ȴ����ͷ���sleep ���Ƿ���
 * notify()/notifyAll():����
 * ��synchronized һ��ʹ��
 * @author ko
 *
 */
public class movie {
	private String pic;
	//�źŵ�
	//flag-->T�����������������ߵȴ���������ɺ�֪ͨ����
	//flag-->F���������ѣ������ߵȴ���������ɺ�֪ͨ����
	private boolean flag = true;
	/**
	 * ����
	 */
	public synchronized void play(String pic){
		if (!flag) {//�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����ˣ�"+pic);
		//�������
		this.pic = pic;
		//֪ͨ����
		this.notify();
		//������ͣ��
		this.flag=false;
	}
	
	public synchronized void watch(){
		if (flag) {//�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�������
		System.out.println("�����ˣ�"+pic);
		//֪ͨ����
		this.notify();
		//����ֹͣ
		this.flag=true;
	}
}
