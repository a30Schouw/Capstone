package za.ac.mycput.Repository.foodType;

/*FoodTypeRepository.java
  Repository for FoodItem
  Author: Anicka Schouw 217284183
  Date: April 2022
*/

import za.ac.mycput.Entity.FoodType;

import java.util.HashSet;
import java.util.Set;

public class FoodTypeRepository implements IFoodTypeRepository{

    private static FoodTypeRepository repository = null;
    private Set<FoodType> foodTypeDB = null;

    private FoodTypeRepository(){
        foodTypeDB = new HashSet<FoodType>();
    }

    public static FoodTypeRepository getRepository(){
        if (repository == null){
            repository = new FoodTypeRepository();
        }
        return repository;
    }

    @Override
    public FoodType create(FoodType foodType){

        boolean made = foodTypeDB.add(foodType);
        if (!made)
            return null;
        return foodType;
    }

    @Override
    public FoodType read(String foodName){

        for (FoodType ft : foodTypeDB){
            if (ft.getFoodName().equals(foodName))
                return ft;
        }
        return null;
    }

    @Override
    public FoodType update(FoodType foodType){

        FoodType oldF = read(foodType.getFoodName());
        if (oldF != null){
            foodTypeDB.remove(oldF);
            foodTypeDB.add(foodType);
            return foodType;
        }
        return null;
    }

    @Override
    public boolean delete(String foodName){
        FoodType foodTypeDelete = read(foodName);
        if (foodTypeDelete == null)
            return false;
        foodTypeDB.remove(foodTypeDelete);
        return true;
    }

    @Override
    public Set<FoodType> getAll(){
        return foodTypeDB;
    }
}
