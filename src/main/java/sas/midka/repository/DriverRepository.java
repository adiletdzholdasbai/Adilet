package sas.midka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sas.midka.entity.DriverEntity;

@Repository
public interface DriverRepository extends JpaRepository<DriverEntity,Long> {
}
