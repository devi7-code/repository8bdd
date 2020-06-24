$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/test.feature");
formatter.feature({
  "name": "Book Flight Ticket",
  "description": "Navigating to the Flight Booking Page\nChecking with low price for the destined location\nBook the ticket and reviewing the page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DataDrivenTesting"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Book Flight for one way trip",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Navigating to the flight boooking page of Goibibo",
  "keyword": "Given "
});
formatter.step({
  "name": "Entering \"\u003cSrcLocation\u003e\" and \"\u003cDestLocation\u003e\" and Searching for the trip details",
  "keyword": "When "
});
formatter.step({
  "name": "Shows the details of the trip with booking option",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SrcLocation",
        "DestLocation"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Kochi"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Book Flight for one way trip",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DataDrivenTesting"
    }
  ]
});
formatter.step({
  "name": "Navigating to the flight boooking page of Goibibo",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinition.navigating_to_the_flight_boooking_page_of_Goibibo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Entering \"Chennai\" and \"Kochi\" and Searching for the trip details",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinition.entering_and_and_Searching_for_the_trip_details(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Shows the details of the trip with booking option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinition.shows_the_details_of_the_trip_with_booking_option()"
});
formatter.result({
  "status": "passed"
});
});