package decorator.example1;

public class MinSoreDecorator extends Decorator {

	public MinSoreDecorator(SchoolReport sr) {
		super(sr);
		// TODO Auto-generated constructor stub
	}
	
	private void reportMinSource(){
		System.out.println("��ε���ͳɼ���    ����20     ��ѧ32    ��Ȼ 13");
	}
	
	@Override
	public void report(){
		this.reportMinSource();
		super.report();
	}
}
