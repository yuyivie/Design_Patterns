package adapter.example2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String, String> homeInfo = new HashMap<String,String>();
		homeInfo.put("homeTelNumber", "Ա���ļ�ͥ�绰�ǡ�������");
		homeInfo.put("homeAddress", "Ա���ļ�ͥ��ַ�ǡ�������");
		
		return homeInfo;
	}

}
