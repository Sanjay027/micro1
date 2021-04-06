Feature: Verifi the Adacatin page

Scenario Outline: user shoul validite with valid cradicintals

Given user should launch the browser page
When  user shoul validate login "praveen05" & "praveen@05"
Then  user should validate the details "<location>" , "<Hostel>" , "<RoomType>" ,"<NoofRooms>" , "<checkin>" , "<Checkout>" , "<Adult>" , "<Child>" 
And   user should workin on radio button
And   user should give their valid "<firstname>","<lastname>","<adress>","<cardno>","<cardtype>","<month>","<cvvno>"

Examples:
   |location |Hostel     |RoomType |NoofRooms|checkin   |Checkout  |Adult   |Child    |firstname|lastname|adress   |cardno          |cardtype   |month|cvvno|
   |Melbourne|Hotel Creek|Standard |3 - Three|02-04-2021|05-04-2021|4 - Four|3 - Three|Sanjay   |vinod   |hyderabad|1231231231231231|Master Card|April|2022 |
  

 
