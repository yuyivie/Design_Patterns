package decorator.example1;

public class MinSoreDecorator extends Decorator {

	public MinSoreDecorator(SchoolReport sr) {
		super(sr);
		// TODO Auto-generated constructor stub
	}
	
	private void reportMinSource(){
		System.out.println("这次的最低成绩是    语文20     数学32    自然 13");
	}
	
	@Override
	public void report(){
		this.reportMinSource();
		super.report();
	}
}
