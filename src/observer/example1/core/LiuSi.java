package observer.example1.core;

public class LiuSi implements Observer{
	//刘斯，观察到韩非子有活动后，自己也得做一些事。
	public void update(String str){
		System.out.println("刘斯：观察到韩非子活动");
		this.happy(str);
		System.out.println("刘斯：乐死了\n");
	}
	//一看到韩非子有变化，他就快乐
	private void happy(String context){
		System.out.println("刘斯：因为" + context + "--所以我快乐啊");
		
	}
}
