package ma.emsi.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.emsi.cinema.entities.Place;

@RepositoryRestResource
public interface PlaceRepository extends JpaRepository<Place, Long> {

}
