package adapter.example1;

/**
 * @author yu
 *适配器模式：
 *	 将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配
 *  而无法在一起工作的两个类都能够在一起工作。
 *  
 *  注意：适配器模式在详细设计阶段不要考虑他，他不是解决还处在开发阶段的问题，而是解决正在服役的项目的问题
 *  没有一个系统分析师会在做详细设计的时候考虑使用适配器模式。他主要应用在扩展应用中
 */
public class Test {
	public static void main(String[] args) {
		//没有与外界系统链接是，是这样写的。
		IUserInfo youngGirl = new UserInfo();
		//从数据库中查到5个
		for(int i=0;i<5;i++){
			youngGirl.getMobileNumber();
		}
		
		//获取的外界的数据
		IUserInfo youngGirl2 = new OuterUserInfo();
		for (int i = 0; i < 5; i++) {
			youngGirl2.getMobileNumber();
		}
	}
}
