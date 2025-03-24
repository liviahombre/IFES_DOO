/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora_Factory_Method;

/**
 *
 * @author CODE-DEV-75
 */
import java.util.Scanner;
import Calculadora_Factory_Method.factory.Factory;
import Calculadora_Factory_Method.modal.Operador;

public class Main {

    public static void main(String[] args){
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        a = scanner.nextDouble();  
        System.out.println("Digite o segundo número: ");
        b = scanner.nextDouble();  

        System.err.println("Escolha a operação dentre as opções: ");
        System.err.println("*Divisao");
        System.err.println("*Multiplicacao");
        System.err.println("*Subtracao");
        System.err.println("*Soma");
        while (true) {
            System.out.println("Digite a operação desejada: ");
            String opcao = scanner.next();
            if (opcao.equals("Divisao") || opcao.equals("Multiplicacao") || opcao.equals("Subtracao") || opcao.equals("Soma")) {
                Operador op = Factory.factory(opcao);
                op.executar(a,b);
                break;
            }
            System.out.println("Operação inválida, tente novamente.");
        }
        
        scanner.close();
    }
}

