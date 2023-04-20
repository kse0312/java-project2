module com.example.javaproject2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaproject2 to javafx.fxml;
    exports com.example.javaproject2;
    exports com.example.javaproject2.week1;
    opens com.example.javaproject2.week1 to javafx.fxml;
    exports com.example.javaproject2.week1.Day4;
    opens com.example.javaproject2.week1.Day4 to javafx.fxml;
    exports com.example.javaproject2.week1.Day3;
    opens com.example.javaproject2.week1.Day3 to javafx.fxml;
    exports com.example.javaproject2.week1.Day2;
    opens com.example.javaproject2.week1.Day2 to javafx.fxml;
}