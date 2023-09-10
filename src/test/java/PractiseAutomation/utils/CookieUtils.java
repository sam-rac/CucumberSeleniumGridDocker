package PractiseAutomation.utils;


import io.restassured.http.Cookies;
import org.openqa.selenium.Cookie;

import java.util.List;
import java.util.ArrayList;

public class CookieUtils {
    public List<Cookie> convertRestAssuredCookiesToSeleniumCookies(Cookies cookies){
        List<io.restassured.http.Cookie> restAssuredCookies;
        restAssuredCookies = cookies.asList();
        List<Cookie> seleniumCookies = new ArrayList<>();
        for(io.restassured.http.Cookie cookie: restAssuredCookies){
            seleniumCookies.add(new Cookie(cookie.getName(), cookie.getValue(), cookie.getDomain(),
                    cookie.getPath(), cookie.getExpiryDate(), cookie.isSecured(), cookie.isHttpOnly(),
                    cookie.getSameSite()));
        }
        return seleniumCookies;
    }
}
