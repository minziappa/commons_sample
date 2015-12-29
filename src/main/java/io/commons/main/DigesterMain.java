package io.commons.main;

import java.io.File;

import org.apache.commons.digester.Digester;

import io.commons.digester.UserInfo;
import io.commons.digester.UserInfos;

public class DigesterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Digester digester = new Digester();
		digester.setValidating(false);
		
		digester.addObjectCreate("users", UserInfos.class);
		digester.addObjectCreate("users/user", UserInfo.class);
		digester.addBeanPropertySetter("users/user/id", "id");
		digester.addBeanPropertySetter("users/user/name", "name");
		digester.addBeanPropertySetter("users/user/age", "age");

		File file = new File("test.xml");

		try {
			UserInfos users = (UserInfos)digester.parse(file);
			UserInfo user = users.getUserInfo("A01");
			System.out.println(user.getName());

		} catch (Exception e) {
			// TODO: handle exception
		} 
	}

}
