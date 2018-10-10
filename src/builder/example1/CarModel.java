package builder.example1;

import java.util.ArrayList;

/**
 * @author yu
 *����ģ�͵ĳ�����
 */
public abstract class CarModel {
	//��������Ǹ�����������ִ�е�˳��
	private ArrayList<String> sequence = new ArrayList<>();
	//ģ����������ʼ���ˡ�
	protected abstract void start();
	//�ܷ������ǻ�Ҫ��ͣ���������ǲ����汾�¡���
	protected abstract void stop();
	//���Ȼ���������ǵενл������ٽС�
	protected abstract void alarm();
	//�����¡¡���죬�������Ǽٵġ�
	protected abstract void engineBoom();
	//��ģ��Ӧ�û��ܰɣ���������ƵĻ��ǵ��������ģ���֮Ҫ���ܣ�
    final	public void run(){
		//ѭ��һ�飬˭��ǰ˭��ִ��
		for(int i = 0; i<this.sequence.size(); i++){
			String actionName = this.sequence.get(i);
			if(actionName.equalsIgnoreCase("start")){
				this.start();//����������
			}else if(actionName.equalsIgnoreCase("stop")){
				this.stop();//ֹͣ����
			}else if(actionName.equalsIgnoreCase("alarm")){
				this.alarm();//���ȿ�ʼ���ˡ�
			}else if(actionName.equalsIgnoreCase("engineBoom")){
				this.engineBoom();//���濪ʼ����
			}
		}
	}
    final	public void setSequence(ArrayList<String> arrayList){
		this.sequence = arrayList;
	}
}
