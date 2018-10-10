package proxy.example3;

/**
 * @author yu
 *
 */
public interface IGamePlayer {
	
	//登录游戏
	public void login(String user,String password);
	
	//杀怪，这是网络游戏的最要特色
	public void killBoss();
	
	//升级
	public void upgrade();
	
	//每个人都可以找个自己的代理
	public IGamePlayer getProxy();
}
