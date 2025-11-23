# java-basic-learing 
####
1. Variables

   Concept :-  
               A named storage location in memory that holds a value. In Java, variables must be declared with a type before they are used, ensuring type safety and proper memory allocation.
   Where to Use :-
               Field Storage: Defining attributes for objects (e.g., Car object stores its speed and color).
               Loop Control: Managing iterators (i) in loops. * Method Parameters: Accepting input into a function (e.g., public void setAge(int newAge)).
   Syntax(Declaration & Initialization):-
               $DataType$ $variableName$;
               $variableName$ = $value$; (or combined)
   Simple Example (Java):-
               int age = 21;
               String name = "Nitya";
               final double PI = 3.14159; // Declaring a constant
###
2. Data Types
   
   Concept :-
               Java is statically-typed, meaning all variables must be declared with a data type. Types are categorized into Primitive (built-in, direct memory storage) and Reference (objects, store memory                       address).
   Where to Use:-
               Primitive: Use int for counting, double for high-precision decimal calculations (e.g., finance), char for single characters, and boolean for logical flags. * Reference: Use String for text, and c                  custom class names (e.g., Scanner, ArrayList) for objects
   Syntax:-
               (Primitive Types)byte, short, int, long, float, double, char, boolean
   Simple Example:-
               double price = 19.99;
               char initial = 'N';
               boolean isValid = true;
               String message = "Complete.";
###
3. Input/Output (I/O)

   Concept:-
               The process of receiving data from or sending data to an external resource. For basic console applications, this primarily involves using the System.out stream for output and the Scanner class for                 input.
   Where to Use:-
               User Input:
                         Utilizing the Scanner class to read values from the standard input stream (System.in).
               Debugging/Logging:
                         Printing diagnostics, status messages, or variable values to the console using System.out.println().
   Syntax (Setup & Output):-
               import java.util.Scanner;
               Scanner scanner = new Scanner(System.in);
               System.out.println("Hello");

   Simple Example:-
               int num = scanner.nextInt();
               String line = scanner.nextLine();
###
4. Arithmetic Operators
   Concept:-
               Symbols that perform mathematical operations. Key interview points include understanding integer division (which truncates the decimal part) and the modulus operator.
   Where to Use:-
               Calculations: Standard math for business logic or processing data sets.
               Modulus Operator ($\%$): Useful for determining cyclicity (e.g., rotating array indices) and checking for even/odd numbers (if (num % 2 == 0)).
               Assignment: Compound operators (+=, -=, *=, etc.) for concise code.
   Syntax:-
               (Core Operators)+, -, *, /, \% (Modulus), ++ (Increment), -- (Decrement)
   Simple Example:-
               int result = 10 / 3;
               // Result is 3 (integer division)
               int remainder = 10 % 3;
               // Remainder is 1
               count++;
               // Post-increment
###
5. Control Flow: If/Else and Switch

   Concept :-
              Structures that control the sequence of execution based on conditions. If/Else evaluates boolean expressions for conditional branching. Switch is optimized for selecting from a number of discrete                  constant values (e.g., int, String, enum).
   Where to Use :-
               Validation: Using if/else to check complex conditions (e.g., if (age >= 18 && hasID)).
               State-Based Actions: Using a switch statement to map a specific user input (like a menu option) or an application state to a unique action.
   Syntax :-
             (If/Else)
                   if ($condition$) { ... }
                    else if ($condition2$) { ... }
                     else { ... }Syntax

              (Switch)
                   switch ($expression$) { case $val1$: ... break; default: ... }

   Simple Example :-
             switch (day) {
                   case 1:
                      System.out.println("Mon");
                           break;
                   default:
                      System.out.println("Weekend");
             }

   

