package state;

public class Test {
	public static void main(String[] args) {
		ILift lift = new Lift();
		//���ݵĳ�ʼ����Ӧ����ֹͣ״̬
		lift.setState(ILift.STOPPING_STATE);
		
		//�����ǵ��ݿ��ţ��˽�ȥ
		lift.open();
		//Ȼ����ݹر�
		lift.close();
		//��Ȼ�󣬵����������������ϻ������¡�
		lift.run();
		//������ͣ����
		lift.stop();
	}
}
