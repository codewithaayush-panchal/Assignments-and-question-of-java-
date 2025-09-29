import java.util.Scanner;

public class Secondassignment {
    public static void main(String[] args) {


        // Q.1: Area Of Circle Java Program

//        Scanner in = new Scanner(System.in);
//        System.out.println("To find the area of circle, please enter radius of circle: ");
//        float rad = in.nextFloat();
//        if (rad > 0 ) {
//            System.out.println("The area of the the circle of radius " + rad + " is: " + 3.14 * rad * rad);
//        } else {
//            System.out.println("Invalid operation!!!");
//        }

        // problem solved

        // Q.2: Area Of Triangle

//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter the measurement of base");
//        float base = in.nextFloat();
//        System.out.println("Please enter the measurement of height");
//        float height = in.nextFloat();
//
//        if ( base > 0 && height > 0 ) {
//            System.out.println("The area of triangle of base " + base + " and height " + height + " is: " + 0.5 * base * height);
//        }     else {
//            System.out.println("Invalid operation!!!");
//        }

        // problem solved


        // Q.3: Area Of Rectangle Program
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter the lenght of the rectangle: ");
//        float length = in.nextFloat();
//        System.out.println("Please enter the breadth of the rectangle: ");
//        float breadth = in.nextFloat();
//
//        if ( length > 0 && breadth > 0) {
//            System.out.println("The area of the rectangle is: " + length * breadth);
//        }   else {
//            System.out.println("Invalid operation!!!");
//        }

        // problem solved


        // Q.4: Area Of Isosceles Triangle


//                Scanner in = new Scanner(System.in);
//
//                System.out.println("Please enter the measurement of base of isosceles triangle: ");
//                float base = in.nextFloat();
//                System.out.println("Please enter the measurement of height isosceles triangle: ");
//                float height = in.nextFloat();
//                double area = 0.5 * base * height;
//                if ( base > 0 && height > 0) {
//                    System.out.println("The are or isosceles triangle with base " + base + " and height " + height + " is: " + area);
//                }   else {
//                    System.out.println("Invalid operation");
//                }
//
                //problem solved but if we are given the base and sides of isosceles triangle then??

        // 2nd answer for case if we are only given base and side length...

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Give the values of any two parameter among height, base, and side. And also write below that which value you are giving of... and then value of that parameter.. ");
//        String p1 = in.next();
//        String p2 = in.next();
//        float a = in.nextFloat();
//        float b = in.nextFloat();
//
//        if ( p1.equals("base") && p2.equals("height") || p1.equals("height") && p2.equals("base")) {
//            System.out.println("Area of the isosceles triangle is: " + 0.5 * a * b );
//        } else if (p1.equals("side") && p2.equals("height") ) {
//            System.out.println("Area of the isosceles triangle is: " + 0.5 * p2 *  );
//        }

        // i will continue this later for sure


        // Q.5: Area Of Parallelogram

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Write the values of base and height: ");
//        float base = in.nextFloat();
//        float height = in.nextFloat();
//
//        if ( base > 0 && height > 0) {
//            System.out.println("The area of parellalogram is: " + height * base);
//        }   else {
//            System.out.println("Invalid operation");
//        }

        // problem solved...


        // Q.6: Area Of Rhombus

//        Scanner in = new Scanner(System.in);
//        System.out.println("Write the values of both the diagonal: ");
//        float d1 = in.nextFloat();
//        float d2 = in.nextFloat();
//
//        if ( d1 > 0 && d2 > 0) {
//            System.out.println("The area of the rhombus is: " + d1 * d2 / 2);
//        }   else {
//            System.out.println("Invalid operation");
//        }

        // another thing that it is not necessary for user to have only diagonal they might have side or anything else so i will create that for too after some time

        // problem solved


        // Q.7: Area Of Equilateral Triangle
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the length of any side of equilateral triangle: ");
//        float a = in.nextFloat();
//        if ( a > 0 ) {
//            System.out.print("The area of the equilateral triangle of side " + a + " is: " + (Math.sqrt(3) / 4) * a * a );
//        } else {
//            System.out.println("Invalid operation");
//        }

        // problem solved

        // Q.8: Perimeter Of Circle

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the radius of circle to find perimeter: ");
//        float rad = in.nextFloat();
//
//        if ( rad > 0 ) {
//            System.out.println("The perimeter of the circle of radius " + rad + " is:" + 2 * 3.14 * rad );
//        }   else {
//            System.out.println("Invalid operation, please try again...");
//        }


        // problem solved


        // Q.9: Perimeter Of equilateral triangle

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the length of one side of the equilateral triangle: ");
//        float side = in.nextFloat();
//        if ( side > 0 ) {
//            System.out.println("The perimeter of the equilateral triangle is: " + 3 * side);
//        }   else {
//            System.out.println("Invalid operation");
//        }

        // problem solved


        // Q.10: Perimeter Of Parallelogram

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the base and side length of the parallelogram: ");
//        float a = in.nextFloat();
//        float b = in.nextFloat();
//        if ( a > 0 && b > 0 ) {
//            System.out.println("The perimeter of the parallelogram is: " + 2 * ( a + b ));
//        }   else {
//            System.out.println("Invalid operation");
//        }


        //problem solved


        // Q.11: Perimeter Of Rectangle

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the length: ");
//        float l = in.nextFloat();
//        System.out.print("Enter the length: ");
//        float b = in.nextFloat();
//
//        if ( l > 0 && b > 0 ) {
//            System.out.println("The perimeter of Rectangle is: " + 2 * (l + b));
//        }   else {
//            System.out.println("Invalid operation");
//        }

        // problem solved

        // Q.12: Perimeter Of Square

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the length of side of the square: ");
//        float s = in.nextFloat();
//        if ( s > 0 ) {
//            System.out.println("The perimeter of the square is " + 4 * s );
//        }   else {
//            System.out.println("Invalid operation, Please try again...");
//        }

        // problem solved

        // Q.13: Perimeter Of Rhombus

//        Scanner in = new Scanner(System.in);
//        System.out.print("Please enter the length of side of the rhombus: ");
//        float s = in.nextFloat();
//
//        if ( s > 0 ) {
//            System.out.println("The perimeter of rhombus is: " + 4 * s );
//        } else {
//            System.out.println("Invalid operation, please try again...");
//        }

        // problem solved

        // Q.14: Volume Of Cone Java Program

//        Scanner in = new Scanner(System.in);
//        System.out.print("Please enter the radius of the cone: ");
//        float rad = in.nextFloat();
//        System.out.print("Please enter the height of the cone: ");
//        float hgt = in.nextFloat();
//
//        if ( rad > 0 && hgt > 0 ) {
//            System.out.println("The volume of the cone is: " + (3.14 * rad * rad * hgt) / 3 );
//        }   else {
//            System.out.println("Invalid operation, maybe you've enter negative number or any letter, please write only positive numbers...");
//        }

        // problem solved

        // Q.15: Volume Of Prism

//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter the base length of prism: ");
//        float b = in.nextFloat();
//        System.out.println("Please enter the height length of prism: ");
//        float h = in.nextFloat();
//
//        if ( b > 0 && h > 0) {
//            System.out.println("The volume of the prism is: " + b * h );
//        }   else {
//            System.out.println("Invalid operation...");
//        }

        // problem solved

        // Q.16: Volume Of Cylinder

//        Scanner in = new Scanner(System.in);
//        System.out.print("Please enter the radius of the cylinder: ");
//        float rad = in.nextFloat();
//        System.out.println("Please enter the height of the cylinder: ");
//        float hgt = in.nextFloat();
//        if ( rad >= 0 && hgt >= 0 ) {
//            System.out.println("The volume of the cylinder is: " + 3.14159265359 * rad * rad * hgt );
//        }   else {
//            System.out.println("Invalid operation...please try again..");
//        }

        // problem solved

        // Q.17: Volume Of Sphere

//        Scanner in = new Scanner(System.in);
//        System.out.print("Please enter the radius of the sphere:");
//        float rad = in.nextFloat();
//        if ( rad > 0 ) {
//            System.out.println("The volume of the sphere is: " + (4 * 3.14 * rad * rad * rad) / 3 );
//        }   else {
//            System.out.println("Invalid operation...");
//        }

        // Q.18: Volume Of Pyramid

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the base length of the pyramid: ");
//        float l = in.nextFloat();
//        System.out.println("Enter the base width of the pyramid: ");
//        float w = in.nextFloat();
//        System.out.println("Enter the height of the pyramid: ");
//        float h = in.nextFloat();
//
//        if ( l >= 0 && w >= 0 && h >= 0 ) {
//            System.out.println("The volume of the pyramid is: " + (l * w * h) / 3 );
//        }   else {
//            System.out.println("Invalid operation, please try again...");
//        }

        // problem solved


        // Q.19: Curved Surface Area Of Cylinder

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the radius of the cylinder: ");
//        float r = in.nextFloat();
//        System.out.println("Enter the height of the cylinder: ");
//        float h = in.nextFloat();
//
//        if ( r >= 0 && h >= 0 ) {
//            System.out.println("The curved surface area of the cylinder is: " + 2 * 3.14159265359 * r * h );
//        }   else {
//            System.out.println("Invalid operation, Please try again...");
//        }

        // problem solved

        // Q.20: Total Surface Area Of Cube

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the side of the square: ");
//        float s = in.nextFloat();
//
//        if ( s >= 0 ) {
//            System.out.println("The total surface area of the square is: " + 6 * s * s );
//        }   else {
//            System.out.println("Invalid operation, Please try again... ");
//        }

        // problem solved

        // Q.21: Fibonacci Series In Java Programs

//        Scanner in = new Scanner(System.in);
//          System.out.print("Which term number do you want to know: ");
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while ( count <= n ) {
//            int temp = b ;
//            b = b + a ;
//            a = temp ;
//            count++;
//        }
//        System.out.println("The number on " + n + "th term of fibonacci series is: " + b );

        // problem solved

        // Q.22: Subtract the Product and Sum of Digits of an Integer

//        Scanner in = new Scanner(System.in);
//        System.out.println("Input 1st integer number: ");
//        int n1 = in.nextInt();
//        System.out.println("Input 2nd integer number: ");
//        int n2 = in.nextInt();
//        int r = ( n1 * n2 ) - ( n1 + n2 );
//        System.out.println("The subtraction of product and addition of two number " + n1 + " and " + n2 + " is: " + n1 * n2 + " + " + (n1 + n2) + " = " + r );

        // problem solved but i misinterpreted the problem the actual question is different...

        // Q.22: Subtract the Product and Sum of Digits of an Integer


//        int n = 9738;
//        int a = n % 10;
//        n /= 10;
//        int b = n % 10;
//        n /= 10;
//        int c = n % 10;
//        n /= 10;
//        int d = n % 10;
//
//        System.out.println( ( a * b * c * d ) - ( a + b + c + d ) );

        // The answer is correct but this type of methods are not feasable or convenient, and also i have to create program such that user will enter the number and will get the answer

//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        int product = 1;
//        int sum = 0;
//
//        while (n > 0) {
//            int digit = n % 10;   // get last digit
//            product *= digit;     // multiply to product
//            sum += digit;         // add to sum
//            n /= 10;              // remove last digit
//        }
//
//        System.out.println(product - sum);

        // solved but by chatgpt, shame on myself


        // Q.23: Input a number and print all the factors of that number (use loops).

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        int i = 1;
//        while ( i <= n ) {
//            int a = n % i ;
//            if ( a == 0 ) {
//                System.out.println(i);
//            }
//            i++;
//        }

        // solved by own, feeling good now

        // Q.24: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

//            Scanner in = new Scanner(System.in);
//
//            int ans = 0;
//            while (true) {
//                int num = in.nextInt();
//                ans = ans + num;
//
//                if (num == 0) {
//                    System.out.println(ans);
//                    break;
//                }
//
//            }

        // problem solved


        // Q.25: Take integer inputs till the user enters 0 and print the largest number from all.
//
//        Scanner in = new Scanner(System.in);
//
//        int temp = 0 ;
//        int max = 0 ;
//        while (true) {
//
//            int num = in.nextInt();
//
//            if ( num != 0 ) {
//                if ( num > temp ) {
//                    max = num;
//                    temp = num;
//                }   else {
//                    max = temp ;
//                }
//            }   else {
//                System.out.println(max);
//                break;
//            }
//
//        }

        // problem solved but can only work for positive values not for negative here is the solution by chatgpt for even negative values

//        Scanner in = new Scanner(System.in);

// read the first number
//        System.out.println("Enter numbers (0 to stop):");
//        int num = in.nextInt();
//
//        if (num == 0) {
//            System.out.println("No numbers entered");
//        } else {
//            int max = num;
//            int temp = num;
//
//            while (true) {
//                num = in.nextInt();
//                if (num == 0) {
//                    System.out.println("Largest number: " + max);
//                    break;
//                }
//
//                if (num > temp) {
//                    max = num;
//                    temp = num;
//                } else {
//                    max = temp;
//                }
//            }
//        }


        // Q.26: Addition Of Two Numbers

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        float num1 = in.nextInt();
//        System.out.print("Input the second number: ");
//        float num2 = in.nextInt();
//        float ans = num1 + num2 ;
//        System.out.print("The answer is: " + ans );


        // problem solved

        // All of these were basic level question


        // Now moving forward to intermediate question...


        // Q.1: Factorial Program In Java

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a number to get factorial of that number: ");
//        int f = in.nextInt();
//        int temp = 1 ;
//        for (int i = 1; i <= f; i++) {
//           temp = temp * i ;
//        }
//        System.out.println(temp);

        // problem solved, and learnt thing that don't modify the variable, initialized in the loop, inside the loop.


        // Q.2: Calculate Electricity Bill

//        Scanner in = new Scanner(System.in);
//        System.out.print("Please input the energy consumption in kWh: ");
//        float energycon = in.nextFloat();
//        System.out.print("Please input the cost per unit of electricity: ");
//        float cost = in.nextFloat();
//        System.out.print("Input tax % :");
//        float tax = in.nextFloat();
//        System.out.println("Is there any fixed charges on your bill every month( Yes or No )");
//        String fixcharge = in.next();
//        if ( fixcharge.equals("Yes") || fixcharge.equals("yes") ) {
//            System.out.println("Input fixed charge value: ");
//            float fixcharg = in.nextFloat();
//
//            double ans = ( energycon * cost ) + fixcharg + ( energycon * cost * tax ) / 100 ;
//
//            System.out.println("The total electricity bill this month according to the data you gave is :" + ans );
//
//
//        }   else {
//            System.out.println("Thanks for sharing...");
//            double ans = ( energycon * cost ) + ( energycon * cost * tax ) / 100 ;
//
//            System.out.println("The total electricity bill this month according to the data you gave is :" + ans );
//
//        }

        // problem solved


        // Q.3: Calculate Average Of N Numbers

//        Scanner in = new Scanner(System.in);
//        System.out.println("Input N (How many number's average you want): ");
//        int n = in.nextInt();
//        System.out.println("Start entering number till " + n );
//        int a = 1 ;
//        float ans = 0 ;
//        float temp = 0 ;
//        while ( a <= n ) {
//            int num = in.nextInt();
//            ans = temp + num ;
//            temp = ans;
//            a++;
//        }
//
//        System.out.println( ans / n );

        // problem solved

        // Q.4: Calculate Discount Of Product

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input the actual cost of the product(without discount): " );
//        int cost = in.nextInt();
//        System.out.print("Input how much discount is on the product: ");
//        float discount = in.nextFloat();
//
//        float ans = cost - ( cost * discount ) / 100 ;
//
//        System.out.println("The cost of the product after the discount will be: " + ans );

        // problem solved

        // Q.5: Calculate Distance Between Two Points

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the coordinates of the first point: ");
//        int x1 = in.nextInt();
//        int y1 = in.nextInt();
//        System.out.print("Input the coordinates of the second point: ");
//        int x2 = in.nextInt();
//        int y2 = in.nextInt();
//        float ans = ( ( x2 - x1 ) * ( x2 - x1) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) ;
//        double answer = Math.sqrt(ans);
//        System.out.println("The distance between two points (" + x1 + "," + y1 + ") and (" + x2 +"," + y2 + ") is: " + answer );

        // problem solved

        // Q.6: Calculate Commission Percentage

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the total sales amount by you: ");
//        float sales = in.nextInt();
//        System.out.print("Input the total commission you got: ");
//        float commission = in.nextInt();
//        System.out.print("The commission percentage is: " + ( commission / sales ) * 100 );

        // problem solved and learnt a things that while solving percentage related question use float...


        /*
        This is the new thing or concept i learn from this question from chatgpt

               Java Division & Data Types – Quick Notes

               If you divide two integers (int / int), Java does **integer division**.
             - It removes the decimal part.
             - Example: 5 / 2 = 2 (not 2.5), 1 / 5 = 0

               If at least one number is decimal (float or double), Java does **decimal division**.
             - Example: 5 / 2.0 = 2.5, (double)5 / 2 = 2.5

               For percentages, always multiply first by 100.0 or cast to double/float:
             - double percent = (commission * 100.0) / sales;

               Java doesn’t automatically guess decimal.
             - The type of the operation = type of the operands.

               Easy rule to remember:
             - int ÷ int = int
             - anything ÷ double = double (or float)

            Always use double or float when you expect decimal answers.

         */


        // Q.7: Power In Java

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input the base number here: ");
//        int base = in.nextInt();
//        System.out.print("Input the power of the base here: " );
//        int power = in.nextInt();
//        int t = 1 ;
//        double ans = 1 ;
//        double a = 1 ;
//        while ( t <= power ) {
//            ans = a * base ;
//            a = ans ;
//            t++;
//        }
//        System.out.println(ans);

        // problem solved

        // Q.8: Calculate Depreciation of Value

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input the actual cost (actual cost) of the asset: ");
//        int cost = in.nextInt();
//        System.out.print("Input the scrap value (value at the end of useful life) of the asset: ");
//        int scrap = in.nextInt();
//        System.out.print("Input the number of years (how long the item will last: )");
//        int years = in.nextInt();
//
//        double depreciation = ( cost - scrap ) / years ;
//        System.out.println(depreciation);
//
        // problem solved


        // Q.9: Calculate Batting Average

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the total run scored by player: ");
//        int run = in.nextInt();
//        System.out.print("Input how many times the player had been dismissed or got out: ");
//        int dismiss = in.nextInt();
//        float ans = ( float ) run / dismiss ;
//        System.out.println(ans);

        // problem solved


        // Q.10: Calculate CGPA Java Program

//        Scanner in = new Scanner(System.in);
//
//        int a = 1 ;
//        System.out.print("How many semester you had: ");
//        int semnum = in.nextInt();
//
//
//            System.out.println("Okay so you have " + semnum + " semester now enter SGPA and Credits respectively below");
//            while (a <= semnum ) {
//                System.out.print("Enter the SGPA of your " + a + " semester:");
//                int SGPA = in.nextInt();
//                a++;
//            }
//            System.out.println("Great, now enter credits of all the semester below");
//
//        int b = 1 ;
//            while (b <= semnum) {
//                System.out.print("Enter the credit of your " + b + " semester:");
//                int credit = in.nextInt();
//                b++;
//            }

        /*
             actually i was stucked for calculating weightedsgpa as sgpa and credit were not storing
             for each semester so how would i urff the program will multiply both of them then i searched
             on chatgpt but i by mistakely seen the main imp part of the problem after that i was not able
             to solve this question with another method so i will solve this question again after some time
             for sure...
         */


        // Q.11: Compound Interest Java Program

//        Scanner in = new Scanner(System.in);
//        System.out.println("To find compound interest input these information below: ");
//        System.out.print("Input the principal amount or initial amount: ");
//        float pamt = in.nextFloat();
//        System.out.print("Great, now input annual interest rate: ");
//        float intrate = in.nextFloat();
//        System.out.print("Great, now input the number of times the interest compounded per year: ");
//        int intyear = in.nextInt();
//        System.out.print("Input time in years: ");
//        int timeyear = in.nextInt();
//
//        double halfans = pamt * Math.pow( ( 1 + ( ( intrate / 100 ) / intyear )) , intyear * timeyear ) ;
//        double answer = halfans - pamt ;
//        System.out.print("The compound interest as per your inputs is: " + answer );


        // problem solved


        // Q.12: Calculate Average Marks

//        Scanner in = new Scanner(System.in);
//        System.out.print("How many subject you have: ");
//        int noofsubject = in.nextInt();
//        int a = 1 ;
//        int totalmarks = 0 ;
//        while ( a <= noofsubject ) {
//            System.out.print("Enter the marks of " + a + " subject: ");
//            int marks = in.nextInt();
//            totalmarks = totalmarks + marks ;
//            a++;
//        }
//        float Avgmarks = (float) totalmarks / noofsubject ;
//        System.out.println(Avgmarks);


        // problem solved


        // Q.13: Sum Of N Numbers

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("How many numbers you want to add together: ");
//        int totalnum = in.nextInt();
//        float sum = 0 ;
//        int t = 1 ;
//        while ( t <= totalnum ) {
//            System.out.print("Enter " + t + " number: ");
//            float num = in.nextFloat();
//            sum = sum + num ;
//            t++;
//        }
//        System.out.println("The answer is: " + sum );


        // problem solved


        // Q.14: Armstrong Number In Java

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input the number you want to check that whether it is an armstrong number or not: ");
//        Integer number = in.nextInt() ;
//        int t = 10 ;
//        int c = 0 ;
//        int original = number ;
//        Integer a = number ;
//
//        while ( number != 0 ) {
//            number = number / t ;
//            c++;
//        }
//
//        int temp = 1 ;
//        double answer = 0 ;
//
//        while ( a != 0 ) {
//            double main = a % 10 ;
//            main = Math.pow( main , c );
//            answer = answer + main ;
//            a = a / 10 ;
//        }
//
//        if ( answer == original ) {
//            System.out.println("The given number is an armstrong number...");
//        }   else {
//            System.out.println("The given number is not an armstrong number...");
//        }

        // problem solved, i was stucked at 1 place means i did 2 mistake first in if condition i put answer == number and that was only problem there is not 2nd problem


        // Q.15: Find Ncr & Npr

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("To find nPr and nCr input n and r respectively: ");
//        int n = in.nextInt();
//        int r = in.nextInt();
//        int n2 = n ;
//        int n3 = n ;
//        int r2 = r ;
//        int r3 = r ;
//
//        if ( n >= r ) {
//
//            int nfactorial = 1;
//            int t1 = 1 ;
//            for (; nfactorial <= n; nfactorial++ ) {
//                t1 = t1 * nfactorial ;
//            }
//
//            int rfactorial = 1;
//            int t2 = 1 ;
//            for (; rfactorial <= r; rfactorial++ ) {
//               t2 = t2 * rfactorial ;
//            }
//
//            int nr = n2 - r2 ;
//
//            int nrfactorial = 1;
//            int t3 = 1 ;
//            for (; nrfactorial <= nr; nrfactorial++ ) {
//                t3 = t3 * nrfactorial ;
//            }
//
//            double nPr = (double) t1 / t3 ;
//            double nCr = (double) t1 / ( t2 * t3 ) ;
//
//            System.out.println("nPr is equal to: " + nPr);
//            System.out.println("nCr is equal to: " + nCr);
//
//        }   else {
//            System.out.println("Sorry but nPr and nCr are only defined for n >= r, please try again...");
//        }


        // problem solved but did same mistake again as did in previous question that after the variable value decreases/increases after the loop u cant use that variable you have to duplicate the variable in first or before loop to use it in another loop


        // Q.16: Reverse A String In Java

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input a String here: ");
//        String string = in.next();

        // Ok so i got to know that we can use String.length() to find String length without this you
        // cant find the length, means you can but that has not been taught yet, although this have also
        // not been taught yet but if i use other than steps will be reduced means it will give answer,
        // more ans means if i have to write numbers till 10 then other method will give answer till 5
        // or 6 or 7 but this method will give 3 or 2 numbers so that i can use my brain

//        int length = string.length();
//        int t = 0 ;
//        int temp = length - 1 ;
//        String answer = "" ;
//        while ( t <= temp ) {
//            char ans = string.trim().charAt(temp);
//            answer = answer + ans ;
//            temp--;
//        }
//        System.out.print("The reverse of the String you've input is: " + answer );


        // problem solved but I was stucked at the like 888 actually I was writing String instead of char but now i know this thing...


        // Q.17: Find if a number is palindrome or not

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input any integer to check whether it is palindrome or not: ");
//        int number = in.nextInt();
//        int num2 = number ;
//        int num3 = number ;
//        int len = 0 ;
//        while ( number != 0 ) {
//            number = number / 10 ;
//            len++;
//        }
//
//        int temp = 1 ;
//        int l;
//        int i;
//
//        while ( temp <= len / 2 ) {
//
//
//            i = (int) (num2 / ( Math.pow( 10, len - temp ) ) );
//            l = (int) (num3 % ( Math.pow( 10, len - temp + 1 ) ) );
//
//            if ( i == l ) {
//                temp++;
//            }   else {
//                System.out.println("The given number is not a palindrome number, try another one");
//                break;
//            }
//
//            if ( temp == len / 2 ) {
//                System.out.println("The given number is a palindrome number.");
//            }
//
//        }


        // by chat gpt

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input any integer to check whether it is palindrome or not: ");
//        int number = in.nextInt();
//
//        int original = number;
//        int reversed = 0;
//
//        while (number != 0) {
//            int digit = number % 10;       // take last digit
//            reversed = reversed * 10 + digit; // build reversed number
//            number = number / 10;          // remove last digit
//        }
//
//        if (original == reversed) {
//            System.out.println("The given number is a palindrome number.");
//        } else {
//            System.out.println("The given number is not a palindrome number.");
//        }


        // couldn't solve this question but i really gave more than 2 to 3 hour for this problem


        // Q.18: Future Investment Value

//        Scanner in = new Scanner(System.in);
//        System.out.print("To find the future value of any asset or else please input the present value: ");
//        float PV = in.nextFloat();
//        System.out.print("Please input the assumed annual growth rate: ");
//        float rate = in.nextFloat();
//        System.out.print("Now, till how many years will the investment be held:");
//        int year = in.nextInt();
//        double answer = PV * Math.pow( ( 1 + ( rate / 100 ) ) , year ) ;
//        System.out.println("The future investment value of the asset will be: " + answer );


        // problem solved, but i spend few minutes more bcz in place of rate i have to write rate/100 as
        // rate will be in % and if calculating with any formula then we do nor have to write rate we have
        // to write in fraction for means rate/100


        // Q.19: HCF Of Two Numbers Program

        // we will use euclidean method or algorithm for easy way, we will also solve this with the conventional way

//        Scanner in = new Scanner(System.in);
//        System.out.println("To find the HCF of two numbers");
//        System.out.print("Input the first number:");
//        int n1 = in.nextInt();
//        System.out.print("Input the second number:");
//        int n2 = in.nextInt();
//        int rem = 0 ;
//
//
//        if ( n1 == n2 ) {
//            System.out.println("The HCF is " + n1 );
//        } else if ( n1 > n2 ) {
//
//
//            while (n1 > n2) {
//                int temp = rem;
//                rem = n1 % n2;
//                n1 = n2;
//                n2 = rem;
//
//                if (rem == 0) {
//                    System.out.println("The HCF of two numbers is: " + temp);
//                    break;
//                }
//            }
//
//        }   else {
//            while (n2 > n1) {
//                int temp = rem;
//                rem = n2 % n1;
//                n2 = n1;
//                n1 = rem;
//
//                if (rem == 0) {
//                    System.out.println("The HCF of two numbers is: " + temp);
//                    break;
//                }
//            }
//
//        }

        // not solved completely and i forget what was mistake actually i wrote this code early in morning
        // and then went to college and after coming from college i forget this


//        Scanner in = new Scanner(System.in);

//        System.out.print("Enter 1st number: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter 2nd number: ");
//        int num2 = in.nextInt();
//        int rem;
//        if ( num1 == 0 && num2 == 0 ) {
//            System.out.println("The HCF is the number itself (" + num2 + ")");
//        } else if ( num2 == num1 ) {
//            System.out.println("The HCF for both zero numbers is undefined");
//        } else if ( num1 == 0 ) {
//            System.out.println("The HCF is " + num2 );
//        } else if ( num2 == 0 ) {
//            System.out.println("The HCF is " + num1 );
//        }
//        while ( num1 > num2 && num2 != 0 ) {
//            rem = num1 % num2 ;
//            if ( rem == 0 ) {
//                System.out.println("The HCF of 2 numbers is: " + num2 );
//                break;
//            }   else {
//                num1 = num2 ;
//                num2 = rem ;
//            }
//        }
//
//        while ( num1 < num2 && num1 != 0 ) {
//            rem = num2 % num1 ;
//            if ( rem == 0 ) {
//                System.out.println("The HCF of 2 numbers is: " + num1 );
//                break;
//            }   else {
//                num2 = num1 ;
//                num1 = rem ;
//            }
//        }


        // finally solved the problem but with the help of chomu



        // Q.20: LCM Of Two Numbers


//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter 1st number: ");
//        int n1 = in.nextInt();
//        int n3 = n1 ;
//        System.out.print("Enter 2nd number: ");
//        int n2 = in.nextInt();
//        int n4 = n2 ;
//        while (true) {
//            if ( n1 == n2 ) {
//                System.out.println("The LCM of two number is " + n1 );
//                break;
//            }
//            n1 = n1 + n3 ;
//            n2 = n2 + n4 ;
//        }
//
        // chatgpt

//        int m1 = n1;  // current multiple of first number
//        int m2 = n2;  // current multiple of second number
//
//        while (m1 != m2) {
//            if (m1 < m2) {
//                m1 += n1;  // move first up to next multiple
//            } else {
//                m2 += n2;  // move second up to next multiple
//            }
//        }
//
//        System.out.println("LCM = " + m1);


        // actually i was able to solve this question if i use hcf method but then it will become very easy
        // that's why i didn't use that method


        // Q.21: Java Program Vowel Or Consonant

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the letter you want to check is Vowel or Consonant: ");
//        char lett = in.next().charAt(0) ;
//
//        if ( lett >= 'a' && lett <= 'z' || lett >= 'A' && lett <= 'Z' )    {
//            if ( lett == 'a' || lett == 'e' || lett == 'i' || lett == 'o' || lett == 'u' || lett == 'A'
//                    || lett == 'E' || lett == 'I' || lett == 'O' || lett == 'U' )  {
//                System.out.println("The given letter is Vowel");
//            }   else {
//                System.out.println("The given letter is Consonant");
//
//            }
//        }   else {
//            System.out.println("Please enter any alphabet letter only");
//        }


        // problem solved , that was easy question


        // Q.22: Perfect Number In Java

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input any number to check whether it is perfect number or not: ");
//        int num = in.nextInt();
//        int div = 1 ;
//        int i = 0 ;
//
//        while ( div < num ) {
//
//            if ( num % div == 0 ) {
//                i = i + div ;
//            }
//            div++ ;
//
//        }
//        if ( num == i ) {
//            System.out.println("The given number is a perfect number");
//        }   else {
//            System.out.println("The given number is not a perfect number");
//        }


        // Q.23: Check Leap Year Or Not

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter any year to check whether it's a leap year or not: ");
//        int year = in.nextInt();
//
//        if ( year % 4 == 0 )    {
//            if ( year % 100 == 0 )  {
//                if ( year % 400 == 0 )  {
//                    System.out.println("It's a leap year");
//                }   else {
//                    System.out.println("Not a leap year");
//                }
//            }   else {
//                System.out.println("It's a leap year");
//            }
//        }   else {
//            System.out.println("Not a leap year");
//        }

        // problem solved


        // Q.24: Sum Of A Digits Of Number

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input a number: ");
//        int num = in.nextInt();
//        int num2 = num ;
//        int i = 0 ;
//
//        while ( num != 0 )  {
//            num /= 10 ;
//            i++;
//        }
//
//        int sum = 0 ;
//        int j = 0 ;
//        while ( num2 != 0 )  {
//            j = num2 % 10 ;
//            num2 /= 10 ;
//            sum = sum + j ;
//        }
//        System.out.print("The sum of all the digits of the given number is :" + sum );


        // problem solved but from 1191 to 1194 it was unnecessary code, actually reason behind this
        // is i had another approach but it didn't worked and for that approach you need the number of
        // digits but i forget that his method don't need number of digits


        // Q.25: Kunal is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.

//        int dayinaugust = 31 ;
//        dayinaugust = dayinaugust / 2 ;
//        System.out.println("The number of times kunal can go outside is " + dayinaugust );

        // problem solved but i am pretty shock that this was very easy problem why would kunal give such type of problem


        // Q.26: Write a program to print the sum of negative numbers, sum of positive even numbers and
        // the sum of positive odd numbers from a list of numbers (N) entered by the user. The list
        // terminates when the user enters a zero.

//        Scanner in = new Scanner(System.in);
//
//
//        int negsum = 0 ;
//        int posevensum = 0 ;
//        int posoddsum = 0 ;
//
//        while (true)    {
//
//            System.out.print("Input the number:");
//            int num = in.nextInt();
//
//            if ( num == 0 ) {
//                break;
//            } else if ( num < 0 ){
//                negsum = negsum + num ;
//            } else {
//                if ( num % 2 == 0 ) {
//                    posevensum = posevensum + num ;
//                }   else {
//                    posoddsum = posoddsum + num ;
//                }
//            }
//
//
//
//        }
//
//        System.out.println("The sum of all negative numbers is: " + negsum );
//        System.out.println("The sum of all positive even number is: " + posevensum );
//        System.out.println("The sum of all positive odd number is: " + posoddsum );


        // problem solved but there is a code by chatgpt which is shorter and nothing much

//        Scanner in = new Scanner(System.in);
//
//        int negSum = 0, posEvenSum = 0, posOddSum = 0;
//        int num;
//
//        while (true) {
//            System.out.print("Input the number: ");
//            num = in.nextInt();
//            if (num == 0) break;
//
//            if (num < 0) negSum += num;
//            else if (num % 2 == 0) posEvenSum += num;
//            else posOddSum += num;
//        }
//
//        System.out.println("Sum of negative numbers: " + negSum);
//        System.out.println("Sum of positive even numbers: " + posEvenSum);
//        System.out.println("Sum of positive odd numbers: " + posOddSum);



        // finally second assignment done after a lot of time


    }
}
