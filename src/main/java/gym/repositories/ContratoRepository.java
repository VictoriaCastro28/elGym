package gym.repositories;

import org.springframework.data.repository.CrudRepository;

import gym.models.Contrato;
import gym.models.pks.ContratoPk;

// This will be AUTO IMPLEMENTED by Spring into a Bean called usuarioRepository
// CRUD refers Create, Read, Update, Delete

public interface ContratoRepository extends CrudRepository<Contrato, ContratoPk> {

}
