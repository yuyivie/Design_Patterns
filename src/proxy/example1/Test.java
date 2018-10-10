package proxy.example1;

public class Test {
	public static void main(String[] args) {
		//定义个一个玩家
		IGamePlayer player =  new GamePlayer("张三");
		
		IGamePlayer proxy = new GamePlayerProxy(player);
		//开始打游戏，记下时间戳
		System.out.println("开始时间是：2016-03-01 21:11");
		//登录		
		///player.login("zhangsan", "123456");
		//开始杀怪
		//player.killBoss();
		 //升级
		//player.upgrade();
		//记录游戏结束时间
		
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();
		
		System.out.println("结束时间是：2016-03-02 02：00");
	}
}
 