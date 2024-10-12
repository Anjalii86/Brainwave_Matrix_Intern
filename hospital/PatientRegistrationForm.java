package com.hospital;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anjalii on 22-09-2024.
 */



    public class PatientRegistrationForm extends JFrame {
        private JTextField nameField;
        private JTextField ageField;
        private JTextField contactNumberField;

        public PatientRegistrationForm() {
            setTitle("Patient Registration");
            setSize(300, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            add(panel);
            placeComponents(panel);

            setVisible(true);
        }

        private void placeComponents(JPanel panel) {
            panel.setLayout(null);

            JLabel nameLabel = new JLabel("Name:");
            nameLabel.setBounds(10, 20, 80, 25);
            panel.add(nameLabel);

            nameField = new JTextField(20);
            nameField.setBounds(100, 20, 165, 25);
            panel.add(nameField);

            JLabel ageLabel = new JLabel("Age:");
            ageLabel.setBounds(10, 50, 80, 25);
            panel.add(ageLabel);

            ageField = new JTextField(20);
            ageField.setBounds(100, 50, 165, 25);
            panel.add(ageField);

            JLabel contactNumberLabel = new JLabel("Contact:");
            contactNumberLabel.setBounds(10, 80, 80, 25);
            panel.add(contactNumberLabel);

            contactNumberField = new JTextField(20);
            contactNumberField.setBounds(100, 80, 165, 25);
            panel.add(contactNumberField);

            JButton registerButton = new JButton("Register");
            registerButton.setBounds(10, 110, 150, 25);
            panel.add(registerButton);

            registerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    int age = Integer.parseInt(ageField.getText());
                    String contactNumber = contactNumberField.getText();

                    // Handle patient registration logic here (e.g., insert into database)
                }
            });
        }

        public static void main(String[] args) {
            new PatientRegistrationForm();
        }
    }


