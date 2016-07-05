package com.kobe.thread.pro;

public class App {
	public static void main(String[] args) {
		//共同资源
		movie m = new movie();
		//多线程
		Player p = new Player(m);
		Watcher w = new Watcher(m);
		
		new Thread(p).start();
		new Thread(w).start();
	}

}
