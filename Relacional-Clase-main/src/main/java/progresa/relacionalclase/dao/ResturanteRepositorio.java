package progresa.relacionalclase.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import progresa.relacionalclase.entity.Restaurante;

import java.util.Optional;

@RepositoryRestResource

public interface ResturanteRepositorio extends JpaRepository<Restaurante,Long> {
    Optional<Restaurante> findAllByNombre(String nombre);
    boolean existsByNombre(String nombre);

}
