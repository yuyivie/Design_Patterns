package proxy.example3;

/**
 * @author yu
 *
 */
public interface IGamePlayer {
	
	//��¼��Ϸ
	public void login(String user,String password);
	
	//ɱ�֣�����������Ϸ����Ҫ��ɫ
	public void killBoss();
	
	//����
	public void upgrade();
	
	//ÿ���˶������Ҹ��Լ��Ĵ���
	public IGamePlayer getProxy();
}
