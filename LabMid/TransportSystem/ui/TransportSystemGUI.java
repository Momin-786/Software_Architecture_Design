package ui;
import domain.PersonalVehicle;
import domain.PublicTransport;
import domain.TransportationMode;
import domain.UniversityBus;
import java.awt.*;
import javax.swing.*;
import model.filter.CostFilter;
import model.filter.FlexibilityFilter;
import model.filter.Pipe;
import model.observer.Student;
import model.observer.TransportNotifier;

public class TransportSystemGUI {
    private JFrame frame;
    private JTextArea outputArea;
    private TransportNotifier notifier;

    public TransportSystemGUI() {
        notifier = new TransportNotifier();
        setupGUI();
    }

    private void setupGUI() {
        frame = new JFrame("University Transport System");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton publicTransportButton = new JButton("Public Transport");
        JButton personalVehicleButton = new JButton("Personal Vehicle");
        JButton universityBusButton = new JButton("University Bus");
        JButton subscribeButton = new JButton("Subscribe to Notifications");

        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        publicTransportButton.addActionListener(e -> selectMode(new PublicTransport()));
        personalVehicleButton.addActionListener(e -> selectMode(new PersonalVehicle()));
        universityBusButton.addActionListener(e -> {
            selectMode(new UniversityBus());
            notifier.notifyObservers("University Bus: Schedule updated or delayed!");
        });

        subscribeButton.addActionListener(e -> subscribeStudent());

        panel.add(publicTransportButton);
        panel.add(personalVehicleButton);
        panel.add(universityBusButton);
        panel.add(subscribeButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

   private void selectMode(TransportationMode mode) {
    Pipe pipe = new Pipe();
    pipe.addFilter(new CostFilter());
    pipe.addFilter(new FlexibilityFilter());

    outputArea.setText("Processing selected transportation mode: " + mode.getName() + "\n\n");
    pipe.process(mode);

    outputArea.append("Selected Transportation Mode: " + mode.getName() +
            "\nCost: " + mode.getCost() +
            "\nFlexibility (1-10): " + mode.getFlexibility() +
            "\n\nFilters applied: Cost and Flexibility successfully calculated.");
}


    private void subscribeStudent() {
        String studentName = JOptionPane.showInputDialog(frame, "Enter your name to subscribe:");
        if (studentName != null && !studentName.isEmpty()) {
            Student student = new Student(studentName);
            notifier.subscribe(student);
            outputArea.append("\n" + studentName + " subscribed to notifications.");
        } else {
            outputArea.append("\nSubscription canceled.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TransportSystemGUI gui = new TransportSystemGUI();
            gui.notifier.subscribe(new Student("Momin"));
            gui.notifier.subscribe(new Student("Ali"));
        });
    }
}
