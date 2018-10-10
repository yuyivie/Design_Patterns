package observer.example1;

/**
 * @author yu
 *通过聚集方式的场景类
 */
public class Test2 {
	public static void main(String[] args) {
		//定义出韩非子
		HanFeiZi2 hanFeiZi = new HanFeiZi2();
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
	}
}
