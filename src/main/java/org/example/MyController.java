package org.example;
@RestController
public class MyController {
    private final LocationService locationService;
    private final WeatherService weatherService;
    private final PersonService personService;

    public MyController(LocationService locationService, WeatherService weatherService, PersonService personService) {
        this.locationService = locationService;
        this.weatherService = weatherService;
        this.personService = personService;
    }

    @GetMapping("/location")
    public Location getLocation() {
        return locationService.getLocation(0, 0);
    }

    @GetMapping("/weather")
    public Weather getWeather() {
        return weatherService.getWeather(0, 0);
    }

    @PostMapping("/person")
    public Person savePerson(@RequestBody Person person) {
        return personService.getPerson(person.getName(), person.getAge(), person.getLocation());
    }
}
