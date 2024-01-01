package FoodieApk.FoodieApk.Dao;

import FoodieApk.FoodieApk.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Dao extends JpaRepository<Food,Integer> {

}
