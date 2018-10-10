package proxy.example3;

public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer gamePlayer = null;
	//���캯�������û���
	public GamePlayerProxy(IGamePlayer _gamePlayer){
		this.gamePlayer = _gamePlayer;
	}
	//������¼
	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}
	//����ɱ��
	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}
	//��������
	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}
	//����Ĵ�����ʱ��û�У������Լ�
	@Override
	public IGamePlayer getProxy() {
		
		return this;
	}

}
