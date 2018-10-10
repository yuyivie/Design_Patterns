package template_method;

/**
 * @author yu
 *模板方法模式:   
 *				定一个操作中的算法的框架，而将一些步骤延迟到子类中。
 *			使得子类可以不改变一个算法的结构即可重定义算法的某些特定的步骤
 */

public class Test {
	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		//调用模板方法
		class1.templateMethod();
		class2.templateMethod();
	}
}
