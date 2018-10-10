package observer.example1;

public class Spy extends Thread {
	private HanFeiZi hanFeiZi;
	private LiSi liSi;
	private String type;
	//ͨ�����캯�����ݲ�������Ҫ��ص���˭��˭����أ�Ҫ���ʲô��
	public Spy(HanFeiZi hanFeiZi,LiSi liSi,String type){
		this.hanFeiZi = hanFeiZi;
		this.liSi = liSi;
		this.type = type;
	}
	@Override
	public void run() {
		while(true){
			if(this.type.equals("breakfast")){//����Ƿ��ڳ����
				//������ֺ������ڳԷ�����֪ͨ��˹
				if(this.hanFeiZi.isHanvingBreakfast()){
					this.liSi.update("�������ڳԷ�");
					//����״̬���������
					this.hanFeiZi.setHanvingBreakfast(false);
				}else {//����Ƿ�������
					if(this.hanFeiZi.isHavingFun()){
						this.liSi.update("������������");
						this.hanFeiZi.setHavingFun(false);
					}
				}
			}
		}
	}
}
