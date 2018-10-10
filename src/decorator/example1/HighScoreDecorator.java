package decorator.example1;

import decorator.Component;

public class HighScoreDecorator extends Decorator {

	//构造函数
		public HighScoreDecorator(SchoolReport sr) {
			super(sr);
		}
		
		
			//我要汇报成绩
			private void reportHighScore(){
				System.out.println("这次考试语文最高是75  数学是78   自然是80");
			}
			
			//我要在老爸看到成绩单钱告诉他最高成绩，否则等他一看，就抡起扫把揍我，我哪还有机会说啊。
			@Override
			public void report(){
				this.reportHighScore();
				super.report();
			}
}
