package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControleurImporter {

    @FXML
    private Button btnConsulter;

    @FXML
    private Button btnExporter;

    @FXML
    private Button btnImporter;

    @FXML
    private Button btnImporterDistance;

    @FXML
    private Button btnImporterLocal;

    @FXML
    private Button btnNotice;

    @FXML
    private Button btnQuitter;
    
    @FXML
    private Button btnRevenirArriere;

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
    void quitter(ActionEvent event) {
    	System.exit(0);
    }
    @FXML
    void importerDistance(ActionEvent event) {
    	Main.setPageImporterDistance();
    }

    @FXML
    void importerLocal(ActionEvent event) {
    	Main.setPageImporterLocal();

    }
    
    @FXML
    void revenirArriere(ActionEvent event) {
    	Main.setPageDeGarde();
    }

   

}