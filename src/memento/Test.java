package memento;

/**
 * @author yu
 *����¼ģʽ��
 *	 �ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬��
 *���ڸö���֮�Ᵽ�����״̬�������Ժ�Ϳɽ��ö���ָ���ԭ�ȱ����״̬��
 *
 *����¼����������ɫ��  
 *                      �����˽�ɫ
 *                      ����¼��ɫ    
 *                      ����¼����Ա��ɫ
 *
 *
 *
 *
 *
 *
 */
public class Test {
	public static void main(String[] args) {
		//�����������
		Originator originator =  new Originator();
		//���������¼����Ա
		Caretaker  caretaker = new Caretaker();
		// ����һ������¼
		caretaker.setMemento(originator.createMemento());
		//�ָ�һ������¼
		originator.restoreMemento(caretaker.getMemento());
	}
}
