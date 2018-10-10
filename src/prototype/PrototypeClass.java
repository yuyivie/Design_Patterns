package prototype;

public class PrototypeClass implements Cloneable {
	//重写父类的方法
	public PrototypeClass clone(){
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
