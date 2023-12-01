package northeast.aaa.com.unit;

import org.testng.annotations.Test;

import northeast.aaa.com.constant.Keys;
import northeast.aaa.com.utils.Readconfig;

public class ReadConfigTest {
	
	@Test 
	public void getPropertiesTest () {
		
		Readconfig config = new Readconfig();
		String urlString =config.getvalue(Keys.url);
		System.out.println(urlString);
		System.out.println("There is will there is a way");
	
	}

}
