public class TestSimulation{
	public static void main(String[] args){
		Terrain t = new Terrain(5,5);
		Simulation s1;
		s1 = new Simulation(t,10,10);
		s1.Affiche();
		
		System.out.println(s1.tab1[0].toString());
		s1.tab1[0].seDeplacer(1,1);
		System.out.println(s1.tab1[0].toString());
		
		
		Ressource r1 = new Piece("Piece",10);
		Ressource r2 = new Viande("Viande",2);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(s1.tab2[0].toString());
		
		s1.Recolte(s1.tab1[0]);
		s1.Affiche();
		
	}
}
