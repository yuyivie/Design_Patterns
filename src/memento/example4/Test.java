package memento.example4;

import memento.example3.Originator;

public class Test {
	public static void main(String[] args) {
		//定义出发起人
		Originator originator  = new Originator();
		originator.setState1("haha");
		originator.setState2("aaaaa");
		originator.setState3("qqqqq");
		System.out.println(originator.toString());
		//定义出备忘录管理员
		Caretaker caretaker = new Caretaker();
		//创建两个备忘录
		caretaker.setMemento("001", originator.createMemento());
		caretaker.setMemento("002", originator.createMemento());
		originator.setState1("哈哈");
		originator.setState2("喝喝");
		originator.setState3("呼呼");
		System.out.println(originator.toString());
		//恢复一个指定标记的备忘录
		originator.restoreMemento(caretaker.getMemento("001"));
		
		System.out.println(originator.toString());
	}
	
	
	
}
