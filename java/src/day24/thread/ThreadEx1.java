package day24.thread;

public class ThreadEx1 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("+");
		}
		/*for(int i = 0; i < 10; i++) {
			System.out.println("-");
		}*/
		ChildThread1 chTread = new ChildThread1();
		chTread.start();
	}

}

class ChildThread1 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("-");
		}
	}
}
