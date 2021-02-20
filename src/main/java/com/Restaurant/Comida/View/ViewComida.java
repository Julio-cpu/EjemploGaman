package com.Restaurant.Comida.View;

import com.Restaurant.Comida.Cataloge.CComida;
import com.Restaurant.Comida.Model.MComida;

public class ViewComida{
    
    public CComida retrieveComida(CComida cComida) throws Exception {
       MComida mComida =new MComida();

       return mComida.consulta(cComida);
    }

    public CComida updateComuda(CComida cComida) throws Exception {
        MComida mComida =new MComida();
        return mComida.actualiza(cComida);
    }
}
