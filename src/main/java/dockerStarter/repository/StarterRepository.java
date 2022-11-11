package dockerStarter.repository;

import dockerStarter.entity.Starter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarterRepository extends JpaRepository<Starter, Integer> {
}
