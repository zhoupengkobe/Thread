package com.kobe.thread.pro;

public class App {
	public static void main(String[] args) {
		//��ͬ��Դ
		movie m = new movie();
		//���߳�
		Player p = new Player(m);
		Watcher w = new Watcher(m);
		
		new Thread(p).start();
		new Thread(w).start();
	}

}
