package pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pcmarket.pcmarket.entity.Characteristics;
@RepositoryRestResource(path = "characteristics")
public interface CharacteristicsRepository extends JpaRepository<Characteristics,Integer> {
}
