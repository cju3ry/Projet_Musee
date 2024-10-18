package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControleurImporterLocal {

    @FXML
    private Button btnChoisirFichierConferenciers;

    @FXML
    private Button btnChoisirFichierEmployes;

    @FXML
    private Button btnChoisirFichierExpositions;

    @FXML
    private Button btnChoisirFichierVisites;

    @FXML
    private Button btnConsulter;

    @FXML
    private Button btnExporter;

    @FXML
    private Button btnImporter;

    @FXML
    private Button btnImporterFichiers;

    @FXML
    private Button btnNotice;

    @FXML
    private Button btnQuitter;

    @FXML
    private Button btnRevenirArriere;

    @FXML
    private Button checkExpositions;

    @FXML
    private Button checkFichierConferenciers;

    @FXML
    private Button choisirFicherVisites;

    @FXML
    private Button choisirFichierEmployes;

    @FXML
    void choisirFichierConferencier(ActionEvent event) {

    }

    @FXML
    void choisirFichierEmployes(ActionEvent event) {

    }

    @FXML
    void choisirFichierExpositions(ActionEvent event) {

    }

    @FXML
    void choisirFichierVisites(ActionEvent event) {

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
    void importerFichiers(ActionEvent event) {

    }

    @FXML
    void notice(ActionEvent event) {

    }

    @FXML
    void quitter(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void revenirArriere(ActionEvent event) {
    	Main.setPageImporter();

    }

}
