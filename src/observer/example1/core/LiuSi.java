package observer.example1.core;

public class LiuSi implements Observer{
	//��˹���۲쵽�������л���Լ�Ҳ����һЩ�¡�
	public void update(String str){
		System.out.println("��˹���۲쵽�����ӻ");
		this.happy(str);
		System.out.println("��˹��������\n");
	}
	//һ�����������б仯�����Ϳ���
	private void happy(String context){
		System.out.println("��˹����Ϊ" + context + "--�����ҿ��ְ�");
		
	}
}
