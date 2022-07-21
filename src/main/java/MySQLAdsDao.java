//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//import com.mysql.cj.jdbc.Driver;
//
//
//public class MySQLAdsDao implements Ads{
//
//    public Connection getConnection() {
//        return connection;
//    }
//
//    public void setConnection(Connection connection) {
//        this.connection = connection;
//    }
//
//    private Connection connection = null;
//    private List<Ad> ads;
//
//    public MySQLAdsDao(Config config) {
//        try {
//
//            DriverManager.registerDriver(new Driver());
//            this.connection = DriverManager.getConnection(
//                    config.getUrl(),
//                    config.getUser(),
//                    config.getPassword()
//            );
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    @Override
//    public List<Ad> all() {
//        if (ads == null) {
//            ads = generateAds();
//        }
//        return ads;
//    }
//
//    @Override
//    public Long insert(Ad ad) {
//    String title = ad.getTitle();
//    String desc = ad.getDescription();
//    String query = "INSERT INTO ads(user_id, title,description)ValUES(1, '"title+"','"desc+"')";
//    try{
//    Statement smt = connection.createStatement();
//    smt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
//    ResultSet rs= smt.getGeneratedKeys();
//    rs.next();
//        System.out.println("Created a new id"+rs.getLong(1));
//    }catch(SQLException e){
//        throw new RuntimeException(e);
//    }
//
//    private List<Ad> generateAds() {
//      String selectQuery = "SELECT * FROM ads";
//        List<Ad> ads = new ArrayList<>();
//
//        try {
//            Statement statement =connection.createStatement();
//            ResultSet rs = statement.executeQuery(selectQuery);
//
//            while(rs.next()){
//                ads.add(new Ad(rs.getLong("id"),rs.getLong("user_id"),rs.getString("title"),rs.getString("description")));
//
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return ads;
//    }
//

//}
