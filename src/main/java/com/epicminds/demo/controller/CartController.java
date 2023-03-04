package com.epicminds.demo.controller;

import com.epicminds.demo.model.Item;
import com.epicminds.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sidharth
 */
@RequestMapping("api/ver3")
@RestController
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/items/cart/add/{o}")
    public ResponseEntity<Item> addItemToCart(@RequestBody Item i, @PathVariable Integer o){
        return new ResponseEntity(cartService.addItemToCart(i,o), HttpStatus.CREATED);
    }

    @GetMapping("/items/cart/get/{o}")
    public ResponseEntity<List<Item>> listItemsByOrder(@PathVariable Integer o){
        return new ResponseEntity(cartService.listItemsByOrder(o), HttpStatus.OK);
    }
}
