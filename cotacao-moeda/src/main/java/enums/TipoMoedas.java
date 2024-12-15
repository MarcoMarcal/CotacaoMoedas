package enums;

public enum TipoMoedas {
    USDBRL("USD-BRL"),
    EURBRL("EUR-BRL"),
    BTCBRL("BTC-BRL");

    public final String description;

    TipoMoedas(String description) {
        this.description = description;
    }
}
