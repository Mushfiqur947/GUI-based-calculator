 import java.awt.Toolkit;
import java.awt.event.;
import javax.swing.;
import java.io.;
import java.lang.String;

public class myframe extends JFrame implements ActionListener 
    {
	JPanel  mypanel;
	JButton button_equal;
	JButton button_c; 
	JButton mybutton1;
	JButton mybutton2;
	JButton mybutton3;
	JButton mybutton4;
	JButton mybutton5; 
	JButton mybutton6;
	JButton mybutton7;
	JButton mybutton8;
	JButton mybutton9;
	JButton mybutton0;
	JButton button_plus;
	JButton button_minus;
	JButton button_multiplication;
	JButton button_division;
	JButton button_save;
	JButton button_recall;
	JLabel mylabel;
	JTextField mytext;
    ImageIcon icon;

	double firstnumber;
	double secondnumber;
	double result;
	String save;
	String recall;
	char operations;
	String answer;

	public static void writedata(String data)throws IOException{
		FileWriter writehandle = new FileWriter(CUsersDELLDesktoplab6data.txt);
		BufferedWriter bw = new BufferedWriter(writehandle);

		bw.write(data);
		bw.close();
		writehandle.close();
	}

	public static String readdata()throws IOException{
		FileReader readhandle = new FileReader(CUsersDELLDesktoplab6data.txt);
		BufferedReader br = new BufferedReader(readhandle);

		String num = br.readLine();

		br.close();
		readhandle.close();

		return num;
	}

	public myframe ()
	{

		mypanel = new JPanel();
		mypanel.setLayout(null);


		button_equal = new JButton(=);
		button_equal.setBounds(10,220,50,50);

		mybutton1 = new JButton(1);
		mybutton1.setBounds(10,55,50,50);

		mybutton2 = new JButton(2);
		mybutton2.setBounds(65,55,50,50);

		mybutton3 = new JButton(3);
		mybutton3.setBounds(120,55,50,50);

		mybutton4 = new JButton(4);
		mybutton4.setBounds(10,110,50,50);

		mybutton5 = new JButton(5);
		mybutton5.setBounds(65,110,50,50);

		mybutton6 = new JButton(6);
		mybutton6.setBounds(120,110,50,50);

		mybutton7 = new JButton(7);
		mybutton7.setBounds(10,165,50,50);

		mybutton8 = new JButton(8);
		mybutton8.setBounds(65,165,50,50);

		mybutton9 = new JButton(9);
		mybutton9.setBounds(120,165,50,50);

		mybutton0 = new JButton(0);
		mybutton0.setBounds(120,220,50, 50);


		button_plus = new JButton(+);
		button_plus.setBounds(175,55,50,50);


		button_minus = new JButton(-);
		button_minus.setBounds(175,110,50,50);

		button_multiplication = new JButton();
		button_multiplication.setBounds(175,165,50,50);

		button_division = new JButton();
		button_division.setBounds(175,220,50,50);

		button_c = new JButton(C);
		button_c.setBounds(65, 220, 50, 50);

		mylabel = new JLabel(Basic Claculator);
		mylabel.setBounds(10, 270, 160, 30 );

		button_save = new JButton(S);
		button_save.setBounds(175, 275, 50, 50);

		button_recall = new JButton(R);
		button_recall.setBounds(175, 330, 50, 50);

		mytext = new JTextField(22);
		mytext.setBounds(10,14,216,35);
		mytext.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		icon = new ImageIcon(imagecalculator1.jpg);
		setIconImage(icon.getImage());


		add(mypanel);
		mypanel.add(mytext);
		mypanel.add(button_equal);
		mypanel.add(button_c);
		mypanel.add(mybutton1);
		mypanel.add(mybutton2);
		mypanel.add(mybutton3);
		mypanel.add(mybutton4);
		mypanel.add(mybutton5);
		mypanel.add( mybutton6);
		mypanel.add(mybutton7);
		mypanel.add(mybutton8);
		mypanel.add(mybutton9);
		mypanel.add(mybutton0);
		mypanel.add(button_plus);
		mypanel.add(button_minus);
		mypanel.add(button_multiplication);
		mypanel.add(button_division);
		mypanel.add(button_save);
		mypanel.add(button_recall);
		mypanel.add(mylabel);




		button_equal.addActionListener(this);
		button_c.addActionListener(this);
		mybutton1.addActionListener(this);
		mybutton2.addActionListener(this);
		mybutton3.addActionListener(this);
		mybutton4.addActionListener(this);
		mybutton5.addActionListener(this);
		mybutton6.addActionListener(this);
		mybutton7.addActionListener(this);
		mybutton8.addActionListener(this);
		mybutton9.addActionListener(this);
		mybutton0.addActionListener(this);
		button_plus.addActionListener(this);
		button_minus.addActionListener(this);
		button_multiplication.addActionListener(this);
		button_division.addActionListener(this);
		button_save.addActionListener(this);
		button_recall.addActionListener(this);
	}


	public void actionPerformed (ActionEvent e) 
	{

		if (e.getSource() == button_equal) 
		{	
			secondnumber = Double.parseDouble(mytext.getText());
			if (operations == '+') {
				result = firstnumber + secondnumber;
				mytext.setText(Double.toString(result));
			}
			else if (operations == '-') {
				result = firstnumber - secondnumber;
				mytext.setText ( Double.toString(result));
			}
			else if (operations == '') {
				result = firstnumber  secondnumber;
				mytext.setText(Double.toString(result));
			}
			else if (operations == '') {
				result = firstnumber  secondnumber;
				mytext.setText(Double.toString(result));
			}
			
		}
		else if (e.getSource() == button_save) {
			save = mytext.getText();
			try
			{
				writedata(save);
			}
			catch (IOException e1)
			{
				e1.printStackTrace();
			} 
		}
		else if (e.getSource() == button_recall) {
			try 
			{
				recall = readdata();
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
			mytext.setText(recall);
		}

		else if (e.getSource() == mybutton1) {
			String EnterNumber = mytext.getText() + mybutton1.getText();
			mytext.setText(EnterNumber);
		}
		else if (e.getSource() == mybutton2) {
			String EnterNumber = mytext.getText() + mybutton2.getText();
			mytext.setText(EnterNumber);
		}
		else if (e.getSource() == mybutton3) {
			String EnterNumber = mytext.getText() + mybutton3.getText();
			mytext.setText(EnterNumber);
		}
		else if (e.getSource() == mybutton4) {
			String EnterNumber = mytext.getText() + mybutton4.getText();
			mytext.setText(EnterNumber);
		}
		else if (e.getSource() == mybutton5) {
			String EnterNumber = mytext.getText() +mybutton5.getText();
			mytext.setText(EnterNumber);
		}
		else if (e.getSource() == mybutton6) {
			String EnterNumber = mytext.getText() + mybutton6.getText();
			mytext.setText(EnterNumber);
		}
		else if (e.getSource() == mybutton7) {
			String EnterNumber = mytext.getText() + mybutton7.getText();
			mytext.setText(EnterNumber);
		}
		else if (e.getSource() == mybutton8) {
			String EnterNumber = mytext.getText() + mybutton8.getText();
			mytext.setText(EnterNumber);
		}
		else if (e.getSource() == mybutton9) {
			String EnterNumber = mytext.getText() + mybutton9.getText();
			mytext.setText(EnterNumber);
		}
		else if (e.getSource() == mybutton0) {
			String EnterNumber = mytext.getText() + mybutton0.getText();
			mytext.setText(EnterNumber);
		}
		else if (e.getSource() == button_c) {
			mytext.setText(null);
		}
		else if (e.getSource() == button_plus) {
			firstnumber = Double.parseDouble(mytext.getText());
			mytext.setText();
			operations = '+';

		}
		else if (e.getSource() == button_minus) {
			firstnumber = Double.parseDouble(mytext.getText());
			mytext.setText();
			operations = '-';
		}
		else if (e.getSource() == button_multiplication) {
			firstnumber = Double.parseDouble(mytext.getText());
			mytext.setText();
			operations = '';
		}
		else if (e.getSource() == button_division) {
			firstnumber = Double.parseDouble(mytext.getText());
			mytext.setText();
			operations = '';
		}
	}
	
	public static void main(String[] args) throws IOException {



		JFrame myframe = new myframe();
		myframe.setTitle(Calculator);
		myframe.setSize(200,500);
		myframe.setLocation(200,250);
		myframe.setVisible(true);
		myframe.setBounds(800, 350, 255, 450);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
    


}