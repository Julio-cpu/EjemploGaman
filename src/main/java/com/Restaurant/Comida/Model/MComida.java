package com.Restaurant.Comida.Model;

import com.Restaurant.Comida.Persistance.InfoConect;
import com.Restaurant.Comida.Persistance.PComida;

// import java.beans.Statement;
// import java.sql.ResultSet;
import java.sql.*;
import com.Restaurant.Comida.Cataloge.CComida;
import com.Restaurant.Comida.Persistance.Conect;
public class MComida {
    
    PComida pComida =new PComida();
    public CComida consulta(CComida cComida)throws Exception{
        Conect dataConect = null;
        
        try{
            dataConect = new Conect();
            String query = 'SELECT id,Nombre,Caducidad,Procion FROM comida where ' + pComida.nombre +' = "'+cComida.getNombre() +'"';
            //String query= "SELECT * FROM comida where nombre ='espagueti'";
            Statement st =  dataConect.conexionMYSQL().createStatement();
            ResultSet rs =  st.executeQuery(query);

            while (rs.next())
            {
                cComida.setId(rs.getInt("ID"));
                cComida.setNombre(rs.getString("Nombre"));
                cComida.setCaducidad(rs.getString("Caducidad"));
                cComida.setPorcion(rs.getString("Procion"));
        
                // print the results
               // System.out.format("%s, %s, %s, %s, %s, %s\n", cComida.getId(), cComida.getNombre(), cComida.getCaducidad(), cComida.getPorcion());
            }
            st.close();
            }catch(Exception e){
                throw e;
            }
            return cComida;
    }
}
