package factory.method_factory.example1;

/**
 * @author yu
 *黑色人种
 */
public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黑色人种的皮肤是黑色的！");

	}

	@Override
	public void talk() {
		System.out.println("黑色人说话，一般人听不懂");

	}

}
