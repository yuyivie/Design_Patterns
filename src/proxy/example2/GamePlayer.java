package proxy.example2;

import proxy.example1.IGamePlayer;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	
	//���캯������˭�ܹ��������󣬲�ͬʱ��������
	public GamePlayer(IGamePlayer _gamePlayer,String _name) throws Exception{
		if(_gamePlayer == null){
			throw new Exception("���ܴ�����ʵ�Ľ�ɫ");
		}else{
			this.name = _name;
		}
	}
	
	//��֣��������ľ���ɱ�Ϲ�
		public void killBoss(){
			System.out.println(this.name+" �ڴ�֣�");
		}
		
		//������Ϸ֮ǰ�϶��õ�¼�ɣ�����һ����Ҫ����
		public void login(String user,String password){
			System.out.println("��¼��Ϊ��" + user +"���û�"  + this.name + " ��¼�ɹ���");
		}
		
		//�����������ķ����кܶ࣬��Ǯ��һ�֣�������Ҳ��һ�֡�
		public void upgrade(){
			System.out.println(this.name + " ������һ����");
		}
		

}
