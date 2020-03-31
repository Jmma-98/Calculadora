/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *	comentario de prueba 2
 * @author dam
 */
public class Calculadora {
    private int num1;
    private int num2;
    /**
     * 
     * @param: int num1 indica el primer número que usara la caculadora
     * @param: int num2 indica el segundo número que usara la caculadora
     */
    public Calculadora(int a, int b) {
        num1 = a;
        num2 = b;   
        /**
         * @param: int a valor que sustituye a la variable no publica num1
         * @param: int b valor que sustituye a la variable no publica num2
         */
    }

    public int suma(){
        int result = num1 + num2;
        return result;
        /**
         * @return resultado de sumar los dos parámetros
         */
    } 
    public int resta(){
        int resul;
        if(resta2()) resul = num1 - num2;
        else         resul = num2 - num1;
        return resul;
        /**
         * @return resultado de restar el parámetro con el valor mas bajo al más alto
         */
    }
    
    public boolean resta2(){
        if (num1 >= num2) return true;
        else              return false;        
    }
    
    public int multiplica(){
        int result = num1 * num2;
        return result;
        /**
         * @return resultado de multiplicar los dos parámetros
         */
    }
    
    public int divide(){
        int result = num1 / num2;
        return result;
        /**
         * @deprecated sustituido por el método divide0()
         */
    }
    
    public Integer divide2(){
        if(num2==0) return null;
        int resul = num1/num2;
        return resul;
    }
    
    public int divide0(){
        if(num2==0)
            throw new java.lang.ArithmeticException("División por 0");
            /**
             * @throws exception java.lang.ArithmeticException
             */
        else{
            int resul = num1/ num2;
            return resul;
            /**
             * @return resultado de dividir el parámetro 1 entre el 2 siempre que no lance la excepcion anterior
             */
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calc = new Calculadora(20, 10);
        System.out.println(calc.multiplica());
    }
    
}
