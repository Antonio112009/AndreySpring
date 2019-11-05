package multilanguage.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "id"})
@Table(name = "translation")
public class Translation {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.PERSIST
            }
    )
    @JoinColumn(name="language_id")
    private Language language;

    private String text;
}