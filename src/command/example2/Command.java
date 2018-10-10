package command.example2;

import command.example1.CodeGroup;
import command.example1.PageGroup;
import command.example1.RequirementGroup;

/**
 * @author yu
 *
 * 类描述： 抽象命令类
 * 创建日期：2017-1-7
 *
 */
public abstract class Command {
		//把三个组都定义好 ，子类可以直接使用
	protected RequirementGroup rg = new RequirementGroup(); 
	protected PageGroup pg = new PageGroup();
	protected CodeGroup cg = new CodeGroup();
	    //只有一个方法，你要我做什么事情
	public abstract void execute();
}
