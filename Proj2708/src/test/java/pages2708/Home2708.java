package pages2708;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class Home2708 {
	WebDriver driver= null;

	@Given ("^login pgg$")
	public void LoginPgggggg() {

		String projectPath=	System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Browser/chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://goinfinity.beyond360tech.com/Account/Login?ReturnUrl=/Home/MyWallet");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


	}

	@When ("^entr url$")
	public void userDATA() throws InterruptedException {
		driver.findElement(By.xpath("//input[@ng-model='EmailId']")).sendKeys("aman71165@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("pass@12345");
		
	}

	@And ("^clik btn$")
	public void btnLoginnn() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='cred_sign_in_button']")).click();
		Thread.sleep(2000);

		System.out.println("Page Title is: " +	driver.getTitle());
	}

	
	@When ("^clixks on Recognize link$")
	public void linkRECOG() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='cursorPointer'and @href='Recognize/Recognize']//span[@class='ng-binding'][contains(text(),'Recognize')]")).click();
		Thread.sleep(3000);
		System.out.println("Page Title is: " +	driver.getTitle());
	}  


@And ("^clixks on Feedback link$")
	public void linkFeedback() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='cursorPointer'][@href='Feedback/Index']//span[@class='ng-binding'][contains(text(),'Skill Insight')]")).click();
        Thread.sleep(3000);
		System.out.println("Page Title is: " +	driver.getTitle());
	}


    @When ("^clixks on Wellness link$")
	public void linkWellness() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='cursorPointer'][@href='Wellness/index']//span[@class='ng-binding'][contains(text(),'Wellness')]")).click();
        Thread.sleep(3000);
		System.out.println("Page Title is: " +	driver.getTitle());
	}

    
    @And ("^clixks on Survey link$")
	public void linkSurvey() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='cursorPointer'][@href='Survey/Index']//span[@class='ng-binding'][contains(text(),'Survey')]")).click();
        Thread.sleep(3000);
		System.out.println("Page Title is: " +	driver.getTitle());
	}

    
    @When ("^clixks on Jobs link$")
	public void linkJobs() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='cursorPointer'][@href='managejob/index']//span[@class='ng-binding'][contains(text(),'Job Referral')]")).click();
        Thread.sleep(3000);
		System.out.println("Page Title is: " +	driver.getTitle());
	}


    @And ("^clixks on MySummary link$")
	public void linkMySummary() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='cursorPointer'][@href='Home/viewProfile']//span[@class='ng-binding'][contains(text(),'My Summary')]")).click();
        Thread.sleep(3000);
		System.out.println("Page Title is: " +	driver.getTitle());
	}

    @When ("^clixks on Dashboard link$")
	public void linkDashboard() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='cursorPointer'][@href='Dashboard/Dashboard']//span[@class='ng-binding'][contains(text(),'Dashboard')]")).click();
        Thread.sleep(3000);
		System.out.println("Page Title is: " +	driver.getTitle());

	}


    @And ("^clixks on Redeem link$")
	public void linkRedeem() throws InterruptedException {

        driver.findElement(By.xpath("//a[@class='cursorPointer'][@href='Redeem/RedeemPlus']//span[@class='ng-binding'][contains(text(),'Redeem')]")).click();
        Thread.sleep(3000);
		System.out.println("Page Title is: " +	driver.getTitle());     

	}
    

    
    @Then ("^user landssssss on Last page$")
	public void atRECOG() throws InterruptedException {
		
		System.out.println("Page Title is: " +	driver.getTitle());
	}

	}


