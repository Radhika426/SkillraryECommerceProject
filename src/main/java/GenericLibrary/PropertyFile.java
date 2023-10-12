package GenericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
     
	public String getPropertyFile(String key) throws Throwable {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertyfilePath);
		p.load(fis);
		return p.getProperty(key);
	}
}
