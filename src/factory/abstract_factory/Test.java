package factory.abstract_factory;

/**
 * @author yu
 *抽象工厂模式：
 *			为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
 *
 *		
 */
public class Test {
	public static void main(String[] args) {

	//第一条生成线，男性生产线
	HumanFactory maleHumanFactory = new  MaleFactory();
	//第二条生产线，女性生产线
	HumanFactory femaleHumanFactory = new FemaleFactory();
	//生产线建立完毕，开始生产人了；
	Human maleYellowHuman = maleHumanFactory.createYellowHuman();
	Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
	System.out.println("\n--------生产一个黄色女性-----");
	femaleYellowHuman.getColor();
	femaleYellowHuman.talk();
	femaleYellowHuman.getSex();
	System.out.println("\n----------生产一个黄色男性---------");
	maleYellowHuman.getColor();
	maleYellowHuman.talk();
	maleYellowHuman.getSex();
	
	
	
	}
	
	
	


}
