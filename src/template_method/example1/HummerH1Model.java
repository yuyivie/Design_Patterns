package template_method.example1;

public class HummerH1Model extends HummerModel {
	
	private boolean alarmFlag = true;//Ҫ������
	
	
	//��������
	@Override
	public void start() {
		System.out.println("����H1������������");

	}

	@Override
	public void stop() {
		System.out.println("����H1ͣ����������");

	}

	@Override
	public void alarm() {
		System.out.println("����H1����");

	}

	@Override
	public void engineBoom() {
		System.out.println("����H1���������������ġ���");
	}

	/*//��������
	@Override
	public void run() {
		//�ȷ�������
		this.start();
		//���濪ʼ����
		this.engineBoom();
		//Ȼ��Ϳ�ʼ���ˣ��ܵĹ�����������·�����Ͱ����ȡ�
		this.alarm();
		//����Ŀ�ĵ�ͣ��
		 this.start();
	}*/
	
	protected boolean isAlarm(){
		return this.alarmFlag;
	}
	
	//Ҫ��Ҫ�����ȣ����пͻ��������ġ�
	public void setArarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

}
