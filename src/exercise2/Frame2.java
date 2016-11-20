package exercise2;

//Import statements
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by Mudrak on 11/17/2016.
 */
public class Frame2 extends Application {
    //All required variables
    private Label nameLabel,addressLabel,provinceLabel,cityLabel,postalCodeLabel,phoneNumberLabel,emailLabel;
    private TextField nameTextField,addressTextField,provinceTextField,cityTextField,postalCodeTextField,phoneNumberTextField,emailTextField;
    private CheckBox studentCheckBox,volunteerCheckBox;
    private RadioButton computerScienceRadioButton,businessRadioButton;
    private ToggleGroup radioButtonGroup;
    private GridPane gridPaneLayout;

    public static void main(String[] args) {
        launch(args);
    }
    /**
     * start method
     * */
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Initializing GridPane Layout
        gridPaneLayout = new GridPane();
        gridPaneLayout.setAlignment(Pos.BASELINE_LEFT);
        gridPaneLayout.setHgap(5);
        gridPaneLayout.setVgap(5);
        gridPaneLayout.setPadding(new Insets(10,10,10,10));

        //Initializing all Labels
        nameLabel = new Label("Name");
        addressLabel = new Label("Address");
        provinceLabel = new Label("Province");
        cityLabel = new Label("City");
        postalCodeLabel = new Label("Postal Code");
        phoneNumberLabel = new Label("Phone Number");
        emailLabel = new Label("Email ID");

        //Initializing all TextFields with their ToolTip text
        nameTextField = new TextField();
        nameTextField.setTooltip(new Tooltip("Your name here."));
        addressTextField = new TextField();
        addressTextField.setTooltip(new Tooltip("Your address here."));
        provinceTextField = new TextField();
        provinceTextField.setTooltip(new Tooltip("Your province here."));
        cityTextField = new TextField();
        cityTextField.setTooltip(new Tooltip("Your city here."));
        postalCodeTextField = new TextField();
        postalCodeTextField.setTooltip(new Tooltip("Your postal code here."));
        phoneNumberTextField = new TextField();
        phoneNumberTextField.setTooltip(new Tooltip("Your phone number here."));
        emailTextField = new TextField();
        emailTextField.setTooltip(new Tooltip("Your Email ID here."));

        //Initializing and adding the CheckBoxes to the gridPaneLayout
        studentCheckBox = new CheckBox("Student Council");
        volunteerCheckBox = new CheckBox("Volunteer Work");
        gridPaneLayout.add(studentCheckBox,2,1);
        gridPaneLayout.add(volunteerCheckBox,2,5);

        //Initializing and adding the RadioButtons to the gridPaneLayout and also grouping them
        radioButtonGroup = new ToggleGroup();
        computerScienceRadioButton = new RadioButton("Computer Science");
        computerScienceRadioButton.setToggleGroup(radioButtonGroup);
        businessRadioButton = new RadioButton("Business");
        businessRadioButton.setToggleGroup(radioButtonGroup);
        gridPaneLayout.add(computerScienceRadioButton,4,0);
        gridPaneLayout.add(businessRadioButton,5,0);

        //Add the Labels to the gridPaneLayout
        gridPaneLayout.add(nameLabel,0,0);
        gridPaneLayout.add(addressLabel,0,1);
        gridPaneLayout.add(provinceLabel,0,2);
        gridPaneLayout.add(cityLabel,0,3);
        gridPaneLayout.add(postalCodeLabel,0,4);
        gridPaneLayout.add(phoneNumberLabel,0,5);
        gridPaneLayout.add(emailLabel,0,6);

        //Add all the TextFields to gridPaneLayout
        gridPaneLayout.add(nameTextField,1,0);
        gridPaneLayout.add(addressTextField,1,1);
        gridPaneLayout.add(provinceTextField,1,2);
        gridPaneLayout.add(cityTextField,1,3);
        gridPaneLayout.add(postalCodeTextField,1,4);
        gridPaneLayout.add(phoneNumberTextField,1,5);
        gridPaneLayout.add(emailTextField,1,6);

        //Setup a scene object
        /**
         * This is the Scene Object
         * */
        Scene scene = new Scene(gridPaneLayout,300,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Frame2");
        primaryStage.show();
    }
}
