module com.example.animalssounds {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animalssounds to javafx.fxml;
    exports com.example.animalssounds;
}