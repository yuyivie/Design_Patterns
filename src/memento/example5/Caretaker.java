package memento.example5;

/**
 * @author yu
 * 备忘录管理者
 */
public class Caretaker {
	//备忘录对象
	private IMemento memento;

	public IMemento getMemento() {
		return memento;
	}

	public void setMemento(IMemento memento) {
		this.memento = memento;
	}
	
	
}
