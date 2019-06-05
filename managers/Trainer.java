package ua.lviv.iot.gym2.managers;

import ua.lviv.iot.gym2.models.ToolsForCleaning;

import java.util.List;

public interface Trainer {

    List<ToolsForCleaning> sortByPrice(List<ToolsForCleaning> simulators, boolean reverse);

}
