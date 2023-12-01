package northeast.aaa.com.utils;

import java.util.Properties;

import northeast.aaa.com.constant.Keys;

public class Readconfig {

	Properties properties;

	public Readconfig() {
		loadProperties();
	}

	private void loadProperties() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("configuration.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getvalue(Keys key) {
		return properties.getProperty(key.toString());
	}

}
