package pl.bskorka.storagemanager.api;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer partId;

    private String name;

    private String type; // enum

    private String make;

    private String model;

    private Integer numerOfElements;

    private Double pricePerElement;

    private String storageSpace;

    private Double profitMargin;

    private Double priceWithProfitMargin;

}
