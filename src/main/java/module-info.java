module company.name.blender {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;
    requires java.desktop;


    opens company.name.blender to javafx.fxml;
    exports company.name.blender;
}