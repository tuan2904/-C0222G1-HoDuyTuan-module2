package _01_introduction_to_java.exercise;
import java.util.Scanner;
public class ReadingMoney {
    public static void main(String[] args) {
        System.out.println(" Import number to read ");
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
            int unit = number%10;
            int ten = (number/10)%10;
            int hundred=number/100;
            String number1="";
         String number2="";
        String number3="";
            if (unit>0){
        switch (unit){
            case 1:
                number1=" and one";
                break;
            case 2:
                number1="two";
                break;
            case 3:
                number1="three";
                break;
            case 4:
                number1="four";
                break;
            case 5:
                number1="five";
                break;
            case 6:
                number1="six";
                break;
            case 7:
                number1="seven";
                break;
            case 8:
                number1="eight";
                break;
            case 9:
                number1="nine";
                break;
        }}
        if (ten == 1){
        switch (unit){
            case 0:
                number2="ten";
                break;
            case 1:
                number2="eleven";
                break;
            case 2:
                number2="twelve";
                break;
            case 3:
                number2="thirteen";
                break;
            case 4:
                number2="fourteen";
                break;
            case 5:
                number2="fifteen";
                break;
            case 6:
                number2="sixteen";
                break;
            case 7:
                number2="seventeen";
                break;
            case 8:
                number2="eighteen";
                break;
            case 9:
                number2="nineteen";
                break;
        }
        } else {
            switch (ten){
                case 2:
                    number2="twenty";
                    break;
                case 3:
                    number2="thirty";
                    break;
                case 4:
                    number2="forty";
                    break;
                case 5:
                    number2="fifty";
                    break;
                case 6:
                    number2="sixty";
                    break;
                case 7:
                    number2="seventy";
                    break;
                case 8:
                    number2="eighty";
                    break;
                case 9:
                    number2="ninety";
                    break;
            }
        }
        if (hundred>0){
        switch (hundred){
            case 1:
                number3="one hundred";
                break;
            case 2:
                number3="two hundred";
                break;
            case 3:
                number3="three hundred ";
                break;
            case 4:
                number3="four hundred";
                break;
            case 5:
                number3="five hundred ";
                break;
            case 6:
                number3="six hundred ";
                break;
            case 7:
                number3="seven hundred";
                break;
            case 8:
                number3="eight hundred";
                break;
            case 9:
                number3="nine hundred ";
                break;
        }
        }if (ten ==1){
            System.out.println(number3  + " and " +  number2);
        }else if (ten != 1) {
            System.out.println(number3  +  number2  + number1);
        }else if (hundred >1){
            System.out.println(number3);
        }else if (number < 0){
            System.out.println(" Mời nhập lại");
        }

}
}
