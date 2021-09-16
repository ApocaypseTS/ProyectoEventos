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
@Table(name="Reserva")

public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Ubicacion ubicacion;
	
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Prestamista prestamista;
	
	private Date reserva;

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int id, Servicio servicio, Ubicacion ubicacion, Cliente cliente, Prestamista prestamista,
			Date reserva) {
		super();
		this.id = id;
		this.servicio = servicio;
		this.ubicacion = ubicacion;
		this.cliente = cliente;
		this.prestamista = prestamista;
		this.reserva = reserva;
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

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Prestamista getPrestamista() {
		return prestamista;
	}

	public void setPrestamista(Prestamista prestamista) {
		this.prestamista = prestamista;
	}

	public Date getReserva() {
		return reserva;
	}

	public void setReserva(Date reserva) {
		this.reserva = reserva;
	}
	
	

}
