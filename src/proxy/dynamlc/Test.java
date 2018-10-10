package proxy.dynamlc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.example1.GamePlayer;
import proxy.example1.IGamePlayer;


public class Test {
	public static void main(String[] args) {
		//����һ�����Ե����
		IGamePlayer player = new GamePlayer("����");
		//����һ��handler
		InvocationHandler handler = new GamePlayIH(player);
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2016-3-4 3:20" );
		//������class  loader
		ClassLoader cl = player.getClass().getClassLoader();
		//��̬����һ��������
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
		//IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, player.getClass().getInterfaces(), handler);
		//��¼
		proxy.login("login", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("����ʱ���ǣ�2016-3-4 3:20" );
	}

}
