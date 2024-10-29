package Spring.Core.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;

import Spring.Core.jdbc.jpa.Category;
import Spring.Core.jdbc.jpa.CategoryService;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {
    @Autowired
    private CategoryService categoryService;
    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
    @Override
    public void run(String...args){
        Category c = new Category();
        c.setCode("0001");
        c.setDescription("Java");
        categoryService.createCategory(c);
        Iterable<Category> Categories = categoryService.findallCategories();
        Categories.forEach(System.out::println);
        int size = 5;
        int page = 0;
        Page<Category> p =categoryService.getPaginatedCategory(page, size);
        System.out.println("Pages:" + p.getNumber()+ "of:" + p.getTotalPages());
        p.forEach(System.out::println);
        
        
        System.out.println("Succesfully executed");


    }
    

   
    
}
