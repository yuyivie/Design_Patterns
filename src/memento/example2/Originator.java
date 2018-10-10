package memento.example2;

/**
 * @author yu
 *�ںϱ���¼�ķ����˽�ɫ��
 *ʵ����Cloneable�ӿ� 
 */
public class Originator implements Cloneable {
	
	private Originator backup;
	//�ڲ�״̬
	private String state =  "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//����һ������¼
	public Originator createMemento(){
		return this.clone();
	}
	
	//�ָ�һ������¼
	public void restoreMemento(Originator originator){
		this.setState(originator.getState());
	}
	
	
	//��¡��ǰ����
	protected Originator clone(){
		try {
			return (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
