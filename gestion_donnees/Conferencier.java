
package gestion_donnees;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Conferencier {
	private String id;
	private String nom;
	private String prenom;
	private boolean estEmploye;
	private ArrayList<Date> indisponibilite;
	private String[] specialite;
	private String numTel;
	
	public Conferencier(String id, String nom, String prenom, boolean estEmploye, ArrayList<Date> indisponibilite, String[] specialite, String numTel) throws ConferencierException {
		if (id.length() != 7 || id == null) {
			throw new ConferencierException();
		}
		
		for (Conferencier conferencier : gestionDonnees.conferenciers) {
			if (conferencier.getId() == id) {
				throw new ConferencierException();
			}
			
			if (conferencier.getPrenom() == prenom) {
				if (conferencier.getNom() == nom) {
					throw new ConferencierException();
				}
			}
		}
		
		if (specialite.length > 6) {
			throw new ConferencierException();
		}
		
		if (numTel.length() != 10 || numTel == null) {
			throw new ConferencierException();
		}
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.estEmploye = estEmploye;
		this.indisponibilite = indisponibilite;
		this.specialite = specialite;
		gestionDonnees.conferenciers.add(this);
	}
	
	private boolean indisponibiliteOk(ArrayList<String> indisponibilite) {
		SimpleDateFormat formatIndisponibilite = new SimpleDateFormat("dd/MM/yyyy");
		formatIndisponibilite.setLenient(false);
		
		if () {
			
		}
		
		return false;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String toString() {
		return "	Conférencier/Conférencière : " + this.nom + " " + this.prenom;
	}
	
    public static void main(String[] args) throws EmployeException, ExpositionException, ConferencierException, VisiteException {
    	gestionDonnees.initialisesDonnees();
       
        ArrayList<Date> indisponibilite = new ArrayList<>();
        
        indisponibilite.add(new Date()); // Exemple d'une date actuelle

        String[] specialites = {"Java", "AI", "Data Science"};

        Conferencier conferencier = new Conferencier( "ABC1234","Dupont","Jean",true,indisponibilite,specialites,"0612345678");
        
        System.out.println(conferencier.toString());
            
        
    }
}
