package adapter;

/**
 * @author yu
 *
 * 类描述：适配器模式
 * 创建日期：2016-5-28
 *
 */
public class Test {
	public static void main(String[] args) {
		//原有的业务逻辑
		Target target = new ConcreteTarget();
		target.request();
		//现在增加了适配器角色后的业务逻辑
		Target target2 = new Adapter();
		target2.request();
	}
}
