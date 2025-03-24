/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora_Factory_Method.factory;

import Calculadora_Factory_Method.modal.Operador;
import Calculadora_Factory_Method.modal.Divisao;
import Calculadora_Factory_Method.modal.Multiplicacao;
import Calculadora_Factory_Method.modal.Soma;
import Calculadora_Factory_Method.modal.Subtracao;

/**
 *
 * @author CODE-DEV-75
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Factory {

    public static Operador factory(String operador){
        
        Object classeIntanciada = null;

        try{
            classeIntanciada = Class.forName("Calculadora_Factory_Method.modal."+operador).newInstance();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (Operador) classeIntanciada;
    }

}

