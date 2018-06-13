package first;

public class saredresource {
    
	static synchronized void resource1()
	{
	String thname = Thread.currentThread().getName().toUpperCase();
	System.out.println(thname);
	long id = Thread.currentThread().getId();
	System.out.println(id);
	long priority = Thread.currentThread().getPriority();
	System.out.println(priority);
	
	
	 System.out.println(thname + "printing no. from 1 to 25");
	 
	 for(int i=0;i<=7;i++)

	 {
		 System.out.println(i);
		 
		 try {
		     Thread.sleep(1000);	 
		 }
		 catch(InterruptedException e) {
		 e.printStackTrace();
		 }
	 
	 }
	}
	
	static synchronized void resource2()
	{
	String thname = Thread.currentThread().getName().toUpperCase();
	 System.out.println(thname + "printing no. from 26 to 50");
	 
	 for(int i=26;i<=32;i++)

	 {
		 System.out.println(i);
		 
		 try {
		     Thread.sleep(1000);	 
		 }
		 catch(InterruptedException e) {
		 e.printStackTrace();
		 }
	 
	 }
	}
}
