package adapter.example1;

/**
 * @author yu
 *������ģʽ��
 *	 ��һ����Ľӿڱ任�ɿͻ������ڴ�����һ�ֽӿڣ��Ӷ�ʹԭ����ӿڲ�ƥ��
 *  ���޷���һ�����������඼�ܹ���һ������
 *  
 *  ע�⣺������ģʽ����ϸ��ƽ׶β�Ҫ�������������ǽ�������ڿ����׶ε����⣬���ǽ�����ڷ��۵���Ŀ������
 *  û��һ��ϵͳ����ʦ��������ϸ��Ƶ�ʱ����ʹ��������ģʽ������ҪӦ������չӦ����
 */
public class Test {
	public static void main(String[] args) {
		//û�������ϵͳ�����ǣ�������д�ġ�
		IUserInfo youngGirl = new UserInfo();
		//�����ݿ��в鵽5��
		for(int i=0;i<5;i++){
			youngGirl.getMobileNumber();
		}
		
		//��ȡ����������
		IUserInfo youngGirl2 = new OuterUserInfo();
		for (int i = 0; i < 5; i++) {
			youngGirl2.getMobileNumber();
		}
	}
}
