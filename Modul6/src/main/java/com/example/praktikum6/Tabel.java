package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();

        TableColumn<Mahasiswa, String> kolomNim = new TableColumn<>("NIM");
        kolomNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("Nama");
        kolomNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tabel.getColumns().add(kolomNim);
        tabel.getColumns().add(kolomNama);

        tabel.getItems().add(new Mahasiswa(1, "11111112", "Fatih"));
        tabel.getItems().add(new Mahasiswa(2, "11111113", "Alif"));
        tabel.getItems().add(new Mahasiswa(3, "11111114", "Ghifari"));
        tabel.getItems().add(new Mahasiswa(4, "11111115", "Rayen"));
        tabel.getItems().add(new Mahasiswa(5, "11111116", "Taufik"));
        tabel.getItems().add(new Mahasiswa(6, "11111117", "Azhari"));
        tabel.getItems().add(new Mahasiswa(7, "11111118", "Rahman"));
        tabel.getItems().add(new Mahasiswa(8, "11111119", "Rasyid"));
        tabel.getItems().add(new Mahasiswa(9, "11111110", "Pasha"));
        tabel.getItems().add(new Mahasiswa(10, "11111122", "Kale"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}