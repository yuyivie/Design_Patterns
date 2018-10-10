package observer.example1.core;

/**
 * @author yu
 *���۲��߽ӿ�
 *����һ��ͨ�õı��۲��߽ӿڣ����еı��۲��߶�����ʵ������ӿڡ�
 */
public interface Observable {
	
	//����һ���۲���
	public void addObserver(Observer observer);
	//ɾ��һ���۲���
	public void deleteObserver(Observer observer);
	//��ȻҪ�۲죬�ҷ����ı�����ҲӦ������������֪ͨ�۲���
	public void notifyObservers(String context);
	
}
