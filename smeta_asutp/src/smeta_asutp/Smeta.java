package smeta_asutp;

import java.io.Serializable;
import java.util.*;


public class Smeta extends Observable implements Serializable {
	/**
	 * This adds UID for serialization
	 */
	private static final long serialVersionUID = 1L;
	
	private Float price = 0f;

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
	public void calculate (){
		
	}
		

}
