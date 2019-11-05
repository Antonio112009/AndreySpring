package multilanguage.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "id"})
@Table
public class CountryName {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "countryName_generator")
    @SequenceGenerator(name="countryName_generator", sequenceName = "seq_countryName", allocationSize = 1)
    private Long id;

    //Translation
    @OneToMany(
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.PERSIST
            }, fetch = FetchType.LAZY
    )
    private Set<Translation> translations = new HashSet<>();

    public void addTranslation(Translation translation) {
        translations.add(translation);
    }

    public void removeTranslation(Translation translation) {
        translations.remove(translation);
    }
}
