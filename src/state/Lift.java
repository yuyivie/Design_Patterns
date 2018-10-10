package state;

public class Lift implements ILift {
	
	private int state;
	
	@Override
	public void setState(int state) {
		this.state = state;
	}
	
	//�����ſ���
	@Override
	public void open() {
		//������ʲô״̬�²��ܿ���
		switch (this.state) {
		case OPENING_STATE://����״̬��ʲô������
			// do nothing
			break;

		case CLOSING_STATE://����״̬������Կ���
			this.openWithoutLogic();
			this.setState(OPENING_STATE);
			break;
		case RUNING_STATE://����״̬�����ܿ��ţ�ʲô��������
			//do nothing
			break;
		case STOPPING_STATE://ֹͣ״̬����ȻҪ������
			this.openWithoutLogic();
			this.setState(OPENING_STATE);
			break;
		}
	}
	
    //�����Źر�
	@Override
	public void close() {
		//������ʲô״̬�²��ܹرա�
		switch (this.state) {
		case OPENING_STATE: //���Թ��ţ�ͬʱ�޸ĵ��� ״̬��
			this.closeWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		case CLOSING_STATE://����ʱ����״̬����ʲô������
			//do nothing
			break;
		case RUNING_STATE://�������У��ű������ǹرյģ�Ҳʲô������
			//do nothing
			break;
		case STOPPING_STATE://ֹͣ״̬����Ҳ�ǹرյģ�ʲôҲ����
			break;
		}
	}
	//��������
	@Override
	public void run() {
		//������ʲô״̬�������С�
		switch (this.state) {
		case OPENING_STATE://����״̬���������У���ʲô������
			//do nothing
			
			break;

		case CLOSING_STATE://����״̬����������
			this.runWithoutLogic();
			this.setState(RUNING_STATE);
			break;
		case RUNING_STATE://����״̬  ʲô������
			// do nothing
			break;
		case STOPPING_STATE:// ֹͣ״̬   �������С�
			this.runWithoutLogic();
			
		}
	}
	//����ֹͣ
	@Override
	public void stop() {
		switch (this.state) {
		case OPENING_STATE://����״̬����������������   ���Բ���Ҫֹͣ��
			// no  nothing
			break;

		case CLOSING_STATE://����״̬�������ֹͣ
			this.stopWithoutLogic();
			this.setState(STOPPING_STATE);
			break;
		case RUNING_STATE://����״̬������ֹͣ
			 this.stopWithoutLogic();
			 this.setState(STOPPING_STATE);
			 break;
		case STOPPING_STATE://ֹͣ״̬��ʲô��������
			//do  nothing
			break;
		}
	}

	
	//����ĵ��ݹ��ţ�������ʵ�ʵ��߼�
	private void closeWithoutLogic(){
		System.out.println("�����Źرա���������");
	}

	//����ĵ��ݿ��ţ��������κ�����
	private void openWithoutLogic(){
		System.out.println("�����ſ���������������");
	}
	
	//��������У���������������
	private void runWithoutLogic(){
		System.out.println("�����������С�����������");
	}
	//�����ֹͣ���������κ���������
	private void  stopWithoutLogic(){
		System.out.println("����ֹͣ�ˡ���������");
	}
}
