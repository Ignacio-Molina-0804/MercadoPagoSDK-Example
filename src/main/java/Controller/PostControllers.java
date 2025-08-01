package Controller;

import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.preference.PreferenceClient;
import com.mercadopago.client.preference.PreferenceItemRequest;
import com.mercadopago.client.preference.PreferenceRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.preference.Preference;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class PostControllers {

    @GetMapping("/mercado")
    public String mercado() throws MPException, MPApiException {

        MercadoPagoConfig.setAccessToken("PROD_ACCESS_TOKEN");
    

        PreferenceItemRequest itemRequest = PreferenceItemRequest.builder()
                .id("1234")
                .title("Games")
                .description("PS5")
                .pictureUrl("http://picture.com/PS5")
                .categoryId("games")
                .quantity(2)
                .currencyId("BRL")
                .unitPrice(new BigDecimal("4000"))
                .build();

        List<PreferenceItemRequest> items = new ArrayList<>();

        items.add(itemRequest);
        PreferenceRequest preferenceRequest = PreferenceRequest.builder()
                .items(items).build();

        PreferenceClient client = new PreferenceClient();

        Preference preference = client.create(preferenceRequest);

        return preference.getSandboxInitPoint();
    }

}
