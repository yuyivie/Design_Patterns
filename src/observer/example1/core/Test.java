package observer.example1.core;

public class Test {
	public static void main(String[] args) {
		//�����۲��߲�������
		Observer lisi = new LiSi();
		Observer wangsi = new WangSi();
		Observer liusi = new LiuSi();
		//�����������
		HanFeiZi hanfeizi = new HanFeiZi();
		//���������ڹ۲캫����
		hanfeizi.addObserver(lisi);
		hanfeizi.addObserver(liusi);
		hanfeizi.addObserver(wangsi);
		//Ȼ�������ǿ����������ڸ�ʲô
		hanfeizi.haveBreakfast();
	}
}
