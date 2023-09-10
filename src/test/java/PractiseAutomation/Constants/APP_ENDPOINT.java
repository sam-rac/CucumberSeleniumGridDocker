package PractiseAutomation.Constants;

public enum APP_ENDPOINT {
    STORE("/store"),
    ACCOUNT("/account"),
    ADD_TO_CART("/?wc-ajax=add_to_cart");
    public final String url;
    APP_ENDPOINT(String url) {
        this.url = url;
    }
}
