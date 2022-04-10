package za.ac.mycput.Repository.foodType;

/*IFoodTypeRepository.java
  Repository for FoodItem
  Author: Anicka Schouw 217284183
  Date: April 2022
*/

import za.ac.mycput.Entity.FoodType;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

public interface IFoodTypeRepository extends IRepository<FoodType, String> {

    public Set<FoodType> getAll();

}
