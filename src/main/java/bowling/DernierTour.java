package bowling;

public class DernierTour extends Tour{
	Lancer lancer3;

	public DernierTour() {
		lancer3 = new Lancer();
	}

	@Override
	public int getScoreTour(Lancer l1, Lancer l2) {

		return Math.max(0, getLancer1().getNbQuilles()) + Math.max(0, getLancer2().getNbQuilles()) + Math.max(0, lancer3.getNbQuilles());
	}

	public void addScoreLancer(int nbQuille) {
		if (this.getNumLancer() == 3) {
			super.addScoreLancer(nbQuille, lancer3);
		} else {
			super.addScoreLancer(nbQuille);
		}
	}

	public int getNbQuilleTour() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	@Override
	public int getNumLancer() {
		if (this.getLancer1().getNbQuilles() == -1) {
			return 1;
		} else if (this.getLancer2().getNbQuilles() == -1 ) {
			return 2;
		} else if (this.lancer3.getNbQuilles() == -1 && (this.getLancer1().getNbQuilles() + this.getLancer2().getNbQuilles()) >=10 ) {
			return 3;
		} else {
			return 0;
		}
	}

	public int getScoreQuilleLancer3(){
		return super.getScoreQuilleLancer(lancer3);
	}
}

