package model;

import com.fasterxml.jackson.annotation.JsonProperty;
public interface MoedasResponse {
     record Moedas(
            String code,
            @JsonProperty("codein")
            String codeIn,
            String name,
            @JsonProperty("bid")
            String valorCompra,
            @JsonProperty("create_date")
            String dataVerificacao
    ) {}
}