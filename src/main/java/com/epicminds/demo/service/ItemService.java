package com.epicminds.demo.service;

import com.epicminds.demo.exception.ItemNotFoundException;
import com.epicminds.demo.model.Item;

import java.util.List;

/**
 * @author Sidharth
 */
public interface ItemService {
    Item addItem(Item item);

    Item getItemById(Integer id) throws ItemNotFoundException;

    List<Item> getItems();

    Item updateItem(Integer itemId, Item item) throws ItemNotFoundException;

    void deleteItem(Integer itemId) throws ItemNotFoundException;
}
