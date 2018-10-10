package template_method.example1;

public abstract class HummerModel {
	/*
	 * ���ȣ����ģ��Ҫ�ܹ��������������������ҡ���������ǵ�������
	 * ������Ҫ�ܹ����������������ʵ��Ҫ��ʵ�������ˡ�
	 * 
	 */
	public abstract void  start();
	
	//�ܷ�������Ҫ��ͣ�������ǲ����汾�¡�
	public abstract void  stop();
	
	//���Ȼ���������ǵενУ��������ٽС�
	public abstract void alarm();
	
	//�����¡¡���죬�������Ǽٵ�
	public abstract void engineBoom();
	
	//��ģ��Ӧ�û��ܰɣ���������Ƶģ����ǵ��������ģ���֮Ҫ����
	
	public void  run(){
		
		this.start();
		
		this.engineBoom();
		
		//this.alarm();
		
		//Ҫ��������죬����������Ͳ��졣
		if(this.isAlarm()){
			this.alarm();
		}
		
		this.stop();
	}
	
	//���ӷ�����Ĭ�������ǻ���ġ�
	protected boolean isAlarm(){
		return true;
	}
}
