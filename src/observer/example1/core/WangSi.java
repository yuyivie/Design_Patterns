package observer.example1.core;

public class WangSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("��˹���۲쵽�������л���Լ�Ҳ��ʼ���");
		this.cry(context);
		System.out.println("��˹�� ������\n");
	}
	//һ���������л������ʹ��
	private void cry(String context){
		System.out.println("��˹����Ϊ" + context +"--�����ұ��˰���" );
	}
}
