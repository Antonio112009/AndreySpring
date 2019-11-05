package multilanguage.repository;


import multilanguage.entity.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

    List<Country> findAll();

    @Query("SELECT cntr FROM Country as cntr " +

            "join fetch cntr.countryName as cntrname " +
            "join fetch cntrname.translations as trans " +

            "where trans.language.code = ?1 ")
    List<Country> findAllByLanguageCode(String langCode);
}
