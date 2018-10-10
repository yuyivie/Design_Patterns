package memento;

/**
 * @author yu
 *备忘录模式：
 *	 在不破坏封装性的前提下，捕获一个对象的内部状态，
 *并在该对象之外保存这个状态，这样以后就可将该对象恢复到原先保存的状态。
 *
 *备忘录中有三个角色：  
 *                      发起人角色
 *                      备忘录角色    
 *                      备忘录管理员角色
 *
 *
 *
 *
 *
 *
 */
public class Test {
	public static void main(String[] args) {
		//定义出发起人
		Originator originator =  new Originator();
		//定义出备忘录管理员
		Caretaker  caretaker = new Caretaker();
		// 创建一个备忘录
		caretaker.setMemento(originator.createMemento());
		//恢复一个备忘录
		originator.restoreMemento(caretaker.getMemento());
	}
}
