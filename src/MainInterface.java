import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainInterface extends Frame {

	private Frame frame;
	private Button singleSummonButton;
	private Button tenTimeSummonButton;
	
	/**
	 * constructor
	 * @param
	 * @return
	 */
	MainInterface() {
		frame = new Frame("FGO³é¿¨Ä£ÄâÆ÷");
		frame.setBounds(0, 0, 1200,800);
		//frame.setLayout(new GridLayout(2, 4));
		frame.setLayout(null);
		
		singleSummonButton = new Button("ÕÙ»½¡Á1´Î");
		tenTimeSummonButton = new Button("ÕÙ»½¡Á10´Î");
		
		/*
		for (int i = 0; i < 6; ++i)
			frame.add(new Label());
		frame.add(singleSummonButton);
		frame.add(new Label());
		frame.add(tenTimeSummonButton);
		frame.add(new Label());
		*/
		
		frame.add(singleSummonButton);
		frame.add(tenTimeSummonButton);
		singleSummonButton.setBounds(200, 500, 300, 150);
		tenTimeSummonButton.setBounds(700, 500, 300, 150);
		
		frame.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
			);
		frame.setVisible(true);
	}
	
	/**
	 * summon the servants only once
	 * @param
	 * @return
	 */
	void singleSummon() {
		
	}
	
	
	/**
	 * summon the servants ten times
	 * @param
	 * @return
	 */
	void tenTimeSummon() {
		
	}
}
