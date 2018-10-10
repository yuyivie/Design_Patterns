package builder.example1;

import java.util.ArrayList;

/**
 * @author yu
 * *����һ������������˳��ͷ���һ�����۳������˺ܶࡣ��������new����ŵ��˽������У������ٳ�����ֱ��new�����ˡ���
 */
public class BMWBuilder extends CarBuilder {
	private BMWModel  bmw = new BMWModel();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {

		return this.bmw;
	}

}
