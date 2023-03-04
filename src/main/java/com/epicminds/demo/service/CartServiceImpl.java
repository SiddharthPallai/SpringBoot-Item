package com.epicminds.demo.service;

import com.epicminds.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sidharth
 */
@Service
public class CartServiceImpl implements CartService{


    static Map<Integer,List<Item>> cart = new HashMap<>();
    /**
     * @param i
     * @param o
     * @return
     */
    @Override
    public Item addItemToCart(Item i, Integer o) {
        if(cart.containsKey(o)){
            cart.get(o).add(i);
        }else{
            List<Item> newList = new ArrayList();
            newList.add(i);
            cart.put(o,newList);
        }
        return i;
    }

    /**
     * @param o
     * @return
     */
    @Override
    public List<Item> listItemsByOrder(Integer o) {
        return cart.get(o);
    }
}
