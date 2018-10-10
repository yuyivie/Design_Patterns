package adapter.example1;

import java.util.Map;

/**
 * @author yu
 *适配器角色
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

	private Map baseInfo = super.getUserBaseInfo();//员工的基本信息
	private Map homeInfo = super.getUserHomeInfo();//员工的家庭信息
	private Map officeInfo = super.getUserOfficeInfo();//工作信息。
	
	@Override
	public String getUserName() {
		String userName = (String) this.baseInfo.get("userName");
		System.out.println(userName);
		return userName;
	}
	/*
	 * 家庭地址
	 */
	@Override
	public String getHomeAddress() {
		String homeAddress = (String) this.homeInfo.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	/*
	 * 家庭电话号码
	 */
	@Override
	public String getMobileNumber() {
		String mobileNumber = (String) this.baseInfo.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = (String) this.baseInfo.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	@Override
	public String getJobPosition() {
		String jobPosition = (String) this.baseInfo.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = (String) this.baseInfo.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
