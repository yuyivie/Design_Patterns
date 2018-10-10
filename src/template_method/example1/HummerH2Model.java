package template_method.example1;

public class HummerH2Model extends HummerModel{

	@Override
	public void start() {
		System.out.println("����H2������������");
		
	}

	@Override
	public void stop() {
		System.out.println("����H2ͣ����������");
		
	}

	@Override
	public void alarm() {
		System.out.println("����H2���ѡ�������");
		
	}

	@Override
	public void engineBoom() {
		System.out.println("����H2�������������ġ�����");
		
	}

	/*@Override
	public void run() {
		//��������
		this.start();
		//���濪ʼ����
		this.engineBoom();
		//Ȼ��Ϳ�ʼ����  ����������һ����·��   ������
		this.alarm();
		//����Ŀ�ĵ�ͣ����
		this.stop();
		
	}*/
	
	//Ĭ����û�����ȵġ�
	protected boolean isAlarm(){
		return false;
	}
}
