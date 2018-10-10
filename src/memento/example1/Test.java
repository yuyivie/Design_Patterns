package memento.example1;

/**
 * @author yu
 *����¼ģʽ��
 *	 �ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬��
 *���ڸö���֮�Ᵽ�����״̬�������Ժ�Ϳɽ��ö���ָ���ԭ�ȱ����״̬��
 */
public class Test {
	public static void main(String[] args) {
		//����������
		Boy boy  = new Boy();
		
		//����������¼�Ĺ�����
		Caretaker caretaker = new Caretaker();
		
		//��ʼ����ǰ״̬
		boy.setState("����ܰ�");
		System.out.println("=========�к����ڵ�״̬==========");
		System.out.println(boy.getState());
	
		//��Ҫ��¼�µ�ǰ��״̬
		/*Boy backUp = new Boy();
		backUp.setState(boy.getState());*/
		caretaker.setMemento(boy.createMemento());
		
		//�к�ȥ׷��Ů����״̬�ı�
		boy.changeState();
		System.out.println("\n===========�к�׷Ů�����״̬============");
		System.out.println(boy.getState());
		//׷Ů��ʧ�ܣ��ָ�ԭ״
		//boy.setState(backUp.getState());
		boy.restoreMomento(caretaker.getMemento());
		System.out.println("\n===========�к��ָ����״̬==========");
		System.out.println(boy.getState());
		
	}
}
