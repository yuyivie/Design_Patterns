package template_method;

/**
 * @author yu
 *ģ�巽��ģʽ:   
 *				��һ�������е��㷨�Ŀ�ܣ�����һЩ�����ӳٵ������С�
 *			ʹ��������Բ��ı�һ���㷨�Ľṹ�����ض����㷨��ĳЩ�ض��Ĳ���
 */

public class Test {
	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		//����ģ�巽��
		class1.templateMethod();
		class2.templateMethod();
	}
}
