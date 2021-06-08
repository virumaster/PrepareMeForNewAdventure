package BasicJava;

public class ThreadOddEven {
	int i = 1;

	public synchronized void printOdd() {
		while (i < 10) {
			if (i % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Number: " + i);
			i+=1;
			notify();
		}
	}

	public synchronized void printEven() {
		while (i < 10) {
			if (i % 2 != 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Number: " + i);
			i+=1;
			notify();
		}
	}

	public static void main(String[] args) {
		ThreadOddEven th1 = new ThreadOddEven();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				th1.printOdd();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				th1.printEven();
			}
		});

		t1.start();
		t2.start();
	}
}
