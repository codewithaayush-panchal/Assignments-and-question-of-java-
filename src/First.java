import javax.swing.*;
import java.util.Scanner;

public class First {
        public static void main(String[] args) {

        //first 1st: Write a program to print whether a number is even or odd, also take input from the user.
//
//        Scanner input = new Scanner(System.in);
//            System.out.print("Please input a number to check whether it is even or odd: ");
//        int i = input.nextInt();
//        int b = 2;
//        if (i % b == 0 ) {
//            System.out.println("Your number is: even");
//        } else {
//            System.out.println("Your number is: odd");
//        }

        //problem solved

        //problem 2nd: Take name as input and print a greeting message for that particular name.

//            Scanner input = new Scanner(System.in);
//            System.out.println("Please enter your name to get a greeting message");
//            String name = input.nextLine();
//            System.out.println("Hey " + name + ", How are you. Have a nice day " + name + " Hope everything is well btw " + name + " what's you wife and children doing");

        //problem solved

            //problem 3rd: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
            //(the hint for the prblem is I = prt.

//            Scanner input = new Scanner(System.in);
//            System.out.println("To find Simple interest answer below questions:");
//            System.out.println("Principal: ");
//            float principal = input.nextFloat();
//            System.out.println("Time: ");
//            float time = input.nextFloat();
//            System.out.println("Rate: ");
//            float rate = input.nextFloat();
//
//            System.out.print("The value of simple interest is: ");
//            System.out.println(principal * time * rate);
            //problem solved

            //problem 4th: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions).

//            Scanner input = new Scanner(System.in);
//            System.out.println("Input a number 1 then input the operator(+, -, *, /) and then input number 2");
//            double num1 = input.nextDouble();
//            String operator = input.next();
//            double num2 = input.nextDouble();
//
//            if (operator .equals("+")) {
//                System.out.print("your answer is: ");
//                System.out.println(num1 + num2);
//            }
//
//            if (operator .equals("-")) {
//                System.out.print("your answer is: ");
//                System.out.println(num1 - num2);
//            }
//
//            if (operator .equals("*")) {
//                System.out.print("your answer is: ");
//                System.out.println(num1 * num2);
//            }
//
//            if (operator .equals("/")) {
//                System.out.print("your answer is: ");
//                System.out.println(num1 / num2);
//            }
//
            //problem solved

            //problem 5th: Take 2 numbers as input and print the largest number.

//            Scanner input = new Scanner(System.in);
//
//            System.out.println("Input 2 numbers to check which of them is greater:");
//            double num1 = input.nextDouble();
//            double num2 = input.nextDouble();
//
//            System.out.print("The greater num among the two number you gave is: ");
//            if (num1>num2) {
//                System.out.println(num1);
//            } else {
//                System.out.println(num2);
//            }

            //problem solved but there is an extra thing you can do is...

//            Scanner input = new Scanner(System.in);
//
//            System.out.println("Input 2 numbers to check which of them is greater:");
//            double num1 = input.nextDouble();
//            double num2 = input.nextDouble();
//
//            if (num1 == num2) {
//                System.out.println("Both the numbers youv'e entered are equal, please try different numbers...");
//            }
//                else {
//                    System.out.print("The greater num among the two number you gave is: ");
//                    if (num1 > num2) {
//                        System.out.println(num1);
//                    } else {
//                        System.out.println(num2);
//                    }
//                }

        //this was another method to  solve this problem.


            //problem 6th: Input currency in rupees and output in USD.

//            Scanner input = new Scanner(System.in);
//
//            System.out.println("Write amount in inr currency to covert it into usd:");
//            double inr = input.nextDouble();
//            double usd = inr * 0.011 ;
//
//            System.out.print("The amount youv'e entered in usd currency is; " + usd);

            //problem solved


            //problem 7th: To calculate Fibonacci Series up to n numbers.


//            Scanner input = new Scanner(System.in);
//
//                    System.out.print("Enter n: ");
//                    int n = input.nextInt(); // how many numbers you want
//
//                    int a = 0, b = 1; // first two numbers
//                    System.out.print(a + " " + b + " "); // print first two
//
//                    // i starts from 3 because first 2 numbers are already printed
//                    for (int i = 3; i <= n; i++) {
//                        int c = a + b;   // next number = sum of previous 2
//                        System.out.print(c + " ");
//
//                        a = b;  // shift numbers
//                        b = c;
//                    }

            //problem solved but with the help of chatgpt


            //problem 8th: To find out whether the given String is Palindrome or not.
//
//           Scanner input = new Scanner(System.in);
//
//                    System.out.print("Enter a string: ");
//                    String str = input.nextLine();
//
//                    String rev = "";
//                    for (int i = str.length() - 1; i >= 0; i--) {
//                        rev = rev + str.charAt(i);
//                    }
//
//                    if (str.equals(rev)) {
//                        System.out.println("Palindrome");
//                    } else {
//                        System.out.println("Not Palindrome");
//                    }

//                    input.close();

                    //problem solved but with the help of chatgpt but didn't understood how this happens

            //problem 9th: To find Armstrong Number between two given number.


//                    Scanner sc = new Scanner(System.in);
//
//                    // Input range
//                    System.out.print("Enter starting number: ");
//                    int start = sc.nextInt();
//
//                    System.out.print("Enter ending number: ");
//                    int end = sc.nextInt();
//
//                    System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
//
//                    // Loop through range
//                    for (int num = start; num <= end; num++) {
//                        int original = num;
//                        int digits = String.valueOf(num).length(); // count of digits
//                        int sum = 0;
//
//                        int temp = num;
//                        while (temp > 0) {
//                            int digit = temp % 10;         // take last digit
//                            sum += Math.pow(digit, digits); // raise it to power of digits
//                            temp = temp / 10;              // remove last digit
//                        }
//
//                        if (sum == original) {
//                            System.out.println(num); // Armstrong found
//                        }
//                    }

                    //again solved by chatgpt and didn't understood


            //Assignment completed


        }
}
