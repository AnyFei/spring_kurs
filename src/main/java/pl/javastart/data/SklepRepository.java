package pl.javastart.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.javastart.model.Sklep;

@Repository
public interface SklepRepository extends JpaRepository<Sklep, Long>{
}