package Spring.Core.JPA.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Spring.Core.JPA.entities.Category;
import Spring.Core.JPA.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepo;
    public Category createCategory(Category category ){
        return categoryRepo.save(category);
    }
    public Iterable<Category> getAllCategories(){
        return categoryRepo.findAll();
    }
    public void deleteCategory(String code){
        categoryRepo.deleteById(code);
    }
    public Page<Category> getPaginatedCategory(int page,int size){
        Pageable pageable = PageRequest.of(page, size,Sort.by("description"));
        return categoryRepo.findAll(pageable);
        

    }
    
   

    
}

   
