package proxy.example1;

public class Test {
	public static void main(String[] args) {
		//�����һ�����
		IGamePlayer player =  new GamePlayer("����");
		
		IGamePlayer proxy = new GamePlayerProxy(player);
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2016-03-01 21:11");
		//��¼		
		///player.login("zhangsan", "123456");
		//��ʼɱ��
		//player.killBoss();
		 //����
		//player.upgrade();
		//��¼��Ϸ����ʱ��
		
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();
		
		System.out.println("����ʱ���ǣ�2016-03-02 02��00");
	}
}
 