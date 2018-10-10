package state.example1.core;

/**
 * @author yu
 *����״̬
 */
public class OpenningState extends LiftState {
	//�򿪵�����
	@Override
	public void open() {
		System.out.println("�����ſ�������������");
	}
	//���Թر�
	@Override
	public void close() {
		//״̬�޸�
		super.context.setListState(Context.clasingState);
		//����ί��ΪCloseState��ִ��
		super.context.getListState().close();
	}
	
	@Override
	public void run() {
		//do nothing

	}

	@Override
	public void stop() {
		//do nothing

	}

}
