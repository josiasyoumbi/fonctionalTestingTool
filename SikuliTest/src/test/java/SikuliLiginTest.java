
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.chrome.ChromeDriver;

public class SikuliLiginTest {

	public static void main(String[] args) throws FindFailed {

        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        String filepath = "C:\\Users\\mkubi\\eclipse-workspace\\SikuliTest\\sikuliimage\\";
        Screen s = new Screen();
        Pattern email = new Pattern(filepath + "email.PNG");
        Pattern passw = new Pattern(filepath + "passw.PNG");
        Pattern clickToLoginForm = new Pattern(filepath + "einloggen2.PNG");
        Pattern accepcookie = new Pattern(filepath + "accepcookie.PNG");
        WebDriver driver;

        // Open Chrome browser    
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/login");
        
        s.wait(accepcookie, 20);
        // Click on Browse button and handle windows pop up using Sikuli
        //driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
        s.type(email,"josiasyoumbi@yahoo.fr");
        s.type(passw,"PasswordEigeben");
        s.click(accepcookie);

        //s.wait(clickToLoginForm, 20);
        s.click(clickToLoginForm);
        s.wait(accepcookie, 20);

        // Close the browser
        driver.close();
	}
}
