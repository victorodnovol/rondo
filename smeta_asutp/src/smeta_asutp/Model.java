package smeta_asutp;

import java.io.Serializable;
import java.util;


public class Smeta extends Observable implements Serializable {
	/**
	 * This adds UID for serialization
	 */
	private static final long serialVersionUID = 1L;
	
	private Float price = 0f;
	private ArrayList<UpdateListener> list;

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
	private void notifyUpdateListeners(){
		// notifies every update listener on list (observers), that model was updated
		
	}
	
	public void addUpdateListener ( UpdateListener l ){
		// this adds another listener to the list
		
	}
	

}
