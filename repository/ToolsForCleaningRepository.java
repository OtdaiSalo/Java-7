package ua.lviv.iot.gym2.repository;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.gym2.models.ToolsForCleaning;

public interface ToolsForCleaningRepository<T extends ToolsForCleaning> extends CrudRepository<T, Integer> {
}
