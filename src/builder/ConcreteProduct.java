package builder;

/**
 * @author yu
 *具体建造者
 */
public class ConcreteProduct extends Builder {
	private Product product = new Product();
	@Override
	public void setPart() {
		// 产品类内的逻辑处理

	}

	//组建一个产品
	@Override
	public Product buildProduct() {
		return product;
	}

}
