package adapter.example1;

/**
 * @author yu
 *Ա��ʵ����
 */
public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		System.out.println("������������������");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("������Ա���ļ�ͥ��ַ����������");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("����˵��ֻ������ǡ�����������");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("�칫˾�绰�ǡ�����������");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("����˵�ְλ��BOSS������������");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("��ͥ�绰�ǡ�����������");
		return null;
	}

}
