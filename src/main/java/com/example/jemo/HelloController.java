package com.example.jemo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.collections.ObservableList;

public class HelloController {
 // Fields for data
 // Fields for your controls

 public Button CompleteButton;
 public Button BringBackButton;
 public Button newButton;
 public Label label;
 public ListView listView;
 public ListView listView2;
 public ListView listView3;
public TextField textField;
 public Button DeleteButton;

 public void onActionNew() {
  String whatTheUserTyped = textField.getText();
  listView.getItems().add(whatTheUserTyped);
 }

  public void onActiondelete() {
   ObservableList selectedIndices = listView.getSelectionModel().getSelectedItems();
   for (Object o : selectedIndices) {
    listView.getItems().remove(o);
    listView2.getItems().add(o);
   }
  }

 public void onActionBringBack() {
  ObservableList selectedIndices = listView2.getSelectionModel().getSelectedItems();
  for (Object o : selectedIndices) {
   listView2.getItems().remove(o);
   listView.getItems().add(o);
  }
 }

 public void onActionComplete() {
  ObservableList selectedIndices = listView.getSelectionModel().getSelectedItems();
  for (Object o : selectedIndices) {
   listView.getItems().remove(o);
   listView3.getItems().add(o);
  }
 }



}
//Initialize method
    //Methods for all onActions
