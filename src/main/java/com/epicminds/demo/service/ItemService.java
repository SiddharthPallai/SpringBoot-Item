package com.epicminds.demo.service;

import com.epicminds.demo.exception.ItemNotFoundException;
import com.epicminds.demo.model.Item;
import com.epicminds.demo.model.ItemType;

import java.util.List;

/**
 * @author Sidharth
 */
public interface ItemService {
    Item addItem(Item item);
    //1:1 UND
    ItemType addItemType(ItemType itemType);

    Item getItemById(Integer id) throws ItemNotFoundException;

    List<Item> getItems();
    List<ItemType> getItemTypes();
    List<ItemType> getItemsByItemType(String type);

    Item updateItem(Integer itemId, Item item) throws ItemNotFoundException;

    void deleteItem(Integer itemId) throws ItemNotFoundException;
}
