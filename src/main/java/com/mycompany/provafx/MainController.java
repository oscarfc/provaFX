/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.provafx;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author tss
 */
public class MainController implements Initializable {

    private int counter = 0;
    @FXML
    Label etichetta;

    public MainController() {
        System.out.println("MainController");
    }

    public void onButtonClick() {
        counter++;
        etichetta.setText("Cont:  " + counter);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        System.out.println("initialize...");
        etichetta.setText(LocalDateTime.now().toString());
    }

}
