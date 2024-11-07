package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.House;
import model.Light;


public class Gui extends JFrame implements ActionListener, ChangeListener {

	private static final long serialVersionUID = 1L;

	// Objects
	private House house = new House();
	private List<Light> lights = house.getLights();

	// Timer
	private Timer timerOn[] = new Timer[lights.size()];
	private Timer timerOff[] = new Timer[lights.size()];

	// Icons, fonts and number format.

	private final Font F = new Font("Arial", Font.PLAIN, 12);
	private final ImageIcon ICON_TIMED = createImageIcon("images/Icon_Timed.png");

	// Panels and Tabbed Pane
	private final JTabbedPane TABPANE = new JTabbedPane();
	private final JPanel MASTERPANEL = new JPanel(null);
	private final JPanel LIGHTPANEL = new JPanel(null);

	// Labels

	private JLabel LBL_LIGHT[] = new JLabel[lights.size()];
	private JLabel LBL_DIMSETTINGS[] = new JLabel[lights.size()];
	private JLabel LBL_LIGHTSTATUS[] = new JLabel[lights.size()];
	private JLabel MASTER_LBL_LIGHT[] = new JLabel[lights.size()];


	// JButtons
	private JButton BTN_TIMERON[] = new JButton[lights.size()];
	private JButton BTN_TIMEROFF[] = new JButton[lights.size()];
	private JButton MASTER_BTN_TIMERON;
	private JButton MASTER_BTN_TIMEROFF;
	private JButton MASTER_BTN_ON;
	private JButton MASTER_BTN_OFF;

	// Radio Button
	private JRadioButton RB_ON[] = new JRadioButton[lights.size()];
	private JRadioButton RB_OFF[] = new JRadioButton[lights.size()];

	// JSlider
	private JSlider S_DIM[] = new JSlider[lights.size()];
	private JSlider M_DIMSLIDER;


	public Gui() {
		setTitle("MMM - Home Automation System");
		setSize(600, 500);
		setLocation(100, 100);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Create Tab Panel
		add(TABPANE);

		// Create GUI
		masterGUI();
		lightGUI();
		

		// Create Tabs
		TABPANE.add("Master Controls", MASTERPANEL);
		TABPANE.add("Lights", LIGHTPANEL);
	}

	
	public void lightGUI() {

		int y = 25;

		for (int i = 0; i < lights.size(); i++) {
			Light light = lights.get(i);

			LBL_LIGHT[i] = new JLabel(light.toString());
			LBL_LIGHT[i].setBounds(25, y, 90, 15);
			LBL_LIGHT[i].setFont(F);

			RB_ON[i] = new JRadioButton("On");
			RB_ON[i].setBounds(100, y, 50, 20);
			RB_ON[i].setSelected(false);
			RB_ON[i].setFont(F);
			RB_ON[i].addActionListener(this);

			RB_OFF[i] = new JRadioButton("Off");
			RB_OFF[i].setBounds(150, y, 50, 20);
			RB_OFF[i].setSelected(true);
			RB_OFF[i].setFont(F);
			RB_OFF[i].addActionListener(this);

			LBL_LIGHTSTATUS[i] = new JLabel("Status: " + light.status());
			LBL_LIGHTSTATUS[i].setBounds(225, y, 85, 20);
			LBL_LIGHTSTATUS[i].setFont(F);

			BTN_TIMERON[i] = new JButton("Timed On", ICON_TIMED);
			BTN_TIMERON[i].setBounds(320, y, 120, 30);
			BTN_TIMERON[i].setFont(F);
			BTN_TIMERON[i].addActionListener(this);

			BTN_TIMEROFF[i] = new JButton("Timed Off", ICON_TIMED);
			BTN_TIMEROFF[i].setBounds(450, y, 120, 30);
			BTN_TIMEROFF[i].setFont(F);
			BTN_TIMEROFF[i].addActionListener(this);

			y += 35;

			LBL_DIMSETTINGS[i] = new JLabel("Dim Settings: ");
			LBL_DIMSETTINGS[i].setBounds(25, y, 90, 15);
			LBL_DIMSETTINGS[i].setFont(F);

			S_DIM[i] = new JSlider();
			S_DIM[i].setBounds(150, y, 150, 40);
			// Set Maximum and Minimum Value on slider
			S_DIM[i].setMaximum(100);
			S_DIM[i].setMinimum(0);
			// Set Value to 0 (Dim is off)
			S_DIM[i].setValue(0);
			// Set Spacing values
			S_DIM[i].setMajorTickSpacing(25);
			S_DIM[i].setMinorTickSpacing(5);
			// Make Paint Visible
			S_DIM[i].setPaintTicks(true);
			S_DIM[i].setPaintLabels(true);
			S_DIM[i].setFont(F);
			S_DIM[i].addChangeListener(this);

			y += 50;

			LIGHTPANEL.add(LBL_LIGHT[i]);
			LIGHTPANEL.add(RB_ON[i]);
			LIGHTPANEL.add(RB_OFF[i]);
			LIGHTPANEL.add(LBL_DIMSETTINGS[i]);
			LIGHTPANEL.add(S_DIM[i]);
			LIGHTPANEL.add(LBL_LIGHTSTATUS[i]);
			LIGHTPANEL.add(BTN_TIMERON[i]);
			LIGHTPANEL.add(BTN_TIMEROFF[i]);
		}

	}

