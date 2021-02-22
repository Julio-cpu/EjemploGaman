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

import java.net.http.HttpResponse.ResponseInfo;
import java.util.HashMap;
import java.util.Map;

import com.Restaurant.Comida.Cataloge.CComida;
import com.Restaurant.Comida.View.ViewComida;

@RestController
public class ServicioComida {
    @RequestMapping(value="/")
	public String index() {
		return "im alive";

	}

    @RequestMapping(value = "/comida",method = RequestMethod.GET)
    public ResponseEntity<Object> getComida(@RequestBody CComida cComida) throws Exception {

        ViewComida vistComida = new ViewComida();
        cComida = vistComida.retrieveComida(cComida);
        return new ResponseEntity<>(cComida,HttpStatus.OK);
       
    }
    @RequestMapping(value ="/comida",method = RequestMethod.PUT)
    public ResponseEntity<Object> setComida(@RequestBody CComida cComida) throws Exception {
        ViewComida vistComida = new ViewComida();
        cComida = vistComida.updateComuda(cComida);
        return new ResponseEntity<>(cComida,HttpStatus.OK);
    }
    @RequestMapping(value = "/comdia/delete", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delComida(@RequestBody CComida cComida) throws Exception {
        ViewComida vistComida=new ViewComida();
        cComida=vistComida.deleteComida(cComida);

        return new ResponseEntity<>(cComida,HttpStatus.OK);
    }

    


}