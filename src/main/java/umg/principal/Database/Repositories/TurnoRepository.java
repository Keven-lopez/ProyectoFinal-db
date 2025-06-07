package umg.principal.Database.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umg.principal.Database.Entities.TurnoEntity;

import java.util.List;

@Repository
public interface TurnoRepository extends JpaRepository<TurnoEntity, Integer> {
    List<TurnoEntity> findByEstadoOrderByIdAsc(String estado);
}
