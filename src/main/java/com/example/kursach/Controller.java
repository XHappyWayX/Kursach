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
    @FXML
    private ChoiceBox<String> fixChoiceBox1;
    @FXML
    private ChoiceBox<String> fixChoiceBox2;
    @FXML
    private ChoiceBox<String> fixChoiceBox3;
    @FXML
    private ChoiceBox<String> fixChoiceBox4;
    @FXML
    private ChoiceBox<String> fixChoiceBox5;
    @FXML
    private ChoiceBox<String> fixChoiceBox6;
    @FXML
    private ChoiceBox<String> fixChoiceBox7;
    @FXML
    private ChoiceBox<String> fixChoiceBox8;
    @FXML
    private ChoiceBox<String> fixChoiceBox9;
    private final String[] condition = {"Арендоване","Вільне"};
    private final String[] fixcondition = {"Неушкоджене","Пошкоджене","Потребує ремонту"};
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

        fixChoiceBox1.getItems().addAll(fixcondition);
        fixChoiceBox2.getItems().addAll(fixcondition);
        fixChoiceBox3.getItems().addAll(fixcondition);
        fixChoiceBox4.getItems().addAll(fixcondition);
        fixChoiceBox5.getItems().addAll(fixcondition);
        fixChoiceBox6.getItems().addAll(fixcondition);
        fixChoiceBox7.getItems().addAll(fixcondition);
        fixChoiceBox8.getItems().addAll(fixcondition);
        fixChoiceBox9.getItems().addAll(fixcondition);

    }
}