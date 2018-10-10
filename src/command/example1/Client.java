package command.example1;

public class Client {
	public static void main(String[] args) {
		//首先找到需求组说 ，过来天需求，并修改。
		System.out.println("----要求客户增加一个需求");
		Group rg = new RequirementGroup();
		//找到需求组
		rg.find();
		//增加一个需求
		rg.add();
		//要求变更计划
		rg.plan();
		
		
		
		System.out.println(" \n\n-----------客户需要修改页面----------");
		Group pg = new PageGroup();
		pg.find();
		pg.delete();
		pg.plan();
	}
}
