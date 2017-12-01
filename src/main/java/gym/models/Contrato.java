package gym.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import gym.models.pks.ContratoPk;



@SuppressWarnings("serial")
@Entity
public class Contrato implements Serializable{
	

	@EmbeddedId
	private ContratoPk contratoPk;
	
	@Column(name = "idMembresia")
	private Integer idMembresia;
	
	@Column(name = "idSucursal")
	private Integer idSucursal;
	
	
	public Contrato() {
	}

	public Contrato(ContratoPk contratoPk) {
		this.contratoPk = contratoPk;
	}
	
	///////////////////////////////////////////////////////////////////
	@ManyToOne
    @JoinColumn(name = "idUsuario" , insertable=false, updatable=false)
    private Usuario usuario;
	//////////////////////////////////////////////////////////////////
	@ManyToOne
    @JoinColumn(name = "idMembresia" , insertable=false, updatable=false)
    private Membresia membresia;
	//////////////////////////////////////////////////////////////////
	@ManyToOne
    @JoinColumn(name = "idSucursal" , insertable=false, updatable=false)
    private Sucursal sucursal;
	//////////////////////////////////////////////////////////////////
	
	public ContratoPk getContratoPk() {
		return contratoPk;
	}
	public void setContratoPk(ContratoPk contratoPk) {
		this.contratoPk = contratoPk;
	}
	public Integer getIdMembresia() {
		return idMembresia;
	}
	public void setIdMembresia(Integer idMembresia) {
		this.idMembresia = idMembresia;
	}
	public Integer getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}
	
	
		
}


