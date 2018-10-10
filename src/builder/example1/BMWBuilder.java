package builder.example1;

import java.util.ArrayList;

/**
 * @author yu
 * *给定一个汽车的启动顺序就返回一个奔驰车，简单了很多。（不用再new对象放到了建造者中，不用再程序中直接new对象了。）
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
