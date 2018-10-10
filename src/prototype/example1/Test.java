package prototype.example1;

import java.util.Random;

/**
 * @author yu
 *ԭ��ģʽ��
 *		��ԭ��ʵ��ָ��������������࣬����ͨ��������Щԭ�ʹ����µĶ���
 */
public class Test {
	// �����˵������������ֵ�Ǵ����ݿ���ȡ��
	private static int MAX_COUNT = 6;
	public static void main(String[] args) {
		//ģ�ⷢ���ʼ�
		int  i = 0;
		//��ģ�嶨�����������Ǵ����ݿ���ȡ�á�
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX���а�Ȩ����");
		while(i<MAX_COUNT){
			//������ÿ���ʼ���ͬ�ĵط�
			Mail cloneMail = mail.clone();
			
			cloneMail.setAppellation(getRandString(5) + " ������Ůʿ��");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			sendMail(cloneMail);
			i++;
		}
	}
	
	//�����ʼ�
	public static void sendMail(Mail mail){
		System.out.println("���⣺" + mail.getSubject() + "\t�ռ��ˣ�" + mail.getReceiver() + "\t ...���ͳɹ������� " 
				);
	}
	
	//���ָ�����ȵ�����ַ���
	public static String getRandString(int maxLength){
		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for(int i = 0;i < maxLength ; i++){
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	
	}
}
