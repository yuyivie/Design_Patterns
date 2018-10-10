package decorator.example1;


/**
 * @author yu
 *具体的成绩单（四年级成绩单）
 */
public class FouthGradeSchoolReport extends SchoolReport{

	@Override
	public void report() {
		//成绩单的格式是这个样子的
		System.out.println("尊敬的XXX家长：");
		System.out.println("........");
		System.out.println(" 语文 62  数学 65  体育 98  自然  63");
		System.out.println(" ..............");
		System.out.println("                         家长签名：");
		
	}
	//家长签名
	public void sign(String name) {
		 System.out.println("家长签名为：    " + name );
		
	}
	
	
}
