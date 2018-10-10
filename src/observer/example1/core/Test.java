package observer.example1.core;

public class Test {
	public static void main(String[] args) {
		//三个观察者产生出来
		Observer lisi = new LiSi();
		Observer wangsi = new WangSi();
		Observer liusi = new LiuSi();
		//定义出韩非子
		HanFeiZi hanfeizi = new HanFeiZi();
		//有三个人在观察韩非子
		hanfeizi.addObserver(lisi);
		hanfeizi.addObserver(liusi);
		hanfeizi.addObserver(wangsi);
		//然后让我们看看韩非子在干什么
		hanfeizi.haveBreakfast();
	}
}
