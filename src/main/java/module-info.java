module com.deliveryalgosim.deliveryalgosim {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.deliveryalgosim.deliveryalgosim to javafx.fxml;
    exports com.deliveryalgosim.deliveryalgosim;
    exports com.deliveryalgosim.deliveryalgosim.controllers;
    opens com.deliveryalgosim.deliveryalgosim.controllers to javafx.fxml;
}