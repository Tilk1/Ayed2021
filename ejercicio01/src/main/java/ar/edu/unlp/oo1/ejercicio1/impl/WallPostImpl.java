package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * /*
* Permite construir una instancia del WallpostImpl.
* Luego de la invocación, debe tener como texto: “Undefined post”,
* no debe estar marcado como destacado y la cantidad de “Me gusta” deben ser 0.
* 
* 
*/

public class WallPostImpl implements WallPost {
	
	private String text = "Undefined post";
	private int likes = 0;
	private boolean featured;

	public void setFeatured(boolean featured) {
		this.featured = featured;
	}

	/**
	 * Complete con su implementación
	 */


    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }


	public String getText() {
		return this.text;
	}


	public void setText(String text) {
		this.text = text;
		
	}

	public int getLikes() {
		return this.likes;
	}

	public WallPost like() { 
		this.likes++;
		return this;
	}

	public WallPost dislike() { 
		if(this.getLikes() != 0)
			this.likes--;
		return this;
	}

	public boolean isFeatured() {
		return this.featured;
	}

	public WallPost toggleFeatured() {
		setFeatured(!featured);
		return this;
	}

	@Override
	public WallPost text(String text) {
		this.setText(text);
		return this;
	}    

}
