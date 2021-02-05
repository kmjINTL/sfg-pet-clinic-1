package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "types")// closing #36
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    //added method on the 5 Feb 2020.
    @Override
    public String toString() {
        return name;
    }
}
