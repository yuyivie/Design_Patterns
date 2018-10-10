package state.example1.core;

public class RunningState extends LiftState {

	//���е�ʱ�򿪵����ţ� ����ˣ������ǲ�����㿪��
	@Override
	public void open() {
		System.out.println("RUnningState---->Open" );
		//do nothing
	}

	//�����е����ſ϶��ǹصġ�
	@Override
	public void close() {
		//do nothing
	}

	//����������״̬Ҫʵ�ֵķ���
	@Override
	public void run() {
		System.out.println("�����������С���������");
	}
	
	//�������еĵ���ֹͣ
	@Override
	public void stop() {
		super.context.setListState(Context.stoppingstate);
		super.context.getListState().stop();
	}

}
