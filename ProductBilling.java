import java.awt.*;
import java.awt.event.*;
import java.applet.*;
<applet code=ProductBilling width=1500 height=500></applet>
public class ProductBilling extends Applet implements ActionListener
{
	int a,b=0,c=0,d=0,e=0,f=0,g,h=0,i=0,j=0,k=0,sum,sum2,sum3,r1=10000,r2=32000,r3=45000,r4=5000,r5=30000,p1=20,p2=20,p3=20,p4=20,p5=20,dp1,dp2,dp3,dp4,dp5,cpr1=6000,cpr2=25000,cpr3=40000,cpr4=2000,cpr5=20000,c1,c2,c3,c4,c5;
	int cmp1=0,cmp2=0,cmp3=0,cmp4=0,cmp5=0;
        int ab,bc,cd,de,ef,fg,gh,ij,jk,kl;
        String msg="",val="",q1,q2,q3,q4,q5,q6;
        String k1,k2,k3,k4,k5,z1,z2,z3,z4,z5;
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,R1,R2,R3,R4,R5,pass,avail,avail1,avail2,avail3,avail4,discount1,discount2,discount3,discount4,discount5,dis1,dis2,dis3,dis4,dis5,cr1,cr2,cr3,cr4,cr5,comission1,comission2,comission3,comission4,comission5,com1,com2,com3,com4,com5;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
	Label l1,l2,l3,l4,l5,Discount1,Discount2,Discount3,Discount4,Discount5,rate,rate1,rate2,rate3,rate4,quan,quan1,quan2,quan3,quan4,total,total1,total2,total3,total4,crrate1,crrate2,crrate3,crrate4,crrate5,cp1,cp2,cp3,cp4,cp5;
	Label av1,av2,av3,av4,av,Profits;
	TextArea text;
	int s1,s2,s3,s4,s5,s6;
        int dt1,dt2,dt3,dt4,dt5;
        int rc1,rc2,rc3,rc4,rc5,dc1,dc2,dc3,dc4,dc5,result1,result2,result3,result4,result5;
	public void init()
{
this.setLayout(null);
Label head=new  Label("----------------------PRODUCT BILL------------------------: ");
		
setLayout(new FlowLayout(FlowLayout.RIGHT));
Label passl = new Label("Password: ",Label.LEFT);
pass = new TextField(100);
pass.setEchoChar('*');

t1=new TextField(3);  //TextFields
t2=new TextField(3);
t3=new TextField(3);
t4=new TextField(3);
t5=new TextField(3);
t6=new TextField(3);
t7=new TextField(3);
t8=new TextField(3);
t9=new TextField(3);	
t10=new TextField(3);
t11=new TextField(10);
t12=new TextField(10);

cr1=new TextField(3); //TextFields
cr2=new TextField(3);  
cr3=new TextField(3);  
cr4=new TextField(3);  
cr5=new TextField(3);                
		
R1=new TextField(3);
R2=new TextField(3);
R3=new TextField(3);
R4=new TextField(3);
R5=new TextField(3);
		
avail=new TextField(3);  //TextFields
avail1=new TextField(3);
avail2=new TextField(3);
avail3=new TextField(3);
avail4=new TextField(3);
		
discount1 =new TextField(3); //TextFields
discount2 =new TextField(3);
discount3 =new TextField(3);
discount4 =new TextField(3);
discount5 =new TextField(3);

dis1 =new TextField(3); //TextFields
dis2 =new TextField(3);
dis3 =new TextField(3);
dis4 =new TextField(3);
dis5 =new TextField(3);

comission1=new TextField(3); //TextFields
comission2=new TextField(3);
comission3=new TextField(3);
comission4=new TextField(3);
comission5=new TextField(3);

com1=new TextField(3); //TextFields
com2=new TextField(3);
com3=new TextField(3);
com4=new TextField(3);
com5=new TextField(3);


b1=new Button("Submit"); //Buttons
b2=new Button("Submit"); 
b3=new Button("Submit");
b4=new Button("Submit");
b5=new Button("Submit");
b9=new Button("Submit");
b10=new Button("Submit");
b11=new Button("Submit");
b12=new Button("Submit");
b13=new Button("Submit");
b14=new Button("Submit");
b15=new Button("Submit");
b16=new Button("Submit");
b17=new Button("Submit");
b18=new Button("Submit");
b19=new Button("Submit");
b6=new Button("Total:");
b7=new Button("UPDATE");
b8=new Button("PROCEED");
		
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);


pass.addActionListener(this);


l1=new Label("Mi note 7 Plus");    //labels
l2=new Label("Mi 14 Laptop ");
l3=new Label("Samsung TV");
l4=new Label("Philips Air Dryer");
l5=new Label("Voltas AC");

Profits=new Label("Profit:");

crrate1=new Label("CP Rate"); //labels
crrate2=new Label("CP Rate");
crrate3=new Label("CP Rate");
crrate4=new Label("CP Rate");
crrate5=new Label("CP Rate");

rate=new Label("SPRate:");  //labels
rate1=new Label("SPRate:");
rate2=new Label("SPRate:");
rate3=new Label("SPRate:");
rate4=new Label("SPRate:");
		
                
quan=new Label("Quantity:");  //labels
quan1=new Label("Quantity:");
quan2=new Label("Quantity:");
quan3=new Label("Quantity:");
quan4=new Label("Quantity:");
		
                
av=new Label(" Available:"); //labels
av1=new Label("Available:");
av2=new Label("Available:");
av3=new Label("Available:");
av4=new Label("Available:");	
            
                
Discount1=new Label("Discount:"); //labels
Discount2=new Label("Discount:");
Discount3=new Label("Discount:");
Discount4=new Label("Discount:");
Discount5=new Label("Discount:");


cp1= new Label("Commission:");  //labels
cp2= new Label("Commission:");  
cp3= new Label("Commission:");
cp4= new Label("Commission:");
cp5= new Label("Commission:");
		
Font myFont = new Font("Serif",Font.BOLD,15);   //sets font
        
