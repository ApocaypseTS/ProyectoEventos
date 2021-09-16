package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Disponible")

public class Disponible implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private boolean bdisponible;
	
	private Date fechadisponible;

	public Disponible() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Disponible(int id, boolean bdisponible, Date fechadisponible) {
		super();
		this.id = id;
		this.bdisponible = bdisponible;
		this.fechadisponible = fechadisponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isBdisponible() {
		return bdisponible;
	}

	public void setBdisponible(boolean bdisponible) {
		this.bdisponible = bdisponible;
	}

	public Date getFechadisponible() {
		return fechadisponible;
	}

	public void setFechadisponible(Date fechadisponible) {
		this.fechadisponible = fechadisponible;
	}
	
	

}
