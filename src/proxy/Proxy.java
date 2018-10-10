package proxy;

/**
 * @author yu
 * 代理类
 */
public class Proxy implements Subject {
	
	//要代理哪个实现类
	private Subject subject= null;
	
	//默认被代理者
	public Proxy(){
		this.subject = new Proxy();
	}
	
	//通过构造函数传递代理者
	public Proxy(Object objects){
		this.subject = (Subject) objects;
	}
	
	@Override
	public void request() {
		
		System.out.println("aa");
		

	}

}
