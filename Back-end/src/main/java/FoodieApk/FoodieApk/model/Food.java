package FoodieApk.FoodieApk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="Food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private int price;

    @ElementCollection
    @CollectionTable(name = "product_tags", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "tag")
    private List<String> tags;

    private boolean favorite;

    private String imageUrl;

    @ElementCollection
    @CollectionTable(name = "product_origins", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "origin")
    private List<String> origins;

    private double stars;

    private String cookTime;


}
