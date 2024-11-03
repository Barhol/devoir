package exfinal;

public class Test {
	
	
	
    public static void main(String[] args) {
        Employe[] employes = {
            new Developpeur("Alice", 5000, "Java"),
            new Manager("Bob", 7000, 5)
        };

        for (Employe emp : employes) {
            emp.afficherInfos();
        }
        
        
        
        Employe emp = new Developpeur("Alice", 5000, "Java");
        emp.afficherInfos(); 
        
        
        for (Employe emp1 : employes) {
            if (emp1 instanceof Developpeur) {
                ((Developpeur) emp1).afficherLangage(); 
            } else if (emp1 instanceof Manager) {
                ((Manager) emp1).gererEquipe(); 
            }
        }

    }

  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	

	
	
	
	
	

