package decorator.example1;

public class FatherTest {
	public static void main(String[] args) {
		//�ѳɼ����ù���     ԭװ�ĳɼ�
		SchoolReport sr = new FouthGradeSchoolReport();
		
		//���ɼ�
		sr.report();
		
		 //ǩ�� �����룡
		System.out.println("============================");
		
		
		//�ּ��˳ɼ�������˵��
		sr = new SortDecorator(sr);
		
		//������߷�˵���ĳɼ�����
		sr = new HighScoreDecorator(sr);
		
		//�ּ�����ͷ�˵��
		sr = new MinSoreDecorator(sr);
	
				
					
		
		sr.report();
		
		sr.sign("����");  //�ҽ�С��  �ϰֵ�Ȼ������
	}
}
