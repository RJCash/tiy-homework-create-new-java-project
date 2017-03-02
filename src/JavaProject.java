/**
 * Created by rickiecashwell on 3/2/17.
 */
public class JavaProject {

    public static void main(String[] args) {

        //Simple addition expression
        boolean b = true, a = false;
        double x = 34.45, y = 34.45, average;
        System.out.println(x + y);
        //Printing expression using square root. The expression calculates square root of x
        System.out.println(Math.sqrt(x));
        //Printing experssion using exponent. x to the power of 4
        System.out.println(Math.pow(x, 4));
        //Printing a String variable called R with the value of "Rickie"
        String R = "Rickie";
        System.out.println("Hello my name is: " + R);
        //Printing out the boolean value that is added to the string
        System.out.println("It is " + b + " that I think java is fun");
        //Printing the opposite boolean value using !
        System.out.println("It is " + !b + " that I think java isn't fun");
        //Print out if either a or b are true
        if (a || b) {
            System.out.println("either a or b is true");
        }
        //example do while loop that different operators flips the number.
        int q = 324;
        int w, t = 0;
        System.out.println("The original number : " + q);
        do {

            w = q % 10;
            t = t * 10 + w;
            q = q / 10;
        } while (q > 0);
        System.out.println("The reverse number : " + t);
        //exmaple for loop to print the message a certain amount of times
        for (int e = 0; e < 10; e++) {
            System.out.println("This message will print 10 times");
        }
        //Example of running a method
        average=Average();
        System.out.println(average);
        //
    }
        //example method to return average
        public static double Average(){
            double total = 0;
            double average = 0;

            double test1 = 67, test2 = 56, test3 = 78, test4 = 100;

            total += test1 + test2 +test3 + test4;
            average = total / 4;
            return average;
    }

    }

