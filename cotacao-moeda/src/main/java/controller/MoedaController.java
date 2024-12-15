package controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;
import service.MoedasService;

@Controller("/{moedas}")
public class MoedaController {
    @Inject
    private MoedasService moedasService;

    @Get("/{moeda}")
    public String getMoeda(@PathVariable String moeda) {
        try {
            return moedasService.getMoeda(moeda);
        } catch (Exception e) {
            e.printStackTrace();
            return "Deu pau" + e.getMessage();
        }
    }
}
