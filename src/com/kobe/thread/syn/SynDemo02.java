package com.kobe.thread.syn;
/**
 * �������ģʽ��ȷ��һ����ֻ��һ������
 * @author ko
 *
 */
public class SynDemo02 {

	public static void main(String[] args) {
		JvmThread thread1 = new JvmThread(100);
		JvmThread thread2 = new JvmThread(500);
		thread1.start();
		thread2.start();
	}

}
class JvmThread extends Thread{
	private long time;
	public JvmThread(){
		
	}
	
	public JvmThread(long time){
		this.time = time;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"--->������"+Jvm.getInstance(time));
	}
}

/**
 * �������ģʽ
 * ȷ��һ����ֻ��һ������
 * ����ʽ  double checking
 * 1.������˽�л��������ⲿֱ�Ӵ�������
 * 2.����һ��˽�еľ�̬����
 * 3.����һ������Ĺ����ľ�̬����  ���ʸñ��������û�ж��󣬴����ö���
 */
class Jvm{
	
	//����һ��˽�еľ�̬����
	private static Jvm instance = null;
	
	//������˽�л��������ⲿֱ�Ӵ�������
	private Jvm(){
		
	}
	
	//����һ������Ĺ����ľ�̬����  ���ʸñ��������û�ж��󣬴����ö���
	
	public static  Jvm getInstance(long time){
		// c d e -->Ч��  �ṩ�Ѿ����ڶ���ķ���Ч��
	if (null==instance) {
		synchronized (Jvm.class) {
			if (null==instance) {
				try {
					Thread.sleep(time);//��ʱ���Ŵ����
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				instance = new Jvm();
			}
		}
	}
	return instance;
		
	}
	
	
	
	
	
	public static  Jvm getInstance3(long time){
		// a b -->Ч�ʲ���  a b ����Ҫ�ȴ�
		synchronized (Jvm.class) {
			if (null==instance) {
				try {
					Thread.sleep(time);//��ʱ���Ŵ����
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				instance = new Jvm();
			}
			return instance;
		}
		
	}
	
	
	
	public static synchronized Jvm getInstance2(long time){
		if (null==instance) {
			try {
				Thread.sleep(time);//��ʱ���Ŵ����
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		return instance;
	}
	
	public static  Jvm getInstance1(long time){
		if (null==instance) {
			try {
				Thread.sleep(time);//��ʱ���Ŵ����
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		return instance;
	}
}
