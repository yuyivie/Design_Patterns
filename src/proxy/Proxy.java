package proxy;

/**
 * @author yu
 * ������
 */
public class Proxy implements Subject {
	
	//Ҫ�����ĸ�ʵ����
	private Subject subject= null;
	
	//Ĭ�ϱ�������
	public Proxy(){
		this.subject = new Proxy();
	}
	
	//ͨ�����캯�����ݴ�����
	public Proxy(Object objects){
		this.subject = (Subject) objects;
	}
	
	@Override
	public void request() {
		
		System.out.println("aa");
		

	}

}
