package observer.example1.core2;

import java.util.Observable;

import observer.example1.IHanFeiZi;

/**
 * @author yu
 *��һ���Ż���� ���۲���  ע�⣺ʹ�õ���java�Դ��� java.util.Observable
 */
public class HanFeiZi2 extends Observable implements IHanFeiZi{

	@Override
	public void haveBreakfast() {
		System.out.println("�����ӣ���ʼ�Է��ˡ�������");
		//֪ͨ���й۲���
		super.setChanged();
		super.notifyObservers("�������ڳԷ�");
	}

	@Override
	public void haveFun() {
		System.out.println("�����ӣ���ʼ�����ˡ���������");
		super.setChanged();
		super.notifyObservers("�����������֡���");
	}

}
