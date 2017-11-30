package gym.repositories;

import org.springframework.data.repository.CrudRepository;

import gym.models.Usuario;

// This will be AUTO IMPLEMENTED by Spring into a Bean called usuarioRepository
// CRUD refers Create, Read, Update, Delete

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
