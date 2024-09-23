package team7.BW5_team_7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team7.BW5_team_7.entities.Utente;

import java.util.UUID;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, UUID> {
}
