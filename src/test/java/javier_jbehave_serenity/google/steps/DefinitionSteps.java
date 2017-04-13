package javier_jbehave_serenity.google.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import javier_jbehave_serenity.google.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {
	
	@Steps
	EndUserSteps endUser;
	
	@Given("the user is in google home page")
	public void givenTheUserIsInEDXorgHomePage(){
		endUser.is_the_home_page();
	}
	
	@When("the user looks for '$word'")
	public void whenTheUserLooksForTheWord(String word){
		endUser.looks_for(word);
	}
	
	@When("user clicks on search")
	public void whenTheUserClicksOnSearch(){
		endUser.clicks_button();
	}
	
	@Then("user should see the '$definition'")
	public void then_user_should_see(String definition){
		endUser.should_see_the_definition(definition);
	}
}