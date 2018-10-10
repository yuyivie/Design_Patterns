package memento.example2;

/**
 * @author yu
 *融合备忘录的发起人角色。
 *实现了Cloneable接口 
 */
public class Originator implements Cloneable {
	
	private Originator backup;
	//内部状态
	private String state =  "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//创建一个备忘录
	public Originator createMemento(){
		return this.clone();
	}
	
	//恢复一个备忘录
	public void restoreMemento(Originator originator){
		this.setState(originator.getState());
	}
	
	
	//克隆当前对象
	protected Originator clone(){
		try {
			return (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
