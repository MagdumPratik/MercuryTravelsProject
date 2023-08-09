package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyConfig {
	
	Properties pro;
	public ReadPropertyConfig()
	{
		File src=new File(".\\Configuration\\config.properties");
		try
		{
			FileInputStream fi=new FileInputStream(src);
			pro=new Properties();
			pro.load(fi);
			
		}
		catch(Exception e)
		{
			System.out.println("EXception is :"+e.getMessage());
		}

	}
	public String getApplicationIURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUser() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
}
