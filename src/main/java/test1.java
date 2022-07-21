public class test1 {
    public static void main(String[] args) {
        MySQLAdsDao mysql = new MySQLAdsDao(new Config());
        mysql.all();

    }
}
