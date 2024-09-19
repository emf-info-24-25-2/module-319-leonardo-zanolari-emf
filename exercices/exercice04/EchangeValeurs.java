package exercices.exercice04;

public class EchangeValeurs {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 210;
        System.out.println("before " + number2 + " and " + number1);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("after " + number2 + " and " + number1);
    }

}
