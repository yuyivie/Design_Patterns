package proxy.example2;

import proxy.example1.IGamePlayer;

//
/**
 * @author yu
 *
 */
public class Test {

		//����ģʽ����չ---��ͨ����
	
	public static void main(String[] args) {
		//Ȼ���ٶ���һ��������
		IGamePlayer proxy = new GamePlayerProxy("����");
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2016-03-02 21��20");
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		//��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ�2016-03-03 02:00");
	}
	
}
