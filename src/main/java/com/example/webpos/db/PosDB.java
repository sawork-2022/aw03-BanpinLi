package com.example.webpos.db;

import com.example.webpos.model.Cart;
import com.example.webpos.model.Item;
import com.example.webpos.model.Product;

import java.util.List;

public interface PosDB {

    public List<Product> getProducts();

    public Cart saveCart(Cart cart);

    public Cart getCart();

    public Product getProduct(String productId);

    boolean deleteItem(Item item);

    boolean updateItem(Item item);

    boolean insertItem(Item item);

    Item queryItemByProductId(String productId);

    boolean deleteAllItem();

}
