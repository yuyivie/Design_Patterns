package command.example1;

public class CodeGroup extends Group {
	//�ͻ�Ҫ��������ȥ������̸̸
	@Override
	public void find() {
		System.out.println("�ҵ������顣����");
	}
	//�ͻ�Ҫ������һ���
	@Override
	public void add() {
		System.out.println("�ͻ�Ҫ������һ��ܡ�����");
	}
	//�ͻ�Ҫȥɾ��һ���
	@Override
	public void delete() {
		System.out.println("�ͻ�Ҫ��ɾ��һ��ܡ�����");
	}
   //�ͻ�Ҫ���޸�һ���
	@Override
	public void change() {
		System.out.println("�ͻ�Ҫȥ�޸�һ��ܡ�������");
	}
	//�ͻ�Ҫ���������ƻ���������������������
	@Override
	public void plan() {
		System.out.println("�ͻ�Ҫ���������ƻ�����������");
	}

}
