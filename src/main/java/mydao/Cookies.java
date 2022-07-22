package mydao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface Cookies {
    List<Cookie> all();
    // insert a new ad and return the new ad's id
    Long insert(Cookie cookie);
}


