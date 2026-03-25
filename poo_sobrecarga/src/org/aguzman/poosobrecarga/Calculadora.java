package org.aguzman.poosobrecarga;

public class Calculadora {

    private Calculadora() {
    }

    public static int sumar(int a, int b){
        return a+ b;
    }

    public static int sumar(int... argumentos){
        int total = 0;
        for(int i : argumentos){
            total += i;
        }
        return total;
    }

    public static float sumar(float a, int... argumentos){
        float total = a;
        for(int i : argumentos){
            total += i;
        }
        return total;
    }

    public static double sumar(double... argumentos){
        double total = 0.0;
        for(double i : argumentos){
            total += i;
        }
        return total;
    }

    public static float sumar(float x, float y){
        return x + y;
    }

    public static float sumar(int i, float j){
        return i + j;
    }

    public static float smar(float i, int j){
        return i + j;
    }

    public static double sumar(double a, double b){
        return a+ b;
    }

    public static int sumar(String a, String b){
        int reusltado;
        try{
            reusltado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch(NumberFormatException e){
            reusltado = 0;
        }
        return reusltado;
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

}
