package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{
	//TC1	- Verify	application	title
	//TC2	- Verify	application	URL
	//TC3	- Verify	visibility	of	login	logo
	//TC4	- Verify	visibility	bot	logo
	//TC5	- Login	to	application
	//TC6	- Verify	the	URL	of	second	page	(inventory	page)
	
	
	
	
	//object repositary
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@name='user-name']") private WebElement userNameTextBox;
	@FindBy(xpath = "//input[@name='password") private WebElement passwordTextBox;
	@FindBy(xpath = "//input[@type='submit']") private WebElement loginButton;
	
	@FindBy(xpath = "//span[@class='title']") private WebElement titleProduct;
	
	
	
	public LoginPage () 
	{
		PageFactory.initElements(driver, this);
	}
	//driver.findElement(By.xpath("")); we havent use these hard code thats why we have to use CONSTRUCTOR
	
	public string loginToApp1() 
	{
		userNameTextBox.sendKeys("standard_user");
		passwordTextBox.sendKeys("secret_sauce");
		loginButton.click();
		return titleProduct.getText();
	}
    //TC1 method to verify the title
	public String verifyTitle() 
	{
	  return driver.getTitle();
	}

    //TC2 method to verify the Url	
	public String verifyUrl() 
	{
	  return driver.getCurrentUrl();
	}

}
