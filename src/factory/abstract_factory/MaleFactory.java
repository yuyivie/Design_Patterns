package factory.abstract_factory;

public class MaleFactory implements HumanFactory {

	//��������������
	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}
	//��������ɫ����
	@Override
	public Human createWhiteHuman() {
		return new MailWhiteHuman();
	}
	//��������ɫ����
	@Override
	public Human createBlackHuman() {
		return  new MailBlackHuman();
	}

}
