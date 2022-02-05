package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

public class Mamifero {
	private String identificador;
	private String especie;
	private Mamifero padre;
	private Mamifero madre;

	public Mamifero getPadre() {
		return padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public Mamifero(String string) {
		this.identificador = string;
	}

	public Mamifero() {
		this.identificador = "anonimo";
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;

	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;

	}

	public Object getAbuelaMaterna() {
		if (this.getMadre() != null)
			return this.getMadre().getMadre();
		else
			return null;
	}

	public Object getAbuelaPaterna() {
		if(this.getPadre() != null)
			return this.getPadre().getMadre();
		return
			null;
	}

	public Object getAbueloMaterno() {
		if (this.getMadre() != null)
			return this.getMadre().getPadre();
		else
			return null;
	}

	public Object getAbueloPaterno() {
		if (this.getPadre() != null)
			return this.getPadre().getPadre();
		else
			return null;
	}

	public void setEspecie(String string) {
		this.especie = string;
		
	}

	public Object getEspecie() {
		return this.especie;
	}

	public void setIdentificador(String string) {
		this.identificador = string;
	}

	public Object getIdentificador() {
		return this.identificador;
	}

	public Boolean tieneComoAncestroA(Mamifero ancestro) {
		boolean ramaPadre = false;
		boolean ramaMadre = false;
		if(this.getPadre() == null && this.getMadre() == null)
			return false;
		if (this.getPadre() != null) { 
				if(this.getPadre().equals(ancestro))//usar equals no ==
					return true;
				ramaPadre = this.getPadre().tieneComoAncestroA(ancestro);}
		if (this.getMadre() != null) {
				if(this.getMadre().equals(ancestro))
					return true;
				ramaMadre = this.getMadre().tieneComoAncestroA(ancestro);}
		return(ramaMadre || ramaPadre);

	}
}
