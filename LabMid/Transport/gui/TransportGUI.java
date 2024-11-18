package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import model.NotificationPipe;
import model.Student;
import model.TransportManager;
import model.filters.Filter;
import model.filters.PaymentFilter;
import model.filters.RestrictionCheckFilter;
import model.transports.OwnConvenienceTransport;
import model.transports.PublicTransport;
import model.transports.UniversityTransport;

public class TransportGUI extends JFrame {
    private JButton universityTransportButton;
    private JButton ownConvenienceButton;
    private JButton publicTransportButton;
    private JTextArea notificationArea;

    private TransportManager transportManager;
    private NotificationPipe notificationPipe;

    public TransportGUI() {
        setTitle("Transport System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        universityTransportButton = new JButton("University Transport");
        ownConvenienceButton = new JButton("Own Convenience");
        publicTransportButton = new JButton("Public Transport");
        notificationArea = new JTextArea(10, 30);
        notificationArea.setEditable(false);

        add(universityTransportButton);
        add(ownConvenienceButton);
        add(publicTransportButton);
        add(new JScrollPane(notificationArea));

        // Initialize TransportManager and NotificationPipe
        transportManager = new TransportManager();
        notificationPipe = new NotificationPipe();
        
        // Set up the filters in the pipeline
        List<Filter> filters = new ArrayList<>();
        filters.add(new PaymentFilter());
        filters.add(new RestrictionCheckFilter());
        notificationPipe.setFilters(filters);

        // Create student observers
        Student student1 = new Student("Ali");
        Student student2 = new Student("Momin");
        transportManager.addObserver(student1);
        transportManager.addObserver(student2);

        // Action Listeners
        universityTransportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UniversityTransport universityTransport = new UniversityTransport(true, true);
                String details = universityTransport.getDetails();
                String notification = notificationPipe.process(details);
                transportManager.notifyObservers(notification);
                displayNotification(notification);
            }
        });

        ownConvenienceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OwnConvenienceTransport ownConvenienceTransport = new OwnConvenienceTransport(true, true);
                String details = ownConvenienceTransport.getDetails();
                String notification = notificationPipe.process(details);
                transportManager.notifyObservers(notification);
                displayNotification(notification);
            }
        });

        publicTransportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PublicTransport publicTransport = new PublicTransport(true, true);
                String details = publicTransport.getDetails();
                String notification = notificationPipe.process(details);
                transportManager.notifyObservers(notification);
                displayNotification(notification);
            }
        });

        setVisible(true);
    }

    private void displayNotification(String message) {
        notificationArea.append(message + "\n");
    }

    public static void main(String[] args) {
        new TransportGUI();
    }
}

