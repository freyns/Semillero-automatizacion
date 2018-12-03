$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As a web user\n  He want to log in on the website",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login on the page indeed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@successful"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "That Freyns wants to login in the page web",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.thatFreynsWantsToLoginInThePage()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Without connection to the network - Expected net.serenitybdd.screenplay.QuestionSubject@648d0e6d\nExpected: is \u003ctrue\u003e\n     but: was \u003cfalse\u003e\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:187)\r\n\tat com.indeed.co.certification.task.OpenTheBrowser.performAs(OpenTheBrowser.java:28)\r\n\tat com.indeed.co.certification.task.OpenTheBrowser$$EnhancerByCGLIB$$532ed7f4.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat com.indeed.co.certification.task.OpenTheBrowser$$EnhancerByCGLIB$$532ed7f4$$FastClassByCGLIB$$a25a2648.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.indeed.co.certification.task.OpenTheBrowser$$EnhancerByCGLIB$$532ed7f4.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:106)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:90)\r\n\tat net.serenitybdd.screenplay.Actor.wasAbleTo(Actor.java:84)\r\n\tat com.indeed.co.certification.stepdefinitions.LoginStepDefinitions.thatFreynsWantsToLoginInThePage(LoginStepDefinitions.java:41)\r\n\tat ✽.That Freyns wants to login in the page web(src/test/resources/feature/login.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "He clicks the enter button of the page of index",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.heClicksTheEnterButtonOfThePageOfIndex()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "He enters the username and the password and clic in the button enter",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "alexanderf.roy@gmail.com",
        "Prueba12345"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.heEntersTheUsernameAndThePassword(IndeedUserModel\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "He verifies that he was logged in with the status",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.heVerifiesThatHeWasLoggedInWithTheStatus()"
});
formatter.result({
  "status": "skipped"
});
});