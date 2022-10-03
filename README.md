## Object-oriented Programming 07: Java Loop
> Created by Anita Nursi &nbsp;&middot;&nbsp;
> Student ID Number: 21343018 &nbsp;&middot;&nbsp;
> Majority of Informatics &nbsp;&middot;&nbsp;
> Faculcity of Engineering &nbsp;&middot;&nbsp;
> Universitas Negeri Padang
---
# About
This is a learning project about Loop in Java. The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.

There are three types of for loops in Java.

![image](https://user-images.githubusercontent.com/112265105/193608620-d25ea6f4-b7eb-4153-872b-4514beb14550.png)
---

# #1 For
Java for loop is used to run a block of code for a certain number of times. The syntax of for loop is:
```
for (initialExpression; testExpression; updateExpression) {
    // body of the loop
}
```
Here,
1. The initialExpression initializes and/or declares variables and executes only once.
2. The condition is evaluated. If the condition is true, the body of the for loop is executed.
3. The updateExpression updates the value of initialExpression.
4. The condition is evaluated again. The process continues until the condition is false.
---

# #2 While
Java while loop is used to run a specific code until a certain condition is met. The syntax of the while loop is:
```
while (testExpression) {
    // body of loop
}
```
Here,
1. A while loop evaluates the textExpression inside the parenthesis ().
2. If the textExpression evaluates to true, the code inside the while loop is executed.
3. The textExpression is evaluated again.
4. This process continues until the textExpression is false.
5. When the textExpression evaluates to false, the loop stops.
---

# #3 Do While
The do...while loop is similar to while loop. However, the body of do...while loop is executed once before the test expression is checked. For example,
```
do {
    // body of loop
} while(textExpression);
```
Here,
1. The body of the loop is executed at first. Then the textExpression is evaluated.
2. If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
3. The textExpression is evaluated once again.
4. If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
5. This process continues until the textExpression evaluates to false. Then the loop stops.
---

# #4 Nested Loop
If a loop exists inside the body of another loop, it's called a nested loop. Here's an example of the nested for loop.
```
// outer loop
for (int i = 1; i <= 5; ++i) {
  // codes

  // inner loop
  for(int j = 1; j <=2; ++j) {
    // codes
  }
..
}
```
Here, we are using a for loop inside another for loop. We can use the nested loop to iterate through each day of a week for 3 weeks.

In this case, we can create a loop to iterate three times (3 weeks). And, inside the loop, we can create another loop to iterate 7 times (7 days).

---

### Source
> https://www.javatpoint.com/java-for-loop <br>
> https://www.programiz.com/java-programming/for-loop <br>
> https://www.programiz.com/java-programming/do-while-loop <br>
> https://www.programiz.com/java-programming/nested-loop

---
