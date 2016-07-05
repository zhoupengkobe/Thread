package com.kobe.thread.status;
/**
 * 线程的状态
 * 1，新生状态
 * 2.就绪状态
 * 3，运行状态
 * 4.就绪状态
 * 5.死亡状态
 * 
 * 二：终止线程
 * 1.自然终止：线程体正常执行完毕
 * 2.外部干涉：
 * 1）线程类中  定义线程体使用的标识
 * 2）线程体使用该标识
 * 3）提供对外的方法改变改标识
 * 4）外部根据条件调用该方法即可
 * @author ko
 *
 */
public class StopDemo01 {

	public static void main(String[] args) {
		Study s = new Study();
		new Thread(s).start();
		//外部干涉
		for (int i = 0; i < 100; i++) {
			if (50==i) {//外部干涉
				s.stop();
			}
			System.out.println("main-------->"+i);
		}

	}

}

class Study implements Runnable{
	
	//1.线程类中  定义线程体使用的标识
	private boolean flag = true;
	@Override
	public void run() {
		//2.线程体使用该标识
		while (flag) {
			System.out.println("study thread.....");
		}
	}
	
	//对外提供方法改变标识
	public void stop(){
		this.flag=false;
	}
	
}
