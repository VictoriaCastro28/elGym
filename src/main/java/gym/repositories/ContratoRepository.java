package gym.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import gym.models.Contrato;
import gym.models.pks.ContratoPk;


public interface ContratoRepository extends JpaRepository<Contrato, ContratoPk> {
	Iterable<Contrato> findByIdSucursal(Integer idSucursal);
	
	
}
