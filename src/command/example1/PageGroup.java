package command.example1;

public class PageGroup extends Group {
	//������������� Ӧ�����ҵ���  ��Ȼ���˭̸
	@Override
	public void find() {
		System.out.println("�ҵ������顣��������������");
	}
	//������Ҫ������һ��ҳ��
	@Override
	public void add() {
		System.out.println("�ͻ�Ҫ������һ��ҳ�档������");
	}
	
	 //�ͻ�Ҫ��ɾ��һЩҳ��
	@Override
	public void delete() {
		System.out.println("�ͻ�Ҫ��ɾ��һЩҳ�档����������");
	}
	//�ͻ�Ҫ������е�ҳ������޸�
	@Override
	public void change() {
		System.out.println("�ͻ�Ҫ���޸�һЩҳ�档����");
	}
	//���е���ɾ�� ��Ҫ�����ƻ�
	@Override
	public void plan() {
		System.out.println("�ͻ�Ҫ��ҳ�����ƻ���������");
	}

}
