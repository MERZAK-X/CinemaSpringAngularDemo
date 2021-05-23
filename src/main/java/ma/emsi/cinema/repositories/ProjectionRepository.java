package ma.emsi.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import ma.emsi.cinema.entities.Projection;

public interface ProjectionRepository extends JpaRepository<Projection, Long> {

}
