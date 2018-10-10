package decorator.example1;

import decorator.Component;

public class HighScoreDecorator extends Decorator {

	//���캯��
		public HighScoreDecorator(SchoolReport sr) {
			super(sr);
		}
		
		
			//��Ҫ�㱨�ɼ�
			private void reportHighScore(){
				System.out.println("��ο������������75  ��ѧ��78   ��Ȼ��80");
			}
			
			//��Ҫ���ϰֿ����ɼ���Ǯ��������߳ɼ����������һ����������ɨ�����ң����Ļ��л���˵����
			@Override
			public void report(){
				this.reportHighScore();
				super.report();
			}
}
