package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PrestamistaxServicio")

public class PrestamistaxServicio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="resenia", nullable=false, length=50)
	private String resenia;
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Prestamista prestamista;
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Disponible disponible;
	
	private int precio;

	public PrestamistaxServicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrestamistaxServicio(int id, String resenia, Prestamista prestamista, Servicio servicio,
			Disponible disponible, int precio) {
		super();
		this.id = id;
		this.resenia = resenia;
		this.prestamista = prestamista;
		this.servicio = servicio;
		this.disponible = disponible;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResenia() {
		return resenia;
	}

	public void setResenia(String resenia) {
		this.resenia = resenia;
	}

	public Prestamista getPrestamista() {
		return prestamista;
	}

	public void setPrestamista(Prestamista prestamista) {
		this.prestamista = prestamista;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Disponible getDisponible() {
		return disponible;
	}

	public void setDisponible(Disponible disponible) {
		this.disponible = disponible;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	

}
