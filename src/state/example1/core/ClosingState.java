package state.example1.core;

public class ClosingState extends LiftState {
	
	//�������ǹص� Ҫ��
	@Override
	public void open() {
		super.context.setListState(Context.openningState);//����Ϊ����״̬
		super.context.getListState().open();
	}

	@Override
	public void close() {
		System.out.println("�����Źرա���������");
	}
	
	//�����Ź��� ������ ������������������
	@Override
	public void run() {
		super.context.setListState(Context.runningState);//����Ϊ����״̬
		super.context.getListState().run();
	}

	@Override
	public void stop() {
		super.context.setListState(Context.stoppingstate);//����Ϊֹͣ״̬
		super.context.getListState().stop();
	}

}
