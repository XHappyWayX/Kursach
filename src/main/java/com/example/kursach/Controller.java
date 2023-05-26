package com.example.kursach;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ChoiceBox<String> condChoiceBox1;
    @FXML
    private ChoiceBox<String> condChoiceBox2;
    @FXML
    private ChoiceBox<String> condChoiceBox3;
    @FXML
    private ChoiceBox<String> condChoiceBox4;
    @FXML
    private ChoiceBox<String> condChoiceBox5;
    @FXML
    private ChoiceBox<String> condChoiceBox6;
    @FXML
    private ChoiceBox<String> condChoiceBox7;
    @FXML
    private ChoiceBox<String> condChoiceBox8;
    @FXML
    private ChoiceBox<String> condChoiceBox9;
    private final String[] condition = {"Арендоване","Вільне"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        condChoiceBox1.getItems().addAll(condition);
        condChoiceBox2.getItems().addAll(condition);
        condChoiceBox3.getItems().addAll(condition);
        condChoiceBox4.getItems().addAll(condition);
        condChoiceBox5.getItems().addAll(condition);
        condChoiceBox6.getItems().addAll(condition);
        condChoiceBox7.getItems().addAll(condition);
        condChoiceBox8.getItems().addAll(condition);
        condChoiceBox9.getItems().addAll(condition);
    }
}