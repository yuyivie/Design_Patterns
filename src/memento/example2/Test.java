package memento.example2;

public class Test {
	public static void main(String[] args) {
		//���巢����
		Originator originator = new Originator();
		//������ʼ״̬
		originator.setState("��ʼ״̬");
		System.out.println("��ʼ״̬��:" + originator.getState());
		
		//��������
		Originator bak = 	originator.createMemento();
		//�޸�״̬
		originator.setState("�޸ĺ��״̬");
		System.out.println("�޸ĺ��״̬�ǣ�" + originator.getState());
		
		//�ָ�ԭ�е�״̬
		 originator.restoreMemento(bak);
		 System.out.println("�ָ���״̬�ǣ�" + originator.getState());
		
	}
}
