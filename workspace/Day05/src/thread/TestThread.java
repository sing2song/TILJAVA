package thread;

class MyRunnable2 implements Runnable{
	String myName;
	public MyRunnable2(String name) {this.myName=name;}
	public void run() {
		for(int i=10;i>=0;i--)
			System.out.print(myName+i+" ");
	}
}



public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new MyRunnable2("A"));
		Thread t2=new Thread(new MyRunnable2("B"));
		t1.start();
		t2.start();//스레드의 출력이 섞이는 것을 알 수 있다.
	}

}
