package proxy.example1;

/**
 * @author yu
 *��Ϸ��
 */
public class GamePlayer implements IGamePlayer{
	
	private String name="";
	
	//ͨ�����캯����������
	public GamePlayer(String _name){
		this.name = _name;
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
