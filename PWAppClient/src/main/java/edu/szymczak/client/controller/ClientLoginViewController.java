package edu.szymczak.client.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientLoginViewController {

    @FXML
    TextField loginInput;

    @FXML
    TextField passwordInput;

    @FXML
    Button submitButton;

    @FXML
    Label warningLabel;

    public void submitButtonClick(ActionEvent event) {
        warningLabel.setText("");

        try {
            Parent ClientPanelViewParent = FXMLLoader.load(getClass().getResource("/ClientPanelView.fxml"));
            Scene ClientPanelViewScene = new Scene(ClientPanelViewParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(ClientPanelViewScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
            warningLabel.setText("An error occured. Please try again.");
        }
    }
}