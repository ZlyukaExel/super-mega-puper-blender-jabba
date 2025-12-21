module company.name.blender {
    requires javafx.controls;
    requires javafx.fxml;


    opens company.name.blender to javafx.fxml;
    exports company.name.blender;
}