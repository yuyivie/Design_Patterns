package proxy.dynamlc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.example1.GamePlayer;
import proxy.example1.IGamePlayer;


public class Test {
	public static void main(String[] args) {
		//定义一个痴迷的玩家
		IGamePlayer player = new GamePlayer("张三");
		//定义一个handler
		InvocationHandler handler = new GamePlayIH(player);
		//开始打游戏，记下时间戳
		System.out.println("开始时间是：2016-3-4 3:20" );
		//获得类的class  loader
		ClassLoader cl = player.getClass().getClassLoader();
		//动态产生一个代理者
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
		//IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, player.getClass().getInterfaces(), handler);
		//登录
		proxy.login("login", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是：2016-3-4 3:20" );
	}

}
