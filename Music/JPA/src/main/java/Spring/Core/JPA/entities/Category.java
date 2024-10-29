package Spring.Core.JPA.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categories")
public class Category {
    @Id
    @Column(name = "catcode")
    private String code;

    @Column(name = "catdesc")
    private String description;

    // Constructors
    public Category() {}

    public Category(String code, String description) {
        this.code = code;
        this.description = description;
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category [code=" + code + ", description=" + description + "]";
    }

}
