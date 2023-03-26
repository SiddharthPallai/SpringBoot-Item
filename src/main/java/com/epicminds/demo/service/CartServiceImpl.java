//package com.epicminds.demo.service;
//
//import com.epicminds.demo.exception.ItemNotFoundException;
//import com.epicminds.demo.model.CartItem;
//import com.epicminds.demo.model.Item;
//import com.epicminds.demo.repository.CartItemRepo;
//import com.epicminds.demo.repository.ItemRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
///**
// * @author Sidharth
// */
//@Service
//public class CartServiceImpl implements CartService{
//
//    @Autowired
//    CartItemRepo cartItemRepo;
//    @Autowired
//    ItemRepo itemRepo;
//
//    /**
//     * @param itemId
//     * @param qty
//     * @return
//     */
//    @Override
//    public int addItemToCart(Integer itemId, Integer qty) {
//        Item i = itemRepo.findById(itemId).orElseThrow(() -> new ItemNotFoundException("No such item (" + itemId + ") found"));
//        if(qty > i.getQuantity()){
//            throw new ItemNotFoundException("ddddd");
//        }
//        CartItem c= new CartItem(i,qty);
//        c.setItem(i);
//       // i.getCarts().add(c);
//
//        i.setQuantity(i.getQuantity()-qty);
//        cartItemRepo.save(c);
//        itemRepo.save(i);
//        System.out.println(i + "--" + qty);
//        System.out.println("c---"+c);
//
//        return qty;
//    }
//
//    /**
//     * @return
//     */
//    @Override
//    public List<CartItem> getCartItems() {
//        return cartItemRepo.findAll();
//    }
//
////
////    static Map<Integer,List<Item>> cart = new HashMap<>();
////    /**
////     * @param i
////     * @param o
////     * @return
////     */
////    @Override
////    public Item addItemToCart(Item i, Integer o) {
////        if(cart.containsKey(o)){
////            cart.get(o).add(i);
////        }else{
////            List<Item> newList = new ArrayList();
////            newList.add(i);
////            cart.put(o,newList);
////        }
////        return i;
////    }
////
////    /**
////     * @param o
////     * @return
////     */
////    @Override
////    public List<Item> listItemsByOrder(Integer o) {
////        return cart.get(o);
////    }
//}
