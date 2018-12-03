$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/loginSerenity.feature");
formatter.feature({
  "name": "Login in newtours page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login in newtours",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The newtours login page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewtoursLoginStepDefinitions.the_newtours_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the user and password",
  "keyword": "When "
});
formatter.match({
  "location": "NewtoursLoginStepDefinitions.i_fill_the_user_and_password()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Timed out after 2 seconds. Element not found\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027RC-PC\u0027, ip: \u0027172.23.81.222\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat net.thucydides.core.annotations.locators.SmartAjaxElementLocator.ajaxFindElement(SmartAjaxElementLocator.java:173)\r\n\tat net.thucydides.core.annotations.locators.SmartAjaxElementLocator.findElement(SmartAjaxElementLocator.java:125)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.sendKeys(Unknown Source)\r\n\tat com.newtours.pages.Homepage.writeData(Homepage.java:25)\r\n\tat com.newtours.pages.NewToursLoginSteps.writeData(NewToursLoginSteps.java:19)\r\n\tat com.newtours.pages.NewToursLoginSteps$$EnhancerByCGLIB$$4a6be787.CGLIB$writeData$1(\u003cgenerated\u003e)\r\n\tat com.newtours.pages.NewToursLoginSteps$$EnhancerByCGLIB$$4a6be787$$FastClassByCGLIB$$32bb587.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.newtours.pages.NewToursLoginSteps$$EnhancerByCGLIB$$4a6be787.writeData(\u003cgenerated\u003e)\r\n\tat com.newtours.stepdefinitions.NewtoursLoginStepDefinitions.i_fill_the_user_and_password(NewtoursLoginStepDefinitions.java:21)\r\n\tat ✽.I fill the user and password(features/loginSerenity.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "NewtoursLoginStepDefinitions.click_the_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I access to a new page",
  "keyword": "Then "
});
formatter.match({
  "location": "NewtoursLoginStepDefinitions.i_access_to_a_new_page()"
});
formatter.result({
  "status": "skipped"
});
});