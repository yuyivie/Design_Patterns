package adapter.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yu
 *����˾��Ա��ʵ����
 */
public class OuterUser implements IOuterUser {
    /*
     * �û��Ļ�����Ϣ
     */
	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "���Ա���л���ħ������������");
		baseInfoMap.put("mobileNumber", "���Ա���ĵ绰�ǡ�������");
		return baseInfoMap;
	}
	 /*
	  * Ա���ļ�ͥ��Ϣ
	  */
	@Override
	public Map getUserOfficeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumber", "Ա���ļ�ͥ�绰�ǡ�����������");
			
		return null;
	}
	/*
	 * Ա���Ĺ�����Ϣ�����磬ְλ��
	 */
	@Override
	public Map getUserHomeInfo() {
		HashMap officeInfo  = new HashMap();
		officeInfo.put("jobPosition", "����˵�ְλ��Boss.....");
		officeInfo.put("officeTelNumber", "Ա���İ칫�绰�ǡ�������");
		return officeInfo;
	}

}
