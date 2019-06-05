package ua.lviv.iot.gym2.models;

import ua.lviv.iot.gym2.enums.Toxicity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class AirFresheners extends ToolsForCleaning{

    private Toxicity toxicity;

    public AirFresheners(){
    }

    public AirFresheners(String name, String producer, double price, Toxicity toxicity){
        super(name, producer, price);
        this.toxicity = toxicity;
    }

    public Toxicity getToxicity() {
        return toxicity;
    }

    public void setToxicity(Toxicity toxicity) {
        this.toxicity = toxicity;
    }
}
