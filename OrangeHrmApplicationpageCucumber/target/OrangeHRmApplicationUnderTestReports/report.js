$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrangeHRmApplicationUnderTest.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHRM Application Functionalities Testing",
  "description": "",
  "id": "orangehrm-application-functionalities-testing",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Browser in the System",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 7,
  "name": "Validating OrangHRM Application LogIn Page",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters OrangeHRM Application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_enters_orange_hrm_application_url_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Browser in the System",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 12,
      "value": "#Then User should close the OrangeHRM Application along with the browser"
    }
  ],
  "line": 16,
  "name": "Validating OrangHRM Application LogIn Functioanlity",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@ReTesting"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#Given User should open Browser in the System"
    }
  ],
  "line": 19,
  "name": "User enters OrangeHRM Application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User should enter userName and password and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User should click on WelCome Admin and click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_enters_orange_hrm_application_url_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_enter_userName_and_password_and_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_click_on_WelCome_Admin_and_click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 25,
      "value": "#Then User should close the OrangeHRM Application along with the browser"
    }
  ],
  "line": 28,
  "name": "Validating OrangHRM Application LogIn Functioanlity with TestData",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@Smoke"
    },
    {
      "line": 27,
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Given User should open Browser in the System"
    }
  ],
  "line": 31,
  "name": "User enters OrangeHRM Application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User should enter \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\" and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User should click on WelCome Admin and click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 37,
      "value": "#Then User should close the OrangeHRM Application along with the browser"
    }
  ],
  "line": 38,
  "name": "",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 39,
      "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata;;1"
    },
    {
      "cells": [
        "BAjay",
        "Ajay@9265"
      ],
      "line": 40,
      "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata;;2"
    },
    {
      "cells": [
        "srini",
        "WebDriver"
      ],
      "line": 41,
      "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata;;3"
    },
    {
      "cells": [
        "Cucumber",
        "Q@Trainer7"
      ],
      "line": 42,
      "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata;;4"
    },
    {
      "cells": [
        "Ajay",
        "Ajay@9265"
      ],
      "line": 43,
      "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Browser in the System",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 40,
  "name": "Validating OrangHRM Application LogIn Functioanlity with TestData",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@Smoke"
    },
    {
      "line": 27,
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Given User should open Browser in the System"
    }
  ],
  "line": 31,
  "name": "User enters OrangeHRM Application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User should enter \"BAjay\" and \"Ajay@9265\" and click on login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User should click on WelCome Admin and click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_enters_orange_hrm_application_url_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "BAjay",
      "offset": 19
    },
    {
      "val": "Ajay@9265",
      "offset": 31
    }
  ],
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_enter_and_and_click_on_login_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_click_on_WelCome_Admin_and_click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Browser in the System",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 41,
  "name": "Validating OrangHRM Application LogIn Functioanlity with TestData",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@Smoke"
    },
    {
      "line": 27,
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Given User should open Browser in the System"
    }
  ],
  "line": 31,
  "name": "User enters OrangeHRM Application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User should enter \"srini\" and \"WebDriver\" and click on login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User should click on WelCome Admin and click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_enters_orange_hrm_application_url_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "srini",
      "offset": 19
    },
    {
      "val": "WebDriver",
      "offset": 31
    }
  ],
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_enter_and_and_click_on_login_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_click_on_WelCome_Admin_and_click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Browser in the System",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 42,
  "name": "Validating OrangHRM Application LogIn Functioanlity with TestData",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@Smoke"
    },
    {
      "line": 27,
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Given User should open Browser in the System"
    }
  ],
  "line": 31,
  "name": "User enters OrangeHRM Application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User should enter \"Cucumber\" and \"Q@Trainer7\" and click on login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User should click on WelCome Admin and click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_enters_orange_hrm_application_url_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 19
    },
    {
      "val": "Q@Trainer7",
      "offset": 34
    }
  ],
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_enter_and_and_click_on_login_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_click_on_WelCome_Admin_and_click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Browser in the System",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 43,
  "name": "Validating OrangHRM Application LogIn Functioanlity with TestData",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-oranghrm-application-login-functioanlity-with-testdata;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@Smoke"
    },
    {
      "line": 27,
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Given User should open Browser in the System"
    }
  ],
  "line": 31,
  "name": "User enters OrangeHRM Application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User should enter \"Ajay\" and \"Ajay@9265\" and click on login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User should click on WelCome Admin and click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_enters_orange_hrm_application_url_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ajay",
      "offset": 19
    },
    {
      "val": "Ajay@9265",
      "offset": 30
    }
  ],
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_enter_and_and_click_on_login_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_click_on_WelCome_Admin_and_click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationUserDefinedMethod.user_should_be_navigated_to_orange_hrm_application_log_in_web_page()"
});
formatter.result({
  "status": "skipped"
});
});