package be.intecbrussel.fundamentals.restaurant.model;

import java.util.List;

public class Menu {

    private String menuName;
    private List<MenuItem> items;

    public Menu() {
    }
    public Menu(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void addMenuItem(MenuItem param){

    }

    public void removeItem(MenuItem param){

    }

    public List<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuName='" + menuName + '\'' +
                ", items=" + items +
                '}';
    }
}
