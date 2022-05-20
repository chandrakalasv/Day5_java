package com.bl.day5;

public class Calculator {
    int num1, num2;
    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    int addition()
    {
        return num1 + num2;
    }
    int subtraction()
    {
        return num1 - num2;
    }
    int multiplication()
    {
        return num1 * num2;
    }
    int division() {

        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculator math = new Calculator(4, 2);
        int add_result = math.addition();
        System.out.println("addition result is" + " " + add_result);
        int sub_result = math.subtraction();
        System.out.println("subtraction result is" + " " + sub_result);
        int mul_result = math.multiplication();
        System.out.println("multiplication result is" + " " + mul_result);
        int div_result = math.division();
        System.out.println("division result is" + " " + div_result);

    }
}
