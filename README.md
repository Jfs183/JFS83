# JFS83
Project Summary:
Company: Chada Tech
Objective: To align with the international standard ISO 8601, Chada Tech aims to enhance their website's user interface to accommodate both domestic and international clients. The project involves the development of an object-oriented programming (OOP) application that allows clients to view both 12-hour and 24-hour clock formats simultaneously.
Problem Statement: Chada Tech's website currently only displays time in a 12-hour format. However, to cater to their international clientele and adhere to ISO 8601 standards, there is a need to display time in both 12-hour and 24-hour formats. The absence of a 24-hour clock format may pose a challenge for international clients accustomed to this format, potentially affecting user experience and satisfaction.
Solution: The proposed solution is to develop an application using secure and efficient C++ code, following OOP principles. The application will feature two clocks that are displayed simultaneously and will allow for user input. The program will have a loop structure wherein the user can modify the time by adding hours, minutes, or seconds. There's also an option for the user to exit the program.

Evaluation of the Provided Code:
1. What did you do particularly well?
   The code structure is logical and follows a clear flow.
   Use of functions to break down specific tasks, such as displaying the clocks, checking the time, and displaying the menu.
   The function to differentiate between AM and PM for the 12-hour clock is a neat implementation.
   The incorporation of real-time into the program using the ctime function is a practical touch.
2. Where could you enhance your code? How would these improvements make your code more efficient, secure, and so on?
   Error Handling: There's no handling for incorrect user input in the menu. For instance, if the user enters a character or a number outside of the menu range, the program can crash or behave unexpectedly.
   Redundancy: The timeCheck function is called twice (once in twelveHourClock and once in twenty-fourHourClock). This redundancy can be eliminated by calling it once before these functions.
   Variable Scope: Global variables could be avoided. Instead, consider encapsulating the entire clock functionality within a class, making the code more secure and modular.

3. Which pieces of the code did you find most challenging to write, and how did you overcome this? What tools or resources are you adding to your support network?
   Parsing the current time from ctime and converting it to integers for hours, minutes, and seconds might have been challenging. Using functions like substr and stoi from the string library and leveraging the istringstream to split the string made this task easier.
   For future challenges, referring to official C++ documentation, forums like Stack Overflow, and C++focused books or courses can be immensely helpful.
4. What skills from this project will be particularly transferable to other projects or coursework?
   Implementing real-time features using system time.
   The ability to design a user-friendly interface with a menu-driven approach.
   Modular programming uses functions to break down complex tasks.
5. How did you make this program maintainable, readable, and adaptable?
   Maintainability: The code is modular, with separate functions for different tasks like printing clocks and showing the menu.
   Readability: Functions and variables are named descriptively, making it easy to understand their purpose. The star-print function, for   example, clearly indicates its role.
   Adaptability: The structure allows for easy addition of features. For example, if you want to add a feature where the user can subtract hours, minutes, or seconds, it can be added to the showMenu function without much hassle.
