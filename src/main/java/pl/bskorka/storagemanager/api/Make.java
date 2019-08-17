package pl.bskorka.storagemanager.api;

import lombok.Data;
import pl.bskorka.storagemanager.api.enums.PartCategory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Make {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer makeId;

    private PartCategory partCategory;

    private String name;

}
