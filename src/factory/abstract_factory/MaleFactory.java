package factory.abstract_factory;

public class MaleFactory implements HumanFactory {

	//生产出黄人男性
	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}
	//生产出白色男性
	@Override
	public Human createWhiteHuman() {
		return new MailWhiteHuman();
	}
	//生产出黑色男性
	@Override
	public Human createBlackHuman() {
		return  new MailBlackHuman();
	}

}
