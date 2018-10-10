package memento.example1;

public class Boy {
	//�к���״̬
	private String state = "";
	//��ʶŮ����״̬�϶��Ǹı䣬�������飬���еĻ��ȡ�
	public void changeState(){
		this.state = "������ܺܲ���";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//����һ������
	public Memento createMemento(){
		return new Memento(state);
	}
	
	//�ָ�һ������
	public void restoreMomento(Memento memento){
		this.setState(memento.getState());
	}
}
