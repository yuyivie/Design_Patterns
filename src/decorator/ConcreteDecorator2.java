package decorator;

public class ConcreteDecorator2 extends Decorator {
	
	//���屻������
	public ConcreteDecorator2(Component _component) {
		super(_component);
		// TODO Auto-generated constructor stub
	}
	
	//�����Լ������η���
	
	private void method2(){
		System.out.println("method2 ����");
	}

	//��д�����Operation����
	public void operate(){
		super.operate();
		this.method2();
	}
	
}
