package factory.method_factory;

public class ConcreteCreator extends Creator {

	@Override
	public <T extends Product> T createProdcct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T)product;
	}

}
