package memento.example5;

/**
 * @author yu
 * ����¼������
 */
public class Caretaker {
	//����¼����
	private IMemento memento;

	public IMemento getMemento() {
		return memento;
	}

	public void setMemento(IMemento memento) {
		this.memento = memento;
	}
	
	
}
