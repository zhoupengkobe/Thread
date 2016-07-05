package com.kobe.thread.status;
/**
 * �̵߳�״̬
 * 1������״̬
 * 2.����״̬
 * 3������״̬
 * 4.����״̬
 * 5.����״̬
 * 
 * ������ֹ�߳�
 * 1.��Ȼ��ֹ���߳�������ִ�����
 * 2.�ⲿ���棺
 * 1���߳�����  �����߳���ʹ�õı�ʶ
 * 2���߳���ʹ�øñ�ʶ
 * 3���ṩ����ķ����ı�ı�ʶ
 * 4���ⲿ�����������ø÷�������
 * @author ko
 *
 */
public class StopDemo01 {

	public static void main(String[] args) {
		Study s = new Study();
		new Thread(s).start();
		//�ⲿ����
		for (int i = 0; i < 100; i++) {
			if (50==i) {//�ⲿ����
				s.stop();
			}
			System.out.println("main-------->"+i);
		}

	}

}

class Study implements Runnable{
	
	//1.�߳�����  �����߳���ʹ�õı�ʶ
	private boolean flag = true;
	@Override
	public void run() {
		//2.�߳���ʹ�øñ�ʶ
		while (flag) {
			System.out.println("study thread.....");
		}
	}
	
	//�����ṩ�����ı��ʶ
	public void stop(){
		this.flag=false;
	}
	
}
