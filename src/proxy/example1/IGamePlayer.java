package proxy.example1;


/**
 * @author yu
 *游戏者接口
 */
public interface IGamePlayer {
	//登录游戏
	public void login(String user,String password);
	
	//杀怪，网络游戏最主要的特色
	public void killBoss();
	
	//升级
	public void upgrade();
	
}
