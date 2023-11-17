package bowling;

public class Lancer {
	private int nbQuilles;
	
	public Lancer(int nbQuilles){
		if(nbQuilles>10 || nbQuilles<-1){
			throw new IllegalArgumentException("nombre de quilles tombées incohérent");
		}
		else{this.nbQuilles=nbQuilles;}
	}
	
	public Lancer(){
		this(-1);
	}
	
	public int getNbQuilles(){
		return this.nbQuilles;
	}

	public void setNbQuilles(int nvnbQuilles) {
		if (nvnbQuilles>10 || nvnbQuilles<0) {
			throw new IllegalArgumentException("nombre de quilles incohérent");
		}
		else{this.nbQuilles = nvnbQuilles;}
	}
}
