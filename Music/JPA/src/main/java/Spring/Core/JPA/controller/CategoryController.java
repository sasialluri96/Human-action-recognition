package Spring.Core.JPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Spring.Core.JPA.entities.Category;
import Spring.Core.JPA.service.CategoryService;
@RestController
@RequestMapping("/paging")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping("/create")
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }
    @GetMapping
    public Iterable<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
    @DeleteMapping("/codes/{code}")
    public void deleteCategory(@PathVariable String code){
        categoryService.deleteCategory(code);
    }
    @GetMapping("/page")
    public Page<Category> getPaginatedCategory(@RequestParam int page,@RequestParam int size){
        return categoryService.getPaginatedCategory(page, size);
        
    }


    
}
