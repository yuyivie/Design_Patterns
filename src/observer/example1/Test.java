package observer.example1;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		//����������Ӻ���˹
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		//�۲����
		Spy spyBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
		//��ʼ�����̣߳����
		spyBreakfast.start();
		//�۲��������
		Spy spyFun = new Spy(hanFeiZi, liSi, "fun");
		spyFun.start();
		//Ȼ�󿴿��������ڸ�ʲô��
		Thread.sleep(1000);//���̵߳ȴ�һ��������ִ��
		hanFeiZi.haveBreakfast();
		Thread.sleep(1000);
		hanFeiZi.haveFun();
		
	}
}
