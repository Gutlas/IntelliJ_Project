$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DeckofCards.feature");
formatter.feature({
  "line": 1,
  "name": "API Testing",
  "description": "I want to do API Testing using RestAssured",
  "id": "api-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Create a new deck of cards",
  "description": "",
  "id": "api-testing;create-a-new-deck-of-cards",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Input to new Deck of Cards",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Get the success results of Deck of Cards",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckofCard_Stepdef.GivenDeckofCards()"
});
formatter.result({
  "duration": 76949201,
  "status": "passed"
});
formatter.match({
  "location": "DeckofCard_Stepdef.ThenDeckofCards()"
});
formatter.result({
  "duration": 1691900900,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Draw a Card",
  "description": "",
  "id": "api-testing;draw-a-card",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Input to Draw a cards",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Get the Draw a Cards results",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckofCard_Stepdef.GivenDrawaCards()"
});
formatter.result({
  "duration": 124601,
  "status": "passed"
});
formatter.match({
  "location": "DeckofCard_Stepdef.ThenDrawaCards()"
});
formatter.result({
  "duration": 235192099,
  "status": "passed"
});
});