package exercise1;
/**
 * import statements
 * */
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.awt.*;
import java.awt.event.ItemEvent;

/**
 * Created by Mudrak on 11/6/2016.
 */
public class Frame1 extends JFrame {
    //Declaring required variables/components
    private final JLabel nameJLabel,
                        addressJLabel,
                        provinceJLabel,
                        cityJLabel,
                        postalCodeJLabel,
                        phoneNumberJLabel,
                        emailJLabel;
    private final JTextField nameJTextField,
                            addressJTextField,
                            provinceJTextField,
                            cityJTextField,
                            postalCodeJTextField,
                             phoneNumberJTextField,
                             emailJTextField;
    private final JPanel labelsJPanel, textfieldsJPanel;
    private final JCheckBox studentJCheckBox, volunteerJCheckBox;
    private final JRadioButton computerScienceJRadioButton, businessJRadioButton;
    private final JComboBox computerScienceJComboBox, businessJComboBox;
    private final JList<String> computerScienceJList, businessJList;
    private final JButton displayJButton;
    private final DefaultListModel<String> JListModel;
    private String[] computerScienceCourses = {"C#","Java","Python"} ;
    private String[] businessCourses = {"Math","Stats","Market"};
    /**
     * Frame1 constructor
     **/
    public Frame1(){
        super("Frame1");
        /**
         * Set the layout of the frame
         * */
        setLayout(null);
        /**
         * Initialize all the required JLabels and JTextFields
         * */
        //nameJLabel constructor with a string argument
        nameJLabel = new JLabel("Name");
        //nameJTextField constructor with a column size argument
        nameJTextField = new JTextField(20);
        nameJTextField.setToolTipText("Your name here.");
        //addressJLabel constructor with a string argument
        addressJLabel = new JLabel("Address");
        //addressJTextField constructor with a column size argument
        addressJTextField = new JTextField(20);
        addressJTextField.setToolTipText("Your address here.");
        //provinceJLabel constructor with a string argument
        provinceJLabel = new JLabel("Province");
        //provinceJTextField constructor with a column size argument
        provinceJTextField = new JTextField(20);
        provinceJTextField.setToolTipText("Your province here.");
        //cityJLabel constructor with a string argument
        cityJLabel = new JLabel("City");
        //cityJTextField constructor with a column size argument
        cityJTextField = new JTextField(20);
        cityJTextField.setToolTipText("Your city here.");
        //postalCodeJLabel constructor with a string argument
        postalCodeJLabel = new JLabel("Postal code");
        //postalCodeJTextfield constructor with a column size argument
        postalCodeJTextField  = new JTextField(20);
        postalCodeJTextField.setToolTipText("Your postal code here.");
        //phoneNumberJLabel constructor with a string argument
        phoneNumberJLabel = new JLabel("Phone number");
        //phoneNumberJTextField constructor with a column size argument
        phoneNumberJTextField = new JTextField(20);
        phoneNumberJTextField.setToolTipText("Your phone number here.");
        //emailJLabel constructor with a string argument
        emailJLabel = new JLabel("Email ID");
        //emailJTextField constructor with a column size argument
        emailJTextField = new JTextField(20);
        emailJTextField.setToolTipText("Your email id here.");
        /**
        * JPanel for JLabels Alignment
        * */
        labelsJPanel = new JPanel();
        labelsJPanel.setLayout(new BoxLayout(labelsJPanel, BoxLayout.PAGE_AXIS));
        labelsJPanel.add(nameJLabel);
        labelsJPanel.add(Box.createRigidArea(new Dimension(0,5)));
        labelsJPanel.add(addressJLabel);
        labelsJPanel.add(Box.createRigidArea(new Dimension(0,5)));
        labelsJPanel.add(provinceJLabel);
        labelsJPanel.add(Box.createRigidArea(new Dimension(0,5)));
        labelsJPanel.add(cityJLabel);
        labelsJPanel.add(Box.createRigidArea(new Dimension(0,5)));
        labelsJPanel.add(postalCodeJLabel);
        labelsJPanel.add(Box.createRigidArea(new Dimension(0,5)));
        labelsJPanel.add(phoneNumberJLabel);
        labelsJPanel.add(Box.createRigidArea(new Dimension(0,5)));
        labelsJPanel.add(emailJLabel);
        /**
         * JPanel for JTextFields Alignment
         * */
        textfieldsJPanel = new JPanel();
        textfieldsJPanel.setLayout(new BoxLayout(textfieldsJPanel, BoxLayout.Y_AXIS));
        textfieldsJPanel.add(nameJTextField);
        textfieldsJPanel.add(addressJTextField);
        textfieldsJPanel.add(provinceJTextField);
        textfieldsJPanel.add(cityJTextField);
        textfieldsJPanel.add(postalCodeJTextField);
        textfieldsJPanel.add(phoneNumberJTextField);
        textfieldsJPanel.add(emailJTextField);
        /**
        * Dimensions for absolute positioning of labelsJPanel and textFieldsJPanel
        * */
        Dimension labelsDimension = labelsJPanel.getPreferredSize();
        Dimension textfieldsDimension = textfieldsJPanel.getPreferredSize();
        //set the co-ordinates for both panels
        labelsJPanel.setBounds(3,20, labelsDimension.width, labelsDimension.height);
        textfieldsJPanel.setBounds(140,20, textfieldsDimension.width, textfieldsDimension.height);
        //add both the panels to the Frame1
        add(labelsJPanel);
        add(textfieldsJPanel);
        /**
         * Initializing the two JCheckBox
         * */
        studentJCheckBox = new JCheckBox("Student Council");
        volunteerJCheckBox = new JCheckBox("Volunteer Work");
        Dimension studentJCheckBoxDimension = studentJCheckBox.getPreferredSize();
        Dimension volunteerJCheckBoxDimension = volunteerJCheckBox.getPreferredSize();
        //set co-ordinates for both the JCheckBox's
        studentJCheckBox.setBounds(365,40,studentJCheckBoxDimension.width,studentJCheckBoxDimension.height);
        volunteerJCheckBox.setBounds(365,120,volunteerJCheckBoxDimension.width,volunteerJCheckBoxDimension.height);
        add(studentJCheckBox);
        add(volunteerJCheckBox);
        /**
         * Initializing computerScienceJList and businessJList
         * */
        JListModel = new DefaultListModel<>();
        /*computerScienceJList = new JList(computerScienceCourses.clone());
        businessJList = new JList(businessCourses.clone());*/
        computerScienceJList = new JList<>(JListModel);
        businessJList = new JList<>(JListModel);
        /**
         * Adding computerScienceJList to the Frame1
         * */
        Dimension computerScienceJListDimension= computerScienceJList.getPreferredSize();
        computerScienceJList.setBounds(600,60,computerScienceJListDimension.width,computerScienceJListDimension.height);
        computerScienceJList.setVisibleRowCount(4);
        computerScienceJList.setBackground(Color.WHITE);
        add(computerScienceJList);
        /**
         *Adding businessJList to the Frame1
         **/
        Dimension businessJListDimension = businessJList.getPreferredSize();
        businessJList.setBounds(600,60,businessJListDimension.width,businessJListDimension.height);
        businessJList.setVisibleRowCount(4);
        businessJList.setBackground(Color.WHITE);
        add(businessJList);
        /**
         * Initializing the two JComboBox's
         * */
        computerScienceJComboBox = new JComboBox(computerScienceCourses);
        businessJComboBox = new JComboBox(businessCourses);
        /**
         * Add itemListener to computerScienceJComboBox
         * */
        computerScienceJComboBox.addItemListener(event -> {
            String string = computerScienceJComboBox.getSelectedItem().toString();
            if(event.getStateChange() == ItemEvent.SELECTED){
                //Check if the item selected from computerScienceJComboBox already exists in the JList or not
                if(!(computerScienceJList.getModel().toString().contains(string))){
//                    computerScienceJList.setListData(computerScienceJComboBox.getSelectedObjects());
                } else{
                    JOptionPane.showMessageDialog(null, "One course can be added only one time.");
                }
            }
        });
        /**
         * Add the computerScienceJComboBox to the Frame1
         * */
        Dimension computerScienceJComboBoxDimension = computerScienceJComboBox.getPreferredSize();
        computerScienceJComboBox.setBounds(510,60,computerScienceJComboBoxDimension.width,computerScienceJComboBoxDimension.height);
        add(computerScienceJComboBox);
        /**
         * Adding ItemListener to businessJComboBox
         * */
        businessJComboBox.addItemListener(event -> {
            String string = businessJComboBox.getSelectedItem().toString();
//            if(event.getStateChange() == ItemEvent.SELECTED){
                //Check if the item selected from businessJComboBox already exists in the JList or not
                if(!(businessJList.getModel().toString().contains(string))){
//                    businessJList.setListData(businessJComboBox.getSelectedObjects());
                } else{
                    JOptionPane.showMessageDialog(null,"One course can be added only one time.");
                }
//            }
        });
        /**
         * Add the businessJComboBox to the Frame1
         * */
        Dimension businessJComboBoxDimension = businessJComboBox.getPreferredSize();
        businessJComboBox.setBounds(510,60,businessJComboBoxDimension.width,businessJComboBoxDimension.height);
        add(businessJComboBox);
        /**
         * Initializing the two JRadioButton's
         * */
        computerScienceJRadioButton = new JRadioButton("Computer Science",true);
        businessJRadioButton = new JRadioButton("Business", false);
        /**
         * Adding ItemListener to computerScienceJRadioButton
         **/
        computerScienceJRadioButton.addItemListener(itemEvent -> {
            computerScienceJComboBox.setVisible(true);
            computerScienceJList.setVisible(true);
            businessJComboBox.setVisible(false);
            businessJList.setVisible(false);
        });
        /**
         * Adding ItemListener to businessJRadioButton
         **/
        businessJRadioButton.addItemListener(itemEvent -> {
            businessJComboBox.setVisible(true);
            businessJList.setVisible(true);
            computerScienceJComboBox.setVisible(false);
            computerScienceJList.setVisible(false);
        });
        /**
         * Creating Dimension object for computerScienceJRadioButton and businessJRadioButton to setBounds for both JRadioButtons
         **/
        Dimension computerScienceJRadioButtonDimension = computerScienceJRadioButton.getPreferredSize();
        Dimension businessJRadioButtonDimension = businessJRadioButton.getPreferredSize();
        computerScienceJRadioButton.setBounds(500,20,computerScienceJRadioButtonDimension.width,computerScienceJRadioButtonDimension.height);
        businessJRadioButton.setBounds(640,20,computerScienceJRadioButtonDimension.width,computerScienceJRadioButtonDimension.height);
        /**
         * Create a ButtonGroup to establish a relationship between the JRadioButtons
         **/
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(businessJRadioButton);
        radioButtonGroup.add(computerScienceJRadioButton);
        add(computerScienceJRadioButton);
        add(businessJRadioButton);
        /**
         * Initializing the displayJButton
         **/
        displayJButton = new JButton("Display");
        /**
         * Adding the displayJButton to the Frame1 and positioning it using a Dimension object
         * */
        Dimension displayJButtonDimension = displayJButton.getPreferredSize();
        displayJButton.setBounds(320,170,displayJButtonDimension.width,displayJButtonDimension.height);
        add(displayJButton);

        displayJButton.addActionListener(actionEvent -> {
            /**
             * Check if both check boxes are selected with computer science option
             * */
            if((studentJCheckBox.isSelected() && volunteerJCheckBox.isSelected()) && computerScienceJRadioButton.isSelected()){
                JOptionPane.showMessageDialog(null,"Name: "+nameJTextField.getText()
                        + "\nAddress: "+addressJTextField.getText()
                        + "\nProvince: "+provinceJTextField.getText()
                        + "\nCity: "+cityJTextField.getText()
                        + "\nPostal Code: "+postalCodeJTextField.getText()
                        + "\nPhone number: "+phoneNumberJTextField.getText()
                        + "\nEmail ID: "+emailJTextField.getText()
                        + "\nCourses\n"+computerScienceJComboBox.getSelectedObjects().toString()
                        + "\nVolunteer? : Yes\nStudent Council? : Yes\n"
                );
            } /**Check if both checkboxes are selected with business option**/
            else if ((studentJCheckBox.isSelected() && volunteerJCheckBox.isSelected()) && businessJRadioButton.isSelected()){
                JOptionPane.showMessageDialog(null,"Name: "+nameJTextField.getText()
                        + "\nAddress: "+addressJTextField.getText()
                        + "\nProvince: "+provinceJTextField.getText()
                        + "\nCity: "+cityJTextField.getText()
                        + "\nPostal Code: "+postalCodeJTextField.getText()
                        + "\nPhone number: "+phoneNumberJTextField.getText()
                        + "\nEmail ID: "+emailJTextField.getText()
                        + "\nCourses\n"+businessJComboBox.getSelectedObjects().toString()
                        + "\nVolunteer? : Yes\nStudent Council? : Yes\n"
                );
            } /**Check if only volunteer checkbox is selected with computer science option**/
            else if (volunteerJCheckBox.isSelected() && computerScienceJRadioButton.isSelected()){
                JOptionPane.showMessageDialog(null,"Name: "+nameJTextField.getText()
                        + "\nAddress: "+addressJTextField.getText()
                        + "\nProvince: "+provinceJTextField.getText()
                        + "\nCity: "+cityJTextField.getText()
                        + "\nPostal Code: "+postalCodeJTextField.getText()
                        + "\nPhone number: "+phoneNumberJTextField.getText()
                        + "\nEmail ID: "+emailJTextField.getText()
                        + "\nCourses\n"+computerScienceJComboBox.getSelectedObjects().toString()
                        + "\nVolunteer? : Yes\nStudent Council? : No\n"
                );
            } /**Check if only volunteer checkbox is selected with business option**/
            else if(volunteerJCheckBox.isSelected() && businessJRadioButton.isSelected()){
                JOptionPane.showMessageDialog(null,"Name: "+nameJTextField.getText()
                        + "\nAddress: "+addressJTextField.getText()
                        + "\nProvince: "+provinceJTextField.getText()
                        + "\nCity: "+cityJTextField.getText()
                        + "\nPostal Code: "+postalCodeJTextField.getText()
                        + "\nPhone number: "+phoneNumberJTextField.getText()
                        + "\nEmail ID: "+emailJTextField.getText()
                        + "\nCourses\n"+businessJComboBox.getSelectedObjects().toString()
                        + "\nVolunteer? : Yes\nStudent Council? : No\n"
                );
            } /**Check if only student council checkbox is selected with computer science option**/
            else if(studentJCheckBox.isSelected() && computerScienceJRadioButton.isSelected()){
                JOptionPane.showMessageDialog(null,"Name: "+nameJTextField.getText()
                        + "\nAddress: "+addressJTextField.getText()
                        + "\nProvince: "+provinceJTextField.getText()
                        + "\nCity: "+cityJTextField.getText()
                        + "\nPostal Code: "+postalCodeJTextField.getText()
                        + "\nPhone number: "+phoneNumberJTextField.getText()
                        + "\nEmail ID: "+emailJTextField.getText()
                        + "\nCourses\n"+computerScienceJComboBox.getSelectedObjects().toString()
                        + "\nVolunteer? : No\nStudent Council? : Yes\n"
                );
            } /**Check if only student council checkbox is selected with business option**/
            else if(studentJCheckBox.isSelected() && businessJRadioButton.isSelected()){
                JOptionPane.showMessageDialog(null,"Name: "+nameJTextField.getText()
                        + "\nAddress: "+addressJTextField.getText()
                        + "\nProvince: "+provinceJTextField.getText()
                        + "\nCity: "+cityJTextField.getText()
                        + "\nPostal Code: "+postalCodeJTextField.getText()
                        + "\nPhone number: "+phoneNumberJTextField.getText()
                        + "\nEmail ID: "+emailJTextField.getText()
                        + "\nCourses\n"+businessJComboBox.getSelectedObjects().toString()
                        + "\nVolunteer? : No\nStudent Council? : Yes\n"
                );
            }/**Check if no check boxes are selected with computer science option**/
            else if((!studentJCheckBox.isSelected() && !volunteerJCheckBox.isSelected()) && computerScienceJRadioButton.isSelected()){
                JOptionPane.showMessageDialog(null,"Name: "+nameJTextField.getText()
                        + "\nAddress: "+addressJTextField.getText()
                        + "\nProvince: "+provinceJTextField.getText()
                        + "\nCity: "+cityJTextField.getText()
                        + "\nPostal Code: "+postalCodeJTextField.getText()
                        + "\nPhone number: "+phoneNumberJTextField.getText()
                        + "\nEmail ID: "+emailJTextField.getText()
                        + "\nCourses\n"+computerScienceJComboBox.getSelectedObjects().toString()
                        + "\nVolunteer? : No\nStudent Council? : No\n"
                );
            }/**Check if no check boxes are selected with business option**/
            else if ((!studentJCheckBox.isSelected() && !volunteerJCheckBox.isSelected()) && businessJRadioButton.isSelected()){
                JOptionPane.showMessageDialog(null,"Name: "+nameJTextField.getText()
                        + "\nAddress: "+addressJTextField.getText()
                        + "\nProvince: "+provinceJTextField.getText()
                        + "\nCity: "+cityJTextField.getText()
                        + "\nPostal Code: "+postalCodeJTextField.getText()
                        + "\nPhone number: "+phoneNumberJTextField.getText()
                        + "\nEmail ID: "+emailJTextField.getText()
                        + "\nCourses\n"+businessJComboBox.getSelectedObjects().toString()
                        + "\nVolunteer? : No\nStudent Council? : No\n"
                );
            }
        });
    }
}
