module com.example.kursach {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kursach to javafx.fxml;
    exports com.example.kursach;
}