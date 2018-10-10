package Mediator.example2;


/**
 * @author yu
 *
 * 类描述：抽象同事类
 * 创建日期：2016-5-16
 *
 */
public abstract class AbstractColleague {
	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
	
}
