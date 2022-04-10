package za.ac.mycput.Repository.foodType;

import za.ac.mycput.Entity.FoodType;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

public interface IFoodTypeRepository extends IRepository<FoodType, String> {

    public Set<FoodType> getAll();

}
