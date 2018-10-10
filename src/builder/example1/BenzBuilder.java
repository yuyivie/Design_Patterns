package builder.example1;

import java.util.ArrayList;

/**
 * @author yu
 *����һ������������˳��ͷ���һ�����۳������˺ܶࡣ��������new����ŵ��˽������У������ٳ�����ֱ��new�����ˡ���
 */
public class BenzBuilder extends CarBuilder {
	
	private BenzModel benz = new BenzModel();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);

	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
