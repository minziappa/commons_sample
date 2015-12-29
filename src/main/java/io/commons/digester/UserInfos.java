package io.commons.digester;

import java.util.HashMap;
import java.util.Map;

public class UserInfos {

	Map<String, UserInfo> map = new HashMap<String, UserInfo>();

	public Map<String, UserInfo> getMap() {
		return map;
	}

	public void setMap(Map<String, UserInfo> map) {
		this.map = map;
	}
	
	public UserInfo getUserInfo(String key) {
		return this.map.get(key);
	}

	public void addUserInfo(UserInfo userInfo) {
		this.map.put(userInfo.getId(), userInfo);
	}
}