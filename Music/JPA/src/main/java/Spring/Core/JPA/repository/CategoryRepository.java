package Spring.Core.JPA.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import Spring.Core.JPA.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,String>{
    
}