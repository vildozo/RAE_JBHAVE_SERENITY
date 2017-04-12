package javier_jbehave_serenity.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.locators.WaitForWebElements;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.rae.es/")
public class RAE_Page extends PageObject{

	@FindBy(id="dval")
    private WebElementFacade searchTerms;

    @FindBy(css=".sbb")
    private WebElementFacade lookupButton;
    
    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }



//    public void enter_keywords2(String keyword){
//    	WaitForWebElements buscador=getDriver().findElements(By.id("dval"[0]));
//    	buscador.sendKeys(keyword);
//    }
    
    public void clickearBottonBusquead(){
    	WebElement botonBusqueda=getDriver().findElement(By.className("sbb"));
    	//botonBusquedasendKeys(keyword);
    }

    
    public void lookup_terms() {
        lookupButton.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("header"));
        List<WebElement> results = definitionList.findElements(By.className("f"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }

	


}
