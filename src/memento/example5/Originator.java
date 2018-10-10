package memento.example5;

public class Originator {
	//�ڲ�״̬
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	} 
	//����һ������¼
	public IMemento createMemento(){
		return new Memento(this.state);
	}
	//�ָ�һ������¼
	public void restoreMemento(IMemento memento){
		this.setState(((Memento)memento).getState());
	}
	
	//������
	private class Memento implements IMemento{
		//�����˵��ڲ�״̬
		private String state="";
		//���캯�����ݲ���
		private Memento(String state){
			this.state = state;
		}
		private String getState(){
			return state;
		}
		private void setState(String state){
			this.state = state;
		}
	}
}
