package decorator.example1;

public class SortDecorator extends Decorator {
	
	public SortDecorator(SchoolReport sr) {
		super(sr);
		// TODO Auto-generated constructor stub
	}
	//告诉老爸学校的排名情况
	private void reportSort(){
		System.out.println("我是排名第38名。。。");
	}
	
	//老爸看完成绩单后再告诉他  ，加强作用。
	@Override
	public void report(){
		this.reportSort();
		super.report();
	}
}
