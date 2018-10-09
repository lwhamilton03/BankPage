import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankPage {

	public void createBankPage()
	{
		Frame F = new Frame("home"); 
		F.setVisible(true);
		F.setSize(600,600);
		
		Panel homePage = new Panel(); 
		GridLayout grid = new GridLayout(3,1);
		homePage.setLayout(grid);
		F.add(homePage, BorderLayout.CENTER); 
		
		Button createAccount = new Button ("Create Account");
		createAccount.setBackground(Color.BLUE);
		Button depositeMoney = new Button("Deposite Money");
		depositeMoney.setBackground(Color.green);
		Button withdrawMoeny = new Button("Withdraw"); 
		withdrawMoeny.setBackground(Color.PINK); 
		
		homePage.add(createAccount);
		homePage.add(depositeMoney);
		homePage.add(withdrawMoeny);
		
		createAccount.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						Frame A = new Frame("createAccount");
						A.setVisible(true);
						A.setSize(600, 600);
						
						Panel acc = new Panel();
						GridLayout gri = new GridLayout(3,2);
						acc.setLayout(gri);
						A.add(acc, BorderLayout.CENTER);
						
						Label name = new Label("Name: "); 
						name.setBackground(Color.CYAN);
						acc.add(name);
						
						TextField nom = new TextField();
						nom.setBackground(Color.CYAN);
						acc.add(nom);
						
						Label address = new Label("Address: ");
						address.setBackground(Color.YELLOW);
						acc.add(address); 
						
						TextField add = new TextField(); 
						add.setBackground(Color.YELLOW);
						acc.add(add); 
						
						Label account = new Label("Account No: "); 
						account.setBackground(Color.RED);
						acc.add(account);
						
						TextField retu = new TextField();
						retu.setBackground(Color.RED);
						acc.add(retu);
						
						Button butt = new Button("SUBMIT");
						butt.setBackground(Color.ORANGE);
						A.add(butt, BorderLayout.SOUTH);
						
					}
				});
	
		depositeMoney.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Frame A = new Frame("depositAccount");
				A.setVisible(true);
				A.setSize(600, 600);
				
				Panel p = new Panel(); 
				FlowLayout flow = new FlowLayout(); 
				p.setBackground(Color.MAGENTA);
				p.setLayout(flow);
				
				
				Label accountN = new Label("Enter Account No: "); 
				p.add(accountN);
				
				TextField input = new TextField();
				p.add(input);
				
				Button submit = new Button("Submit AcNo");
				p.add(submit);
				
				A.add(p, BorderLayout.NORTH);
				
				Panel acc = new Panel();
				GridLayout gri = new GridLayout(4,2);
				acc.setLayout(gri);
				A.add(acc, BorderLayout.CENTER);
				
				Label name = new Label("Name: "); 
				name.setBackground(Color.CYAN);
				acc.add(name);
				
				TextField nom = new TextField();
				nom.setBackground(Color.CYAN);
				acc.add(nom);
				
				Label address = new Label("Address: ");
				address.setBackground(Color.YELLOW);
				acc.add(address); 
				
				TextField add = new TextField(); 
				add.setBackground(Color.YELLOW);
				acc.add(add); 
				
				Label account = new Label("Balance: "); 
				account.setBackground(Color.blue);
				acc.add(account);
				
				TextField retu = new TextField();
				retu.setBackground(Color.RED);
				acc.add(retu);
				
				Label ac = new Label("Enter Deposit Amount: "); 
				ac.setBackground(Color.pink);
				acc.add(ac);
				
				TextField re = new TextField();
				re.setBackground(Color.pink);
				acc.add(re);
				
				Button butt = new Button("DEPOSIT");
				butt.setBackground(Color.ORANGE);
				A.add(butt, BorderLayout.SOUTH);
			}
		});
		
	
	withdrawMoeny.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent event)
		{
			Frame A = new Frame("depositAccount");
			A.setVisible(true);
			A.setSize(600, 600);
			
			Panel p = new Panel(); 
			FlowLayout flow = new FlowLayout(); 
			p.setBackground(Color.MAGENTA);
			p.setLayout(flow);
			
			
			Label accountN = new Label("Enter Account No: "); 
			p.add(accountN);
			
			TextField input = new TextField();
			p.add(input);
			
			Button submit = new Button("Submit AcNo");
			p.add(submit);
			
			A.add(p, BorderLayout.NORTH);
			
			Panel acc = new Panel();
			GridLayout gri = new GridLayout(4,2);
			acc.setLayout(gri);
			A.add(acc, BorderLayout.CENTER);
			
			Label name = new Label("Name: "); 
			name.setBackground(Color.CYAN);
			acc.add(name);
			
			TextField nom = new TextField();
			nom.setBackground(Color.CYAN);
			acc.add(nom);
			
			Label address = new Label("Address: ");
			address.setBackground(Color.YELLOW);
			acc.add(address); 
			
			TextField add = new TextField(); 
			add.setBackground(Color.YELLOW);
			acc.add(add); 
			
			Label account = new Label("Balance: "); 
			account.setBackground(Color.blue);
			acc.add(account);
			
			TextField retu = new TextField();
			retu.setBackground(Color.blue);
			acc.add(retu);
			
			Label ac = new Label("Enter Amount To Withdraw: "); 
			ac.setBackground(Color.pink);
			acc.add(ac);
			
			TextField re = new TextField();
			re.setBackground(Color.pink);
			acc.add(re);
			
			Button butt = new Button("DEPOSIT");
			butt.setBackground(Color.ORANGE);
			A.add(butt, BorderLayout.SOUTH);
		}
	});
	}
	
}
