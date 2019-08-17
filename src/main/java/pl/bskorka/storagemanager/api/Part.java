package pl.bskorka.storagemanager.api;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import pl.bskorka.storagemanager.api.enums.State;
import pl.bskorka.storagemanager.api.enums.Type;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer partId;

    private String name;

    private State state;

    private Type type;

    private String make;

    private String model;

    private Integer quantity;

    private Double pricePerElement;

    private String storageSpace;

    private Double profitMargin;

    private Double priceWithProfitMargin;

    private String photoUrl;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date modifiedAt;

}
