package pl.bskorka.storagemanager.api;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PhoneModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer phoneModelId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="makeId")
    private Make make;

    private String name;

}
