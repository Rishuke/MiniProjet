public class Simulation{
	private Terrain t1;
	public Pirate[] tab1;
	public Ressource[] tab2;
	
	public Simulation(Terrain t,int m,int n){
		tab1 = new Pirate[n];
		tab2 = new Ressource[m];
		this.t1 = t;
		
		for(int i=0; i<tab2.length;i++){
			tab2[i] = new Piece("Piece",(int)(Math.random()*(1000+1)));
			int lig = (int)(Math.random()*(t1.nbLignes));
			int col = (int)(Math.random()*(t1.nbColonnes));
			while((t1.caseEstVide(lig,col) == false)){
				lig = (int)(Math.random()*(t1.nbLignes));
				col = (int)(Math.random()*(t1.nbColonnes));
			}
			t1.setCase(lig,col,tab2[0]);
			System.out.print(lig+" ");
			System.out.println(col);
		
		}
		
		for(int j=0;j < tab1.length;j++){
			tab1[j] = new Pirate();
		}
	}
	
	public void Recolte( Pirate p){
		if((t1.caseEstVide(p.getX(),p.getY()) == false) && (t1.getCase(p.getX(),p.getY()) instanceof Piece)){
			Ressource r1 = t1.getCase(p.getX(),p.getY());
			System.out.println(r1.toString());
			r1.initialisePosition();
			Ressource r2 = new Viande("Viande",(int)(Math.random()*(1000+1)));
			t1.setCase(p.getX(),p.getY(),r2);
			System.out.println(r2.toString());
		}
		
	}
	
	
	public void Affiche(){
		t1.affiche();
	}
	
	
}
