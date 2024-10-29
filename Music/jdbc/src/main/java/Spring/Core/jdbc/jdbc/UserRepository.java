package Spring.Core.jdbc.jdbc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    //@Autowired private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate np;

    public void createUserTable() {
        String sql = "IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='Users' AND xtype='U') " +
                     "CREATE TABLE Users (" +
                     "id INT PRIMARY KEY IDENTITY(1,1)," +
                     "username NVARCHAR(100)," +
                     "email NVARCHAR(100)" +
                     ")";
        np.getJdbcTemplate().execute(sql);             
        //jdbcTemplate.execute(sql);
    }
    //public void insertUser(String username,String email){               //JDBC TEMPLATE
       // String sql = "INSERT INTO Users(username,email) VALUES (?,?)";
        //jdbcTemplate.update(sql,username,email);
   // }
    public void insertUser(String username,String email){
        String sql = "INSERT INTO Users(username,email) VALUES (:username,:email)";
        MapSqlParameterSource parameter = new MapSqlParameterSource();
        parameter.addValue("username",username);
        parameter.addValue("email",email);
        np.update(sql, parameter);


   }
    public List<User> getAllUsers(){
        String sql = "SELECT * FROM Users";
        return np.query(sql,(rs,rowNum)->{
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String email = rs.getString("email");
            System.out.println("id = " + id + "UserName = " + username + "Email = " + email);
            return new User(id,username,email);
            
        });
    }
}
    

