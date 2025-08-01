package Controller;

import com.mercadopago.MercadoPagoConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class PostControllers {

    @GetMapping("/mercado")
    public String mercado() {
        
        MercadoPagoConfig.setAccessToken("PROD_ACCESS_TOKEN");
        
        return null;
    }
    
    
}
