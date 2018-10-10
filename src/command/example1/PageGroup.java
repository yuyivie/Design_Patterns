package command.example1;

public class PageGroup extends Group {
	//首先这个美工组 应该能找到吧  不然你跟谁谈
	@Override
	public void find() {
		System.out.println("找到美工组。。。。。。。。");
	}
	//美工被要求增加一个页面
	@Override
	public void add() {
		System.out.println("客户要求增加一个页面。。。。");
	}
	
	 //客户要求删除一些页面
	@Override
	public void delete() {
		System.out.println("客户要求删除一些页面。。。。。。");
	}
	//客户要求对现有的页面进行修改
	@Override
	public void change() {
		System.out.println("客户要求修改一些页面。。。");
	}
	//所有的增删改 都要给出计划
	@Override
	public void plan() {
		System.out.println("客户要求页面变更计划。。。。");
	}

}
