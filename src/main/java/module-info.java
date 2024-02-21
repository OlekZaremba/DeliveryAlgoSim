module com.deliveryalgosim.deliveryalgosim {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.deliveryalgosim.deliveryalgosim to javafx.fxml;
    exports com.deliveryalgosim.deliveryalgosim;
    exports com.deliveryalgosim.deliveryalgosim.controllers;
    exports com.deliveryalgosim.deliveryalgosim.model;
    opens com.deliveryalgosim.deliveryalgosim.controllers to javafx.fxml;
}