package googletest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class googleTest {

	@Test	
	public void testgoogle() throws IOException
	{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/?gfe_rd=cr&ei=c6OeWPOtCpCAoAO9hI-QDQ");
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/seleniumWorkspace/googletest/Screenshot/screenshot.png"));
	}
	
	
	
}
