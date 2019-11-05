package multilanguage.controller;

import multilanguage.entity.Country;
import multilanguage.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/test1")
    public List<Country> all() {
        return countryService.findAllCountries();
    }

    @GetMapping("/test2")
    public List<Country> allByLanguageCode(@RequestParam(name = "lang") String langCode){
        return countryService.findAllCountriesByLanguageCode(langCode);
    }
}
