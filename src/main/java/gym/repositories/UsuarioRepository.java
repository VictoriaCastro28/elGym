package gym.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gym.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByNombre(String nombre);
}
