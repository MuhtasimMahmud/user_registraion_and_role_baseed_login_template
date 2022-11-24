# How to use this template :

This is a web application template in which user can register with his/her role and can login with their email address. Specific user can see specific window/dashboard which means based on the role user's dashboard will be different. To use this template please follow the steps bellow :


- first create a database schema with your prefered name in your local machiene (i prefer MySql Workbence). 
- then clone this template to your local IDE (copy the clone link and give it to your IDE - you can watch any tutorial in youtube)
- open the project
- go to the application.properties file (src -> main -> java -> resources -> application.properties)
- change the database name in the very first line (in the bottom of this file i wrote how to change it)
- change the MySql workbench username and password as your machine's (you can see any tutorial on "how to check MySql username and password")
- now you are ready to run !


** if your port shows reserved/block then you can also change the port number in this application.properties file.
** here i have used id as primary key, also i have given condition that the email id should be unique.
