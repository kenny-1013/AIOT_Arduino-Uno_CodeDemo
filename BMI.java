import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //ActionEvent類別

public class BMI extends JFrame{
	//加入field 欄位
	JLabel labelH=new JLabel("身高:");
	JLabel labelW=new JLabel("體重:");
	JLabel labelBMI=new JLabel("BMI值");
	JTextField inputH=new JTextField(10); //身高輸入 10表示10個空格
	JTextField inputW=new JTextField(10); //體重輸入 10表示10個空格
	JButton btn=new JButton("計算");
	String title;
	public BMI(String title){
		//super(title);
		this.setTitle(title);
		
		init();
	}
	void init(){  //在此設計畫面 
		this.setSize(350,300);
		this.setLocation(100,200);
		Container content=this.getContentPane(); 
		content.setLayout(new FlowLayout( FlowLayout.LEFT ));
		this.add(labelH);
		this.add(inputH);
		this.add(labelW);
		this.add(inputW);
		this.add(btn);
		this.add(labelBMI);
		//btn.addActionListener(  );
		//btn.addActionListener( new ActionListener() {  }  );
		//btn.addActionListener( new ActionListener() {  void xxx(){xxx}  }  );
		btn.addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e){
					//xxx 事件的程式碼
					String str1=inputH.getText();
					String str2=inputW.getText();
					double h=Double.parseDouble(str1);
					double w=Double.parseDouble(str2);
					double h1=h/100.0;
					double bmi=w/(h1*h1);
					labelBMI.setText("BMI值="+bmi);
					
				}
		}   ); 
		
	}
	void method1(){

	}

	public static void main(String [] args){
		BMI obj1=new BMI("計算bmi");
		obj1.setVisible(true);
	}
}