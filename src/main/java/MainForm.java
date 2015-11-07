import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Sat Nov 07 13:27:50 MSK 2015
 */


public class MainForm extends JFrame {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        MainForm mainForm = new MainForm();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();

//        UIManager.setLookAndFeel(new NimbusLookAndFeel());
//        MainForm.setDefaultLookAndFeelDecorated(true);

        mainForm.setTitle("Encrypt Form");
        mainForm.setSize(width / 2, height / 2);
        mainForm.setResizable(false);
        mainForm.setVisible(true);
        mainForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainForm.setLocationRelativeTo(null);

    }

    public MainForm() {
        initComponents();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - ???°???????? ?????°?µ??
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        setFileTitle = new JLabel();
        textField1 = new JTextField();
        setFileButton = new JButton();
        label4 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        openTextArea = new JTextArea();
        scrollPane2 = new JScrollPane();
        encryptTextArea = new JTextArea();
        buttonBar = new JPanel();
        label3 = new JLabel();
        progressBar1 = new JProgressBar();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(Borders.createEmptyBorder("7dlu, 7dlu, 7dlu, 7dlu"));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new FormLayout(
                    "104dlu, $lcgap, 119dlu, $lcgap, 45dlu, $lcgap, default, $lcgap, 199dlu, $lcgap, default",
                    "5*(default, $lgap), 13dlu, 3*($lgap, default), $lgap, 62dlu"));

                //---- setFileTitle ----
                setFileTitle.setText("Choose the encrypt file");
                contentPanel.add(setFileTitle, CC.xy(1, 1));
                contentPanel.add(textField1, CC.xywh(1, 3, 3, 1));

                //---- setFileButton ----
                setFileButton.setText("Choose");
                contentPanel.add(setFileButton, CC.xy(5, 3));

                //---- label4 ----
                label4.setText("Mode");
                contentPanel.add(label4, CC.xy(1, 5));

                //---- radioButton1 ----
                radioButton1.setText("Encrypting");
                contentPanel.add(radioButton1, CC.xy(1, 7));

                //---- radioButton2 ----
                radioButton2.setText("Decryption");
                contentPanel.add(radioButton2, CC.xy(1, 9));

                //---- label1 ----
                label1.setText("Open Text");
                contentPanel.add(label1, CC.xy(1, 11));

                //---- label2 ----
                label2.setText("Encrypt Text");
                contentPanel.add(label2, CC.xywh(9, 11, 3, 1));

                //======== scrollPane1 ========
                {

                    //---- openTextArea ----
                    openTextArea.setRows(5);
                    openTextArea.setLineWrap(true);
                    scrollPane1.setViewportView(openTextArea);
                }
                contentPanel.add(scrollPane1, CC.xywh(1, 13, 3, 7));

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(encryptTextArea);
                }
                contentPanel.add(scrollPane2, CC.xywh(7, 13, 3, 7));
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(Borders.createEmptyBorder("5dlu, 0dlu, 0dlu, 0dlu"));
                buttonBar.setLayout(new FormLayout(
                        "$lcgap, default, $glue, $button, $rgap, $button",
                        "2*(default), pref"));

                //---- label3 ----
                label3.setText("Progress");
                buttonBar.add(label3, CC.xy(2, 2));
                buttonBar.add(progressBar1, CC.xy(2, 3));

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, CC.xy(4, 3));

                //---- cancelButton ----
                cancelButton.setText("Exit");
                buttonBar.add(cancelButton, CC.xy(6, 3));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - ???°???????? ?????°?µ??
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel setFileTitle;
    private JTextField textField1;
    private JButton setFileButton;
    private JLabel label4;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTextArea openTextArea;
    private JScrollPane scrollPane2;
    private JTextArea encryptTextArea;
    private JPanel buttonBar;
    private JLabel label3;
    private JProgressBar progressBar1;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private class CloseFrame extends AbstractAction {
        private CloseFrame() {
            // JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
            // Generated using JFormDesigner Evaluation license - ???°???????? ?????°?µ??
            // JFormDesigner - End of action initialization  //GEN-END:initComponents
        }

        public void actionPerformed(ActionEvent e) {
            // TODO add your code here
            if(e.getSource()==okButton){

            }
            if(e.getSource()==cancelButton){
                System.exit(0);
            }
        }

    }

    public String getOpenTextFieldContent() {
        return openTextArea.getText();
    }


}
