package command.example1;

public class Client {
	public static void main(String[] args) {
		//�����ҵ�������˵ �����������󣬲��޸ġ�
		System.out.println("----Ҫ��ͻ�����һ������");
		Group rg = new RequirementGroup();
		//�ҵ�������
		rg.find();
		//����һ������
		rg.add();
		//Ҫ�����ƻ�
		rg.plan();
		
		
		
		System.out.println(" \n\n-----------�ͻ���Ҫ�޸�ҳ��----------");
		Group pg = new PageGroup();
		pg.find();
		pg.delete();
		pg.plan();
	}
}
