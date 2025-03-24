package Calculadora_Factory_Method.modal;

public class Subtracao implements Operador {
    @Override
    public void executar(double  a, double  b){
        System.out.println(a-b);
    }
}
