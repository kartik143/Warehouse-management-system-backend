package com.myapp.services;

import com.myapp.models.Item;
import java.util.List;

public interface WarehouseService {
    List<Item> getAllItems();
    void addItem(Item item);
    void removeItem(String itemName);
}
