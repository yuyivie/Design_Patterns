package builder.example1;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("���۳��������������ġ���");

	}

	@Override
	protected void stop() {
		System.out.println("���۳���������ͣ���ġ�������");

	}

	@Override
	protected void alarm() {
		System.out.println("���۳��������������ӵġ�������");
	}

	@Override
	protected void engineBoom() {
		System.out.println("���۳����������������ӵġ�����������");
	}

}
