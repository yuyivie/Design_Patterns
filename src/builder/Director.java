package builder;

/**
 * @author yu
 *建造者模式中的导演类
 */
public class Director {
	private Builder builder  = new ConcreteProduct();
	//构建不同的产品
	public Product getProduct(){
		
		//设置不同的零件，产生不同的产品
		builder.setPart();
		return builder.buildProduct();
	}
			
}
