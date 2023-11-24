module com.mycompany.atividademissao4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.atividademissao4 to javafx.fxml;
    exports com.mycompany.atividademissao4;
}
