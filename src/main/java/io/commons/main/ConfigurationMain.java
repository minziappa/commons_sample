package io.commons.main;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ConfigurationMain {

	public static void main(String[] args) throws ConfigurationException {

		Configuration config = new PropertiesConfiguration("project.properties");
		String strTest = config.getString("test.str");

		System.out.println(strTest);
		
	}

}
