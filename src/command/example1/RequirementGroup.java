package command.example1;

/**
 * @author yu
 *
 * ��������������
 * �������ڣ�2016-6-6
 *
 */
public class RequirementGroup extends Group {
	//�ͻ�Ҫ���������ȥ������̸
	@Override
	public void find() {
		System.out.println("�ҵ������顣����");
	}
	//�ͻ�Ҫ������һ������
	@Override
	public void add() {
		System.out.println("�ͻ�Ҫ������һ�����󡣡�����");
	}
    //�ͻ�Ҫ��ɾ��һ������
	@Override
	public void delete() {
		System.out.println("�ͻ�Ҫ��ɾ��һ�����󡣡�����");
	}
	//�ͻ�Ҫ���޸�һ������
	@Override
	public void change() {
		System.out.println("�ͻ�Ҫȥ�޸�һ�����󡣡�����");
	}
	
	//�ͻ���������ƻ�
	@Override
	public void plan() {
		System.out.println("�ͻ���������ƻ�����������");
	}

}
