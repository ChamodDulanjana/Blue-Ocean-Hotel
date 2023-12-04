module com.lk.ijse.blueoceanhotel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lk.ijse.blueoceanhotel to javafx.fxml;
    exports com.lk.ijse.blueoceanhotel;
}