package proxy.dynamlc.example1;


public class RealSubject implements  Subject{

	@Override
	public void doSomething(String str) {
		System.out.println("do something !------>"  + str);
	}

	

}
