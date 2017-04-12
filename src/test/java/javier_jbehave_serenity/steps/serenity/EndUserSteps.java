package javier_jbehave_serenity.steps.serenity;

import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import javier_jbehave_serenity.pages.RAE_Page;
public class EndUserSteps {

	RAE_Page rae_page;
	
	
	@Step
    public void enters(String keyword) {
		rae_page.enter_keywords(keyword);
    }
	
	
	@Step
	public void is_the_home_page() {
		rae_page.open();
	}
	
	@Step
	public void looks_for(String word) {
		rae_page.enter_keywords(word);
	}
	
	@Step
    public void starts_search() {
		rae_page.lookup_terms();
    }

	@Step
	public void clicks_button() {		
		rae_page.lookup_terms();
		
	}
	
	@Step
	public void should_see_the_definition(String definition) {
		assertThat(rae_page.getDefinitions(), hasItem(containsString(definition)));
	}
	
	
	
	
}
