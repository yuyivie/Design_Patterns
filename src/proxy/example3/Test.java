package proxy.example3;
//强制代理测试
public class Test {
	public static void main(String[] args) {

		//定义一个游戏的角色
		IGamePlayer player =  new GamePlayer("张三");
		//开始打游戏，记下时间戳
		
		System.out.println("开始时间是：2016-03-02 22：33");
		player.login("zhagnsan", "password");
		player.killBoss();
		player.upgrade();
		//记录游戏结束时间
		System.out.println("结束时间是：2016-03-03 02：00");
		
		System.out.println("===================================");
		

		//定义一个游戏的角色
		IGamePlayer player2 =  new GamePlayer("张三");
		
		IGamePlayer proxy = new GamePlayerProxy(player2);
		//开始打游戏，记下时间戳
		System.out.println("开始时间是：2016-03-02 22：33");
		proxy.login("zhagnsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		//记录游戏结束时间
		System.out.println("结束时间是：2016-03-03 02：00");
		

		System.out.println("===================================");
		
		

		//定义一个游戏的角色
		IGamePlayer player3 =  new GamePlayer("张三");
		
		IGamePlayer ploxy2 = player3.getProxy();
		
		//开始打游戏，记下时间戳
		System.out.println("开始时间是：2016-03-02 22：33");
		ploxy2.login("zhagnsan", "password");
		ploxy2.killBoss();
		ploxy2.upgrade();
		//记录游戏结束时间
		System.out.println("结束时间是：2016-03-03 02：00");
		
		
	}
			
}
