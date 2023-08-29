package ecommerceWebssite;

import java.util.*;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem1(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

	public void addItem11(Product product) {
		
	}

	public double calculateTotal1() {
		
		return 0;
	}

	public void addItem(Product product) {
	
		
	}


}
