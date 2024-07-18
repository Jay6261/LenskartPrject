package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    WebDriver driver;

    public Home(WebDriver d) {
        this.driver = d;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='text']")
     private WebElement searchbox;
    
    @FindBy(xpath = "//*[text()='Oops No result found']")
    private WebElement NoResultFound;
   
    //(//img[@alt='Lenskart Hustlr Monza Red Full Rim Wayfarer left side'])[1]
    
    @FindBy(xpath="(//div[@class='ProductContainer--1dcah6v VStwK'])[1]")
    private WebElement Product;
    
    @FindBy(xpath="//div[@id='product-swatch']//a")
    private WebElement coloricons;
    
    public void Entersearchtext(String b) {
        this.searchbox.sendKeys(b);
    }

    public void EnterNoResultFound()
    {
    	String ele = this.NoResultFound.getText();
    	System.out.println("Message is : " + ele);
    }
    
    public void ClickOnProduct()
    {
    	this.Product.click();
    }
    
    public void ClickOnColorIcon()
    {
    	for(int i=0;i<3;i++)
    	{
    		
    		this.coloricons.click();
    	}
    	
    }
    
}
