package Spring.Core.jdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Spring.Core.jdbc.jdbc.JobDAO;

@SpringBootApplication
public class Application implements CommandLineRunner {

    // @Autowired
    // private UserRepository userRepository;
    @Autowired
    private JobDAO jobDAO;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Override
    public void run(String... args) {
        // Create the Users table
        // userRepository.createUserTable();
        // System.out.println("Users table created successfully!");
        // userRepository.insertUser("Kalyan","kalyan123@gmail.com");
        // userRepository.insertUser("Charan","Charan234@gmail.com");
        // System.out.println("Users inserted Successfully");
        // userRepository.getAllUsers();

        // jobDAO.add("SpringDeveloper");
        // jobDAO.add("JavaDeveloper");
        // System.out.println("Jobs Added Succesfully");
        jobDAO.add("Python Developer");
        jobDAO.add("HTMLDeveloper");
        System.out.println("Transactions  Added Succesfully");
        jobDAO.deleteDeveloper("HTMLDeveloper");
        System.out.println("Succesfully deleted");




        
        
    }
}