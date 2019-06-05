package ua.lviv.iot.gym2.managers;

import ua.lviv.iot.gym2.models.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TrainerImpl implements Trainer {


    public TrainerImpl() {
    }

    @Override
    public final List<ToolsForCleaning> sortByPrice(List<ToolsForCleaning> simulators, final boolean reverse) {

        return getSimulators(simulators, reverse, Comparator.comparing(ToolsForCleaning::getPrice));
    }

    private List<ToolsForCleaning> getSimulators(List<ToolsForCleaning> simulators, boolean reverse, Comparator<ToolsForCleaning> comparing) {
        if (reverse) {
            Collections.sort(simulators, comparing.reversed());
        } else {
            Collections.sort(simulators, comparing);
        }
        return simulators;
    }
}



