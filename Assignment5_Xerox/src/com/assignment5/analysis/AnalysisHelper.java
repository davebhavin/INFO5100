/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analysis;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author saura
 */
public class AnalysisHelper {
    
   public void top3SalesPerson() {
        
        LinkedHashMap<Integer, Integer> topSalesPerson = new LinkedHashMap<Integer, Integer>();

        Map<Integer, Order> orders = DataStore.getInstance().getOrder();
        Map<Integer, Product> products = DataStore.getInstance().getProduct();
      
        for (Order o : orders.values()) {
            int prod_Id = o.getItem().getProductId();

            for (Product p : products.values()) {
                if (p.getProdID()== prod_Id) {
                    {

                        if (topSalesPerson.containsKey(o.getSupplierId())) {
                            int sum = topSalesPerson.get(o.getSupplierId());
                            topSalesPerson.put(o.getSupplierId(), (sum) + Math.abs(o.getItem().getQuantity() * (o.getItem().getSalesPrice() - p.getTargetPrice())));

                        } else {
                            topSalesPerson.put(o.getSupplierId(),Math.abs(o.getItem().getQuantity() * (o.getItem().getSalesPrice() - p.getTargetPrice())));

                        }
                    }
                }
            }
        }

        List<Integer> mapKeys = new ArrayList<>(topSalesPerson.keySet());
        List<Integer> mapValues = new ArrayList<>(topSalesPerson.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        Iterator<Integer> valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            int val = valueIt.next();
            Iterator<Integer> keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                Integer key = keyIt.next();
                int tempKey = topSalesPerson.get(key);
                //int tempVal2 = val;

                if (tempKey == val) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }
        }
         
        
        ArrayList<Integer> salesPerson = new ArrayList<Integer>(sortedMap.keySet());
        Collections.reverse(salesPerson);
        
        System.out.println("Sorted Values:" + sortedMap );
        System.out.println("\n Q3-Top 3 Sales Persons are:\r");
        for (int x = 0; x < 3; x++) {
            Integer value = sortedMap.get(salesPerson.get(x));
            System.out.println("Sales Person: " + salesPerson.get(x) + "  Profit :" + value.toString());
        }
         
        
    }
   
   

}
