package sas.midka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sas.midka.entity.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity,Long> {
}
