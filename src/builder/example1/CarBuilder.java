package builder.example1;

import java.util.ArrayList;

/**
 * @author yu
 *����������װ��
 */
public abstract class CarBuilder {
	//����һ��ģ�ͣ����Ҫ����һ��˳��Ҫ��������װ˳��
	public abstract void setSequence(ArrayList<String>sequence);
	//�������˳��󣬾Ϳ���ֱ���õ��������ģ�͡�
	public abstract CarModel getCarModel();
}	
