package com.example.student_management_system;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private Label title;

    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> idColumn;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> majorColumn;
    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField majorField;

    private ObservableList<Student> studentData = FXCollections.observableArrayList();


    @FXML
    private void addStudent(ActionEvent event) {
        // Create a new Student from text field data
        // Add the new Student to the table
        if (idField.getText().isEmpty() || nameField.getText().isEmpty() || majorField.getText().isEmpty()) {
            System.out.println("Enter some data");
        } else {
            Student s = new Student(idField.getText(), nameField.getText(), majorField.getText());
            studentData.add(s);
            clearFields();
        }
    }
    @FXML
    private void deleteStudent(ActionEvent event) {
        // Delete the selected Student from the table
        try {
            Student selectedItem = studentTable.getSelectionModel().getSelectedItem();
            studentTable.getItems().remove(selectedItem);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @FXML
    public void initialize() {
        // Initialize the table
        title.setText("Student Management System");

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        majorColumn.setCellValueFactory(new PropertyValueFactory<>("major"));

        studentTable.setItems(studentData);
    }

    public void clearFields () {
        idField.clear();
        nameField.clear();
        majorField.clear();
    }
}