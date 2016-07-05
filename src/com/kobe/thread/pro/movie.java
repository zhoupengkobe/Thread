package com.kobe.thread.pro;
/**
 * 一个场景，共同的资源
 * 生产者消费者模式，信号灯法
 * wait(): 等待，释放锁sleep 不是放锁
 * notify()/notifyAll():唤醒
 * 与synchronized 一起使用
 * @author ko
 *
 */
public class movie {
	private String pic;
	//信号灯
	//flag-->T生产者生产，消费者等待，生产完成后通知消费
	//flag-->F消费者消费，生产者等待，消费完成后通知生产
	private boolean flag = true;
	/**
	 * 播放
	 */
	public synchronized void play(String pic){
		if (!flag) {//生产者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//开始生产
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("生产了："+pic);
		//生产完毕
		this.pic = pic;
		//通知消费
		this.notify();
		//生产者停下
		this.flag=false;
	}
	
	public synchronized void watch(){
		if (flag) {//消费者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//开始消费
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//消费完毕
		System.out.println("消费了："+pic);
		//通知生产
		this.notify();
		//消费停止
		this.flag=true;
	}
}
