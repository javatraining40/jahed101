$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/customer/Feature_CustomerLoginFunctiolality.feature");
formatter.feature({
  "name": "Verify Customer Login functionlity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verfiy Customer Login functioality happy path",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am landing page https://it.microtechlimited.com/",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Login menu",
  "keyword": "When "
});
formatter.step({
  "name": "I click on Customer Login",
  "keyword": "And "
});
formatter.step({
  "name": "Enter user Id as \"\u003cuserId\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I Enter Passeord as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "I Verify that I am in CUSTOMER Home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId",
        "password"
      ]
    },
    {
      "cells": [
        "david@gmail.com",
        "1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verfiy Customer Login functioality happy path",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am landing page https://it.microtechlimited.com/",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerLoginFunctionalty.i_am_landing_page_https_it_microtechlimited_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login menu",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerLoginFunctionalty.i_click_on_Login_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Customer Login",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerLoginFunctionalty.i_click_on_Customer_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter user Id as \"david@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerLoginFunctionalty.enter_user_Id_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter Passeord as \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerLoginFunctionalty.i_Enter_Passeord_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerLoginFunctionalty.i_click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify that I am in CUSTOMER Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerLoginFunctionalty.i_Verify_that_I_am_in_CUSTOMER_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/customer/Feature_CustomerOrder.feature");
formatter.feature({
  "name": "Customer orders functionality",
  "description": "  As a Custmer\n  I want to See my orders\n  So that I can manage my Orders  ",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer order total count test",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in as Customer",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerOrder.i_logged_in_as_Customer(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Order List Menu",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerOrder.click_on_Order_List_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Total count is greater than 100",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerOrder.verify_Total_count_is_greater_than(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/order/Feature_CreateOrder.feature");
formatter.feature({
  "name": "Create Order Operation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create order by customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in as Customer",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.orders.StepDefs_CustomerOrder.i_logged_in_as_Customer(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Product menu",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs_CreateOrder.StepDefs_CreateOrder.i_click_on_Product_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Product name",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs_CreateOrder.StepDefs_CreateOrder.select_Product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Order Date",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs_CreateOrder.StepDefs_CreateOrder.enter_Order_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Order Product button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs_CreateOrder.StepDefs_CreateOrder.click_Order_Product_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Confirm order",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs_CreateOrder.StepDefs_CreateOrder.click_Confirm_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Order Status is Confirmed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs_CreateOrder.StepDefs_CreateOrder.verify_Order_Status_is_Confirmed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});