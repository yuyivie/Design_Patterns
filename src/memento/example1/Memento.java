package memento.example1;

/**
 * @author yu
 *����¼��
 */
public class Memento {
	//�к���״̬
	private String state = "";

	
	
	//ͨ�����캯������״̬��Ϣ
	public Memento(String state) {
		this.state = state;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}
	
}
