package Calculadora_Factory_Method.modal;

public class Divisao implements Operador {
    @Override
    public void executar(double a, double b){
        if (b != 0) {
            System.out.println(a / b);
        } 
        else {
            System.out.println("Não é possível dividir por zero.");
        }
    }
}