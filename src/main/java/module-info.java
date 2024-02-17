module com.deliveryalgosim.deliveryalgosim {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.deliveryalgosim.deliveryalgosim to javafx.fxml;
    exports com.deliveryalgosim.deliveryalgosim;
}