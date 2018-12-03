$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Google_traslate.feature");
formatter.feature({
  "name": "Google Translate",
  "description": "\tAs a web user\n\tI want to use Google Translate\n\tTo translate words between different languajes",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Translate from English to Spanish",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "That susan wants to translate a word",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.thatSusanWantsToTranslateAWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "She translates the word cheese from English to Spanish",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.sheTranslatesTheWordCheeseFromEnglishToSpanish()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "She should see the word queso in the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.sheShouldSeeTheWordQuesoInTheScreen()"
});
formatter.result({
  "status": "passed"
});
});