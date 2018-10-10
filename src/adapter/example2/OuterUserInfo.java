package adapter.example2;

import java.util.Map;

import adapter.example1.IUserInfo;

/**
 * @author yu
 *适配器类
 * 主要是把 继承 旧的  用户数据 
 * 然后把新的用户数据 的实现了  当作适配器的 属性  然后通过构造器把值传进来
 */
public class OuterUserInfo implements IUserInfo {

	//源目标对象
	private IOuterUserBaseInfo baseInfo = null;
	private IOuterUserHomeInfo homeInfo = null;
	private IOuterUserOfficeInfo officeInfo = null;
	
	//数据处理
	private Map baseMap = null;
	private Map homeMap = null;
	private Map officeMap = null;
	
	
	//构造方法传递对象
	public OuterUserInfo(IOuterUserBaseInfo baseInfo,
			IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
		super();
		this.baseInfo = baseInfo;
		this.homeInfo = homeInfo;
		this.officeInfo = officeInfo;
		
		//数据处理
		this.baseMap = this.baseInfo.getUserBAseInfo();
		this.homeMap = this.homeInfo.getUserHomeInfo();
		this.officeMap = this.officeInfo.getUserOfficeInfo();
	}

	@Override
	public String getUserName() {
		String userName = (String) this.baseMap.get("userName");
		System.out.println(userName);
		return userName;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = (String) this.homeMap.get("homeTelNumber");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		String mobileNumber = (String) this.baseMap.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
		
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = (String) this.officeMap.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return null;
		
	}

	@Override
	public String getJobPosition() {
		String jobPosition = (String) this.officeMap.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
		
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
