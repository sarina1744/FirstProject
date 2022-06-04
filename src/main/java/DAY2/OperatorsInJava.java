package DAY2;

public class OperatorsInJava {
    public static void main (String[] args){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        boolean result = num1++ > num2 & num2++ > num3;
        System.out.println(result);
        System.out.println(num1);
        System.out.println(num2);
        int age=12;
        //Ternary Operator
        System.out.println(age > 60 ? "Senior Citizen " : "Not Eligible for Senior Citizen benefits");
    }
}








