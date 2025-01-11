import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 class Demo {
  public static void main(String[] args) {
    String className = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://@localhost:3306/college?useSSL=false";

    String username = "root";
    String password = "Ankitadcn@5025";
    String sql = "create table emp(eno int, ename varchar(20))";

    try {
      Class.forName(className);
      System.out.println("Load and Configre the Driver");

      Connection connection = DriverManager.getConnection(url, username, password);
      System.out.println("Establish the connection....");

      Statement statement = connection.createStatement();
      System.out.println("Statement object cretated....");

      int count = statement.executeUpdate(sql);
      System.out.println("Query Executed....." + count);

      connection.close();
      System.out.println("close the connecton");
    } catch (ClassNotFoundException e) {
      System.out.println("Driver Not Found");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
