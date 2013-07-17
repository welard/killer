package killer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Mar 09 09:42:19 GMT 2013
 */



/**
 * @author welard
 */
public class MYGUI extends JFrame {
	public MYGUI() {
		initComponents();
	}

	private void startBUTTONActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - john gibson
		label1 = new JLabel();
		monstertokill = new JComboBox<>();
		label2 = new JLabel();
		foodtoeat = new JComboBox<>();
		label3 = new JLabel();
		location = new JComboBox<>();
		startBUTTON = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//---- label1 ----
		label1.setText("Monster");
		contentPane.add(label1);
		label1.setBounds(new Rectangle(new Point(10, 30), label1.getPreferredSize()));

		//---- monstertokill ----
		monstertokill.setModel(new DefaultComboBoxModel<>(new String[] {
			"Goblin",
			"Chicken",
			"Rat",
			"Guard"
		}));
		contentPane.add(monstertokill);
		monstertokill.setBounds(65, 30, 80, monstertokill.getPreferredSize().height);

		//---- label2 ----
		label2.setText("Food");
		contentPane.add(label2);
		label2.setBounds(new Rectangle(new Point(10, 60), label2.getPreferredSize()));

		//---- foodtoeat ----
		foodtoeat.setModel(new DefaultComboBoxModel<>(new String[] {
			"Chicken",
			"Lobster",
			"BakedPotato",
			"ChiliPotato",
			"EggPotato",
			"MushroomPotato",
			"TunaPotato",
			"Trout",
			"Pike ",
			"Salmon ",
			"Tuna",
			"lobster",
			"Bass",
			"Swordfish",
			"Monkfish",
			"Shark",
			"SeaTurtle",
			"MantaRay",
			"Cavefish",
			"Rocktail",
			"Monkfish",
			"Shark",
			"SeaTurtle",
			"MantaRay",
			"Cavefish",
			"Rocktail"
		}));
		contentPane.add(foodtoeat);
		foodtoeat.setBounds(new Rectangle(new Point(65, 60), foodtoeat.getPreferredSize()));

		//---- label3 ----
		label3.setText("Location:");
		contentPane.add(label3);
		label3.setBounds(new Rectangle(new Point(10, 90), label3.getPreferredSize()));

		//---- location ----
		location.setModel(new DefaultComboBoxModel<>(new String[] {
			"None (no banking)",
			"Varrock",
			"DraynorVillage",
			"Edgeville",
			"Falador",
			"Burthorpe ",
			"GoblinVillage",
			"Taverley",
			"Dwarven Mine"
		}));
		contentPane.add(location);
		location.setBounds(new Rectangle(new Point(65, 90), location.getPreferredSize()));

		//---- startBUTTON ----
		startBUTTON.setText("start");
		startBUTTON.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startBUTTONActionPerformed(e);
				startBUTTONActionPerformed(e);
				startBUTTONActionPerformed(e);
			}
		});
		contentPane.add(startBUTTON);
		startBUTTON.setBounds(new Rectangle(new Point(55, 160), startBUTTON.getPreferredSize()));

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - john gibson
	private JLabel label1;
	private JComboBox<String> monstertokill;
	private JLabel label2;
	private JComboBox<String> foodtoeat;
	private JLabel label3;
	private JComboBox<String> location;
	private JButton startBUTTON;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
