package tek.capstone.framework.utilities;
import com.github.javafaker.Faker;

public class DataGenerator {

	public static String addressGenerator(String input) {
	Faker faker = new Faker();
	String output = "";
	
	if(input.equalsIgnoreCase("countryValue")) {
		output = "unitd States";	
	}else if(input.equalsIgnoreCase("fullnameValue")) {
		output = faker.name().fullName();
	}else if(input.equalsIgnoreCase("phoneValue")){
		output = faker.phoneNumber().cellPhone();	
	}else if(input.equalsIgnoreCase("stAddress")) {
		output = faker.address().streetAddress();
	}else if(input.equalsIgnoreCase("aptValue")){
		output = faker.address().secondaryAddress();	
	}else if(input.equalsIgnoreCase("cityValue")){
		output = faker.address().city();
	}else if(input.equalsIgnoreCase("stateValue")){
		output = faker.address().state();
	}else if(input.equalsIgnoreCase("zipCodeValue")){
		String zipCode=faker.address().zipCode().substring(0,5);
		// in faker class you can specify how many digits zipCode you want
		output=zipCode;
	}
	return output;
}
}