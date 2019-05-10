package webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("calculadora")
public class CalculadoraRest { 
    
    @Path("/somarInt/{a}/{b}")

    public somarInt(int a, int b){
        Calculadora(a, b, +);

    }
    @Path("/multiplicarInt/{a}/{b}")

    public multiplicarInt(int a, int b){
        Calculadora(a, b, *);
    }
}
