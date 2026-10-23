# Password game backlog

*The external links can not be opened directly from this .md document*



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



### **Steps and how-to**



##### 1 - Display screen

Launch the app; a screen with a password field will open.

*Field says “enter password” - because rules will explain the game and are straightforward, no other instruction is given.*



##### 2 - Start up

Start typing and enter the first draft of the password.



##### 3 - Typing and checking

The program checks if your password entry is right according to the current rule.



##### 4 - Rule complete 

Once a rule is completed and checked, a new rule will show up.

*If a previous rule isn't valid anymore because of changes that were made, that one will show up first.*



##### 5 - Rule amount

There will be a maximum of rules, and the game is won when all rules are completed.

*Steps 3 and 4 will be repeated.*



##### 6 - Completion and new game

Once the game is won, there will be a “try again” button.

This removes the entry and starts back at rule one.







##### Gameplan for creating this

###### *First draft*



//We need a file with boolean methods that check rules, and these must be called in the original game run file. As of now, we also have to make the gui and scan the password from the interface, instead of just getting an entry.



//Parts:

* Interface with password entry field, on this screen rules get added as well.
* File that runs game and calls methods from check file according to how far in the game someone is

&#x09;Add something in the game file that shows when rule is completed

* Check file with booleans checking rules

&#x09;At rule 1, just rule 1 needs to be checked

&#x09;Rules must be able to be checked in a different way to not keep the game code too easy

&#x09;*e.g. check string, check addition of numbers, roman numerals (? - from original game), check if an entry includes a substring from certain list, etc.*





\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_





### **Stairs to success - checklist**

x = completed



Labels for rules

* Be able to show and hide label - x
* Implement method in the main file so label is hidden when started - x

*Labels are shown when it’s their turn (rule 1 when first input is entered, rule 2 when ‘check’ is pressed, etc.)*



* Be able to see how far player is in game - progress bar - x
* At first press, rule one shows

&#x09;Invisible before pressing ‘check’ button for the first time

&#x09;This label disappears if the user implements this rule

&#x09;**But** label comes back if user changes password to not implement rule anymore



Rules themselves

* Invent rule that the password must follow
* Add boolean method in PassCheck 

&#x09;*Add this for every rule. (6 rules included in base) - x*



* Also add a “Valid password” label - x

&#x09;This one shows when all labels are invisible/correctly implemented

* “Play again”/”Clear” button? - when valid - 



* “Enter” key to check password - x





*//MAYBE’s*

*Either try to make the text bold if it’s incorrect and unbold it when correct and keep text in textfield, so the user can remember what rules came before. (Will make it a bit easier)*

*If the first rule is already implemented the first time, the rule won’t be bold. User does need to press check again to see the next rule.*

*Or add red or green color to the labels*

*For example if the first rule is already implemented the first time, the rule will already become green to show the user that rule is correct*

*(label.setForeground(Color.COLOR) / label.setForeground(Color.decode(nm: “#hex code”)) / or with rgb value)*

*Java GUI Labels (Swing Tutorial)*

*maybe then also add an extra rule immediately so the user can try adding that one?*





\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_





### **Rules to be added**



##### Actual

* Password must contain at least 5 characters

&#x09;.length

* Password must include at least one number

&#x09;Regex with .\*\[0-9].\* 

&#x09;Regex info on bottom document

* Password must include a special character

&#x09;Regex with “.\*\[^a-zA-Z0-9].\*”

* Password must include a season

&#x09;Regex with “(?i)(a|b)”

* Password must include a country using the UTC+5 time

&#x09;Same regex as above

* All vowels in the password must be capitalised

&#x09;Regex for vowels --> a/e/i/o/u can not be in password





##### Ideas/draft

*include number*

*// include a leap year (maybe)*

*include special character*

*every vowel must be capitalised*

*include a season*

*include country using the time zone UTC+5*

*Kazakhstan, Pakistan, Tajikistan, Turkmenistan, Uzbekistan, Maldives, Russia*

*Antarctic: Mawson Station*

*TFT: French Southern and Antarctic Time*

*include a song by specific artist from specific year(?)*





\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



#### Regex information

*Regular Expression* - uses a variety of methods to check a string for what it contains



Sources:

Regular Expressions in Java - GeeksforGeeks 

A Guide To Java Regular Expressions API | Baeldung 



Following are used in project: \[draft, might change]



input.matches(".\*\[0-9].\*"); 

//checks if the input has a digit, “.\*” allowing any characters before and after the digit.



input.matches(".\*\[^a-zA-Z0-9].\*");

//checks for a special character by seeing if there is a character that is not (^) part of the lowercase letters, uppercase letters, or numbers.



input.matches("(?i)(spring|summer|autumn|fall|winter)");

//checks if the password includes one of the four seasons, case insensitive because of “?i”

Source: How to Make Java Regular Expression Case Insensitive in Java? - GeeksforGeeks 

→ same for rule 5







