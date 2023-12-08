package com.example.jemo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class HelloController {
 // Fields for data
 // Fields for your controls

 public Button nextButton;
 public Button prevButton;
 public Button newButton;
 public Label label;
 public ListView listView;
public TextField textField;
 public Button DeleteButton;

 public void onActionNew() {
  String whatTheUserTyped = textField.getText();
  listView.getItems().add(whatTheUserTyped);
 }

  public void onActiondelete() {
   String whatTheUserTyped = textField.getText();
   listView.getItems().remove(whatTheUserTyped);
  }



}
//Initialize method
    //Methods for all onActions
