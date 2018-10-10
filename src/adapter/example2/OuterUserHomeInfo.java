package adapter.example2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String, String> homeInfo = new HashMap<String,String>();
		homeInfo.put("homeTelNumber", "员工的家庭电话是。。。。");
		homeInfo.put("homeAddress", "员工的家庭地址是。。。。");
		
		return homeInfo;
	}

}
