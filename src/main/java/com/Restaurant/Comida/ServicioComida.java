package com.Restaurant.Comida;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

import com.Restaurant.Comida.Cataloge.CComida;

@RestController
public class ServicioComida {
    @RequestMapping(value="/")
	public String index() {
		return "im alive";
	}

    @RequestMapping(value = "/comida",method = RequestMethod.GET)
    public ResponseEntity<Object> getComida(@RequestBody CComida cComida){

        cComida.setNombre("");
        if (cComida.getNombre() == null){
            
        }
        return new ResponseEntity<>(cComida,HttpStatus.OK);
    }


}