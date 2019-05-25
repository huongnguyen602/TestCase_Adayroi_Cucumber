Feature: automated End2End Tests
  Description: The purpose of this feature is no test End 2 End integration

  Scenario: Customer place an order by purchasing an item from search
  Given user is on Home Page
  Then he login to page with username "0981284843" and password "123456?a"
  When search for "Ipad"
  And choose to buy "Apple iPad 9.7 2018 Wifi 32GB"
  And move to checkout cart
    
  #Scenario Outline: Customer place an order by purchasing an item from search
#	Given user is on Home Page
#	Then he login to page with username "<username>" and password "<password>"
#	When  search for "<product>"
#	And choose to buy the item "<item>"
#	And move to checkout cart
#	
#	Examples:
#	| username | password | product | item |
#	| 0981284843 | YutPip | samsung | Samsung Galaxy A8 Plus - Vàng |
#	| 0981284843 | YutPip | samsung | Samsung Galaxy A8 Plus - Vàng |
  
  
  
   #Scenario: Customer place an order by purchasing an item from search
   #Given user is on Home Page
   #Then he login to page with username and password
   #| username | password |
   #| 0981284843 | YutPip |
   #| 0981284843 | YutPip |