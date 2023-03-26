package com.epicminds.demo.service;

import com.epicminds.demo.exception.ItemNotFoundException;
import com.epicminds.demo.model.Item;
import com.epicminds.demo.model.ItemType;
import com.epicminds.demo.repository.ItemRepo;
import com.epicminds.demo.repository.ItemTypeRepo;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Sidharth
 */
@Service
@CommonsLog
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepo itemRepo;
    @Autowired
    ItemTypeRepo itemTypeRepo;

    @Override
    public Item addItem(Item item) {
        return itemRepo.save(item);
    }

    /**
     * @param itemType
     * @return
     */
    @Override
    public ItemType addItemType(ItemType itemType) {
        return itemTypeRepo.save(itemType);
    }

    @Override
    public Item getItemById(Integer itemId) {
        return itemRepo.findById(itemId).orElseThrow(
                () -> new ItemNotFoundException("No such item (" + itemId + ") found")
        );
    }

    @Override
    public List<Item> getItems() {
      //  System.out.println("----------"+itemRepo.findByName("SonyBravio"));
        return itemRepo.findAll();
    }

    @Override
    public List<ItemType> getItemsByItemType(String type) {
        List<ItemType> itemTypes = itemTypeRepo.findAll();
        return itemTypes.stream().filter(s -> s.getType().equals(type)).collect(Collectors.toList());
    }

    @Override
    public List<ItemType> getItemTypes() {
        return itemTypeRepo.findAll();
    }

    @Override
    public Item updateItem(Integer itemId, Item item) {
        Item item1 = itemRepo.findById(itemId).orElseThrow(
                () -> new ItemNotFoundException("No such item (" + itemId + ") found")
        );
        item1.setName(Objects.isNull(item.getName()) ? item1.getName() : item.getName());
        item1.setQuantity(Objects.isNull(item.getQuantity()) ? item1.getQuantity() : item.getQuantity());
        item1.setPrice(Objects.isNull(item.getPrice()) ? item1.getPrice() : item.getPrice());
        return itemRepo.save(item1);
    }

    @Override
    public void deleteItem(Integer itemId) {
        Item it = itemRepo.findById(itemId).orElseThrow(
                () -> new ItemNotFoundException("No such item found by id = " + itemId)
        );
        itemRepo.delete(it);
    }

}
