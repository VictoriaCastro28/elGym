package gym.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import gym.models.Admin;
import java.lang.String;


public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findByNombre(String nombre);

}
