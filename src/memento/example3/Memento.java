package memento.example3;

import java.util.HashMap;

/**
 * @author yu
 *����¼
 */
public class Memento {
	//����HashMap ��Ϊ״̬
	private HashMap<String,Object> stateMap;
	//����һ�����󣬽���һ������

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
