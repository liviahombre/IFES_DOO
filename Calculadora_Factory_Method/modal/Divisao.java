/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora_Factory_Method.modal;

/**
 *
 * @author CODE-DEV-75
 */
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