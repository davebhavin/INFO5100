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
    
     public void top3BestNegotiatedProducts() {
       Map<Integer, Integer> topproducts = new HashMap<Integer, Integer>();
       Map<Integer, Item> item = DataStore.getInstance().getItem();
       Map<Integer, Product> prod = DataStore.getInstance().getProduct();
        
        for (Item i : item.values()) {
           //System.out.println("ProductID "+i.getProductId() );
            // System.out.println("Sales Price: " +i.getSalesPrice());
          // System.out.println("Target Price: " +prod.get(i.getProductId()).getTargetPrice());
             if(i.getSalesPrice() > prod.get(i.getProductId()).getTargetPrice()) {
                //Check if prodid from Item is present in Product map
                //Prod is the map. map.get = prod.get
                 if (topproducts.containsKey(i.getProductId()))
                {
                  int quantity = topproducts.get(i.getProductId());
                topproducts.put(i.getProductId(), (quantity + i.getQuantity()));
                }
                else {
                topproducts.put(i.getProductId(), i.getQuantity());
            }

            } 
        }
          //System.out.println("top product map: "+topproducts.values());
         List<Map.Entry<Integer, Integer>> entrylist = new ArrayList<Map.Entry<Integer, Integer>>(topproducts.entrySet());
        
        Collections.sort(entrylist, new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> p1,
                               Map.Entry<Integer, Integer> p2)
            {     
               // System.out.println(o1.getValue());
                return (p2.getValue()).compareTo(p1.getValue());
            }
           
             
        });
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\n \n Top 3 Products according to the quantity are as below:");
        for(int j = 0;j<3;j++){
            System.out.println("\n Product: " +entrylist.get(j)+" ");
        }

      }
      public void top3BestCustomer() {
       LinkedHashMap<Integer, Integer> top3customers = new LinkedHashMap<Integer, Integer>();
       Map<Integer, Order> order = DataStore.getInstance().getOrder();
       Map<Integer, Product> prod = DataStore.getInstance().getProduct();
       
       for(Order o:order.values()){
           if(top3customers.containsKey(o.getCustomerId())){
               int sumOfDiff = top3customers.get(o.getCustomerId());
               top3customers.put(o.getCustomerId(),sumOfDiff +Math.abs((o.getItem().getSalesPrice() - prod.get(o.getItem().getProductId()).getTargetPrice())));
                       }
           else{
               //Map.get - so we are getting the target price from Product map so we have to traverse through it to get the target price
             top3customers.put(o.getCustomerId(),Math.abs((o.getItem().getSalesPrice() - prod.get(o.getItem().getProductId()).getTargetPrice())));
           }
       }
       
       List<Map.Entry<Integer, Integer>> entrylist = new ArrayList<Map.Entry<Integer, Integer>>(top3customers.entrySet());
        
        Collections.sort(entrylist, new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> c1,
                               Map.Entry<Integer, Integer> c2)
            {     
               // System.out.println(o1.getValue());
                return (c1.getValue()).compareTo(c2.getValue());
            }
           
             
        });
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\n \n Top 3 Customers according to the closest buying price are:");
        for(int j = 0;j<3;j++){
            System.out.println("\n Customer: " +entrylist.get(j)+" ");
        }
          
    }
      
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
         System.out.println("-------------------------------------------------------------------");

        System.out.println("Sorted Values:" + sortedMap );
        System.out.println("\n Q3-Top 3 Sales Persons are:\r");
        for (int x = 0; x < 3; x++) {
            Integer value = sortedMap.get(salesPerson.get(x));
            System.out.println("Sales Person: " + salesPerson.get(x) + "  Profit :" + value.toString());
        }
          
    }
  
}