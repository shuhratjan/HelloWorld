package kz.shuh.Service;

import java.sql.*;

/**
 * @author Shuhratjan Nizamov
 */
public class MyDb {

    private static Connection conn;

    public void connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //This is just simple db named test, this table has one entity named welcometext(id, text);
            String dbName="test";
            //port to connection mysql
            String port="3306";
            String username="root";
            String password="";
            conn= DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/"+dbName,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    /* It was for derby connection
    public void connecToDerby() throws SQLException{

        String dbUrl = "jdbc:derby:D:\\Projects\\JavaWebApplication\\FirstMavenProject; create=true";
        conn = DriverManager.getConnection(dbUrl);

    }


    public void initDb() throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("Create table welcometext(id int primary key, text varchar(100))");

        statement.executeUpdate("INSERT into welcometext values (1, 'Hello Java World')");
        statement.close();
    }
    */

    public String getWelcomeText() throws SQLException{
        String welcomText=null;
        Statement statement = conn.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM welcometext");
        while (resultSet.next()){
            welcomText=resultSet.getString("text");
        }
        statement.close();
        return welcomText;
    }

    //for update text;
    /*
    * @param String text
     */
    public void setWelcomText(String text) throws SQLException{
        PreparedStatement preparedStatement= conn.prepareStatement("UPDATE welcometext SET text="+text+"WHERE id=1");
        preparedStatement.executeUpdate();
    }


}
