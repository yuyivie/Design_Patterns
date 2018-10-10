package factory.abstract_factory;

public class FemaleFactory implements HumanFactory {

	//生产出黄人女性
	@Override
	public Human createYellowHuman() {
		return new FemailBlackHuman();
	}
	//生产出白人女性
	@Override
	public Human createWhiteHuman() {
		return new FemailWhlteHuman();
	}
	//生产出黄人女性
	@Override
	public Human createBlackHuman() {
		return new FemailBlackHuman();
	}

}
