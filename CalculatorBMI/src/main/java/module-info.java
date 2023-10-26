module com.example.calculatorbmi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatorbmi to javafx.fxml;
    exports com.example.calculatorbmi;
}