package state.example1.core;

public class StoppingState extends LiftState {

	//ֹͣ״̬�ǿ��Կ��ŵ�
	@Override
	public void open() {
		super.context.setListState(Context.openningState);//����״̬Ϊ����
		super.context.getListState().open();
	}
	//ֹͣ״̬���ţ��ű������ǹ��ŵ�
	@Override
	public void close() {
		//do nothing
	}
	//ֹͣ״̬������  �����ĺ�
	@Override
	public void run() {
		super.context.setListState(Context.runningState);//����״̬Ϊ����
		super.context.getListState().run();
	}
	//����ԭ������ֹͣ��  ����ʲô����������
	@Override
	public void stop() {
		System.out.println("����ֹͣ���С�������");

	}

}
