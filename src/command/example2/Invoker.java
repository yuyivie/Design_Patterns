package command.example2;

/**
 * @author yu
 *
 * 类描述：负责人
 * 创建日期：2017-1-7
 *
 */
public class Invoker {
	//什么命令
	private Command command;
	
	//客户发出命令
	public void setCommand(Command command){
		this.command = command;
	}
	
	//执行客户的命令
	public void acction(){
		this.command.execute();
	}
}
