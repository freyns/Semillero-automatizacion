$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Login.feature");
formatter.feature({
  "name": "login en Gmail",
  "description": "  Yo quiero entrar a mi correo y loguearme",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Abrimos el navegador y vamos al sitio web de Login",
  "keyword": "Given "
});
formatter.step({
  "name": "El usuario ingresa el username \"\u003cusername\u003e\" y el password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "El usuario presiona click en el boton ingresar",
  "keyword": "And "
});
formatter.step({
  "name": "El Usuario debera ver el Mensaje \"\u003cmensaje\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "mensaje"
      ]
    },
    {
      "cells": [
        "alexanderfroy@gmail.com",
        "prueba12345",
        "Contrase�a o direcci�n de email incorrectas"
      ]
    },
    {
      "cells": [
        "alexanderf.roy@gmail.com",
        "Prueba12345",
        "alexanderf.roy@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "Abrimos el navegador y vamos al sitio web de Login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginGmailStepDefinitions.abrimos_el_navegador_y_vamos_al_sitio_web_de_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El usuario ingresa el username \"alexanderfroy@gmail.com\" y el password \"prueba12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginGmailStepDefinitions.el_usuario_ingresa_el_username_y_el_password(String,String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Ofertas de trabajo, bolsa de trabajo | Buscar empleo en Indeed Colombia]\u003e but was:\u003c[Iniciar sesión | Cuentas Indeed]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat co.com.google.stepdefinitions.LoginGmailStepDefinitions.el_usuario_ingresa_el_username_y_el_password(LoginGmailStepDefinitions.java:23)\r\n\tat ✽.El usuario ingresa el username \"alexanderfroy@gmail.com\" y el password \"prueba12345\"(Features/Login.feature:26)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "El usuario presiona click en el boton ingresar",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGmailStepDefinitions.el_usuario_presiona_click_en_el_boton_ingresar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "El Usuario debera ver el Mensaje \"Contrase�a o direcci�n de email incorrectas\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGmailStepDefinitions.el_Usuario_debera_ver_el_Mensaje(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "Abrimos el navegador y vamos al sitio web de Login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginGmailStepDefinitions.abrimos_el_navegador_y_vamos_al_sitio_web_de_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El usuario ingresa el username \"alexanderf.roy@gmail.com\" y el password \"Prueba12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginGmailStepDefinitions.el_usuario_ingresa_el_username_y_el_password(String,String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Ofertas de trabajo, bolsa de trabajo | Buscar empleo en Indeed Colombia]\u003e but was:\u003c[Iniciar sesión | Cuentas Indeed]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat co.com.google.stepdefinitions.LoginGmailStepDefinitions.el_usuario_ingresa_el_username_y_el_password(LoginGmailStepDefinitions.java:23)\r\n\tat ✽.El usuario ingresa el username \"alexanderf.roy@gmail.com\" y el password \"Prueba12345\"(Features/Login.feature:26)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "El usuario presiona click en el boton ingresar",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGmailStepDefinitions.el_usuario_presiona_click_en_el_boton_ingresar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "El Usuario debera ver el Mensaje \"alexanderf.roy@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGmailStepDefinitions.el_Usuario_debera_ver_el_Mensaje(String)"
});
formatter.result({
  "status": "skipped"
});
});