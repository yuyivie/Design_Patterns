package observer.example1.core;

import java.util.ArrayList;

import observer.example1.IHanFeiZi;

public class HanFeiZi implements Observable,IHanFeiZi{
	//������䳤���飬������Ĺ۲���
	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	//���ӹ۲���
	public void addObserver(Observer observer){
		this.observerList.add(observer);
	}
	//ɾ���۲���
	public void deleteObserver(Observer observer){
		this.observerList.remove(observer);
	}
	//֪ͨ���еĹ۲���
	public void notifyObservers(String context){
		for (Observer observer : observerList) {
			observer.update(context);
		}
	}
	//������Ҫ�Է���
	public void haveBreakfast(){
		System.out.println("�����ӣ���ʼ�Է��ˡ���������");
		//֪ͨ���еĹ۲���
		this.notifyObservers("�������ڳԷ�");
	}
	//�����ӿ�ʼ������
	public void haveFun(){
		System.out.println("�����ӣ���ʼ�����ˡ�������");
		this.notifyObservers("������������");
	}
}
