package adapter.example2;

import adapter.example1.IUserInfo;

/**
 * @author yu
 * ������ģʽҪ�� �� �����������࣬��������̳� �ɵ� �ӿڡ�Ȼ�� ��������  ������  �ɵĽӿڵķ��� ��Ȼ�� ���µ� �ӿ�  �ۺϵ� ��������    ��ͨ������������ �½ӿڵĶ���
 * Ȼ��Ϳ���  �ڼ̳еľɵĽӿڵķ�������   ��ȡ�µ����ֵ��
 */
public class Test {
		public static void main(String[] args) {
			IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
			IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
			IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
			IUserInfo youngGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
			for (int i = 0; i < 10; i++) {
				youngGirl.getMobileNumber();
			}
		}
}
