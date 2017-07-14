package example;
 
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RunScriptServer  {

	private WebDriver driver;
	private String baseUrl;
	 
	
	@SuppressWarnings("unused")
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		 
		 
		 baseUrl = "http://zabegan-001-site18.itempurl.com/Login/Index#";
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() {

		//String service = "C:\\Program Files\\IEDriverServer.exe";
		 	// System.setProperty("webdriver.ie.driver", service);
		 	 
		 	//String service = "/usr/bin/google-chrome";
		 	 //System.setProperty("webdriver.chrome.driver", service);
			 
	    	//WebDriver driver = new FirefoxDriver();
		 	// WebDriver  driver = new InternetExplorerDriver();
		 	// WebDriver  driver = new ChromeDriver();
		  driver = new FirefoxDriver();
		 	 driver.get(baseUrl);

			if (driver.findElements(By.id("username")).isEmpty()){
		        System.out.println("Vleze vo if ");
			   final String username = "jenkinss4e@gmail.com";
		       final String password = "Passwords4e";
		       String to = "bo_sale@hotmail.com";
		       String poraka;
		       Properties props1 = new Properties();
		       props1.put("mail.smtp.auth", "true");
		       props1.put("mail.smtp.starttls.enable", "true");
		       props1.put("mail.smtp.host", "smtp.gmail.com");
		       props1.put("mail.smtp.port", "587");
			   			Session session = Session.getInstance(props1,
				        new javax.mail.Authenticator() {
				         protected PasswordAuthentication getPasswordAuthentication() {
				              return new PasswordAuthentication(username, password);
				            }
				          });  
				        try {

				            Message message = new MimeMessage(session);
				            message.setFrom(new InternetAddress("jenkinss4e@gmail.com"));
				            message.setRecipients(Message.RecipientType.TO,
				                InternetAddress.parse(to));
				            message.setSubject("Server is not working !!!");
				            poraka= "Server is not working !!! ";
				            message.setText(poraka);
				            Transport.send(message);
				            System.out.println("Done");

				        } 
			 
				        catch (MessagingException e) 
				        {
				            // throw new RuntimeException(e);
				            System.out.println("Username or Password are incorrect ... exiting !");
				        } 
				        
			}        
		        else
		    	 System.out.println("Vleze vo else "); 
		 
		    }
		}
	
	
		 
		

