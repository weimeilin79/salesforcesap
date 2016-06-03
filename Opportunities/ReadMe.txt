Camel Router Salesforce Opportunity Application
==================================================

To build this project use

    mvn install

To run this project with Maven use

    mvn camel:run

To get the Opportunity List, 
http://IP:9191/opportunity/getList

Example: http://localhost:9191/opportunity/getList

To update the Oppotunity statys 
http://IP:9191/opportunity/updateOpp/{ID}/{STATUS}

Available status are: 
CLOSEWON
PROSPECTING

Example: http://localhost:9191/opportunity/updateOpp/00628000008yT2Y/CLOSEWON
