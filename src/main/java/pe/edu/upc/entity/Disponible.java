package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Disponible")

public class Disponible implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private PrestamistaxServicio prestamistaxServicio;
	
	private boolean disponible;
	
	private Date fechadisponible;

	public Disponible() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Disponible(int id, Servicio servicio, Usuario usuario, PrestamistaxServicio prestamistaxServicio,
			boolean disponible, Date fechadisponible) {
		super();
		this.id = id;
		this.servicio = servicio;
		this.usuario = usuario;
		this.prestamistaxServicio = prestamistaxServicio;
		this.disponible = disponible;
		this.fechadisponible = fechadisponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public PrestamistaxServicio getPrestamistaxServicio() {
		return prestamistaxServicio;
	}

	public void setPrestamistaxServicio(PrestamistaxServicio prestamistaxServicio) {
		this.prestamistaxServicio = prestamistaxServicio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Date getFechadisponible() {
		return fechadisponible;
	}

	public void setFechadisponible(Date fechadisponible) {
		this.fechadisponible = fechadisponible;
	}
	
	

}
