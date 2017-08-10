package cn.ums.mybatis.po;

import java.util.List;


public class UserQueryVo {
	
	//传入多个id
	private List<Integer> ids;
	
	
	
	private UserCustom userCustom;

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	
	
	

}
