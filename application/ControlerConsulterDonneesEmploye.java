package application;

import gestion_donnees.DonneesApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControlerConsulterDonneesEmploye {
	
	private DonneesApplication donnees;

    @FXML
    private Button btnConsulter;

    @FXML
    private Button btnExporter;

    @FXML
    private Button btnImporter;

    @FXML
    private Button btnNotice;

    @FXML
    private Button btnQuitter1;

    @FXML
    private Button btnRevenir;
    
    @FXML
    private Button btnSauvegarder;
    
    @FXML
    public Button statistiques;

    @FXML
    private TextArea textAreaConsultation;

    private boolean donneesChargeesLocal; // Pour vérifier si les données sont déjà chargées en local

    private boolean donnesChargeesDistance; // Pour vérifier si les données sont déjà chargées a distance
    

    private boolean premierAffichageOk;

    private boolean donnesChargeesSauvegarder;
    
    @FXML
    void initialize() {
        textAreaConsultation.setEditable(false);
        textAreaConsultation.setText("\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t\tCliquez ici pour afficher les données.");

        premierAffichageOk = false;
        
        // Déclenchement de l'événement au clic sur la TextArea
        textAreaConsultation.setOnMouseClicked(event -> afficherDonnees());
    }
    
    // Méthode pour charger et afficher les données
    private void afficherDonnees() {
        donneesChargeesLocal = ControleurImporterLocal.isDonneesEmployesChargees();
        donnesChargeesDistance = ControleurImporterDistance.isDonneesEmployesChargees();
        donnesChargeesSauvegarder = ControleurPageDeGarde.isDonneesSaveChargees();
        StringBuilder strEmployesLocal = ControleurImporterLocal.getStrEmployes();
        StringBuilder strEmployesDistance = ControleurImporterDistance.getStrEmployes();
        StringBuilder strEmployesSave = ControleurPageDeGarde.getStrEmployes();
        
        if ((!donneesChargeesLocal || strEmployesLocal == null) && (!donnesChargeesDistance || strEmployesDistance == null) 
        	&& (!donnesChargeesSauvegarder || strEmployesSave == null ))  { // Vérifie si les données n'ont pas déjà été chargées en local et a distance
            textAreaConsultation.setText("Les données ne sont pas encore disponibles.");
        }
        
        if (donneesChargeesLocal && !premierAffichageOk) {
            textAreaConsultation.setText(ControleurImporterLocal.getStrEmployes().toString());
            donnees = ControleurImporterLocal.getDonnees();
            premierAffichageOk = true;
        } else if (donnesChargeesDistance && !premierAffichageOk) {
            textAreaConsultation.setText(ControleurImporterDistance.getStrEmployes().toString());
            donnees = ControleurImporterDistance.getDonnees();
            premierAffichageOk = true;
        } else if (donnesChargeesSauvegarder && !premierAffichageOk) {
        	 textAreaConsultation.setText(ControleurPageDeGarde.getStrEmployes().toString());
           donnees = ControleurPageDeGarde.getDonnees();
           premierAffichageOk = true;
        }
    }
    
    @FXML
    void consulter(ActionEvent event) {
    	Main.setPageConsulter();
    }

    @FXML
    void exporter(ActionEvent event) {
    	Main.setPageExporter();

    }

    @FXML
    void importer(ActionEvent event) {
    	Main.setPageImporter();
    }

    @FXML
    void notice(ActionEvent event) {
    	
    }
    
    @FXML
    void statistiques(ActionEvent event) {
    	Main.setPageConsulterStatistiques();
    }

    @FXML
    void quitter(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void revenirEnArriere(ActionEvent event) {
    	Main.setPageConsulter();
    }
    
    @FXML
	void sauvegarder(ActionEvent event) {
		Main.sauvegarder();
	}

}
