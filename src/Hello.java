import java.awt.*;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, is there anybody out there?");
        System.out.println("Hello Capt. Cassian");

        //23
        int firstNumber = 9;
        int secondNumber = 6;
        System.out.println("firstNumber "+firstNumber);
        System.out.println("secondNumber "+secondNumber);
        System.out.println(firstNumber+" + "+secondNumber+" = "+(firstNumber+secondNumber));
        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber+" + "+secondNumber+" = "+firstNumber+secondNumber);

        //24
        int thirdNumber = 22;
        System.out.println("thirdNumber "+thirdNumber);
        System.out.println("secondNumber * thirdNumber = " +(secondNumber*thirdNumber));

        int subTotal = (firstNumber + secondNumber + thirdNumber);
        System.out.println("sub Total " + subTotal);

        int lastOne = 1000 - subTotal;
        System.out.println((lastOne));

        /*
Hello, is there anybody out there?
Hello Capt. Cassian
firstNumber 9
secondNumber 6
9 + 6 = 15
15
9 + 6 = 96
thirdNumber 22
secondNumber * thirdNumber = 132
sub Total 37
963
         */

    }

}
