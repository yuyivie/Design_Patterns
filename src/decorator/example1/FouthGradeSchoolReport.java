package decorator.example1;


/**
 * @author yu
 *����ĳɼ��������꼶�ɼ�����
 */
public class FouthGradeSchoolReport extends SchoolReport{

	@Override
	public void report() {
		//�ɼ����ĸ�ʽ��������ӵ�
		System.out.println("�𾴵�XXX�ҳ���");
		System.out.println("........");
		System.out.println(" ���� 62  ��ѧ 65  ���� 98  ��Ȼ  63");
		System.out.println(" ..............");
		System.out.println("                         �ҳ�ǩ����");
		
	}
	//�ҳ�ǩ��
	public void sign(String name) {
		 System.out.println("�ҳ�ǩ��Ϊ��    " + name );
		
	}
	
	
}
