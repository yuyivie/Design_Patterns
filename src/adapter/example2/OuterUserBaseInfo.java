package adapter.example2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {
	
	//�û��Ļ�����Ϣ
	@Override
	public Map<String,String> getUserBAseInfo() {
		HashMap<String,String> baseInfoMap  = new HashMap<String,String>();
		baseInfoMap.put("userName", "���Ա���л���ħ��������");
		baseInfoMap.put("mobileNumber", "���Ա���ĵ绰�ǡ�������");
		
		return baseInfoMap;
	}

}
