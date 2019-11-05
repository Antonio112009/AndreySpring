package multilanguage.service;

import multilanguage.entity.Country;
import multilanguage.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> findAllCountries() {
        return countryRepository.findAll();
    }

    public List<Country> findAllCountriesByLanguageCode(String langCode) {
        return countryRepository.findAllByLanguageCode(langCode);
    }
}
