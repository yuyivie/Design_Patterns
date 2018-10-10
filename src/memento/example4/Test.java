package memento.example4;

import memento.example3.Originator;

public class Test {
	public static void main(String[] args) {
		//�����������
		Originator originator  = new Originator();
		originator.setState1("haha");
		originator.setState2("aaaaa");
		originator.setState3("qqqqq");
		System.out.println(originator.toString());
		//���������¼����Ա
		Caretaker caretaker = new Caretaker();
		//������������¼
		caretaker.setMemento("001", originator.createMemento());
		caretaker.setMemento("002", originator.createMemento());
		originator.setState1("����");
		originator.setState2("�Ⱥ�");
		originator.setState3("����");
		System.out.println(originator.toString());
		//�ָ�һ��ָ����ǵı���¼
		originator.restoreMemento(caretaker.getMemento("001"));
		
		System.out.println(originator.toString());
	}
	
	
	
}
