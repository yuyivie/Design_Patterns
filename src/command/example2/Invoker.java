package command.example2;

/**
 * @author yu
 *
 * ��������������
 * �������ڣ�2017-1-7
 *
 */
public class Invoker {
	//ʲô����
	private Command command;
	
	//�ͻ���������
	public void setCommand(Command command){
		this.command = command;
	}
	
	//ִ�пͻ�������
	public void acction(){
		this.command.execute();
	}
}
