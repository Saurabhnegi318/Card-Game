package SwingsAdvance;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Game  implements ActionListener
{    
	int n,ran,attack,heal,flag;
	 public void defaultt()
     {
		 w1.setEnabled(false);
	     w2.setEnabled(false);
	     w3.setEnabled(false);
	     w4.setEnabled(false);
	     w5.setEnabled(false);
	     w6.setEnabled(false);
	     w7.setEnabled(false);
	     w8.setEnabled(false);
     }
	
	 JButton toss;
	 JPanel p1=new JPanel();
	 JPanel p2=new JPanel();
	 JPanel p3=new JPanel();
	 JLabel player_1,player_2,player_11,player_22,h1,h2,h3,h4,h5,h6,h7,h8,po1,po2,po3,po4,po5,po6,po7,po8,result;
	 JLabel hl1,hl2,hl3,hl4,hl5,hl6,hl7,hl8,pow1,pow2,pow3,pow4,pow5,pow6,pow7,pow8,potion,potion_power,no1,no2,no3,roll;
	 JLabel random,turn;
	 JButton w1,w2,w3,w4,w5,w6,w7,w8,dice;
	 
	 public Game()
	 {
	   
		 JFrame f=new JFrame();
		 f.add(p1);
		 f.add(p2);
		 f.add(p3);
		 f.setSize(1200,800);
		 f.setResizable(false);
		 p1.setSize(1200,800);
		 p2.setSize(1200,800);
		 p3.setSize(1200,800);
		 
		 f.setLayout(null);
		 p1.setLayout(null);
		 p2.setLayout(null);
		 p3.setLayout(null);
		
		
		 player_1=new JLabel("Player 1");
		 player_1.setBounds(320,100,600,200);
		 player_1.setFont(new Font("Arcade Normal",Font.BOLD,60));
		 player_1.setForeground(Color.RED);
		 player_2=new JLabel("Player 2");
		 player_2.setBounds(320,500,600,200);
		 player_2.setFont(new Font("Arcade Normal",Font.BOLD,60));
		
		 p1.add(player_1);
		 p1.add(player_2);
		 ImageIcon icon = new ImageIcon("gameimg/img/toss.png"); 
	    toss=new JButton(icon); 
	    toss.setBounds(450,300,200,200);
	    toss.setContentAreaFilled(false);
	    p1.add(toss);
		
	    
	     toss.addActionListener(this);
	     
	     
	     player_11=new JLabel("Player 1");
	     player_22=new JLabel("Player 2");
	     player_11.setBounds(20,100,200,100);
	     player_11.setForeground(Color.RED);
	     player_22.setBounds(20,550,200,100);
	     player_11.setFont(new Font("Arcade Normal",Font.BOLD,20));
	     player_22.setFont(new Font("Arcade Normal",Font.BOLD,20));
	     p2.add(player_11);
	     p2.add(player_22);
	     
	     ImageIcon icon1 = new ImageIcon("gameimg/img/1.png"); 
	 	Image scaleImage = icon1.getImage().getScaledInstance(170,170,Image.SCALE_DEFAULT);
	 	 icon1 = new ImageIcon(scaleImage); 
	     w1= new JButton(icon1);
	     w5=new JButton(icon1);
	     
	     w1.setBounds(240,70,170,170);
	     w5.setBounds(240,520,170,170);
	     p2.add(w1);
	     p2.add(w5);
	     
	     
	     
	     ImageIcon icon2= new ImageIcon("gameimg/img/2.png"); 
	 	 scaleImage = icon2.getImage().getScaledInstance(170,170,Image.SCALE_DEFAULT);
	 	 icon2 = new ImageIcon(scaleImage); 
	     w2= new JButton(icon2);
	     w2.setBounds(480,70,170,170);
	     w6= new JButton(icon2);
	     w6.setBounds(480,520,170,170);
	     p2.add(w2);
	     p2.add(w6);
	     
	     ImageIcon icon3= new ImageIcon("gameimg/img/3.png"); 
	 	 scaleImage = icon3.getImage().getScaledInstance(170,170,Image.SCALE_DEFAULT);
	 	 icon3 = new ImageIcon(scaleImage); 
	     w3= new JButton(icon3);
	     w3.setBounds(720,70,170,170);
	     p2.add(w3);
	     
	     w7= new JButton(icon3);
	     w7.setBounds(720,520,170,170);
	     p2.add(w7);
	     
	     ImageIcon icon4= new ImageIcon("gameimg/img/4.png"); 
	 	 scaleImage = icon4.getImage().getScaledInstance(170,170,Image.SCALE_DEFAULT);
	 	 icon4 = new ImageIcon(scaleImage); 
	     w4= new JButton(icon4);
	     w4.setBounds(960,70,170,170);
	     p2.add(w4);
	     
	     w8= new JButton(icon4);
	     w8.setBounds(960,520,170,170);
	     p2.add(w8);
	     
	    w1.addActionListener(this);
	    w2.addActionListener(this);
	    w3.addActionListener(this);
	    w4.addActionListener(this);
	    w5.addActionListener(this);
	    w6.addActionListener(this);
	    w7.addActionListener(this);
	    w8.addActionListener(this);
	    
	     
	     
	     ImageIcon icon5= new ImageIcon("gameimg/img/h.png"); 
	 	 scaleImage = icon5.getImage().getScaledInstance(250,40,Image.SCALE_DEFAULT);
	 	 icon5 = new ImageIcon(scaleImage); 
	     h1= new JLabel(icon5);
	     h2= new JLabel(icon5);
	     h3= new JLabel(icon5);
	     h4= new JLabel(icon5);
	     h5= new JLabel(icon5);
	     h6= new JLabel(icon5);
	     h7= new JLabel(icon5);
	     h8= new JLabel(icon5);
	     h1.setBounds(190,160,250,200);
	     h2.setBounds(430,160,250,200);
	     h3.setBounds(670,160,250,200);
	     h4.setBounds(910,160,250,200);
	     h5.setBounds(190,610,250,200);
	     h6.setBounds(430,610,250,200);
	     h7.setBounds(670,610,250,200);
	     h8.setBounds(910,610,250,200);
	     p2.add(h1);
	     p2.add(h2);
	     p2.add(h3);
	     p2.add(h4);
	     p2.add(h5);
	     p2.add(h6);
	     p2.add(h7);
	     p2.add(h8);
	     
	     
	     ImageIcon icon6= new ImageIcon("gameimg/img/po.png"); 
	 	 scaleImage = icon6.getImage().getScaledInstance(160,20,Image.SCALE_DEFAULT);
	 	 icon6 = new ImageIcon(scaleImage); 
	     po1= new JLabel(icon6);
	     po2= new JLabel(icon6);
	     po3= new JLabel(icon6);
	     po4= new JLabel(icon6);
	     po5= new JLabel(icon6);
	     po6= new JLabel(icon6);
	     po7= new JLabel(icon6);
	     po8= new JLabel(icon6);
	     po1.setBounds(190,180,250,200);
	     po2.setBounds(430,180,250,200);
	     po3.setBounds(670,180,250,200);
	     po4.setBounds(910,180,250,200);
	     po5.setBounds(190,630,250,200);
	     po6.setBounds(430,630,250,200);
	     po7.setBounds(670,630,250,200);
	     po8.setBounds(910,630,250,200);
	     p2.add(po1);
	     p2.add(po2);
	     p2.add(po3);
	     p2.add(po4);
	     p2.add(po5);
	     p2.add(po6);
	     p2.add(po7);
	     p2.add(po8);
	     
	     
	     
	     hl1=new JLabel("100");
	     hl1.setBounds(390,160,300,200);
	     hl1.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     hl2=new JLabel("100");
	     hl2.setBounds(630,160,300,200);
	     hl2.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     hl3=new JLabel("100");
	     hl3.setBounds(870,160,300,200);
	     hl3.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     hl4=new JLabel("100");
	     hl4.setBounds(1110,160,300,200);
	     hl4.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     
	     hl5=new JLabel("100");
	     hl5.setBounds(390,610,300,200);
	     hl5.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     
	     
	     hl6=new JLabel("100");
	     hl6.setBounds(630,610,300,200);
	     hl6.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     
	     hl7=new JLabel("100");
	     hl7.setBounds(870,610,300,200);
	     hl7.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     
	     hl8=new JLabel("100");
	     hl8.setBounds(1110,610,300,200);
	     hl8.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     
	     p2.add(hl1);
	     p2.add(hl2);
	     p2.add(hl3);
	     p2.add(hl4);
	     p2.add(hl5);
	     p2.add(hl6);
	     p2.add(hl7);
	     p2.add(hl8);
	     
	     
	     
	     pow1=new JLabel("10");
	     pow1.setBounds(390,180,300,200);
	     pow1.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     pow2=new JLabel("25");
	     pow2.setBounds(630,180,300,200);
	     pow2.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     pow3=new JLabel("35");
	     pow3.setBounds(870,180,300,200);
	     pow3.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     pow4=new JLabel("50");
	     pow4.setBounds(1110,180,300,200);
	     pow4.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     
	     pow5=new JLabel("10");
	     pow5.setBounds(390,630,300,200);
	     pow5.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     
	     
	     pow6=new JLabel("25");
	     pow6.setBounds(630,630,300,200);
	     pow6.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     
	     pow7=new JLabel("35");
	     pow7.setBounds(870,630,300,200);
	     pow7.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     
	     pow8=new JLabel("50");
	     pow8.setBounds(1110,630,300,200);
	     pow8.setFont(new Font("Arcade Normal",Font.BOLD,15));
	     
	     
	     p2.add(pow1);
	     p2.add(pow2);
	     p2.add(pow3);
	     p2.add(pow4);
	     p2.add(pow5);
	     p2.add(pow6);
	     p2.add(pow7);
	     p2.add(pow8);
	     
	     ImageIcon icon7= new ImageIcon("gameimg/img/potion.png"); 
	 	 scaleImage = icon7.getImage().getScaledInstance(170,170,Image.SCALE_DEFAULT);
	 	 icon7 = new ImageIcon(scaleImage); 
	     potion=new JLabel(icon7);
	     potion.setBounds(920,300,230,200);
	     p2.add(potion);
	     potion_power =new JLabel("POTION 20");
	     potion_power.setBounds(1040,250,300,200);
	     potion_power.setForeground(Color.RED);
	     potion_power.setFont(new Font("Arcade Normal",Font.BOLD,12));
	     p2.add(potion_power);
	     
	     no1 =new JLabel("1          2          3           4");
	     no1.setBounds(320,40,1000,20);
	     no1.setForeground(Color.GREEN);
	     no1.setFont(new Font("Arcade Normal",Font.BOLD,20));
	     
	     p2.add(no1);
	     
	     no2 =new JLabel("1          2          3           4");
	     no2.setBounds(320,490,1000,20);
	     no2.setForeground(Color.GREEN);
	     no2.setFont(new Font("Arcade Normal",Font.BOLD,20));
	     
	     p2.add(no2);
	    
	     no3 =new JLabel("6");
	     no3.setBounds(1060,305,40,40);
	     no3.setForeground(Color.GREEN);
	     no3.setFont(new Font("Arcade Normal",Font.BOLD,20));
	     
	   p2.add(no3);
	    
	     
	     
	     
	     
	     
	     ImageIcon icon8= new ImageIcon("gameimg/img/dice.gif"); 
	 	 scaleImage = icon8.getImage().getScaledInstance(130,130,Image.SCALE_DEFAULT);
	 	 icon8 = new ImageIcon(scaleImage); 
	     dice=new JButton(icon8);
	     dice.setBounds(30,350,140,140);
	   
	  
	    
	     p2.add(dice);
	  
	     
	     roll =new JLabel("ROLL!!");
	     roll.setBounds(45,305,300,40);
	     roll.setForeground(Color.BLUE);
	     roll.setFont(new Font("Arcade Normal",Font.BOLD,25));
	     
	     p2.add(roll);
	     
	     random =new JLabel();
	     random.setBounds(230,315,200,200);
	     random.setForeground(Color.CYAN);
	     random.setFont(new Font("Arcade Normal",Font.CENTER_BASELINE,110));
	     
	     
	     p2.add(random);
	     
	     turn =new JLabel();
	     turn.setBounds(390,360,800,100);
	     turn.setForeground(Color.BLUE);
	     turn.setFont(new Font("Arcade Normal",Font.BOLD,32));
	     p2.add(turn);
	     
	   defaultt();
	   
	     dice.addActionListener(this);
	   
	     
	    result=new JLabel("Player 1 Wins!");
	    result.setFont(new Font("Arcade Normal",Font.BOLD,55));
	    result.setBounds(230,280,1000,200);
	    p3.add(result);
	     
	     
	     
	     
	     
	     
	       p1.setVisible(true);	
	       p2.setVisible(false);
	       p3.setVisible(false);
			f.getContentPane().setBackground(Color.LIGHT_GRAY);
			f.setVisible(true);
			
			
			
			
			
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			
			
			
			
			
			
			
			
			
			
	
			
			
			
	 }    
	 public void actionPerformed(ActionEvent e)
		{
	    if(e.getSource()==toss)
	       {
	    	   n=(int)((Math.random()* ((2 - 1) + 1)) + 1);
	    	   p1.setVisible(false);
	    	   p2.setVisible(true);
	    	   if(n==1)
	    		   turn.setText("Player 1 Roll!!");
	    	   else
	    		   turn.setText("Player 2 Roll !!");
	    	
	    	 
	    		
	       }
	       
	     else if(e.getSource()==dice)
	       {
	    	   ran=(int)((Math.random()*((6-1)+1))+1);
	    	   random.setText(Integer.toString(ran));
	    	 
	    	   if(n==1)
	    	 {
	    		  
		  		   
	    		   if(ran>0&&ran<5)
	    	 {
	    		 if(ran==1)
	 	    	    attack=Integer.parseInt(pow1.getText());
	 	    	   else if(ran==2)
	 	    	    attack=Integer.parseInt(pow2.getText());
	 	    	   
	 	    	   else if(ran==3)   
	 	    		   attack=Integer.parseInt(pow3.getText());
	 	    	   else if(ran==4)   
	 	    		   attack=Integer.parseInt(pow4.getText());
	    		 
		    	
	  		 //turn.setText(Integer.toString(attack));
	    		 if(Integer.parseInt(hl5.getText())>0)
	  		   w5.setEnabled(true);
	    		 if(Integer.parseInt(hl6.getText())>0)
	  		   w6.setEnabled(true);
	    		 if(Integer.parseInt(hl7.getText())>0)
	  		   w7.setEnabled(true);
	    		 if(Integer.parseInt(hl8.getText())>0)
	  		   w8.setEnabled(true);
	  		   
	    	 }
	    	 
	    	     
	 	    	   
	 	    	 else if(ran==5)
	 	    	 {
	 	    	 turn.setText("Player 2 Roll!!");
	 	    	 n=2;
	 	    	 }
	   	 else if(ran==6)
	    		//dice.setEnabled(false);
	   		 {	   if(Integer.parseInt(hl1.getText())>0)
	   		       w1.setEnabled(true);
	   		if(Integer.parseInt(hl2.getText())>0)
		  		   w2.setEnabled(true);
	   		if(Integer.parseInt(hl3.getText())>0)
		  		   w3.setEnabled(true);
	   		if(Integer.parseInt(hl4.getText())>0)
		  		   w4.setEnabled(true);
		
	   	 }
	    		   if(ran!=5)
	    		   dice.setEnabled(false);
	   	 }
	       
	    	   else if(n==2)
	    	 {  
	    		   if(ran>0&&ran<5)
	  	    	 {
	    			   
	  	    	 
	    	   if(ran==1)
	    	    attack=Integer.parseInt(pow5.getText());
	    	   else if(ran==2)
	    	    attack=Integer.parseInt(pow6.getText());
	    	   
	    	   else if(ran==3)   
	    		   attack=Integer.parseInt(pow7.getText());
	    	   else if(ran==4)   
	    		   attack=Integer.parseInt(pow8.getText());
	    	   
	    	   if(Integer.parseInt(hl1.getText())>0)
	    	   w1.setEnabled(true);
	    	   if(Integer.parseInt(hl2.getText())>0)
	  		   w2.setEnabled(true);
	    	   if(Integer.parseInt(hl3.getText())>0)
	  		   w3.setEnabled(true);
	    	   if(Integer.parseInt(hl4.getText())>0)
	  		   w4.setEnabled(true);
	  		  
	  		   //turn.setText(Integer.toString(attack));
	  	    	 }
	    	   
	    	 else if(ran==5)
	    	 {
	    	 turn.setText("Player 1 Roll!!");
	    	 n=1;
	    	 }
	    	 else if(ran==6)
	    	 {
	    		 if(Integer.parseInt(hl5.getText())>0)
		  		   w5.setEnabled(true);
	    		 if(Integer.parseInt(hl6.getText())>0)
		  		   w6.setEnabled(true);
	    		 if(Integer.parseInt(hl7.getText())>0)
		  		   w7.setEnabled(true);	
	    		 if(Integer.parseInt(hl8.getText())>0)
		  		   w8.setEnabled(true);
	    		 //dice.setEnabled(false);
	    	 
	    	 }
	    		   if(ran!=5)
	    		   dice.setEnabled(false);
		}
	    	
	    	   }
	       
	      else if(e.getSource()==w1)
	       { 
	    	   if(n==1)
	    	   {
	    		   if(ran==6)
	    		   {
	    			   hl1.setText(Integer.toString(Integer.parseInt(hl1.getText())+20));
	    			   defaultt(); 
	    			   dice.setEnabled(true);
	    		   }
	    	   }
	    	   
	    	   else if(n==2)
	    	   {
	    		   if(ran!=6)
	    		   {   
	    			   if((Integer.parseInt(hl1.getText())-attack)<0)
	    			   { hl1.setText("0");
	    			   if((Integer.parseInt(hl1.getText())==0)&&(Integer.parseInt(hl2.getText())==0)&&(Integer.parseInt(hl3.getText())==0)&&(Integer.parseInt(hl4.getText())==0))
		    		   {result.setText("Player 2 Wins !");
		    		    p2.setVisible(false);
		    		    p3.setVisible(true);
		    		   }
	    			   }
	    			   else
	    			   hl1.setText(Integer.toString(Integer.parseInt(hl1.getText())-attack));
	    			   turn.setText("Player 1 Roll!!");
		  	 	    	 n=1;  
		  	 	    	 defaultt();
		  	 	    	 dice.setEnabled(true);
		  	 	    	 }
	    	   }
	    	   
	       }
	      else if(e.getSource()==w2)
		       { 
		    	   if(n==1)
		    	   {
		    		   if(ran==6)
		    		   {
		    			   hl2.setText(Integer.toString(Integer.parseInt(hl2.getText())+20));
		    			   
		    			   defaultt();
		    			   dice.setEnabled(true);
		    			   }
		    	   }
		    	   
		    	   else if(n==2)
		    	   {
		    		   if(ran!=6)
		    		   {  
		    			   if((Integer.parseInt(hl2.getText())-attack)<0)
		    			   {	   hl2.setText("0");
		    			   if((Integer.parseInt(hl1.getText())==0)&&(Integer.parseInt(hl2.getText())==0)&&(Integer.parseInt(hl3.getText())==0)&&(Integer.parseInt(hl4.getText())==0))
			    		   {result.setText("Player 2 Wins !");
			    		    p2.setVisible(false);
			    		    p3.setVisible(true);
			    		   }
		    			   }
		    			   else
		    			   hl2.setText(Integer.toString(Integer.parseInt(hl2.getText())-attack));
		    			   turn.setText("Player 1 Roll!!");
			  	 	    	 n=1;  
			  	 	    	defaultt();
			  	 	     dice.setEnabled(true);
			  	 	    	}
		    	   }
		    
		    	   
		       }
	    
	      else if(e.getSource()==w3)
	       { 
	    	   if(n==1)
	    	   {
	    		   if(ran==6)
	    		   {
	    			   hl3.setText(Integer.toString(Integer.parseInt(hl3.getText())+20));
	    			   defaultt();
	    			   dice.setEnabled(true);
	    		   }
	    	   }
	    	   
	    	   else if(n==2)
	    	   {
	    		   if(ran!=6)
	    		   {  if((Integer.parseInt(hl3.getText())-attack)<0)
    				   {hl3.setText("0");
	    		   if((Integer.parseInt(hl1.getText())==0)&&(Integer.parseInt(hl2.getText())==0)&&(Integer.parseInt(hl3.getText())==0)&&(Integer.parseInt(hl4.getText())==0))
	    		   {result.setText("Player 2 Wins !");
	    		    p2.setVisible(false);
	    		    p3.setVisible(true);
	    		   }
    				   }
    			   else
	    			   hl3.setText(Integer.toString(Integer.parseInt(hl3.getText())-attack));
	    			   turn.setText("Player 1 Roll!!");
		  	 	    	 n=1;
		  	 	    	 
		  	 	    	defaultt();
		  	 	     dice.setEnabled(true);
	    		   }
	    	   }
	    
	    	   
	       }
	    
	      else if(e.getSource()==w4)
	       { 
	    	   if(n==1)
	    	   {
	    		   if(ran==6)
	    		   {   
	    			   
	    			   hl4.setText(Integer.toString(Integer.parseInt(hl4.getText())+20));
	    			   defaultt();   
	    			   dice.setEnabled(true);
	    		   }
	    	   }
	    	   
	    	   else if(n==2)
	    	   {
	    		   if(ran!=6)
	    		   {  if((Integer.parseInt(hl4.getText())-attack)<0)
	    		   { hl4.setText("0");
	    		   if((Integer.parseInt(hl1.getText())==0)&&(Integer.parseInt(hl2.getText())==0)&&(Integer.parseInt(hl3.getText())==0)&&(Integer.parseInt(hl4.getText())==0))
	    		   {result.setText("Player 2 Wins !");
	    		    p2.setVisible(false);
	    		    p3.setVisible(true);
	    		   }
	    		   }
    			   else
	    			   hl4.setText(Integer.toString(Integer.parseInt(hl4.getText())-attack));
	    			   turn.setText("Player 1 Roll!!");
		  	 	    	 n=1;
		  	 	    	defaultt();   
		  	 	     dice.setEnabled(true);
	    		   }
	    	   }
	    
	    	   
	       }
	    
	      else if(e.getSource()==w5)
	       { 
	    	   if(n==2)
	    	   {
	    		   if(ran==6)
	    		   {
	    			   hl5.setText(Integer.toString(Integer.parseInt(hl5.getText())+20));
	    			   defaultt();   
	    			   dice.setEnabled(true);
	    		   }
	    	   }
	    	   
	    	   else if(n==1)
	    	   {
	    		   if(ran!=6)
	    		   {       if((Integer.parseInt(hl5.getText())-attack)<0)
	    		   {   hl5.setText("0");
	    		   if((Integer.parseInt(hl5.getText())==0)&&(Integer.parseInt(hl6.getText())==0)&&(Integer.parseInt(hl7.getText())==0)&&(Integer.parseInt(hl8.getText())==0))
	    		   {result.setText("Player 1 Wins !");
	    		    p2.setVisible(false);
	    		    p3.setVisible(true);
	    		   }
	    		   }
    			   else
	    			   hl5.setText(Integer.toString(Integer.parseInt(hl5.getText())-attack));
	    			   turn.setText("Player 2 Roll!!");
	  	 	    	 n=2;
	  	 	    	defaultt();
	  	 	     dice.setEnabled(true);
	    			   }
	    	   }
	    
	    	   
	       }
	    
	      else if(e.getSource()==w6)
	       { 
	    	   if(n==2)
	    	   {
	    		   if(ran==6)
	    		   {
	    			   hl6.setText(Integer.toString(Integer.parseInt(hl6.getText())+20));
	    			   defaultt();   
	    			   dice.setEnabled(true);
	    		   }
	    	   }
	    	   
	    	   else if(n==1)
	    	   {
	    		   if(ran!=6)
	    		   {   if((Integer.parseInt(hl6.getText())-attack)<0)
	    		   {  hl6.setText("0");
	    		   if((Integer.parseInt(hl5.getText())==0)&&(Integer.parseInt(hl6.getText())==0)&&(Integer.parseInt(hl7.getText())==0)&&(Integer.parseInt(hl8.getText())==0))
	    		   { result.setText("Player 1 Wins !");
	    		    p2.setVisible(false);
	    		    p3.setVisible(true);
	    		   }
	    		   }
    			   else
	    			   hl6.setText(Integer.toString(Integer.parseInt(hl6.getText())-attack));
	    			   turn.setText("Player 2 Roll!!");
		  	 	    	 n=2;
		  	 	    	defaultt();
		  	 	     dice.setEnabled(true);
	    			   }
	    	   }
	    
	    	   
	       }
	    
	      else if(e.getSource()==w7)
	       { 
	    	   if(n==2)
	    	   {
	    		   if(ran==6)
	    		   {
	    			   hl7.setText(Integer.toString(Integer.parseInt(hl7.getText())+20));
	    			   defaultt();   
	    			   dice.setEnabled(true);
	    		   }
	    	   }
	    	   
	    	   else if(n==1)
	    	   {
	    		   if(ran!=6)
	    		   {if((Integer.parseInt(hl7.getText())-attack)<0)
	    		   {   hl7.setText("0");
	    		   if((Integer.parseInt(hl5.getText())==0)&&(Integer.parseInt(hl6.getText())==0)&&(Integer.parseInt(hl7.getText())==0)&&(Integer.parseInt(hl8.getText())==0))
                     { result.setText("Player 1 Wins !");
                       p2.setVisible(false);
                      p3.setVisible(true);
                       }
	    		   }
    			   else
	    			   hl7.setText(Integer.toString(Integer.parseInt(hl7.getText())-attack));
	    			   turn.setText("Player 2 Roll!!");
		  	 	    	 n=2;
		  	 	    	defaultt();
		  	 	     dice.setEnabled(true);
	    			   }
	    	   }
	    
	    	   
	       }
	    
	      else if(e.getSource()==w8)
	       { 
	    	   if(n==2)
	    	   {
	    		   if(ran==6)
	    		   {
	    			   hl8.setText(Integer.toString(Integer.parseInt(hl8.getText())+20));
	    			   defaultt();   
	    			   dice.setEnabled(true);
	    		   }
	    	   }
	    	   
	    	   else if(n==1)
	    	   {
	    		   if(ran!=6)
	    		   {  if((Integer.parseInt(hl8.getText())-attack)<0)
	    		   { hl8.setText("0");
	    		   if((Integer.parseInt(hl5.getText())==0)&&(Integer.parseInt(hl6.getText())==0)&&(Integer.parseInt(hl7.getText())==0)&&(Integer.parseInt(hl8.getText())==0))
	    		   {result.setText("Player 1 Wins !");
	    		    p2.setVisible(false);
	    		    p3.setVisible(true);
	    		   }
	    		   }
    			   else
	    			   hl8.setText(Integer.toString(Integer.parseInt(hl8.getText())-attack));
	    			   turn.setText("Player 2 Roll!!");
		  	 	    	 n=2;
		  	 	    	defaultt();
		  	 	     dice.setEnabled(true);
	    		   }
	    		   
	    	   }
	    
	    	   
	       }
	    	   }
	    
	//    if(e.getSource()==w2)
	  //  	turn.setText("asdasd");
		
		
	       
	     
		 public static void main(String[] args) 
		    {	
		       new Game();
		    }
	
}