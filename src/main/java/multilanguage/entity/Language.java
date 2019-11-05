package multilanguage.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "id"})
@Table
public class Language {

    @Id
    @GeneratedValue
    private Long id;

    private String code;
}