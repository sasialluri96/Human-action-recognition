package Spring.Core.jdbc.jdbc;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.annotation.PostConstruct;

@Component
public class JobDAO {
    
    private  SimpleJdbcInsert sji;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @PostConstruct
    public void init(){
        this.sji = new SimpleJdbcInsert(jdbcTemplate).withTableName("Jobs");
    }
    @Transactional
    public void add(String title){
        HashMap<String,Object> parameter = new HashMap<>();
        parameter.put("title" ,title);
        sji.execute(parameter);

    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void deleteDeveloper(String title){
        String sql = "DELETE FROM Jobs WHERE title=?";
        jdbcTemplate.update(sql,title);
    }
    
    
}
