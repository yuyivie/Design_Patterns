package builder.example1;

public class BMWModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("�����������������ġ�������");
	}

	@Override
	protected void stop() {
		System.out.println("������������ֹͣ�ġ�������");
	}

	@Override
	protected void alarm() {
		System.out.println("�����������������ӵġ�������");
		
	}

	@Override
	protected void engineBoom() {
		System.out.println("������������������ӵġ�������");
	}

}
