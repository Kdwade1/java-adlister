package mydao;

import com.codeup.adlister.dao.Config;

public class DaoFactory {
    private static Cookies cookiesDao;
    private static final Config config = new Config();

    private static Cookie getCookieDao(){
        if (cookiesDao == null) {
            cookiesDao = new CookiesDao(config);

        }
            return cookiesDao;
        }
    }

