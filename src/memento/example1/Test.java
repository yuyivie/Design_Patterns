package memento.example1;

/**
 * @author yu
 *备忘录模式：
 *	 在不破坏封装性的前提下，捕获一个对象的内部状态，
 *并在该对象之外保存这个状态，这样以后就可将该对象恢复到原先保存的状态。
 */
public class Test {
	public static void main(String[] args) {
		//声明出主角
		Boy boy  = new Boy();
		
		//声明出备忘录的管理者
		Caretaker caretaker = new Caretaker();
		
		//初始化当前状态
		boy.setState("心情很棒");
		System.out.println("=========男孩现在的状态==========");
		System.out.println(boy.getState());
	
		//需要记录下当前的状态
		/*Boy backUp = new Boy();
		backUp.setState(boy.getState());*/
		caretaker.setMemento(boy.createMemento());
		
		//男孩去追求女孩，状态改变
		boy.changeState();
		System.out.println("\n===========男孩追女孩后的状态============");
		System.out.println(boy.getState());
		//追女孩失败，恢复原状
		//boy.setState(backUp.getState());
		boy.restoreMomento(caretaker.getMemento());
		System.out.println("\n===========男孩恢复后的状态==========");
		System.out.println(boy.getState());
		
	}
}
