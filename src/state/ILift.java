package state;

/**
 * @author yu
 *���ݽӿ�
 */
public interface ILift {
	public final static int OPENING_STATE = 1;//����״̬
	public final static int CLOSING_STATE = 2;//����״̬
	public final static int RUNING_STATE = 3;//����״̬
	public final static int STOPPING_STATE = 4;//ֹͣ״̬
	
	//���õ��ݵ�״̬
	public void setState(int state);
	//���ȵ����ſ�������
	public void open();
	//���ݹر�
	public void close();
	//��������
	public void run();
	//����ͣ����
	public void stop();
	
}
