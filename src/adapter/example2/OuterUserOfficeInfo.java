package adapter.example2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map<String, String> getUserOfficeInfo() {
		HashMap<String, String> officeInfo = new HashMap<String,String>();
		officeInfo.put("jobPosition", "����˵�ְλ��BOSS.....");
		officeInfo.put("officeTelName","Ա���İ칫�ҵ绰�ǡ���������");
		return officeInfo;
		
	}

}
