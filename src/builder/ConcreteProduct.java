package builder;

/**
 * @author yu
 *���彨����
 */
public class ConcreteProduct extends Builder {
	private Product product = new Product();
	@Override
	public void setPart() {
		// ��Ʒ���ڵ��߼�����

	}

	//�齨һ����Ʒ
	@Override
	public Product buildProduct() {
		return product;
	}

}
