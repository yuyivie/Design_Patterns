package observer.example1.core;

public class LiSi  implements Observer{
	//������˹�Ǹ��۲��ߣ�һ���������л������֪��������Ҫ���ϰ�㱨
	public void update(String str){
		System.out.println("��˹���۲쵽�����ӻ���Ϳ�ʼ���ϰ�㱨");
		this.reportToQinShihuang(str);
	}
	//�㱨����ʼ��
	private void reportToQinShihuang(String reportContext){
		System.out.println("��˹�����棬���ϰ壡�������л��--->" + reportContext);
	}
}
