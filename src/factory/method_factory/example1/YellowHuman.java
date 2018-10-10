package factory.method_factory.example1;

/**
 * @author yu
 *黄色人种
 */
public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黄色人种的皮肤是黄色的。");

	}

	@Override
	public void talk() {
		System.out.println("黄色人会说话，一般都是双字节的。");

	}

}
