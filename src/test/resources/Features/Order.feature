Feature: Validation of login page in adactin hotel page web application
Background:
Given User launch adactin hotel Web application
Then User verify adactin hotel login page is verfied

Scenario: adactin hotel order Id generated

When To Enter the vaild username and vaild password
And User click a login Button
Then User verify adactin hotel Search hotel page is displayed
When To User Select Location,Hotels,RoomType,NumberofRooms,CheckInDate,CheckOutDate,AdultsperRoom,ChildrenperRoom
And To user click a Search button
Then User verify adactin hotel Select Hotel is displayed 
And User Click a radio Button and continue Button
Then User verify adactin hotel Book A Hotel page is displayed
When To Enter the FirstName,LastName,BillingAddress
When To enter CreditCardNo and to selectCreditCardType,ExpiryDate,ExpiryYear and Enter CVVNumber
And To user Click the book now button
Then User verify adactin hotel Booking Confirmation is displayed
When To order id generated in console
And To user Click the my Itinerary button
Then User verify adactin hotel Booked Itinerary is displayed

Scenario Outline: adactin hotel order Id generated multiple vaild credentials
When To Enter the vaild "<username>" and vaild "<password>"
And User click a login Button
Then User verify adactin hotel Search hotel page is displayed
When To User Select "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>","<ChildrenperRoom>"
And To user click a Search button
Then User verify adactin hotel Select Hotel is displayed 
And User Click a radio Button and continue Button
Then User verify adactin hotel Book A Hotel page is displayed
When To Enter the "<FirstName>","<LastName>","<BillingAddress>"
When To enter "<CreditCardNo>" and to "<selectCreditCardType>","<ExpiryDate>","<ExpiryYear>" and Enter "<CVVNumber>"
And To user Click the book now button
Then User verify adactin hotel Booking Confirmation is displayed
When To order id generated in console
And To user Click the my Itinerary button
Then User verify adactin hotel Booked Itinerary is displayed

Examples:
|username|password|Location|Hotels|RoomType|NumberofRooms|CheckInDate|CheckOutDate|AdultsperRoom|ChildrenperRoom|FirstName|LastName|BillingAddress|CreditCardNo|selectCreditCardType|ExpiryDate|ExpiryYear|CVVNumber|
|vinithnirmal1997|nirmal97@|London|Hotel Hervey|Super Deluxe|4 - Four|15/02/2022|17/02/2022|3 - Three|3 - Three|nirmalvenkat|raman|73ChennaiTamilNaduIndia|9765432768965434|Master Card|March|2022|976|
|vinithnirmal1997|nirmal97@|London|Hotel Hervey|Super Deluxe|4 - Four|17/02/2022|18/02/2022|2 - Two|3 - Three|vinith|nirmal|173coimbatoreTamilNaduIndia|9765432768965436|Master Card|March|2021|176|
|vinithnirmal1997|nirmal97@|London|Hotel Hervey|Super Deluxe|1 - One|20/02/2022|21/02/2022|2 - Two|4 - Four|Arun|kumar|145virudhungarTamilNaduIndia|9765432768965435|Master Card|March|2020|776|



