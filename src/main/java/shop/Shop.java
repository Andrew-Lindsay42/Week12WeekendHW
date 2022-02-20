package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int countStock() {
        return stock.size();
    }

    public void addItem(ISell item) {
        stock.add(item);
    }

    public void removeItem(ISell item) {
        stock.remove(item);
    }

    public int calculateTotalProfit() {
        return stock.stream()
                .map(ISell::calculateMarkup)
                .reduce(0, Integer::sum);
    }
}
