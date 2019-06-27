package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import static org.assertj.core.api.Assertions.assertThat;

public class SampleStepDefinitions {

	private final Logger log = LogManager.getLogger(SampleStepDefinitions.class);

	@Given("^the bag is empty$")
	public void the_bag_is_empty() {
		System.out.println("the bag is empty");
	}

	@When("^I put (\\d+) (\\w+) in the bag$")
	public void i_put_something_in_the_bag(final int quantity, final String something) {
		System.out.println("i_put_something_in_the_bag");

	}

	@Then("^the bag should contain only (\\d+) (\\w+)$")
	public void the_bag_should_contain_only_something(final int quantity, final String something) {
		System.out.println("the_bag_should_contain_only_something");
	}

	@Then("^the bag should contain (\\d+) (\\w+)$")
	public void the_bag_should_contain_something(final int quantity, final String something) {
		System.out.println("the_bag_should_contain_something");
	}

	@And("^a new step is$")
	public void aNewStepIs() throws Throwable {
		System.out.println("new one");
	}
}
