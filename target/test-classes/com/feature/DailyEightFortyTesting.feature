Feature: Navia Online Trading Market Login 


Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again

    
Scenario: AMO Orders All Stock and Featue & Options
    
    When Navigate to home page
    And User Click The "Test" Market watchlist
    And User Check The Current Stock to Market WatchList
    And User Click The "buy" Options in Market WatchList
    And User Modify The AMO Order
    And User All Type to Cancel The All AMO Orders
    
    
    
Scenario: Add and Remove Any Script and Verify
    When Navigate to home page
    And User click the search box
    And User Search any "SWIGGY-EQ" Script
    And User Mouse Over and Add a Script "SWIGGY-EQ"
    And User POP Up Message Appear Verify POP UP
    When Navigate to home page
    And User Remove The "SWIGGY-EQ" Stock    

    
Scenario: Payin add money in navia

    When Navigate to home page
    And User Click The Withdraw button 

    Scenario: Payin add money in navia 
       
    When Navigate to home page
    And User Click Add Money
    And User enter money in amount to add
    And User Choose Pay Using UPI
    And User Enter UPI/ID/Mobile Number and click pay now
    
    
    Scenario: User Check The Mutual Fund -  UPI Payment - functionality
    
    When Navigate to home page
    And User MouseOver Dashboard and Click Mutual Funds   
    And User Click Explore
    And User Search "Navi Flexi Cap Fund Direct Plan Growth" in Serach Box and enter
    And User Click One Time , enter amount "100" and click pay now
    And User Click enter UPI ID "6374837965@ptsbi" and Click Pay Via UPI
    
    
    Scenario: Verify the Charts Changes in Different Minutes and Days
    When Navigate to home page
    And User Click the Watch List
    And User Select scrip "S&P BSE SENSEX"
    And User Click Watch List Again
    And User mouse over the scrip "NIFTY 50"
    And User Click the Candles Icon
    And User Choose Candle "candle"
    And User Check the one Minute and one Day Chart
    
    Scenario: Verify the Charts Changes in Different Minutes and Days
    When Navigate to home page
    And User Click the Watch List
    And User Select scrip "S&P BSE SENSEX"
    And User Click Watch List Again
    And User mouse over the scrip "S&P BSE SENSEX"
    And User Click the Candles Icon
    And User Choose Candle "candle"
    And User Check the one Minute and one Day Chart
    
    
Scenario: Verify the Charts Changes in Different Minutes and Days
    When Navigate to home page
    #And User Choose "PreMarket" the Market WatchList
    And User Select The "ICICIBANK-A" Stock or F&O to Chart
    And User Select The "HDFCBANK-EQ" Stock or F&O to Chart
    #And User Select The "NIFTY25JUNFUT" Stock or F&O to Chart
    #And User Select The "SENSEX25603FUT" Stock or F&O to Chart
    #And User Naviagate to Market WatchList
    

        

    

