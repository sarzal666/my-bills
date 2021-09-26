package bill.atoms;

import bill.atoms.Interfaces.CategoryType;
import bill.atoms.enums.Categories;

public class Category implements CategoryType {
    private String name;
    private Categories type = Categories.UPCOMING;


    public Category(String name) {
        this.name = name;
    }

    public Category(String name, Categories type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getCategoryName() {
        return this.type.toString();
    }
}
