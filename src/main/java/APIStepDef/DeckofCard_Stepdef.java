package APIStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ReusableFiles.Utilities;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class DeckofCard_Stepdef {

    @Given("Input to new Deck of Cards")
    public void GivenDeckofCards() throws Exception{
        System.out.println("@GivenDeckofCards");
    }

    @Then("Get the success results of Deck of Cards")
    public void ThenDeckofCards() throws Exception{
        try {
            System.out.println("@ThenDeckofCards");
            File jsonDataInFile = new File("src/main/resources/JSON/Count.json");
            given().queryParam("jokers_enabled","true").when().contentType(ContentType.JSON).body(jsonDataInFile)
                    .post(Utilities.ReadPropertiesFile("NewDeckCards")).then().log().body();
            System.out.println("Deck of Cards Response");

        } catch (Exception e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
    }

    @Given("Input to Draw a cards")
    public void GivenDrawaCards() throws Exception{
        System.out.println("@GivenDrawaCards");
    }

    @Then("Get the Draw a Cards results")
    public void ThenDrawaCards() throws Exception{
        try {
            System.out.println("@Then");
            given().queryParam("deck_count","1").when()
                    .get(Utilities.ReadPropertiesFile("DrawaCards")).then().log().body();
            System.out.println("Shuffle Cards Response");
        } catch (Exception e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
    }

}