                head.setFont(myFont);	
	        head.setBackground(Color.orange);
		
                l1.setBackground(Color.gray);   //sets BackgroundColor
		l2.setBackground(Color.gray);
		l3.setBackground(Color.gray);
		l4.setBackground(Color.gray);
		l5.setBackground(Color.gray);
		
    
                 
                crrate1.setBackground(Color.blue);  //sets Background Color
                crrate2.setBackground(Color.blue);
                crrate3.setBackground(Color.blue);
                crrate4.setBackground(Color.blue);
                crrate5.setBackground(Color.blue);
              
                Profits.setBackground(Color.yellow);

                rate.setBackground(Color.cyan);  //sets Background Color
		rate1.setBackground(Color.cyan);
		rate2.setBackground(Color.cyan);
		rate3.setBackground(Color.cyan);
		rate4.setBackground(Color.cyan);
		
                av.setBackground(Color.gray);      //sets Background Color
		av1.setBackground(Color.gray);
		av2.setBackground(Color.gray);
		av3.setBackground(Color.gray);
		av4.setBackground(Color.gray);
		
                quan.setBackground(Color.gray);      //sets Background Color
		quan1.setBackground(Color.gray);
		quan2.setBackground(Color.gray);
		quan3.setBackground(Color.gray);
		quan4.setBackground(Color.gray);
                
                Discount1.setBackground(Color.cyan);  //sets Background Color
                Discount2.setBackground(Color.cyan);
                Discount3.setBackground(Color.cyan);
                Discount4.setBackground(Color.cyan);
                Discount5.setBackground(Color.cyan);

                cp1.setBackground(Color.red);   //sets Background Color
                cp2.setBackground(Color.red);
		cp3.setBackground(Color.red);
                cp4.setBackground(Color.red);
                cp5.setBackground(Color.red);

                passl.setBackground(Color.blue);
		
		Font myFont1 = new Font("Serif",Font.BOLD,12);  //sets font
	        l1.setFont(myFont1);
		l2.setFont(myFont1);
		l3.setFont(myFont1);
		l4.setFont(myFont1);
		l5.setFont(myFont1);
           
              
	       add(head);
		
               add(passl);

               add(pass);

add(l1);add(crrate1);add(cr1);add(rate);add(R1);add(av);add(avail);add(quan);add(t1);add(b1);add(t2);add(Discount1);add(discount1);add(b9);add(dis1);add(cp1);add(comission1);add(b14);add(com1);
add(l2);add(crrate2);add(cr2);add(rate1);add(R2);add(av1);add(avail1);add(quan1);add(t3);add(b2);add(t4);add(Discount2);add(discount2);add(b10);add(dis2);add(cp2);add(comission2);add(b15);add(com2);
add(l3);add(crrate3);add(cr3);add(rate2);add(R3);add(av2);add(avail2);add(quan2);add(t5);add(b3);add(t6);add(Discount3);add(discount3);add(b11);add(dis3);add(cp3);add(comission3);add(b16);add(com3);
add(l4);add(crrate4);add(cr4);add(rate3);add(R4);add(av3);add(avail3);add(quan3);add(t7);add(b4);add(t8);add(Discount4);add(discount4);add(b12);add(dis4);add(cp4);add(comission4);add(b17);add(com4);
add(l5);add(crrate5);add(cr5);add(rate4);add(R5);add(av4);add(avail4);add(quan4);add(t9);add(b5);add(t10);add(Discount5);add(discount5);add(b13);add(dis5);add(cp5);add(comission5);add(b18);add(com5);
		add(b8); add(b7); add(b6); add(t11);	
               
