package proxy.example3;
//ǿ�ƴ������
public class Test {
	public static void main(String[] args) {

		//����һ����Ϸ�Ľ�ɫ
		IGamePlayer player =  new GamePlayer("����");
		//��ʼ����Ϸ������ʱ���
		
		System.out.println("��ʼʱ���ǣ�2016-03-02 22��33");
		player.login("zhagnsan", "password");
		player.killBoss();
		player.upgrade();
		//��¼��Ϸ����ʱ��
		System.out.println("����ʱ���ǣ�2016-03-03 02��00");
		
		System.out.println("===================================");
		

		//����һ����Ϸ�Ľ�ɫ
		IGamePlayer player2 =  new GamePlayer("����");
		
		IGamePlayer proxy = new GamePlayerProxy(player2);
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2016-03-02 22��33");
		proxy.login("zhagnsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		//��¼��Ϸ����ʱ��
		System.out.println("����ʱ���ǣ�2016-03-03 02��00");
		

		System.out.println("===================================");
		
		

		//����һ����Ϸ�Ľ�ɫ
		IGamePlayer player3 =  new GamePlayer("����");
		
		IGamePlayer ploxy2 = player3.getProxy();
		
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2016-03-02 22��33");
		ploxy2.login("zhagnsan", "password");
		ploxy2.killBoss();
		ploxy2.upgrade();
		//��¼��Ϸ����ʱ��
		System.out.println("����ʱ���ǣ�2016-03-03 02��00");
		
		
	}
			
}
