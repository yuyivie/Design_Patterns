package observer.example1.core2;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer{
	
	//������˹�Ǹ��۲��ߣ�һ���������л������֪��������Ҫ���ϰ�㱨
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("��˹���۲쵽�����ӻ����ʼ���ϰ�㱨�ˡ�����");
		this.reportToQinShiHuang(arg.toString());
	}
	//�㱨����ʼ��
	private void reportToQinShiHuang(String reportContext){
		System.out.println("��˹�����棬���ϰ壡�������л��----->" + reportContext);
	}
}
