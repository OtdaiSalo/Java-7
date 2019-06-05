package ua.lviv.iot.gym2.repository;

import ua.lviv.iot.gym2.models.AirFresheners;

import javax.transaction.Transactional;

@Transactional
public interface AirFreshenersRepository extends ToolsForCleaningRepository<AirFresheners> {
}
