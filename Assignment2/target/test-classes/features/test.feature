@DataDrivenTesting
Feature: Book Flight Ticket

Navigating to the Flight Booking Page
Checking with low price for the destined location
Book the ticket and reviewing the page

Scenario Outline: Book Flight for one way trip

Given Navigating to the flight boooking page of Goibibo
When Entering "<SrcLocation>" and "<DestLocation>" and Searching for the trip details
Then Shows the details of the trip with booking option

Examples:
|SrcLocation|DestLocation|
|Chennai|Kochi|

