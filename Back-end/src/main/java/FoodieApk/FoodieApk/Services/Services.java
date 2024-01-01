package FoodieApk.FoodieApk.Services;

import FoodieApk.FoodieApk.Dao.Dao;
import FoodieApk.FoodieApk.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Services {

    @Autowired
    Dao dao;

    public List<Food> getAll() {
        return dao.findAll();
    }

    public Optional<Food> getById(Integer id){
        return Optional.of(dao.getById(id));
    }

}
