package mapper;

import java.util.*;

import pojo.Items;
import pojo.Orders;
import pojo.User;

public interface Buy {
public List<Items> find_items();
public Items find_itemsById(int id);
public void update_items(Items item);
public void delete_items(int id);
public void insert_items(Items items);
public List<Items> mohu_select(String info);
}
