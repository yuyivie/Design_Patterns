package Mediator.example2;


/**
 * @author yu
 *
 * ������������ͬ����
 * �������ڣ�2016-5-16
 *
 */
public abstract class AbstractColleague {
	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
	
}
