package gym.models.pks;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContratoPk implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "idUsuario")
    private Integer idUsuario;
	
    @Column(name = "fecha")
    private String fecha;

	public ContratoPk() {
	}
	
	public ContratoPk(Integer idUsuario, String fecha) {
		this.idUsuario = idUsuario;
		this.fecha = fecha;
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
    
    
    
}