	public void masterGUI() {
		 
		int x;
		int y;
	
		ImageIcon ICON_ON = createImageIcon("images/Icon_On.png");
		MASTER_BTN_ON = new JButton("On", ICON_ON);
		MASTER_BTN_ON.setBounds(75, 150, 100, 30);
		MASTER_BTN_ON.setFont(F);
		MASTER_BTN_ON.addActionListener(this);

		ImageIcon ICON_OFF = createImageIcon("images/Icon_Off.png");
		MASTER_BTN_OFF = new JButton("Off", ICON_OFF);
		MASTER_BTN_OFF.setBounds(185, 150, 100, 30);
		MASTER_BTN_OFF.setFont(F);
		MASTER_BTN_OFF.addActionListener(this);

		M_DIMSLIDER = new JSlider();
		M_DIMSLIDER.setBounds(295, 150, 200, 40);
		// Minimum + Maximum
		M_DIMSLIDER.setMaximum(100);
		M_DIMSLIDER.setMinimum(0);
		// Default Value
		M_DIMSLIDER.setValue(0);
		// Set Minor and Major ticks
		M_DIMSLIDER.setMinorTickSpacing(5);
		M_DIMSLIDER.setMajorTickSpacing(25);
		// Set Paint True
		M_DIMSLIDER.setPaintTicks(true);
		M_DIMSLIDER.setPaintLabels(true);
		M_DIMSLIDER.addChangeListener(this);

		x = 75;
		y = 200;

		for (int i = 0; i < lights.size(); i++) {
			Light light = lights.get(i);
			MASTER_LBL_LIGHT[i] = new JLabel(light.toString() + " "
					+ light.status());
			MASTER_LBL_LIGHT[i].setBounds(x, y, 110, 15);
			MASTER_LBL_LIGHT[i].setFont(F);
			x += 110;

			// 2 Column Layout
			if (x > 220) {
				x = 75;
				y += 20;
			}

			MASTERPANEL.add(MASTER_LBL_LIGHT[i]);
		}

		MASTER_BTN_TIMERON = new JButton("Timer On", ICON_TIMED);
		MASTER_BTN_TIMERON.setBounds(75, y + 20, 110, 30);
		MASTER_BTN_TIMERON.setFont(F);
		MASTER_BTN_TIMERON.addActionListener(this);

		MASTER_BTN_TIMEROFF = new JButton("Timer Off", ICON_TIMED);
		MASTER_BTN_TIMEROFF.setBounds(195, y + 20, 110, 30);
		MASTER_BTN_TIMEROFF.setFont(F);
		MASTER_BTN_TIMEROFF.addActionListener(this);

		MASTERPANEL.add(MASTER_BTN_ON);
		MASTERPANEL.add(MASTER_BTN_OFF);
		MASTERPANEL.add(M_DIMSLIDER);
		MASTERPANEL.add(MASTER_BTN_TIMERON);
		MASTERPANEL.add(MASTER_BTN_TIMEROFF);

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {

		// Light Loop
		for (int i = 0; i < lights.size(); i++) {
			final Light light = lights.get(i);

			if (e.getSource() == RB_ON[i]) {
				if (!light.isOn()) {
					light.turnOn();
					RB_ON[i].setSelected(true);
					RB_OFF[i].setSelected(false);
					LBL_LIGHTSTATUS[i].setText("Status: " + light.status());
					MASTER_LBL_LIGHT[i].setText(light.toString() + " "
							+ light.status());
				}
			}

			if (e.getSource() == RB_OFF[i]) {
				if (light.isOn()) {
					light.turnOff();
					RB_ON[i].setSelected(false);
					RB_OFF[i].setSelected(true);
					LBL_LIGHTSTATUS[i].setText("Status: " + light.status());
					MASTER_LBL_LIGHT[i].setText(light.toString() + " "
							+ light.status());
				}
			}

			if (e.getSource() == BTN_TIMERON[i]) {
				timerOn[i] = new Timer(1000, this);
				timerOn[i].start();
			}

			if (e.getSource() == timerOn[i]) {
				light.turnOn();
				timerOn[i].stop();
				RB_ON[i].setSelected(true);
				RB_OFF[i].setSelected(false);
				LBL_LIGHTSTATUS[i].setText("Status: " + light.status());
				MASTER_LBL_LIGHT[i].setText(light.toString() + " "
						+ light.status());
			}

			if (e.getSource() == BTN_TIMEROFF[i]) {
				timerOff[i] = new Timer(1000, this);
				timerOff[i].start();
			}

			if (e.getSource() == timerOff[i]) {
				light.turnOff();
				timerOff[i].stop();
				RB_ON[i].setSelected(false);
				RB_OFF[i].setSelected(true);
				LBL_LIGHTSTATUS[i].setText("Status: " + light.status());
				MASTER_LBL_LIGHT[i].setText(light.toString() + " "
						+ light.status());
			}

			/*
			 * MASTER CONTROL FOR LIGHT
			 */

			if (e.getSource() == MASTER_BTN_ON) {
				light.turnOn();
				RB_ON[i].setSelected(true);
				RB_OFF[i].setSelected(false);
				LBL_LIGHTSTATUS[i].setText(light.toString() + " "
						+ light.status());
				MASTER_LBL_LIGHT[i].setText(light.toString() + " "
						+ light.status());
			}

			if (e.getSource() == MASTER_BTN_OFF) {
				light.turnOff();
				RB_ON[i].setSelected(false);
				RB_OFF[i].setSelected(true);
				LBL_LIGHTSTATUS[i].setText(light.toString() + " "
						+ light.status());
				MASTER_LBL_LIGHT[i].setText(light.toString() + " "
						+ light.status());
			}

			if (e.getSource() == MASTER_BTN_TIMERON) {
				timerOn[i] = new Timer(1000, this);
				timerOn[i].start();
			}

			if (e.getSource() == MASTER_BTN_TIMEROFF) {
				timerOff[i] = new Timer(1000, this);
				timerOff[i].start();
			}
		}
	}
	@Override
	public void stateChanged(ChangeEvent c) {
		for (int i = 0; i < lights.size(); i++) {
			Light light = lights.get(i);

			if (S_DIM[i].getValueIsAdjusting()) {
				light.setDimValue((int) S_DIM[i].getValue());
			}

			if (M_DIMSLIDER.getValueIsAdjusting()) {
				S_DIM[i].setValue(M_DIMSLIDER.getValue());
				light.setDimValue((int) M_DIMSLIDER.getValue());
			}
		}
	}
	/*
	 * Copy pasted from docs.oracle.com
	 */
	protected ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
}
