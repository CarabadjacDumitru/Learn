module com.example.learning {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learning to javafx.fxml;
    exports com.example.learning.lesson1;
    opens com.example.learning.lesson1 to javafx.fxml;
    exports com.example.learning.lesson2;
    opens com.example.learning.lesson2 to javafx.fxml;
}