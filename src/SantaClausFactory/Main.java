package SantaClausFactory;

public class Main {
	
	public static void main(String[] args) {
		Singleton santaClaus = Singleton.getInstance(); 
        santaClaus.postMessage("said:");
        

		
		System.out.println();
        
        

		
		
		SantaClaus s2 = SantaClaus.getInstance();
		SantaClaus s3 = SantaClaus.getInstance();
		System.out.println(s2);
		System.out.println(s3);
		
		
		System.out.println();
       
        
        
        
        
        Dwarves workerDwarf = new Dwarves();   
        Observer obs1 = new DwarvesEmployees("Dwarf Ivan");
        Observer obs2 = new DwarvesEmployees("Dwarf Petar");
        Observer obs3 = new DwarvesEmployees("Dwarf Dragan");

        workerDwarf.hireDwarf(obs1);
        workerDwarf.hireDwarf(obs2);
        workerDwarf.hireDwarf(obs3);
        
        workerDwarf.hireDwarf("for the new process.");
        workerDwarf.removeDwarf(obs1); 
        
        
        
        
        System.out.println();


		MagicBoard magicBoard1 = new MagicBoard();
		
		
		


		Dwarf d1 = new Dwarf();

		magicBoard1.attach(d1);

		d1.attachBoard(magicBoard1);

 
		System.out.println();

		santaNeedsDollCommand iNeedDoll = new santaNeedsDollCommand(magicBoard1);
		santaNeedsBikeCommand iNeedBike = new santaNeedsBikeCommand(magicBoard1);
		santaDontWantAnythingCommand iDontNeedAnything = new santaDontWantAnythingCommand(magicBoard1);


		s2.setCommand(iNeedDoll);
		
		s2.setCommand(iNeedBike);


		s2.executeOnMagicBoard();

		

		Factory toy1 = d1.getToy("Doll");
		
		

		System.out.println();
		
		
		
		
		toy1.create();
		Factory toy2 = d1.getToy("Bike");
		toy2.create();
		
		System.out.println();
	

		s2.setCommand(iDontNeedAnything);
		s2.executeOnMagicBoard();
	}
}
	

