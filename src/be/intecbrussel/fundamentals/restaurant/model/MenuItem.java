package be.intecbrussel.fundamentals.restaurant.model;

import java.util.List;
import java.util.Objects;

public class MenuItem {

    private String itemName;
    private List<Ingredient> ingredients;
    private Double price;

    MenuItem(){

    }
    MenuItem(String itemName, Double price){

        this.itemName = itemName;
        this.price = price;
    }

    public void removeIngredient(Ingredient param){

    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient param){

    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(itemName, menuItem.itemName) &&
                Objects.equals(ingredients, menuItem.ingredients) &&
                Objects.equals(price, menuItem.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, ingredients, price);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemName='" + itemName + '\'' +
                ", ingredients=" + ingredients +
                ", price=" + price +
                '}';
    }
}
