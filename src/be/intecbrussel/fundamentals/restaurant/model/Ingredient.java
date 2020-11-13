package be.intecbrussel.fundamentals.restaurant.model;

import java.util.List;
import java.util.Objects;

public class Ingredient {

    private String ingredientName;
    private List<Allergen> allergens;

    public Ingredient() {
    }
    public Ingredient(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public void addAllergen(Allergen param){

    }

    public void removeAllergen(Allergen param){

    }

    public String getIngredientName() {
        return ingredientName;
    }

    public List<Allergen> getAllergens() {
        return allergens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(ingredientName, that.ingredientName) &&
                Objects.equals(allergens, that.allergens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientName, allergens);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                ", allergens=" + allergens +
                '}';
    }
}
