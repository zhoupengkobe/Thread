package com.kobe.thread.pro;
/**
 * Ïû·ÑÕß
 * @author ko
 *
 */
public class Watcher implements Runnable{
	private movie m;
	
	/**
	 * @param m
	 */
	public Watcher(movie m) {
		super();
		this.m = m;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			m.watch();
		}
	}

}
