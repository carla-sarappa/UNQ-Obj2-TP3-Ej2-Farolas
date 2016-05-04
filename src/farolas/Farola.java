package farolas;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	
	Boolean prendida = false;
	List<Farola> vecinas = new ArrayList<Farola>();
	
	public void prender() {
		if(!prendida) {
			prendida = true;
			for(Farola farola : vecinas){
				farola.prender();
			}
		} 
	}
	
	public void apagar() {
		prendida = false;
	}

	public List<Farola> getVecinas() {
		return vecinas;
	}

	public void setVecinas(List<Farola> vecinas) {
		this.vecinas = vecinas;
	}

	public boolean isPrendida() {
		return prendida;
	}
	
	public void conectarCon(Farola farola){
		vecinas.add(farola);
		
	}

}
