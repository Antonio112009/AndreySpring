package multilanguage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_generator")
    @SequenceGenerator(name="country_generator", sequenceName = "seq_country", allocationSize = 1)
    private Long id;

    @Column
    private Short code;

    @Column
    private String locality;

    @Column(name = "alpha_2")
    private String codeAlpha2;

    @Column(name = "alpha_3")
    private String codeAlpha3;

    /*
    Country name
     */
    @OneToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.PERSIST
            })
    @JoinColumn(name = "country_name_id")
    private CountryName countryName;
}
