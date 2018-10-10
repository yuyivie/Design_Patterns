package command.example2;

import command.example1.CodeGroup;
import command.example1.PageGroup;
import command.example1.RequirementGroup;

/**
 * @author yu
 *
 * �������� ����������
 * �������ڣ�2017-1-7
 *
 */
public abstract class Command {
		//�������鶼����� ���������ֱ��ʹ��
	protected RequirementGroup rg = new RequirementGroup(); 
	protected PageGroup pg = new PageGroup();
	protected CodeGroup cg = new CodeGroup();
	    //ֻ��һ����������Ҫ����ʲô����
	public abstract void execute();
}
