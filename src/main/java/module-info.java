module com.mycompany.provafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.sql;

    opens com.mycompany.provafx to javafx.fxml;
    exports com.mycompany.provafx;
}
