package proxy.example2;

import proxy.example1.IGamePlayer;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	
	//构造函数限制谁能狗创建对象，并同时传递姓名
	public GamePlayer(IGamePlayer _gamePlayer,String _name) throws Exception{
		if(_gamePlayer == null){
			throw new Exception("不能创建真实的角色");
		}else{
			this.name = _name;
		}
	}
	
	//打怪，最期望的就是杀老怪
		public void killBoss(){
			System.out.println(this.name+" 在打怪！");
		}
		
		//进入游戏之前肯定得登录吧，这是一个必要条件
		public void login(String user,String password){
			System.out.println("登录名为：" + user +"的用户"  + this.name + " 登录成功！");
		}
		
		//升级，升级的方法有很多，花钱是一种，做任务也是一种。
		public void upgrade(){
			System.out.println(this.name + " 又升了一级。");
		}
		

}
