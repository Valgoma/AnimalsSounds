package com.example.animalssounds;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class HelloController {

    @FXML
    private Button butt;

    @FXML
    private RadioButton cat;

    @FXML
    private RadioButton dog;

    @FXML
    private RadioButton rooster;

    @FXML
    private TextArea speech;
    @FXML
    private ToggleGroup xxx;
  //  Animal.AnimalType animal = Animal.AnimalType.Dog;

    @FXML
   void say(ActionEvent event) {

        RadioButton selection = (RadioButton) xxx.getSelectedToggle();
        if (selection == dog)
            {
                    speech.setText(Dog.dogSpeaks());}
        if (selection == cat)
                    speech.setText(Cat.catSpeaks());
        if (selection == rooster)
                    speech.setText(Rooster.roosterSpeaks());

            }
    }


