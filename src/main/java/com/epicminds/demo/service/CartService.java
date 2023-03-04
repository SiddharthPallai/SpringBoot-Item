package com.epicminds.demo.service;

import com.epicminds.demo.model.Item;

import java.util.List;

/**
 * @author Sidharth
 */
public interface CartService {

    public Item addItemToCart(Item i, Integer o);
    public List<Item> listItemsByOrder(Integer o);

}