                  add(Profits);add(b19);add(t12);
	
	}
	public void actionPerformed(ActionEvent ae)
	{ 	
		String password=pass.getText();
		if((password).equals("sies"))
		{
		val="ADMINISTRATOR SIGN-IN";
		}
		else
		{
		val="SIGN-IN AS A GUEST USER";
		}
		if(ae.getSource()==b7)
		{
		if((password).equals("sies"))
		{
		String b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
		int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20;                           
		R1.setEditable(true);         //gets and sets rate                    
		b1=R1.getText();                                 
		a1=Integer.parseInt(b1);                         
		r1=a1;                                           
		R2.setEditable(true);                           
		b2=R2.getText();
		a2=Integer.parseInt(b2);
		r2=a2;	
		R3.setEditable(true);
		b3=R3.getText();
		a3=Integer.parseInt(b3);
		r3=a3;
		R4.setEditable(true);
		b4=R4.getText();
		a4=Integer.parseInt(b4);
		r4=a4;
		R5.setEditable(true);
		b5=R5.getText();
		a5=Integer.parseInt(b5);
		r5=a5;
		avail.setEditable(true);
		q1=avail.getText();
		s1=Integer.parseInt(q1);
		p1=s1;
		avail1.setEditable(true);
		q2=avail1.getText();
		s2=Integer.parseInt(q2);
		p2=s2;
		avail2.setEditable(true);
		q3=avail2.getText();
		s3=Integer.parseInt(q3);
		p3=s3;		
		avail3.setEditable(true);
		q4=avail3.getText();
		s4=Integer.parseInt(q4);
		p4=s4;		
		avail4.setEditable(true);
		q5=avail4.getText();
		s5=Integer.parseInt(q5);
		p5=s5;
                
                discount1.setEditable(true); // gets and sets the discount
                b6=discount1.getText();
                a6=Integer.parseInt(b6);
                dp1=a6;
                
                discount2.setEditable(true);
                b7=discount2.getText();
                a7=Integer.parseInt(b7);
                dp2=a7;
                
                discount3.setEditable(true);
                b8=discount3.getText();
                a8=Integer.parseInt(b8);
                dp3=a8;
               
                discount4.setEditable(true);
                b9=discount4.getText();
                a9=Integer.parseInt(b9);
                dp4=a9;
 
                discount5.setEditable(true);
                b10=discount5.getText();
                a10=Integer.parseInt(b10);
                dp5=a10;
               
                cr1.setEditable(true);         //setting the cost price
                b11=cr1.getText();
                a11=Integer.parseInt(b11);
                cpr1=a11;
             
                cr2.setEditable(true);
                b12=cr2.getText();
                a12=Integer.parseInt(b12);
                cpr2=a12;
 
                cr3.setEditable(true);
                b13=cr3.getText();
                a13=Integer.parseInt(b13);
                cpr3=a13;

                cr4.setEditable(true);
                b14=cr4.getText();
                a14=Integer.parseInt(b14);
                cpr4=a14;

                cr5.setEditable(true);
                b15=cr5.getText();
                a15=Integer.parseInt(b15);
                cpr5=a15;
                
                comission1.setEditable(true);    //gets and sets the commission
                b16=comission1.getText();
                a16=Integer.parseInt(b16);
                c1=a16;
       
                comission2.setEditable(true);
                b17=comission1.getText();
                a17=Integer.parseInt(b17);
                c2=a17;

                comission3.setEditable(true);
                b18=comission3.getText();
                a18=Integer.parseInt(b18);
                c3=a18;

                comission4.setEditable(true);
                b19=comission4.getText();
                a19=Integer.parseInt(b19);
                c4=a19;

                comission5.setEditable(true);
                b20=comission5.getText();
                a20=Integer.parseInt(b20);
                c5=a20;
                
            		
		val="UPDATED COMPLETE";
		}
		else
		{
		val="THIS USER DOES NOT HAVE A RIGHT TO UPDATE";
		}
		avail.setText(Integer.toString(p1));
		avail1.setText(Integer.toString(p2));
		avail2.setText(Integer.toString(p3));
		avail3.setText(Integer.toString(p4));
		avail4.setText(Integer.toString(p5));
               
		} 
                
           
		R1.setText(Integer.toString(r1));
		R2.setText(Integer.toString(r2));
		R3.setText(Integer.toString(r3));
		R4.setText(Integer.toString(r4));
		R5.setText(Integer.toString(r5));
  
               
                
                cr1.setText(Integer.toString(cpr1));
                cr2.setText(Integer.toString(cpr2));
                cr3.setText(Integer.toString(cpr3));
                cr4.setText(Integer.toString(cpr4));
                cr5.setText(Integer.toString(cpr5));
                
                
		if((t1.getText())=="")
		{
		t1.setText("0");
		}
		if ((t2.getText())=="")
		{	
		t2.setText("0");
		}
		if ((t3.getText())=="")
		{	
		t3.setText("0");
		}
		if ((t4.getText())=="")
		{	
		t4.setText("0");
		}
		if ((t5.getText())=="")
		{	
		t5.setText("0");
		}
                

                 {
                  if ((comission1.getText()==""))
                  {
                   comission1.setText("0");
                  } 
                 if ((comission2.getText()==""))
                  {
                   comission2.setText("0");
                  } 
                  if ((comission3.getText()==""))
                  {
                   comission3.setText("0");
                  } 
                  if ((comission4.getText()==""))
                  {
                   comission4.setText("0");
                  } 
                  if ((comission5.getText()==""))
                  {
                   comission5.setText("0");
                  }  
            }
		if(ae.getSource()==b1)
		{
			String s1=t1.getText();
			a=Integer.parseInt(s1);			
          		if((a)<=0)
			{
			val="INSUFFICIENT QUANTITY OF Mi Note 7 plus, RE-ENTER A VALID QUANTITY ON THE BASIS OF THE AVAILABLE QUANTITY";
			a=0;
			t1.setText(Integer.toString(a));
			}
			else if((p1-a)<0) 
			{
			val="INSUFFICIENT QUANTITY OF Mi Note 7 plus, RE-ENTER A VALID QUANTITY ON THE BASIS OF THE AVAILABLE QUANTITY";
			a=0;
                        t1.setText(Integer.toString(a));
                        }
                        else
                        {
			val=" ";
                        p1=p1-a;
                        val="STOCK AVAILABLE";
			}
			b=a*r1;    //Selling price depending on quantity
			t2.setText(Integer.toString(b));
										
		}
                if(ae.getSource()==b9)
                {
                  String k1=discount1.getText();
                  ab=Integer.parseInt(k1);
                  discount1.setText(Integer.toString(ab));
                  if((ab<=0))
                  {
                   val="Negative Discount Not allowed";
                   ab=0;
                   discount1.setText(Integer.toString(ab));  //discount on selling price
                  }
                  g=ab*b/100;
                  dis1.setText(Integer.toString(g));
                  dp1=b-g;
                }
                if(ae.getSource()==b14)
                {
                  String z1=comission1.getText();
                  fg=Integer.parseInt(z1);
                  comission1.setText(Integer.toString(fg));    //commission on selling price
                  if((fg<=0))
                  {
                   val="Negative Not Allowed";
                   fg=0;
                   comission1.setText(Integer.toString(fg));
                   }
                   cmp1=fg*b/100;
                   com1.setText(Integer.toString(cmp1));
                   rc1=b-cmp1;
                   dc1=g+cmp1;
                   result1= b-dc1; //final result selling price 
                }
		if(ae.getSource()==b2)
		{
			String s2=t3.getText();
			a=Integer.parseInt(s2);			
      			if((a)<=0)
			{
			val="INSUFFICENT QUANTITY OF Mi Notebook 14 Laptop, RE-ENTER A VALID QUANTITY ON THE BASIS OF THE AVAILABLE QUANTITY";
			a=0;
			t3.setText(Integer.toString(a));
			}
			else if((p2-a)<0) 
			{
			val="INSUFFICIENT QUANTITY OF Mi Notebook 14 Laptop, RE-ENTER A VALID QUANTITY ON THE BASIS OF THE AVAILABLE QUANTITY";
			a=0;
                        t3.setText(Integer.toString(a));
                        }
                        else
                        {
			val="";
                        p2=p2-a;
                        val="STOCK AVAILABLE";
			}
			c=a*r2;      //Selling price depending on quantity
			t4.setText(Integer.toString(c));			
		}
                 if(ae.getSource()==b10)
                {
                  String k2=discount2.getText();
                  bc=Integer.parseInt(k2);
                  discount2.setText(Integer.toString(bc));  //discount on selling price
                  if((bc<=0))
                  {
                   val="Negative Discount not Allowed";
                   bc=0;
                   discount2.setText(Integer.toString(bc));
                  }
                   h=bc*c/100;
                  dis2.setText(Integer.toString(h));
                  dt2=c-h;
                }
                if(ae.getSource()==b15)
                {
                  String z2=comission2.getText();
                  gh=Integer.parseInt(z2);
                  comission2.setText(Integer.toString(gh));    //commission on selling price
                  if((gh<=0))
                  {
                   val="Negative not allowed";
                   gh=0;
                   comission2.setText(Integer.toString(gh));
                  }
                  cmp2=gh*c/100;
                  com2.setText(Integer.toString(cmp2));
                  rc2=c-cmp2;   //
                  dc2=h+cmp2;
                  result2=c-dc2; //final result selling price 
                }
		 if(ae.getSource()==b3)
		{
			String s3=t5.getText();
			a=Integer.parseInt(s3);			             		
			if((a)<=0)
			{
			val="INSUFFICIENT QUANTITY OF Samsung Refrigerator, RE-ENTER A VALID QUANTITY ON THE BASIS OF THE AVAILABLE QUANTITY";
			a=0;
			t5.setText(Integer.toString(a));
			}
			else if((p3-a)<0) 
			{
			val="INSUFFICIENT QUANTITY OF Samsung Refrigerator, RE-ENTER A VALID QUANTITY ON THE BASIS OF THE AVAILABLE QUANTITY";
			a=0;
                        t5.setText(Integer.toString(a));
                        }
                        else
                        {
			val="";
                        p3=p3-a;
                        val="STOCK AVAILABLE";
			}
			d=a*r3;      //Selling price depending on quantity
			t6.setText(Integer.toString(d));			
		}
                  if(ae.getSource()==b11)
                {
                  String k3=discount3.getText();
                  cd=Integer.parseInt(k3);
                  discount3.setText(Integer.toString(cd)); //discount on selling price
                  if((cd<=0))
                 {
                  val="Negative not allowed";
                  cd=0;
                  discount3.setText(Integer.toString(cd));
                 }
                  i=cd*d/100;
                  dis3.setText(Integer.toString(i));
                  dt3=d-i;
                }
                 if(ae.getSource()==b16)
                {
                  String z3=comission3.getText();
                  ij=Integer.parseInt(z3);
                  comission3.setText(Integer.toString(ij)); //commision on selling price
                  if((ij<=0))
                  {
                   val="Negative not Allowed";
                   ij=0;
                   comission3.setText(Integer.toString(ij));
                  }
                  cmp3=ij*d/100;
                  com3.setText(Integer.toString(cmp3));
                  rc3=d-cmp3;
                  dc3=i+cmp3;
                  result3=d-dc3; //final result of selling price
                }
		if(ae.getSource()==b4)
		{
			String s4=t7.getText();
			a=Integer.parseInt(s4);             		
			if((a)<=0)
			{
			val="INSUFFICIENT QUANTITY OF Philips Air Dryer, RE-ENTER A VALID QUANTITY ON THE BASIS OF THE AVAILABLE QUANTITY";
			a=0;
			t7.setText(Integer.toString(a));
			}
			else if((p4-a)<0) 
			{
			val="INSUFFICIENT QUANTITY OF Philips Air Dryer, RE-ENTER A VALID QUANTITY ON THE BASIS OF THE AVAILABLE QUANTITY";
			a=0;
                        t7.setText(Integer.toString(a));
                        }
                        else
                        {
			val="";
                        p4=p4-a;
                        val="STOCK AVAILABLE";
			}
			e=a*r4;  //selling price depending on quantity
			t8.setText(Integer.toString(e));			
		}
                 if(ae.getSource()==b12)
                {
                  String k4=discount4.getText();
                  de=Integer.parseInt(k4);
                  discount4.setText(Integer.toString(de)); //discount on selling price
                  if((de<=0))
                  {
                   val="Negative discount not allowed";
                   de=0;
                   discount4.setText(Integer.toString(de));
                  }
                  j=de*e/100;
                  dis4.setText(Integer.toString(j));
                  dt4=e-j;
                  
                }
                 if(ae.getSource()==b17)
                {
                  String z4=comission4.getText();
                  jk=Integer.parseInt(z4);
                  comission4.setText(Integer.toString(jk)); //commision on selling price
                  if((jk<=0))
                  {
                   val="Negative not allowed";
                   jk=0;
                   comission4.setText(Integer.toString(jk));
                  }
                  cmp4=jk*e/100;
                  com4.setText(Integer.toString(cmp4));
                  rc4=e-cmp4;
                  dc4=j+cmp4;
                  result4=e-dc4;
                }
		if(ae.getSource()==b5)
		{
			String s5=t9.getText();
			a=Integer.parseInt(s5);			
			if((a)<=0)
			{
			val="INSUFFICIENT STOCK OF Voltas AC, RE-ENTER A VALID QUANTITY ON THE BASIS OF THE AVAILABLE QUANTITY";
			a=0;
			t9.setText(Integer.toString(a));
			}
			else if((p5-a)<0) 
			{
			val="INSUFFICIENT STOCK OF Voltas AC, RE-ENTER A VALID QUANTITY ON THE BASIS OF THE AVAILABLE QUANTITY";
			a=0;
			t7.setText(Integer.toString(a));
			}
                        else
                        {
                        val="";
                        p5=p5-a;
                        val="STOCK AVAILABLE";
                        }
			f=a*r5; //selling price depending on quantity
			t10.setText(Integer.toString(f));			
              	}
                 if(ae.getSource()==b13)
                {
                  String k5 = discount5.getText();
                  ef=Integer.parseInt(k5);
                  discount5.setText(Integer.toString(ef)); //discount on selling price
                  if((ef<=0))
                  {
                   val="Negative discount not allowed";
                   ef=0;
                   discount5.setText(Integer.toString(ef));
                  }
                  k=ef*f/100;
                  dis5.setText(Integer.toString(k));
                  dt5=f-k;
                }
                if(ae.getSource()==b18)
                {
                  String z5=comission5.getText();
                  kl=Integer.parseInt(z5);
                  comission5.setText(Integer.toString(kl)); //commision on selling price
                  if((kl<=0))
                  {
                   val="Negative not allowed";
                   kl=0;
                   comission5.setText(Integer.toString(kl));
                 }
                  cmp5=kl*f/100;
                  com5.setText(Integer.toString(cmp5));
                  rc5=f-cmp5;
                  dc5=k+cmp5;
                  result5=f-dc5; //final result  on selling price
                }		
		if(ae.getSource()==b8)
		{
		t1.setText("");t2.setText("");t3.setText("");
		t4.setText("");t5.setText("");t6.setText("");
		t7.setText("");t8.setText("");t9.setText("");
                dis1.setText("");dis2.setText("");dis3.setText("");
                dis4.setText("");dis5.setText("");
                com1.setText("");com2.setText("");com3.setText("");
                com4.setText("");com5.setText("");
                dis1.setText("");dis2.setText("");dis3.setText("");
                dis4.setText("");dis5.setText("");
                discount1.setText("");discount2.setText("");discount3.setText("");
                discount4.setText("");discount5.setText("");
                comission1.setText("");comission2.setText("");comission3.setText("");
                comission4.setText("");comission5.setText("");
		t10.setText("");t11.setText("0");t12.setText("0");
		val="THANK YOU";
		}			
		if(ae.getSource()==b6)
		{
		sum=result1+result2+result3+result4+result5; //total selling price
                
		t11.setText(Integer.toString(sum));
		val="YOUR TOTAL IS ="+sum;
            	}
                if(ae.getSource()==b19)
                 {
                  sum2=cpr1+cpr2+cpr3+cpr4+cpr5; //total cost price
                  sum3=sum-sum2; //profit 
                  t12.setText(Integer.toString(sum3));
                  val="Your Total Profit is=RS"+sum3;
                }
                  			
		avail.setText(Integer.toString(p1));
		avail1.setText(Integer.toString(p2));
		avail2.setText(Integer.toString(p3));
		avail3.setText(Integer.toString(p4));
		avail4.setText(Integer.toString(p5));
repaint();
}
public void paint(Graphics g)
{
g.setColor(Color.green);
setBackground(Color.gray);
Font myFont = new Font("Serif",Font.BOLD,15);
g.setFont(myFont);
g.drawString(val,0,420);
}
}


