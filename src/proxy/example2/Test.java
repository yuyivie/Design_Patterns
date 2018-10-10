package proxy.example2;

import proxy.example1.IGamePlayer;

//
/**
 * @author yu
 *
 */
public class Test {

		//代理模式的扩展---普通代理
	
	public static void main(String[] args) {
		//然后再定义一个代练者
		IGamePlayer proxy = new GamePlayerProxy("张三");
		//开始打游戏，记下时间戳
		System.out.println("开始时间是：2016-03-02 21：20");
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		//记录结束游戏时间
		System.out.println("结束时间是：2016-03-03 02:00");
	}
	
}
