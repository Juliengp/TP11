package bowling;

public class Tour {
	private Lancer lancer1;
	private Lancer lancer2;
	private TypeTour type;
	private int scoreTour = 0;
	
	public Tour(){
		lancer1 = new Lancer();
		lancer2 = new Lancer();
		type = TypeTour.NORMAL;
	}
	
	public int getScoreTour(Lancer l1, Lancer l2){
		int scorel1 = Math.max(0, l1.getNbQuilles());
		int scorel2 = Math.max(0, l2.getNbQuilles());
		
		if(lancer1.getNbQuilles() ==10){
			this.scoreTour = lancer1.getNbQuilles() + scorel1 + scorel2;
		}
		else if(lancer1.getNbQuilles()+lancer2.getNbQuilles()==10){
			this.scoreTour = lancer1.getNbQuilles() + lancer2.getNbQuilles() + scorel1;
		}
		else{this.scoreTour = Math.max(0,lancer1.getNbQuilles()) + Math.max(0, lancer2.getNbQuilles());
	}
		return(this.scoreTour);}
	public void addScoreLancer(int nbQuille) {
		if (nbQuille < 0 || nbQuille > 10){
			throw new IllegalArgumentException("nbQuille must be between 0 and 10");
		}
		if (this.getNumLancer() == 1) {
			addScoreLancer(nbQuille, lancer1);
			if (nbQuille == 10) {
				type = TypeTour.STRIKE;
			}
		} else if (this.getNumLancer() == 2) {
			addScoreLancer(nbQuille, lancer2);
			if (lancer1.getNbQuilles() + lancer2.getNbQuilles() == 10){
				type = TypeTour.SPARE;
			}
		}
	}

	public void addScoreLancer(int nbQuille, Lancer lancer) {
		lancer.setNbQuilles(nbQuille);
	}

	public int getNbQuilleTour() {
		int score = 0;
		if (lancer1.getNbQuilles() != -1) {
			score += lancer1.getNbQuilles();
		}
		if (lancer2.getNbQuilles() != -1) {
			score += lancer2.getNbQuilles();
		}
		return score;
	}

	public int getScoreQuilleLancer(Lancer l) {
		/*
		if (l.getNbQuille() < 0) {
			return 0;
		}
		
		 */
		return l.getNbQuilles();
	}
	public int getScoreQuilleLancer1(){
		return getScoreQuilleLancer(lancer1);
	}

	public int getScoreQuilleLancer2(){
		return getScoreQuilleLancer(lancer2);
	}

	public int getNumLancer() {
		if (lancer1.getNbQuilles() == -1) {
			return 1;
		} else if (lancer2.getNbQuilles() == -1 && lancer1.getNbQuilles() != 10) {
			return 2;
		} else {
			return 0;
		}
	}

	public Lancer getLancer1() {
		return lancer1;
	}

	public Lancer getLancer2() {
		return lancer2;
	}
}

