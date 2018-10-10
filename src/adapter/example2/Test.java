package adapter.example2;

import adapter.example1.IUserInfo;

/**
 * @author yu
 * 适配器模式要点 ： 创建适配器类，适配器类继承 旧的 接口。然后 适配器类  就有了  旧的接口的方法 。然后 将新的 接口  聚合到 适配器里    并通过构造器接收 新接口的对象。
 * 然后就可以  在继承的旧的接口的方法里面   获取新的类的值。
 */
public class Test {
		public static void main(String[] args) {
			IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
			IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
			IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
			IUserInfo youngGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
			for (int i = 0; i < 10; i++) {
				youngGirl.getMobileNumber();
			}
		}
}
