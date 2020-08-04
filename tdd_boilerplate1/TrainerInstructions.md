# Live session workshop

## Topic

Introduction to programming and unit testing with JUnit5 framework. TDD - practical excercises.

## Abstract

*Introduction to programming* for tester's course student is not an easy task, yet very important. 
We have to be aware that in most cases **students do not have any** or **have only little** experience
in programming, furthermore **they are afraid of it**. 

Due to limited time planned for programming classes we are not able to fully teach students to write 
programs from scratch and with all best practices in use. We should rather focus on achieving following 
goals, understood as **student can**:  
- recognize and understand simple code constructions
- understand the test code and navigate between tests and production code
- do simple modifications in provided boiler plate code
- write additional test cases basing on provided ones

This project is intended as a boiler plate project to conduct live workshop lesson, which contains
work with trainer and independent exercises done by students.

## Workshop scenario

### 1. Conditional statements and for loop

#### Presentation

Presentation should contain:
- materials about `if` statement and simple data types: `int`, `double`
- materials about `for` loop
- materials about `String` class and `toUpper()` method
- brief description of unit testing idea (without explanation technical part)
- brief explanation of project structure - where *production* and *test* code is located within a project

#### Workshop
1. Clone and open **InteliJ Idea** project
2. Make sure it builds on students systems
3. Present the test and the requirement:
    *As a shop owner I would like to add a merchandise to the stock and check if it on stock*
4. Check if `addMerchandiseAndCheckOnStockSuccess` test fails
5. Implement together with students adding merchandise and checking if it is on the list (use simple
 `for` loop), make `addMerchandiseAndCheckOnStockSuccess` pass.
6. Ask students to implement `addMerchandiseAndCheckOnStockFail`
7. Present `toUpperCase()` method and ask students to implement case insensitive checking with related
unit test. 
8. Implement with students `getMerchandisePrice` method and correlated unit test.
9. Present students another requirement: *As a shop owner I want to replace existing merchandise price 
with a new one*. Instruct students how to write an unit test for the requirement. Operation should be 
implemented within `addMerchandise()` method.
10. Students should implement new requirement in `addMerchandise()` method using search for existing merchandise and 
update the price.
