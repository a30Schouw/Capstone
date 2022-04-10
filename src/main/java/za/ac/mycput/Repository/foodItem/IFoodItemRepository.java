package za.ac.mycput.Repository.foodItem;

/*IFoodItemRepository.java
  Interface Repository for FoodItem
  Author: Anicka Schouw 217284183
  Date: April 2022
*/

import za.ac.mycput.Entity.FoodItem;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

public interface IFoodItemRepository extends IRepository<FoodItem, String> {

    public Set<FoodItem> getAll();
}
