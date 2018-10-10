package decorator.example1;

public class FatherTest {
	public static void main(String[] args) {
		//把成绩单拿过来     原装的成绩
		SchoolReport sr = new FouthGradeSchoolReport();
		
		//看成绩
		sr.report();
		
		 //签名 ？休想！
		System.out.println("============================");
		
		
		//又加了成绩排名的说明
		sr = new SortDecorator(sr);
		
		//加了最高分说明的成绩单。
		sr = new HighScoreDecorator(sr);
		
		//又加了最低分说明
		sr = new MinSoreDecorator(sr);
	
				
					
		
		sr.report();
		
		sr.sign("老三");  //我叫小三  老爸当然叫老三
	}
}
