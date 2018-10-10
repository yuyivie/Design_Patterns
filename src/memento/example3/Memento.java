package memento.example3;

import java.util.HashMap;

/**
 * @author yu
 *备忘录
 */
public class Memento {
	//接收HashMap 作为状态
	private HashMap<String,Object> stateMap;
	//接收一个对象，建立一个备份

	public Memento(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}

	public HashMap<String, Object> getStateMap() {
		return stateMap;
	}

	public void setStateMap(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
	
}
