package memento.example4;

import java.util.HashMap;

import memento.example3.Memento;

public class Caretaker {
	//ÈİÄÉ±¸ÍüÂ¼µÄÈİÆ÷
	private HashMap<String,Memento> memMap = new HashMap<String,Memento>();

	public Memento getMemento(String idx){
		return memMap.get(idx);
	}
	public void setMemento(String idx,Memento memento){
		this.memMap.put(idx, memento);
	}
	
}
