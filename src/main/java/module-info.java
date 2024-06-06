module com.example.orderletters {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.orderletters to javafx.fxml;
    exports com.example.orderletters;
}