package observer.example1;

/**
 * @author yu
 * �ڶ��ַ�ʽ�� ������  ��ֱ�Ӱ�lisi�ۼ�������
 */
public class HanFeiZi2 implements IHanFeiZi{
	//����˹��������
	private ILiSi liSi = new LiSi();
	
	//������Ҫ�Է��ˡ�
	@Override
	public void haveBreakfast() {
		System.out.println("�����ӣ���ʼ�Է��ˡ�������");
		//֪ͨ��˹
		this.liSi.update("�������ڳԷ�������");
	}

	@Override
	public void haveFun() {
		System.out.println("�����ӣ���ʼ�����ˡ�������");
		this.liSi.update("������������");
	}
	
}
