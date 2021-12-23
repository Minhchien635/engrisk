module com.engrisk.engrisk {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires modelmapper;
    requires spring.context;


    exports com.engrisk;
    opens com.engrisk to javafx.fxml;

    exports com.engrisk.controllers;
    opens com.engrisk.controllers to javafx.fxml;

    exports com.engrisk.models;
    opens com.engrisk.models to javafx.fxml;

    exports com.engrisk.dto;
    opens com.engrisk.dto to javafx.fxml;

    exports com.engrisk.utils;
    opens com.engrisk.utils to javafx.fxml;

    exports com.engrisk.enums;
    opens com.engrisk.enums to javafx.fxml;
}