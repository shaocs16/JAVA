package org.aguzman.poosobrecarga;

public class Calculadora {

    public int sumar(int a, int b){
        return a+ b;
    }

    public int sumar(int... argumentos){
        int a =
    }

    public float sumar(float x, float y){
        return x + y;
    }

    public float sumar(int i, float j){
        return i + j;
    }

    public float smar(float i, int j){
        return i + j;
    }

    public double sumar(double a, double b){
        return a+ b;
    }

    public int sumar(String a, String b){
        int reusltado;
        try{
            reusltado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch(NumberFormatException e){
            reusltado = 0;
        }
        return reusltado;
    }

    public int sumar(int a, int b, int c){
        return a + b + c;
    }

}
