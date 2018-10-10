package observer.example1;

import java.awt.List;

/**
 * @author yu
 *����ı��۲���
 */
public class HanFeiZi implements IHanFeiZi {
	
	
	//�������Ƿ��ڳԷ�����Ϊ��ص��жϱ�׼
	private  boolean isHanvingBreakfast = false;
	//�������Ƿ�������
	private boolean isHavingFun = false;
	
	//������Ҫ�Է��ˡ�
	@Override
 	public void haveBreakfast() {
		System.out.println("�����ӣ���ʼ�Է��ˡ�����");
		this.isHanvingBreakfast = true;

	}
	//������Ҫ�����ˡ�
	@Override
	public void haveFun() {
		System.out.println("�����ӣ���ʼ�����ˡ�������");
		this.isHavingFun = true;
	}
	
	//������bean�Ļ���������getter/setter ����˵�ˡ�
	public boolean isHanvingBreakfast() {
		return isHanvingBreakfast;
	}
	public void setHanvingBreakfast(boolean isHanvingBreakfast) {
		this.isHanvingBreakfast = isHanvingBreakfast;
	}
	public boolean isHavingFun() {
		return isHavingFun;
	}
	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}
	

	

}
