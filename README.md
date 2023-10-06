# EmailAddress
Testing default constructor initialisation and toString method...
One of either first name, last name or user ID isn't present, so email can't be generated
Expected empty string for real name and Null Email for Email also expects it to print 
one of either first name, last name or user ID isn't present, so email can't be generated: 
Actual: [Real Name: , Email: Null Email]
Testing set and get method for first name and last name and user ID
Expected Tunde: Actual: Tunde
Expected Fayo: Actual: Fayo
One of either first name, last name or user ID isn't present, so email can't be generated
Expected Tunde Fayo and Null Email with output one of either first name, last name or user 
ID isn't present, so email can't be generated Actual: [Real Name:Tunde Fayo, Email: Null Email]
Testing get method for Real name: 
Expected Tunde Fayo: Actual:Tunde Fayo
Testing set and get method for userID and Domain and toString 
Expected my365.dmu.ac.uk: Actual: my365.dmu.ac.uk
Expected TFayo75@mydmu.ac.uk: Actual: TFayo75@my365.dmu.ac.uk
Expected 75: Actual: 75
Expected Real Name: Tunde Fayo, Email: TFayo75@my365.dmu.ac.uk: Actual: 
[Real Name:Tunde Fayo, Email: TFayo75@my365.dmu.ac.uk]
Testing get method for email only 
Expected: JArthur81@my365.dmu.ac.uk, Actual: JArthur81@my365.dmu.ac.uk
Using object array, we hereby print array of email address holding four objects 
JBiden25@my365.dmu.ac.uk
FBenson15@my365.dmu.ac.uk
DFegnon91@my365.dmu.ac.uk
BRaymond54@my365.dmu.ac.uk
Type your first name and press enter: 
Oluwatimilehin
Your first name is: Oluwatimilehin
Type your last name and press enter: 
Amira
Your last name is: Amira
Type your user ID and press enter: 
89
Your user ID is: 89
Write out the domain and press enter: 
my365@dmu.ac.uk
Domain is: my365@dmu.ac.uk
Here is your email address below; 
OAmira89@my365@dmu.ac.uk
Testing boolean method: 
[Real Name:Jordan Arthur, Email: JArthur81@my365.dmu.ac.uk]
[Real Name:Joe Biden, Email: JBiden25@my365.dmu.ac.uk]
user2.equal(user3) is: false
Testing the override equals method 
user2==user3 is: false
user2.equals(user3) is: true
Testing the Array List: 
Seminar Title: 	Seminar Date: 
Students: []
Seminar Title: 	Seminar Date: 
Students: [[Real Name:Tunde Fayo, Email: TFayo75@my365.dmu.ac.uk]]
Seminar Title: CEM Placement Opportunity	Seminar Date: 19th, November 2021
Students: [[Real Name:Tunde Fayo, Email: TFayo75@my365.dmu.ac.uk]]
Seminar Title: CEM Placement Opportunity	Seminar Date: 19th, November 2021
Students: [[Real Name:Tunde Fayo, Email: TFayo75@my365.dmu.ac.uk], [Real Name:Jordan Arthur, Email: JArthur81@my365.dmu.ac.uk]]
Seminar Title: CEM Placement Opportunity	Seminar Date: 19th, November 2021
Students: [[Real Name:Tunde Fayo, Email: TFayo75@my365.dmu.ac.uk], [Real Name:Jordan Arthur, Email: JArthur81@my365.dmu.ac.uk], [Real Name:Joe Biden, Email: JBiden25@my365.dmu.ac.uk], [Real Name:John Paul, Email: JPaul52@my365.dmu.ac.uk]]
Seminar Title: CEM Placement Opportunity	Seminar Date: 19th, November 2021
Students: [[Real Name:Tunde Fayo, Email: TFayo75@my365.dmu.ac.uk], [Real Name:Jordan Arthur, Email: JArthur81@my365.dmu.ac.uk], [Real Name:John Paul, Email: JPaul52@my365.dmu.ac.uk]]
Seminar Title: CEM Placement Opportunity	Seminar Date: 19th, November 2021
Students: [[Real Name:Jordan Arthur, Email: JArthur81@my365.dmu.ac.uk], [Real Name:John Paul, Email: JPaul52@my365.dmu.ac.uk]]
Seminar Title: CEM Placement Opportunity	Seminar Date: 19th, November 2021
Students: []
Seminar Title: CEM Placement Opportunity	Seminar Date: 19th, November 2021
Students: [[Real Name:Joe Biden, Email: JBiden25@my365.dmu.ac.uk]]


//I created an Email Address class named EmailAddress, with fields first name, last name, user ID and domain. I then initialized my constructors with a fixed domain
//I also created a custom constructor in the class, whereby my first name and last name are strings and my user ID is an integer, i then moved on
//to creating set and get methods for the fields, followed by the toString() method and an overriden equals method. I also created a boolean 
//comparison method. I also made an option to create Real name which comprise of firstname and lastname. and also an option of
//getting the email.
//
//After doing all that, I moved on to creating the test class named EmailAddressTest where I tested the default constructor initialisation and toSring
//method, I also tested the set and get methods for all the fields stated in the Email Address class above
//I tested for set and get methods for the real name and email and also tested the toString() method. After, i went on to
//using object array, hereby printing array of email address holding four objects. Then, i hereby read input of users from 
//keyboard hereby creating a scanner for keyboard input. I then went ahead to test the boolean method hereby comparing user2 and 
//user3

//After this, I created an array list called Seminar which comprises of seminar title, date and students, where the students are an 
//aggregation of the Email Address class, with fields seminar title, seminar date and students , i also created set and get methods for these
// and also created the toString method, including the boolean methods and add and remove methods
//
//I then used the EmailAddressTest class which has a main method and an argument where the method is stored to test the aggregation in both the EmailAddress 
//class and Seminar to know the details of students that will be present at the seminar and also to get the date and title of the seminar.

//Everything i expected came out well.
