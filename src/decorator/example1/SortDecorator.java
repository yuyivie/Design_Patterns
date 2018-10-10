package decorator.example1;

public class SortDecorator extends Decorator {
	
	public SortDecorator(SchoolReport sr) {
		super(sr);
		// TODO Auto-generated constructor stub
	}
	//�����ϰ�ѧУ���������
	private void reportSort(){
		System.out.println("����������38��������");
	}
	
	//�ϰֿ���ɼ������ٸ�����  ����ǿ���á�
	@Override
	public void report(){
		this.reportSort();
		super.report();
	}
}
