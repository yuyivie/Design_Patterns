package builder;

/**
 * @author yu
 *������ģʽ�еĵ�����
 */
public class Director {
	private Builder builder  = new ConcreteProduct();
	//������ͬ�Ĳ�Ʒ
	public Product getProduct(){
		
		//���ò�ͬ�������������ͬ�Ĳ�Ʒ
		builder.setPart();
		return builder.buildProduct();
	}
			
}
