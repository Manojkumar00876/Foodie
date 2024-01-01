package FoodieApk.FoodieApk.Controller;

import FoodieApk.FoodieApk.Services.Services;
import FoodieApk.FoodieApk.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/server")
public class Controller {


    @Autowired
   Services service;
    @GetMapping("/test")
    public String test() {
        return "hello";
    }

    @GetMapping("/getAll")
    public List<Food> getAll(){
        return service.getAll();
    }

    @GetMapping("/getByid/{id}")
    public Food getFoodById(@PathVariable Integer id){
        Optional<Food>  optionalFood = service.getById(id);
        return optionalFood.orElseGet(Food::new);
    }

}
