package first;

public class ThreadA extends Thread{
	saredresource sr;
	ThreadA(saredresource sr)
	{
		this.sr=sr;
	}
	 public void run()
	 {
		 sr.resource1();
	 }
	 
	

}
