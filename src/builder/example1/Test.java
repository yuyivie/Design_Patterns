package builder.example1;

import java.util.ArrayList;

/**
 * @author yu
 *建造者模式，也叫生成器模式，
 *将一个复杂对象的构建与其表示分离，使得同样的构建过程可以创建不同的表示。
 */
public class Test {
	 public static void main(String[] args) {
		/*
		 * 客户告诉XX公司，我要一个这样的模型，然后XX公司就告诉我老大
		 * 说要这样一个模型，这样一个顺序，然后我就来制造
		 */
		 //添加建造者模式之前的方法，每次都需要new一个对象
	/*	 BenzModel bena = new BenzModel();
		 //存放run顺序
		 ArrayList<String> sequence = new ArrayList<String>();
		 sequence.add("engineBoom");//客户要求的，run的时候就要先发动引擎
		 sequence.add("start");//启动起来
		 sequence.add("stop");//开了一段就停下来
		 bena.setSequence(sequence);//我们把这个顺序赋予给奔驰车
		 bena.run();*/
		 
		 
		 
		 //添加建造者之后的方法，
		/* ArrayList<String>sequence = new ArrayList<String>();
		 sequence.add("engineBoom");//客户要求的，run的时候就要先发动引擎
		 sequence.add("start");//启动起来
		 sequence.add("stop");//开了一段就停下来
		//要一个奔驰车
		 BenzBuilder benzBuilder = new BenzBuilder();
		 benzBuilder.setSequence(sequence);
		 //制造出一个奔驰车。
		 BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		 //奔驰车跑一下看看
		 benz.run();
		 //按照同样的方法在造一个宝马车。
		 BMWBuilder bmwBuilder = new BMWBuilder();
		 bmwBuilder.setSequence(sequence);
		 BMWModel bmw =  (BMWModel) bmwBuilder.getCarModel();
		 bmw.run();*/
		 
		 
		 //添加了导演类之后的方法
		 
		 /*
		  * 有了这样一个导演类后，我们的场景类就更容易处理了。XX公司要A类型的奔驰车一万辆，
		  * B类型的奔驰车100万辆，C类型的宝马车1000万辆，D类型的不需要，就非常容易处理了
		  */
		 Director director = new Director();
		 //1万辆A类型的奔驰车
		 for (int i = 0; i < 10000; i++) {
			director.getABenzModel().run();
		}
		 //100万辆B类型的奔驰车。
		 for (int i = 0; i <1000000 ; i++) {
			director.getBBenzModlel().run();
		}
		 //1000万辆C类型的宝马车。
		 for (int i = 0; i < 10000000; i++) {
			director.getCBMWModel().run();
		}
	}
}
