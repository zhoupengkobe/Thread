package com.kobe.thread.status;
/**
 * join:�ϲ��߳�
 * @author ko
 *
 */
public class JoinDemo01 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		JoinDemo01 demo = new JoinDemo01();
		Thread t = new Thread(demo);//����
		t.start();//����
		//cpu���� ����
		
		for (int i = 0; i < 1000; i++) {
			if (50==i) {
				t.join();//mian����...
			}
			System.out.println("main..."+i);
		}
		

	}
	
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("join..."+i);
		}
	}

}
