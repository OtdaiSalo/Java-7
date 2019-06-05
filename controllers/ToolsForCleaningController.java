package ua.lviv.iot.gym2.controllers;

import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.gym2.exceptions.AirFreshenerNotFoundException;
import ua.lviv.iot.gym2.models.AirFresheners;
import ua.lviv.iot.gym2.repository.AirFreshenersRepository;


@RestController
public class ToolsForCleaningController {
    private final AirFreshenersRepository airFreshenersRepository;

    public ToolsForCleaningController(AirFreshenersRepository airFreshenersRepository) {
        this.airFreshenersRepository = airFreshenersRepository;
    }

    @GetMapping("/airFreshener")
    public Iterable<AirFresheners> all() {
        return airFreshenersRepository.findAll();
    }

    @GetMapping("/airFreshener/{id}")
    public AirFresheners one(@PathVariable Integer id) {
        return airFreshenersRepository.findById(id)
                .orElseThrow(() -> new AirFreshenerNotFoundException(id));
    }

    @PostMapping("/airFreshener")
    public AirFresheners newAirFresheners(@RequestBody AirFresheners newAirFresheners){
        return airFreshenersRepository.save(newAirFresheners);
    }

    @PutMapping("/airFreshener/{id}")
    public AirFresheners replaceAirFresheners(@RequestBody AirFresheners newAirFreshener, @PathVariable Integer id) {
        return airFreshenersRepository.findById(id).map(
                airFreshener -> {
                    airFreshener.setName(newAirFreshener.getName());
                    airFreshener.setPrice(newAirFreshener.getPrice());
                    airFreshener.setProducer(newAirFreshener.getProducer());

                    return airFreshenersRepository.save(airFreshener);
                })
                .orElseGet(() -> {
                    newAirFreshener.setId(id);
                    return airFreshenersRepository.save(newAirFreshener);
                });
    }

    @DeleteMapping("/airFreshener/{id}")
    public void deleteAirFreshener(@PathVariable Integer id) {
        airFreshenersRepository.deleteById(id);
    }
}
