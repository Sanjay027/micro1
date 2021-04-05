Feature: Verifi the Adacatin page

Scenario Outline: user shoul validite with valid cradicintals

Given user should launch the browser page
When  user shoul validate login "praveen05" & "praveen@05"
Then  user should validate the details "<location>" , "<Hostel>" , "<RoomType>" ,"<NoofRooms>" , "<checkin>" , "<Checkout>" , "<Adult>" , "<Child>" 

Examples:
   |location |Hostel     |RoomType |NoofRooms|checkin   |Checkout  |Adult   |Child    |
   |Melbourne|Hotel Creek|Standard |3 - Three|02-04-2021|05-04-2021|4 - Four|3 - Three|


 
