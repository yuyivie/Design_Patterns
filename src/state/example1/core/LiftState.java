package state.example1.core;

/**
 * @author yu
 *�������״̬
 */
public abstract class LiftState {
	//����һ��������ɫ��Ҳ���Ƿ�װ״̬�ı仯����Ĺ��ܱ仯
	protected Context context;
	public void setContext(Context context){
		this.context = context;
	}
	//���ȵ����ſ�������
	public abstract void open();
	//�������п������ǵ�ȻҲ�����˹ر��ˡ�
	public abstract void close();
	//����Ҫ�������£���������
	public abstract void run();
	//���ݻ�Ҫ��ͣ����
	public abstract void stop();
		
	
	
}
