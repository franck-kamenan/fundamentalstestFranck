package be.intecbrussel.fundamentals.restaurant.service;

public interface RestaurantService {

    public void addToMenu(MenuItem menuItemParam);

    public void printMenuItemsWithoutAllergens(List<Allergen> param);

    public void setMenu(Menu param);

    public void printSortedMenuByName();

    public void printSortedMenuByPrice();

    public void printMenu();
}
