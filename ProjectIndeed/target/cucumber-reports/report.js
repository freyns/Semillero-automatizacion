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
  "status": "passed"
});
formatter.step({
  "name": "He clicks the enter button of the page of index",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.heClicksTheEnterButtonOfThePageOfIndex()"
});
formatter.result({
  "error_message": "net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException: Expected enabled element was not enabled\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilEnabled(WebElementFacadeImpl.java:963)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilElementAvailable(WebElementFacadeImpl.java:802)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.click(WebElementFacadeImpl.java:1039)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget.performAs(ClickOnTarget.java:13)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget$$EnhancerByCGLIB$$e3f2ec6d.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget$$EnhancerByCGLIB$$e3f2ec6d$$FastClassByCGLIB$$eb009f51.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget$$EnhancerByCGLIB$$e3f2ec6d.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:106)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:90)\r\n\tat com.indeed.co.certification.task.GoTo.performAs(GoTo.java:17)\r\n\tat com.indeed.co.certification.task.GoTo$$EnhancerByCGLIB$$e3e9d2ea.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat com.indeed.co.certification.task.GoTo$$EnhancerByCGLIB$$e3e9d2ea$$FastClassByCGLIB$$79d718c0.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.indeed.co.certification.task.GoTo$$EnhancerByCGLIB$$e3e9d2ea.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:106)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:90)\r\n\tat com.indeed.co.certification.stepdefinitions.LoginStepDefinitions.heClicksTheEnterButtonOfThePageOfIndex(LoginStepDefinitions.java:47)\r\n\tat ✽.He clicks the enter button of the page of index(src/test/resources/feature/login.feature:11)\r\nCaused by: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for By.xpath: /html[1]/body[1]/div[1]/div[1]/nav[1]/ul[2]/li[2]/a[1] to be enabled (tried for 5 second(s) with 100 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:303)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilEnabled(WebElementFacadeImpl.java:960)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilElementAvailable(WebElementFacadeImpl.java:802)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.click(WebElementFacadeImpl.java:1039)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget.performAs(ClickOnTarget.java:13)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget$$EnhancerByCGLIB$$e3f2ec6d.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget$$EnhancerByCGLIB$$e3f2ec6d$$FastClassByCGLIB$$eb009f51.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget$$EnhancerByCGLIB$$e3f2ec6d.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:106)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:90)\r\n\tat com.indeed.co.certification.task.GoTo.performAs(GoTo.java:17)\r\n\tat com.indeed.co.certification.task.GoTo$$EnhancerByCGLIB$$e3e9d2ea.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat com.indeed.co.certification.task.GoTo$$EnhancerByCGLIB$$e3e9d2ea$$FastClassByCGLIB$$79d718c0.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.indeed.co.certification.task.GoTo$$EnhancerByCGLIB$$e3e9d2ea.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:106)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:90)\r\n\tat com.indeed.co.certification.stepdefinitions.LoginStepDefinitions.heClicksTheEnterButtonOfThePageOfIndex(LoginStepDefinitions.java:47)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:32)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:26)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\r\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\r\n\tat cucumber.api.TestStep.run(TestStep.java:83)\r\n\tat cucumber.api.TestCase.run(TestCase.java:58)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html[1]/body[1]/div[1]/div[1]/nav[1]/ul[2]/li[2]/a[1]\"}\n  (Session info: chrome\u003d70.0.3538.110)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027RC-PC\u0027, ip: \u0027172.23.81.133\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\SBMEDA~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51000}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.110, webStorageEnabled: true}\nSession ID: 87a8ccee92d52819b007a5b75d1cbc82\n*** Element info: {Using\u003dxpath, value\u003d/html[1]/body[1]/div[1]/div[1]/nav[1]/ul[2]/li[2]/a[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat net.thucydides.core.webdriver.WebDriverFacade.findElement(WebDriverFacade.java:231)\r\n\tat net.serenitybdd.core.pages.WebElementResolverByLocator.resolveForDriver(WebElementResolverByLocator.java:16)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.getElement(WebElementFacadeImpl.java:208)\r\n\tat net.serenitybdd.core.pages.WebElementExpectations$3.apply(WebElementExpectations.java:63)\r\n\tat net.serenitybdd.core.pages.WebElementExpectations$3.apply(WebElementExpectations.java:55)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\t... 68 more\r\n",
  "status": "failed"
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