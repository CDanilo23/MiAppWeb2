/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.uniminuto;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrador
 */
@WebService(serviceName = "MiNegocioWS")
public class MiNegocioWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "calculaDescuento")
    public double calculaDescuento(@WebParam(name = "precio") double precio, @WebParam(name = "cantidad")int cantidad) {
        double resultado = 0;
        double porcentaje = 0;
        if (cantidad > 100 && cantidad < 1000) {
            porcentaje = 5;
        }
        if (cantidad >= 1000 && cantidad < 10000) {
            porcentaje = 10;
        }
        if(cantidad>=10000){
            porcentaje = 20;
        }
        resultado = (precio *(porcentaje/100));
        return  resultado;
    }
}
