package com.kobe.thread.pro;
/**
 * 生产者
 * @author ko
 *
 */
public class Player implements Runnable{
	
	private movie m;
	
	/**
	 * @param m
	 */
	public Player(movie m) {
		super();
		this.m = m;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (0==i%2) {
				m.play("左青龙");
			}else {
				m.play("右白虎");
			}
		}
		
	}

}
