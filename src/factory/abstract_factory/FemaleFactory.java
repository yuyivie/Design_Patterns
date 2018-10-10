package factory.abstract_factory;

public class FemaleFactory implements HumanFactory {

	//����������Ů��
	@Override
	public Human createYellowHuman() {
		return new FemailBlackHuman();
	}
	//����������Ů��
	@Override
	public Human createWhiteHuman() {
		return new FemailWhlteHuman();
	}
	//����������Ů��
	@Override
	public Human createBlackHuman() {
		return new FemailBlackHuman();
	}

}
