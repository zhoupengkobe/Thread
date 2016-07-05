package com.kobe.thread.syn;
/**
 * ����ʽ
 * 1.������˽�л�
 * 2.����˽�еľ�̬����
 * 3.�����ṩ�������Եľ�̬������ȷ���ö������
 * @author ko
 *
 */
public class MyJvm {

	private static MyJvm instance;
	private MyJvm(){
		
	}
	public static MyJvm getInstance(){
		if (null==instance) {//���Ч��
			synchronized (MyJvm.class) {
				if (null==instance) {//��ȫ
					instance= new MyJvm();
				}
			}
		}
		return instance;
	}
}
/**
 * ����ʹ�õ�ʱ����أ��ӻ����ص�ʱ��
 * @author ko
 *
 */
class MyJvm3 {

	private static class JVMholder{
		private static MyJvm3 instance = new MyJvm3();
	}
	private MyJvm3(){
		
	}
	public static MyJvm3 getInstance(){
		
		return JVMholder.instance;
	}
}



/**
 * ����ʽ
 * 1.������˽�л�
 * 2.����˽�еľ�̬���ԣ�ͬʱ�����ö���
 * 3.�����ṩ�������Եľ�̬����
 * @author ko
 *
 */

class MyJvm2 {

	private static MyJvm2 instance = new MyJvm2();
	private MyJvm2(){
		
	}
	public static MyJvm2 getInstance(){
		
		return instance;
	}
}