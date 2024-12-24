module btl.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;

    opens btl.project to javafx.fxml;
    exports btl.project;
}
