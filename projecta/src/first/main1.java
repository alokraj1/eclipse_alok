package first;

public class main1 {
public static void main(String[] args) {
	saredresource sr1 = new saredresource();
	saredresource sr2 = new saredresource();
	
	
	ThreadA t1 = new ThreadA(sr1);
	ThreadA t2 = new ThreadA(sr2);
	ThreadA t3 = new ThreadA(sr1);
	
	
	//t1.setName("T1====THRAED1");h
	//t2.setName("T2====THRAED2");

	//t3.setName("T3====THRAED3");
	t1.start();
	t2.start();
	t3.start();
}
}
