package Spring.Core.jdbc.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    public Category createCategory(Category category ){
        return categoryRepo.save(category);
    }
    public Iterable<Category> findallCategories(){
        return categoryRepo.findAll();
    }
    public Page<Category> getPaginatedCategory(int page,int size){
        Pageable pageable = PageRequest.of(page, size);
        return categoryRepo.findAll(pageable);
        

    }
    
}
