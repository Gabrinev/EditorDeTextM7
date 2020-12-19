package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Font;


public class Controller {
    @FXML
    MenuBar menu;
    @FXML
    Menu menuFile;
    @FXML
    Menu menuEdit;
    @FXML
    Menu menuOptions;
    @FXML
    Menu menuOptionsFont;
    @FXML
    Menu menuOptionsSize;
    @FXML
    Menu menuHelp;
    @FXML
    MenuItem menuFileClose;
    @FXML
    MenuItem menuEditCopy;
    @FXML
    MenuItem menuEditCut;
    @FXML
    MenuItem menuEditPaste;
    @FXML
    MenuItem menuEditUndo;
    @FXML
    MenuItem menuOptionsFontLSB;
    @FXML
    MenuItem menuOptionsFontNSI;
    @FXML
    MenuItem menuOptionsSize10;
    @FXML
    MenuItem menuOptionsSize40;
    @FXML
    MenuItem menuHelpAbout;
    @FXML
    TextArea textArea;

    Font noto = new Font("Noto Sans Italic",14);
    Font liberation = new Font("Liberation Serif Bold",14);


    public void onClose(){
        Platform.exit();
    }

    public void onCopy(){
        textArea.copy();
    }
    public void onCut(){
        textArea.cut();
    }
    public void onPaste(){
        textArea.paste();
    }
    public void onUndo(){
        textArea.undo();
    }

    public void onFontLSB(){
        textArea.setFont(liberation);
    }
    public void onFontNSI(){
        textArea.setFont(noto);
    }
    public void onSize10(){
        textArea.setStyle("-fx-font-size: 10");
    }
    public void onSize40(){
        textArea.setStyle("-fx-font-size: 40");
    }

    public void onAbout(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("About");
        alert.setContentText("Creado por Gabriele en 2020 este procesador de texto se humilla al de Microsoft");
        alert.showAndWait();
    }



}
