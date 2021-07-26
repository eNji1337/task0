package org.example;

public class Rekusria {
    static class Calculation {
        int fact(int n) {
            if (n <= 1) {
                return 1;
            }
            else {
                return n * fact(n - 1);
            }
        }
    }

    public static void main(String[] args) {
        Calculation obj_one = new Calculation();

        int a = obj_one.fact(5);
        System.out.println("The factorial of the number is : " + a);
    }
}
