package abThread;

//两线程 -》 交替执行

public class _1_JustTwoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunnable mr1=new MyRunnable("A");		
		MyRunnable mr2=new MyRunnable("B");		
		
		Thread t1=new Thread(mr1);
		Thread t2=new Thread(mr2);
		
		t1.start();
		t2.start();
		
	}

}

class MyRunnable implements Runnable {
	
	String s;
	

	public MyRunnable(String string) {
		// TODO Auto-generated constructor stub
		s=string;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			System.out.println(s+i);
		}
		
	}
	
}
