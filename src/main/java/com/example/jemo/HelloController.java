package com.example.jemo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.collections.ObservableList;

import java.io.*;

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
 public Button RedoButton;

    public HelloController() throws IOException {
    }

    public void initialize() throws Exception {
     restoreData();
    }

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

 public void onActionComplete() throws Exception {
  ObservableList selectedIndices = listView.getSelectionModel().getSelectedItems();
  for (Object o : selectedIndices) {
   listView.getItems().remove(o);
   listView3.getItems().add(o);
   this.saveData();
  }
 }

 public void onActionRedo() {
  ObservableList selectedIndices = listView3.getSelectionModel().getSelectedItems();
  for (Object o : selectedIndices) {
   listView3.getItems().remove(o);
   listView.getItems().add(o);
  }
 }

  public void saveData() throws Exception {
   File fileForData = new File( "Jaden");
   FileOutputStream outputStream = new FileOutputStream(fileForData);
   ObjectOutputStream objOutputStream = new ObjectOutputStream(outputStream);
   objOutputStream.writeObject(listView3);
   objOutputStream.flush();
  }

 void restoreData() throws Exception {
  File fileForData = new File("Jaden");
  FileInputStream inputStream = new FileInputStream(fileForData);
  ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
  int numOfSavedObjects = objInputStream.readInt();
  for (int i = 0; i < numOfSavedObjects; i = i + 1) {
   String listText = (String) objInputStream.readObject();

   ;
  }
  inputStream.close();}}
 // readObjects from objInputStream and store those objects into your fields




//Initialize method
    //Methods for all onActions
