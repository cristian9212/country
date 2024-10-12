package countriesproject.countriesproject.CountriesController;

import countriesproject.countriesproject.entities.CountriesEntity;
import countriesproject.countriesproject.services.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/api/v1/countries")
public class CountriesController {

    private final CountriesService countryService;

    @Autowired
    public CountriesController(CountriesService countryService){
        this.countryService = countryService;
    }

    @GetMapping
    public List<CountriesEntity> getCountries(){
        return countryService.getAllCountries();

    }
    @GetMapping("/{id]")
    public Optional<CountriesEntity> getCountry(@PathVariable UUID id){
        return countryService.getCountryById(id);
    }
    @PostMapping
    public String createCountry(){
        return "POST COUNTRY";
    }
    @PutMapping("/{id}")
    public String updateCountry(){
        return " PUT COUNTRY";
    }

    @DeleteMapping("/{id}")
    public String deleteCountry(){
        return "DELETE COUNTRY";
    }

}
