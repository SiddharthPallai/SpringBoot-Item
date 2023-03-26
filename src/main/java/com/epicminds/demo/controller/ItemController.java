package com.epicminds.demo.controller;

import com.epicminds.demo.model.Item;
import com.epicminds.demo.model.ItemType;
import com.epicminds.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Sidharth
 */

@RestController
@RequestMapping("api/v1")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/items")
    public ResponseEntity<Object> createItem(@RequestBody Item item) {
        return new ResponseEntity<>(itemService.addItem(item), HttpStatus.CREATED);
    }

    //Ideally new repo and controller for ItemType if ItemType is the source entity for 1:1 unidirectional
    @PostMapping("/items/type")
    public ResponseEntity<Object> createItemType(@RequestBody ItemType itemType) {
        return new ResponseEntity<>(itemService.addItemType(itemType), HttpStatus.CREATED);
    }

    @GetMapping("/items/{id}")
    public ResponseEntity<Item> getItem(@PathVariable("id") Integer itemId) {
        return ResponseEntity.ok(itemService.getItemById(itemId));
    }

    @GetMapping("/items/types/{type}")
    public ResponseEntity<List<ItemType>> getItem(@PathVariable("type") String type) {
        return ResponseEntity.ok(itemService.getItemsByItemType(type));
    }

    @GetMapping("/items/types")
    public ResponseEntity<List<ItemType>> getItem() {
        return ResponseEntity.ok(itemService.getItemTypes());
    }


    @GetMapping("/items")
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @GetMapping("/items/bnd/")
    public List<ItemType> getItemTypes() {
        return itemService.getItemTypes();
    }

    @PutMapping("/items/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable("id") Integer itemId, @Valid @RequestBody Item item) {
        return ResponseEntity.ok(itemService.updateItem(itemId, item));
    }

    @DeleteMapping("items/{id}")
    public ResponseEntity<Object> deleteItem(@PathVariable("id") int itemId) {
        itemService.deleteItem(itemId);
        return new ResponseEntity<>("", HttpStatus.NO_CONTENT);
    }
}
