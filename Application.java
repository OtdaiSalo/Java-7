package ua.lviv.iot.gym2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.gym2.enums.Toxicity;
import ua.lviv.iot.gym2.models.AirFresheners;
import ua.lviv.iot.gym2.models.ToolsForCleaning;
import ua.lviv.iot.gym2.repository.AirFreshenersRepository;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(final AirFreshenersRepository airFreshenersRepository) {

        return (args) -> {

//           airFreshenersRepository.save(new AirFresheners("Rose-Flavour", "Poland", 34.55, Toxicity.LOW));

            airFreshenersRepository.findAll().forEach(System.out::println);
        };
    }
}
