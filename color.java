import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.awt.image.*;

import java.io.*;

import javax.imageio.*;
import javax.swing.filechooser.*;

import java.applet.*;

class color extends JFrame implements ActionListener
{
	JButton sb1,sb2,sb3,sb4,sb5,sb6,sb7,sb8;

	int startRGB[][]=new int[4000][4000];

	color inst;
		
	MenuBar mb;
	
	Menu m;

	MenuItem mi;
	
	Color c;
		
	FileDialog f;
		
	 Image img;

	String s;

	BufferedImage img1;

	Toolkit t;

	int red[][]=new int[1573][2097];
	int green[][]=new int[1573][2097];
	int blue[][]=new int[1573][2097];

	int count=0;

	int grey=3;
		
	int width,height;


	
	color()
	{

		
		inst=this;
		width=getWidth();
		height=getHeight();
		
	
		mb=new MenuBar();
		f=new FileDialog(this,"color picker");
		
		
		m=new Menu("open");

		

		sb1=new JButton("RED");
		sb2=new JButton("GREEN");
		sb3=new JButton("BLUE");
		sb4=new JButton("NEGATIVE");
		sb5=new JButton("SEPIA");
		sb6=new JButton("RESET");
		sb7=new JButton("GREYSCALE");
		sb8=new JButton("SAVE");
					


		sb1.setBounds(20,600,100,80);
		sb2.setBounds(140,600,100,80);
		sb3.setBounds(260,600,100,80);
		sb4.setBounds(380,600,100,80);
		sb5.setBounds(500,600,100,80);
		sb6.setBounds(760,600,100,80);	
		sb7.setBounds(620,600,120,80);
		sb8.setBounds(380,500,100,80);

		sb1.setBackground(Color.RED);
		sb2.setBackground(Color.GREEN);
		sb3.setBackground(Color.BLUE);
		

		this.add(sb1);
		this.add(sb2);
		this.add(sb3);
		this.add(sb4);		
		this.add(sb5);
		this.add(sb6);
		this.add(sb7);
		this.add(sb8);
		

		sb1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
			try
			{
			int width1 = img1.getWidth(); 
      			  int height1 = img1.getHeight(); 
  


        		// convert to red image 
        		for (int y = 0; y < height1; y++) 
        		{ 
           		 for (int x = 0; x < width1; x++) 
            		{ 
               		 int p = img1.getRGB(x,y); 
  
               		 int a = (p>>24)&0xff; 
                	int r = (p>>16)&0xff; 
  	
                	// set new RGB 
                	// keeping the r value same as in original 
               		 // image and setting g and b as 0. 
               		 p = (a<<24) | (r<<16) | (0<<8) | 0; 
  
               		 img1.setRGB(x, y, p); 
           		 } 
       			 } 
			sb2.setEnabled(false);
			sb3.setEnabled(false);
			sb4.setEnabled(false);
			sb5.setEnabled(false);
			sb7.setEnabled(false);
			repaint();
			}catch(Exception e){}}
		});
		

		sb2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
			try
			{
	
			int width1 = img1.getWidth(); 
      			  int height1 = img1.getHeight(); 
  
        		// convert to red image 
        		for (int y = 0; y < height1; y++) 
        		{ 
           		 for (int x = 0; x < width1; x++) 
            		{ 
				int p = img1.getRGB(x,y); 
  
               			 int a = (p>>24)&0xff; 
                		int g = (p>>8)&0xff; 
  
                		// set new RGB 
                		// keeping the g value same as in original 
               			 // image and setting r and b as 0. 
                		p = (a<<24) | (0<<16) | (g<<8) | 0; 
  
                		img1.setRGB(x, y, p);

				
               		   
           		 } 
       			 } 
			sb1.setEnabled(false);
			sb3.setEnabled(false);
			sb4.setEnabled(false);
			sb5.setEnabled(false);
			sb7.setEnabled(false);
			repaint();}catch(Exception e){}}
			
		
		});


		sb3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				
			try
			{
			int width1 = img1.getWidth(); 
      			  int height1 = img1.getHeight(); 
  
        		// convert to red image 
        		for (int y = 0; y < height1; y++) 
        		{ 
           		 for (int x = 0; x < width1; x++) 
            		{ 
               		   int p = img1.getRGB(x,y); 
  
               			 int a = (p>>24)&0xff; 
               			 int b = p&0xff; 
  		
                		// set new RGB 
               		 // keeping the b value same as in original 
                		// image and setting r and g as 0. 
                		p = (a<<24) | (0<<16) | (0<<8) | b; 
  
               		 img1.setRGB(x, y, p); 
           		 } 
       			 } 
			sb1.setEnabled(false);
			sb2.setEnabled(false);
			sb4.setEnabled(false);		
			sb5.setEnabled(false);
			sb7.setEnabled(false);
			repaint();
			}catch(Exception e){}}
		});


		sb4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
			try
			{	
			int width1 = img1.getWidth(); 
      			  int height1 = img1.getHeight(); 
  
        		// convert to red image 
        		for (int y = 0; y < height1; y++) 
        		{ 
           		 for (int x = 0; x < width1; x++) 
            		{ 
               		   	int p = img1.getRGB(x,y); 
               		 int a = (p>>24)&0xff; 
               		 int r = (p>>16)&0xff; 
                		int g = (p>>8)&0xff; 
                		int b = p&0xff; 
  
                	//subtract RGB from 255 
               		 r = 255 - r; 
               		 g = 255 - g; 
                	b = 255 - b; 
  
               		 //set new RGB value 
               		 p = (a<<24) | (r<<16) | (g<<8) | b; 
                		img1.setRGB(x, y, p); 
           		 } 
       			 } 
			sb1.setEnabled(false);
			
			sb2.setEnabled(false);
			sb3.setEnabled(false);
			sb5.setEnabled(false);
			sb7.setEnabled(false);
			
			repaint();
			}catch(Exception e){}}
		});


		sb5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				
			try
			{
			int width1 = img1.getWidth(); 
      			  int height1 = img1.getHeight(); 
  
        		// convert to red image 
        		for (int y = 0; y < height1; y++) 
        		{ 
           		 for (int x = 0; x < width1; x++) 
            		{ 
               		   int p = img1.getRGB(x,y); 
  
               		 int a = (p>>24)&0xff; 
             		   int R = (p>>16)&0xff; 
              		  int G = (p>>8)&0xff; 
               		 int B = p&0xff; 
  
              		  //calculate newRed, newGreen, newBlue 
               		 int newRed = (int)(0.393*R + 0.769*G + 0.189*B); 
               		 int newGreen = (int)(0.349*R + 0.686*G + 0.168*B); 
                		int newBlue = (int)(0.272*R + 0.534*G + 0.131*B); 
  
               		 //check condition 
               		 if (newRed > 255) 
                    	R = 255; 
               		 else
                  	  R = newRed; 
  
               		 if (newGreen > 255) 
                  		  G = 255; 
               		 else
                   	 G = newGreen; 
  
               		 if (newBlue > 255) 
                  	  B = 255; 
               		 else
                  	  B = newBlue; 
  
               		 //set new RGB value 
               		 p = (a<<24) | (R<<16) | (G<<8) | B; 
  
               		 img1.setRGB(x, y, p);
           		 } 
       			 } 
			sb1.setEnabled(false);
			sb7.setEnabled(false);
			sb2.setEnabled(false);
			sb3.setEnabled(false);
			sb4.setEnabled(false);
			
			repaint();
			}catch(Exception e){}}
		});



		sb6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				
			try
			{
			int width1 = img1.getWidth(); 
      			  int height1 = img1.getHeight(); 
  
        		
        		for (int x = 0; x<width1; x++) 
        		{ 
           		 for (int y = 0; y<height1; y++) 
            		{ 
				img1.setRGB(x,y,startRGB[x][y]);
               		   
           		 } 
       			 } 

			sb1.setEnabled(true);
			sb2.setEnabled(true);
			sb3.setEnabled(true);
			sb4.setEnabled(true);
			sb5.setEnabled(true);
			sb7.setEnabled(true);
			
		
			
			repaint();
			}catch(Exception e){}}
		});

		sb7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
				int w=0,h=0;
				try
				{
				 w=img1.getWidth();
				 h=img1.getHeight();
				} 
				catch(Exception e)
				{
						JOptionPane.showMessageDialog(new color(),"first choose pic","Alert",JOptionPane.WARNING_MESSAGE);
						dispose();
				}
					
				for(int x=0;x<w;x++)
				{
					for(int y=0;y<h;y++)
					{	
						Color c=new Color(img1.getRGB(x,y));

						int r=c.getRed();
						int g=c.getGreen();
						int b=c.getBlue();
						
						int gr=(r+g+b)/3;

						Color c1=new Color(gr,gr,gr);
			
						img1.setRGB(x,y,c1.getRGB());

					}
				}
				repaint();

			sb1.setEnabled(false);
			sb2.setEnabled(false);
			sb3.setEnabled(false);
			sb4.setEnabled(false);
			sb5.setEnabled(false);
		
			
			repaint(20,60,getWidth()-40,getHeight()-350);
			}catch(Exception e){}}
		});

		sb8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(img1!=null)
				{
				try
				{
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.showSaveDialog(null);
					File file=new File(fileChooser.getSelectedFile().getAbsolutePath()+".jpg");

					ImageIO.write(img1,"png",file);

					JOptionPane.showMessageDialog(inst,"image saved successfully");
			
				}
				catch(Exception e){}
				}
				
			}
		});
		
		

		mi=new MenuItem("SELECT");
		
		


		mi.addActionListener(this);
		

		setMenuBar(mb);

		
		
		m.add(mi);
		
		mb.add(m);

		

		
		setLayout(null);
		
		setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("jarvis.png"));
	
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setSize(900,800);
		
		setLocationRelativeTo(null);

		setTitle("pic editor");
		setVisible(true);

		

		

		


	}

	
    public void paint(Graphics g) {
       
		
		
		if(img1!=null)
		{
			g.drawImage(img1,20,60,getWidth()-40,getHeight()-350,null);
		}
	}

	
	
	
	
	

	public static void main(String arg[])
	{
		color c=new color();

		
	}

	public void actionPerformed(ActionEvent ae)
			{
				

				MenuItem m=(MenuItem)ae.getSource();

				if(m==mi)
				{
				f.setVisible(true);
				
				
				try
				{

				
				
				 img = new ImageIcon(f.getFile()).getImage();

	
					

				 img1 = new BufferedImage(img.getWidth(null), img.getHeight(null),
       						 BufferedImage.TYPE_INT_ARGB);

   				 Graphics g = img1.getGraphics();

				

   				 g.drawImage(img, 0, 0, null);

				getrgb();

				
				

				repaint();
				}
				catch(Exception e){}
				}
				
					
				
					
			
			}


		public void getrgb()
		{
			int w=img1.getWidth();
				int  h=img1.getHeight();

	
			for(int x=0;x<w;x++)
				{
					for(int y=0;y<h;y++)
					{	
						startRGB[x][y]=img1.getRGB(x,y);
					}
				}
		}


		
			

			

	

		
}	


		