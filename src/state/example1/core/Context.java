package state.example1.core;

/**
 * @author yu
 * ��������
 */
public class Context {
	//��������еĵ���״̬ ��ͨ������Ϊ  ��̬������
	public final static LiftState openningState =  new OpenningState();
	public final static LiftState clasingState = new ClosingState();
	public final static LiftState stoppingstate = new StoppingState();
	public final static LiftState runningState = new RunningState();
	
	
	//����һ����ǰ����״̬
	private LiftState listState;

	public LiftState getListState() {
		return listState;
	}

	public void setListState(LiftState listState) {
		this.listState = listState;
		//�ѵ�ǰ�Ļ���֪ͨ������ʵ������
		this.listState.setContext(this);
	}
	public  void open(){
		this.listState.open();
	}
	public void close(){
		this.listState.close();
	}
	public void run(){
		this.listState.run();
	}
	public void stop(){
		this.listState.stop();
	}
	
}
