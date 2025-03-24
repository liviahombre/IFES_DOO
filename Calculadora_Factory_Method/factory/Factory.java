
package Calculadora_Factory_Method.factory;

import Calculadora_Factory_Method.modal.Operador;
import Calculadora_Factory_Method.modal.Divisao;
import Calculadora_Factory_Method.modal.Multiplicacao;
import Calculadora_Factory_Method.modal.Soma;
import Calculadora_Factory_Method.modal.Subtracao;

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

