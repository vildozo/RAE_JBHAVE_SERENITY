import net.thucydides.jbehave.ThucydidesJUnitStories;

public abstract class GoogleTestRunner extends ThucydidesJUnitStories {
	 private static final String STORY_NAME_PATTERN = "**/${jbehave.story.name:*}.story";

	    public void JBehaveTestSuite() {
//	        findStoriesCalled(storyNamesFromEnvironmentVariable());
	    }

	    @Override
	    public void run() throws Throwable {
	        super.run();
	    }

//	    private String storyNamesFromEnvironmentVariable() {
//	        return SystemPropertyUtils.resolvePlaceholders(STORY_NAME_PATTERN);
//	    }

}

