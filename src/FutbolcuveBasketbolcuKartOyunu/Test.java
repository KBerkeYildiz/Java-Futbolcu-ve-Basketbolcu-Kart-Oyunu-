package FutbolcuveBasketbolcuKartOyunu;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Color;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField txtKullancAdGiriniz;
	private	JButton oyuncu6;
	private JButton oyuncu7;
	private JButton oyuncu8;
	private JButton oyuncu3;
	private JButton oyuncu2;
	private JButton oyuncu1;
	private JButton oyuncu4;
	private JButton oyuncu5;
	private JLabel kullanıcıadı;
	private JLabel bilgisayar;
	private int bilgisayarseçindis;
	private JTextPane sonuçgöster;
	private int randomözellik;
	private JTextPane kullanıcıskorgöster;
	private JTextPane bilgisayarskorgöster;
	private JButton sonuç;
	private JLabel bilgisayarbilgigöster;
	private JLabel oyuncubilgigöster;
	int kontrol=0;
	private JLabel kullanıcıadıgir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Anamenü anamenü=new Anamenü();
        anamenü.setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(false);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		
		Oyuncu oyuncu=new Oyuncu();
		Futbolcu neymar=new Futbolcu("Neymar", "PSG", 95, 85, 95);
		Futbolcu ronaldo=new Futbolcu("Ronaldo", "Juventus", 99, 93, 97);
		Futbolcu messi=new Futbolcu("Messi", "Barcelona", 99, 93, 96);
		Futbolcu mbappe=new Futbolcu("Mbappe", "PSG", 90, 75, 92);
		Futbolcu mane=new Futbolcu("Mane", "Liverpool", 92, 80, 91);
		Futbolcu salah=new Futbolcu("Salah", "Liverpool", 93, 82, 88);
		Futbolcu debruyne=new Futbolcu("Debruyne", "Manchster City", 96, 95, 80);
		Futbolcu hazard=new Futbolcu("Hazard", "Real Madrid", 92, 82, 93);
		
		Basketbolcu curry=new Basketbolcu("Stephan Curry", "Golden State", 90, 95, 97);
		Basketbolcu james=new Basketbolcu("Lebron James", " Los Angeles Lakers", 95, 90, 98);
		Basketbolcu harden=new Basketbolcu("James Harden", " Houston Rockets", 92, 93, 95);
		Basketbolcu durant=new Basketbolcu("Kevin Durant", " Brooklyn Nets ", 89, 92, 90);
		Basketbolcu cedi=new Basketbolcu("Cedi Osman", "Cleveland Cavaliers", 85, 85, 85);
		Basketbolcu furkan=new Basketbolcu("Furkan Korkmaz", "golden state", 84, 86, 85);
		Basketbolcu melih=new Basketbolcu("Melih Mahmutoğlu", "Philadelphia 76ers", 80, 88, 80);
		Basketbolcu kobe=new Basketbolcu("Kobe Bryant", "Los Angeles Lakers", 99, 99, 99);
			
		ArrayList<Futbolcu> futbolcular=new ArrayList<Futbolcu>();
		futbolcular.add(neymar);
		futbolcular.add(ronaldo);
		futbolcular.add(messi);
		futbolcular.add(mbappe);
		futbolcular.add(mane);
		futbolcular.add(salah);
		futbolcular.add(debruyne);
		futbolcular.add(hazard);
	        
		
		ArrayList<Basketbolcu> basketbolcular=new ArrayList<Basketbolcu>();
		basketbolcular.add(kobe);
		basketbolcular.add(melih);
		basketbolcular.add(furkan);
		basketbolcular.add(cedi);
		basketbolcular.add(durant);
		basketbolcular.add(harden);
		basketbolcular.add(james);
		basketbolcular.add(curry);
	            for (int i = 0; i < futbolcular.size(); i++) {
	                oyuncu.fkartlistesi.add(futbolcular.get(i));
	            }
	          
	            for (int i = 0; i < basketbolcular.size(); i++) {
	                oyuncu.bkartlistesi.add(basketbolcular.get(i));
	            }
	            
	           
	    oyuncu.karıştır();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bilgisayarbilgigöster = new JLabel("");
		bilgisayarbilgigöster.setBounds(724, 91, 153, 185);
		contentPane.add(bilgisayarbilgigöster);
		
		oyuncubilgigöster = new JLabel("");
		oyuncubilgigöster.setBounds(460, 91, 153, 185);
		contentPane.add(oyuncubilgigöster);
		
		txtKullancAdGiriniz = new JTextField();
		txtKullancAdGiriniz.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtKullancAdGiriniz.setFont(new Font("Stencil", Font.PLAIN, 17));
		txtKullancAdGiriniz.setText("");
		txtKullancAdGiriniz.setBounds(674, 324, 203, 43);
		contentPane.add(txtKullancAdGiriniz);
		txtKullancAdGiriniz.setColumns(10);
		
		oyuncu5 = new JButton();
		Image button5img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(0).getBasketbolcuAdı()+".png")).getImage();
		oyuncu5.setIcon(new ImageIcon(button5img));
		oyuncu5.setBounds(234, 607, 153, 185);
		contentPane.add(oyuncu5);
		
		oyuncu6 = new JButton();
		Image button6img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(1).getBasketbolcuAdı()+".png")).getImage();
		oyuncu6.setIcon(new ImageIcon(button6img));
		oyuncu6.setBounds(478, 607, 153, 185);
		contentPane.add(oyuncu6);
		
		oyuncu7 = new JButton();
		Image button7img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(2).getBasketbolcuAdı()+".png")).getImage();
		oyuncu7.setIcon(new ImageIcon(button7img));
		oyuncu7.setBounds(700, 607, 153, 185);
		contentPane.add(oyuncu7);
		
		oyuncu8 = new JButton();
		Image button8img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(3).getBasketbolcuAdı()+".png")).getImage();
		oyuncu8.setIcon(new ImageIcon(button8img));
		oyuncu8.setBounds(949, 607, 153, 185);
		contentPane.add(oyuncu8);
		
		oyuncu3 = new JButton();
		Image button3img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(2).getFutbolcuAdı()+".png")).getImage();
		oyuncu3.setIcon(new ImageIcon(button3img));
		oyuncu3.setBounds(700, 392, 153, 185);
		contentPane.add(oyuncu3);
		
		oyuncu2 = new JButton();
		Image button2img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(1).getFutbolcuAdı()+".png")).getImage();
		oyuncu2.setIcon(new ImageIcon(button2img));
		oyuncu2.setBounds(478, 392, 153, 185);
		contentPane.add(oyuncu2);
		
		oyuncu1 = new JButton();
		Image button1img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(0).getFutbolcuAdı()+".png")).getImage();
		oyuncu1.setIcon(new ImageIcon(button1img));
		oyuncu1.setBounds(234, 392, 153, 185);
		contentPane.add(oyuncu1);
		
		
		oyuncu4 = new JButton();
		Image button4img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(3).getFutbolcuAdı()+".png")).getImage();
		oyuncu4.setIcon(new ImageIcon(button4img));
		oyuncu4.setBounds(949, 392, 153, 185);
		contentPane.add(oyuncu4);
		
		kullanıcıadı = new JLabel("");
		kullanıcıadı.setFont(new Font("Tahoma", Font.BOLD, 17));
		kullanıcıadı.setBounds(478, 38, 107, 43);
		contentPane.add(kullanıcıadı);
		
		bilgisayar = new JLabel("");
		bilgisayar.setFont(new Font("Tahoma", Font.BOLD, 17));
		bilgisayar.setBounds(714, 38, 107, 43);
		contentPane.add(bilgisayar);
		
		sonuçgöster = new JTextPane();
		sonuçgöster.setEditable(false);
		sonuçgöster.setBounds(552, 291, 237, 66);
		contentPane.add(sonuçgöster);
		sonuçgöster.setVisible(false);
		
		kullanıcıskorgöster = new JTextPane();
		kullanıcıskorgöster.setEditable(false);
		kullanıcıskorgöster.setBounds(427, 38, 29, 28);
		contentPane.add(kullanıcıskorgöster);
		kullanıcıskorgöster.setVisible(false);
		
		bilgisayarskorgöster = new JTextPane();
		bilgisayarskorgöster.setEditable(false);
		bilgisayarskorgöster.setBounds(896, 38, 29, 28);
		contentPane.add(bilgisayarskorgöster);
		bilgisayarskorgöster.setVisible(false);
		
		sonuç = new JButton("");
		Image imgsonuç=new ImageIcon(this.getClass().getResource("/SONUC.png")).getImage();
		sonuç.setIcon(new ImageIcon(imgsonuç));
		sonuç.setFont(new Font("Tahoma", Font.BOLD, 17));
		sonuç.setBounds(1325, 491, 160, 81);
		contentPane.add(sonuç);
		sonuç.setVisible(false);
		
		kullanıcıadıgir = new JLabel("KULLANICI ADI GIRINIZ");
		kullanıcıadıgir.setFont(new Font("Stencil", Font.PLAIN, 17));
		kullanıcıadıgir.setHorizontalAlignment(SwingConstants.CENTER);
		kullanıcıadıgir.setBounds(674, 271, 203, 43);
		contentPane.add(kullanıcıadıgir);
		
		oyuncu1.setVisible(false);
		oyuncu2.setVisible(false);
		oyuncu3.setVisible(false);
		oyuncu4.setVisible(false);
		oyuncu5.setVisible(false);
		oyuncu6.setVisible(false);
		oyuncu7.setVisible(false);
		oyuncu8.setVisible(false);
		Random random=new Random();
		
		JLabel arkaplan = new JLabel("");
		arkaplan.setBackground(new Color(240, 240, 240));
		arkaplan.setHorizontalAlignment(SwingConstants.CENTER);
		Image imgarkaplan=new ImageIcon(this.getClass().getResource("/arkaplan.jpg")).getImage();
		arkaplan.setIcon(new ImageIcon(imgarkaplan));
		arkaplan.setBounds(0, 0, 1540, 835);
		contentPane.add(arkaplan);
		
		
		Kullanıcı kullanıcı1=new Kullanıcı("", "", 0);
		Bilgisayar bilgisayar1=new Bilgisayar("Bilgisayar", "bilgisayar", 0);
		txtKullancAdGiriniz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kullanıcıadı.setText(txtKullancAdGiriniz.getText().toUpperCase());
				kullanıcı1.setOyuncuAdı(txtKullancAdGiriniz.getText());
				kullanıcı1.setOyuncuID(txtKullancAdGiriniz.getText());
				bilgisayar.setText(bilgisayar1.getOyuncuAdı().toUpperCase());
				txtKullancAdGiriniz.setVisible(false);
				kullanıcıadıgir.setVisible(false);
				sonuçgöster.setVisible(true);
				oyuncu1.setVisible(true);
				oyuncu2.setVisible(true);
				oyuncu3.setVisible(true);
				oyuncu4.setVisible(true);
				oyuncu5.setVisible(true);
				oyuncu6.setVisible(true);
				oyuncu7.setVisible(true);
				oyuncu8.setVisible(true);
				kullanıcıskorgöster.setVisible(true);
				bilgisayarskorgöster.setVisible(true);
				sonuç.setVisible(true);
				oyuncubilgigöster.setVisible(true);
				bilgisayarbilgigöster.setVisible(true);
				oyuncu5.setEnabled(false);oyuncu6.setEnabled(false);oyuncu7.setEnabled(false);oyuncu8.setEnabled(false);
				oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true);
			}
		});
		
		
		//BUTON1
		oyuncu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				oyuncu1.setEnabled(false);oyuncu2.setEnabled(false);oyuncu3.setEnabled(false);oyuncu4.setEnabled(false);
				oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true);
				Image labelimg=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(0).getFutbolcuAdı()+".png")).getImage();
				oyuncubilgigöster.setIcon(new ImageIcon(labelimg));
				bilgisayarseçindis=random.nextInt(oyuncu.bfkartlistesi.size());
				Image labellimg=new ImageIcon(this.getClass().getResource("/"+oyuncu.bfkartlistesi.get(bilgisayarseçindis).getFutbolcuAdı()+".png")).getImage();
				bilgisayarbilgigöster.setIcon(new ImageIcon(labellimg));
				int kullanıcıseçindis=0;
				randomözellik=random.nextInt(3);
				if (oyuncu.bbkartlistesi.size()==0) {
                    oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true); }
                if (randomözellik==0) {
                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getPenaltı()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getPenaltı()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu turu siz kazandınız tebrikler:)");
                    	oyuncu.kfkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
                        kullanıcı1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.GREEN);
                        bilgisayarskorgöster.setBackground(Color.RED);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
        				
                    }
                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getPenaltı()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getPenaltı()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu turu bilgisayar kazandı :(");
                    	oyuncu.kfkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
                        bilgisayar1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.RED);
                        bilgisayarskorgöster.setBackground(Color.GREEN);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
                    		kontrol++;
                    		oyuncu1.setEnabled(true);
                    }
                    }
     
                }
                if (randomözellik==1) {
                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getSerbestVuruş()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getSerbestVuruş()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu turu siz kazandınız tebrikler:)");
                    	oyuncu.kfkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
                        kullanıcı1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.GREEN);
                        bilgisayarskorgöster.setBackground(Color.RED);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getSerbestVuruş()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getSerbestVuruş()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu turu bilgisayar kazandı :(");
                    	oyuncu.kfkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
                        bilgisayar1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.RED);
                        bilgisayarskorgöster.setBackground(Color.GREEN);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
                    		kontrol++;
                    		oyuncu1.setEnabled(true);
                    }
                
                    }}
                if (randomözellik==2) {
                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getKarşıKarşıya()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getKarşıKarşıya()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum karşı karşıya"+"\n Bu turu siz kazandınız tebrikler:)");
                    	oyuncu.kfkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
                        kullanıcı1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.GREEN);
                        bilgisayarskorgöster.setBackground(Color.RED);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getKarşıKarşıya()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getKarşıKarşıya()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum karşı karşıya"+"\n Bu turu bilgisayar kazandı :(");
                    	oyuncu.kfkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
                        bilgisayar1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.RED);
                        bilgisayarskorgöster.setBackground(Color.GREEN);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
                    		kontrol++;
                    		oyuncu1.setEnabled(true);
                    }
                    }
                }
             
                if (kontrol==3) {
                	sonuçgöster.setText("Kartların değerlendirilen özellikleri aynıdır oyun sona ermiştir");
                	oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
                	oyuncu1.setVisible(false);
                }
            }
		});
		//BUTON2
		
		oyuncu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				oyuncu1.setEnabled(false);oyuncu2.setEnabled(false);oyuncu3.setEnabled(false);oyuncu4.setEnabled(false);
				oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true);
				Image label2img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(1).getFutbolcuAdı()+".png")).getImage();
				oyuncubilgigöster.setIcon(new ImageIcon(label2img));
				bilgisayarseçindis=random.nextInt(oyuncu.bfkartlistesi.size());
				Image labell2img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bfkartlistesi.get(bilgisayarseçindis).getFutbolcuAdı()+".png")).getImage();
				bilgisayarbilgigöster.setIcon(new ImageIcon(labell2img));
						int kullanıcıseçindis=1;
						randomözellik=random.nextInt(3);
						if (oyuncu.bbkartlistesi.size()==0) {
                            oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true); }
		                if (randomözellik==0) {
		                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getPenaltı()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getPenaltı()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getPenaltı()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getPenaltı()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu2.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==1) {
		                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getSerbestVuruş()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getSerbestVuruş()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getSerbestVuruş()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getSerbestVuruş()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu2.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==2) {
		                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getKarşıKarşıya()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getKarşıKarşıya()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum karşı karşıya"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getKarşıKarşıya()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getKarşıKarşıya()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum karşı karşıya"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu2.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonuçgöster.setText("Kartların değerlendirilen özellikleri aynıdır oyun sona ermiştir");
		                	oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                	oyuncu2.setVisible(false);
		                }    
		            }
		});
		
		//BUTON3
		
		oyuncu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				oyuncu1.setEnabled(false);oyuncu2.setEnabled(false);oyuncu3.setEnabled(false);oyuncu4.setEnabled(false);
				oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true);
				Image label3img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(2).getFutbolcuAdı()+".png")).getImage();
				oyuncubilgigöster.setIcon(new ImageIcon(label3img));
				bilgisayarseçindis=random.nextInt(oyuncu.bfkartlistesi.size());
				Image labell3img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bfkartlistesi.get(bilgisayarseçindis).getFutbolcuAdı()+".png")).getImage();
				bilgisayarbilgigöster.setIcon(new ImageIcon(labell3img));
						int kullanıcıseçindis=2;
						randomözellik=random.nextInt(3);
						if (oyuncu.bbkartlistesi.size()==0) {
                            oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true); }
		                if (randomözellik==0) {
		                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getPenaltı()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getPenaltı()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getPenaltı()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getPenaltı()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu3.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==1) {
		                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getSerbestVuruş()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getSerbestVuruş()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getSerbestVuruş()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getSerbestVuruş()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu3.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==2) {
		                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getKarşıKarşıya()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getKarşıKarşıya()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum karşı karşıya"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getKarşıKarşıya()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getKarşıKarşıya()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum karşı karşıya"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu3.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonuçgöster.setText("Kartların değerlendirilen özellikleri aynıdır oyun sona ermiştir");
		                	oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                	oyuncu3.setVisible(false);
		                }
		            }
		});
		//BUTON4
		
		oyuncu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				oyuncu1.setEnabled(false);oyuncu2.setEnabled(false);oyuncu3.setEnabled(false);oyuncu4.setEnabled(false);
				oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true);
				Image label4img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(3).getFutbolcuAdı()+".png")).getImage();
				oyuncubilgigöster.setIcon(new ImageIcon(label4img));
				bilgisayarseçindis=random.nextInt(oyuncu.bfkartlistesi.size());
				Image labell4img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bfkartlistesi.get(bilgisayarseçindis).getFutbolcuAdı()+".png")).getImage();
				bilgisayarbilgigöster.setIcon(new ImageIcon(labell4img));
						int kullanıcıseçindis=3;
						randomözellik=random.nextInt(3);
						if (oyuncu.bbkartlistesi.size()==0) {
                            oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true); }
		                if (randomözellik==0) {
		                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getPenaltı()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getPenaltı()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getPenaltı()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getPenaltı()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum penaltı"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu4.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==1) {
		                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getSerbestVuruş()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getSerbestVuruş()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getSerbestVuruş()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getSerbestVuruş()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu4.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==2) {
		                    if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getKarşıKarşıya()>oyuncu.bfkartlistesi.get(bilgisayarseçindis).getKarşıKarşıya()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum karşı karşıya"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullanıcıseçindis).getKarşıKarşıya()<oyuncu.bfkartlistesi.get(bilgisayarseçindis).getKarşıKarşıya()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum karşı karşıya"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest vuruş"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu4.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonuçgöster.setText("Kartların değerlendirilen özellikleri aynıdır oyun sona ermiştir");
		                	oyuncu.bfkartlistesi.remove(bilgisayarseçindis);
		                	oyuncu4.setVisible(false);
		                }
		            }
		}); 
		
		
		//buton5
		oyuncu5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				oyuncu5.setEnabled(false);oyuncu6.setEnabled(false);oyuncu7.setEnabled(false);oyuncu8.setEnabled(false);
				oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true);
				Image label5img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(0).getBasketbolcuAdı()+".png")).getImage();
				oyuncubilgigöster.setIcon(new ImageIcon(label5img));
				bilgisayarseçindis=random.nextInt(oyuncu.bbkartlistesi.size());
				Image labell5img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bbkartlistesi.get(bilgisayarseçindis).getBasketbolcuAdı()+".png")).getImage();
				bilgisayarbilgigöster.setIcon(new ImageIcon(labell5img));
				int kullanıcıseçindis=0;
				randomözellik=random.nextInt(3);
				if (oyuncu.bfkartlistesi.size()==0) {
                    oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true); }
                if (randomözellik==0) {
                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getIkilik()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getIkilik()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu turu siz kazandınız tebrikler:)");
                    	oyuncu.kbkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
                        kullanıcı1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.GREEN);
                        bilgisayarskorgöster.setBackground(Color.RED);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getIkilik()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getIkilik()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu turu bilgisayar kazandı :(");
                    	oyuncu.kbkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
                        bilgisayar1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.RED);
                        bilgisayarskorgöster.setBackground(Color.GREEN);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
                    		kontrol++;
                    		oyuncu5.setEnabled(true);
                    }
                    }
                }
                if (randomözellik==1) {
                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getÜçlük()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getÜçlük()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu turu siz kazandınız tebrikler:)");
                    	oyuncu.kbkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
                        kullanıcı1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.GREEN);
                        bilgisayarskorgöster.setBackground(Color.RED);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getÜçlük()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getÜçlük()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu turu bilgisayar kazandı :(");
                    	oyuncu.kbkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
                        bilgisayar1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.RED);
                        bilgisayarskorgöster.setBackground(Color.GREEN);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
                    		kontrol++;
                    		oyuncu5.setEnabled(true);
                    }
                    }
                }
                if (randomözellik==2) {
                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getSerbestAtış()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getSerbestAtış()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu turu siz kazandınız tebrikler:)");
                    	oyuncu.kbkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
                        kullanıcı1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.GREEN);
                        bilgisayarskorgöster.setBackground(Color.RED);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getSerbestAtış()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getSerbestAtış()) {
                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu turu bilgisayar kazandı :(");
                    	oyuncu.kbkartlistesi.get(0).setKartKullanıldıMı(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
                        bilgisayar1.setSkor();
                        kullanıcıskorgöster.setBackground(Color.RED);
                        bilgisayarskorgöster.setBackground(Color.GREEN);
                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
                    		kontrol++;
                    		oyuncu5.setEnabled(true);
                    }
                    }
                }
                if (kontrol==3) {
                	sonuçgöster.setText("Kartların değerlendirilen özellikleri aynıdır oyun sona ermiştir");
                	oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
                	oyuncu5.setVisible(false);
                }
            }
		});
		
		//buton6
				oyuncu6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)  {
						oyuncu5.setEnabled(false);oyuncu6.setEnabled(false);oyuncu7.setEnabled(false);oyuncu8.setEnabled(false);
						oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true);
						Image label6img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(1).getBasketbolcuAdı()+".png")).getImage();
						oyuncubilgigöster.setIcon(new ImageIcon(label6img));
						bilgisayarseçindis=random.nextInt(oyuncu.bbkartlistesi.size());
						Image labell6img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bbkartlistesi.get(bilgisayarseçindis).getBasketbolcuAdı()+".png")).getImage();
						bilgisayarbilgigöster.setIcon(new ImageIcon(labell6img));
						int kullanıcıseçindis=1;
						randomözellik=random.nextInt(3);
						if (oyuncu.bfkartlistesi.size()==0) {
		                    oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true); }
		                if (randomözellik==0) {
		                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getIkilik()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getIkilik()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getIkilik()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getIkilik()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu6.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==1) {
		                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getÜçlük()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getÜçlük()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getÜçlük()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getÜçlük()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu6.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==2) {
		                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getSerbestAtış()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getSerbestAtış()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getSerbestAtış()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getSerbestAtış()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu6.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonuçgöster.setText("Kartların değerlendirilen özellikleri aynıdır oyun sona ermiştir");
		                	oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                	oyuncu6.setVisible(false);
		                }
		            }
				});
				
				//buton7
				oyuncu7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)  {
						oyuncu5.setEnabled(false);oyuncu6.setEnabled(false);oyuncu7.setEnabled(false);oyuncu8.setEnabled(false);
						oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true);
						Image label7img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(2).getBasketbolcuAdı()+".png")).getImage();
						oyuncubilgigöster.setIcon(new ImageIcon(label7img));
						bilgisayarseçindis=random.nextInt(oyuncu.bbkartlistesi.size());
						Image labell7img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bbkartlistesi.get(bilgisayarseçindis).getBasketbolcuAdı()+".png")).getImage();
						bilgisayarbilgigöster.setIcon(new ImageIcon(labell7img));
						int kullanıcıseçindis=2;
						randomözellik=random.nextInt(3);
						if (oyuncu.bfkartlistesi.size()==0) {
		                    oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true); }
		                if (randomözellik==0) {
		                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getIkilik()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getIkilik()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getIkilik()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getIkilik()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu7.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==1) {
		                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getÜçlük()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getÜçlük()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getÜçlük()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getÜçlük()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu7.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==2) {
		                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getSerbestAtış()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getSerbestAtış()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getSerbestAtış()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getSerbestAtış()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu7.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonuçgöster.setText("Kartların değerlendirilen özellikleri aynıdır oyun sona ermiştir");
		                	oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                	oyuncu7.setVisible(false);
		                }
		            }
				});
				
				//buton8
				oyuncu8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)  {
						oyuncu5.setEnabled(false);oyuncu6.setEnabled(false);oyuncu7.setEnabled(false);oyuncu8.setEnabled(false);
						oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true);
						Image label8img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(3).getBasketbolcuAdı()+".png")).getImage();
						oyuncubilgigöster.setIcon(new ImageIcon(label8img));
						bilgisayarseçindis=random.nextInt(oyuncu.bbkartlistesi.size());
						Image labell8img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bbkartlistesi.get(bilgisayarseçindis).getBasketbolcuAdı()+".png")).getImage();
						bilgisayarbilgigöster.setIcon(new ImageIcon(labell8img));
						int kullanıcıseçindis=3;
						randomözellik=random.nextInt(3);
						if (oyuncu.bfkartlistesi.size()==0) {
		                    oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true); }
		                if (randomözellik==0) {
		                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getIkilik()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getIkilik()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getIkilik()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getIkilik()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum ikilik"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu8.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==1) {
		                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getÜçlük()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getÜçlük()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getÜçlük()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getÜçlük()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum üçlük"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu8.setEnabled(true);
		                    }
		                    }
		                }
		                if (randomözellik==2) {
		                    if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getSerbestAtış()>oyuncu.bbkartlistesi.get(bilgisayarseçindis).getSerbestAtış()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu turu siz kazandınız tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        kullanıcı1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.GREEN);
		                        bilgisayarskorgöster.setBackground(Color.RED);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullanıcıseçindis).getSerbestAtış()<oyuncu.bbkartlistesi.get(bilgisayarseçindis).getSerbestAtış()) {
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu turu bilgisayar kazandı :(");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullanıldıMı(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarseçindis).setKartKullanıldıMı(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                        bilgisayar1.setSkor();
		                        kullanıcıskorgöster.setBackground(Color.RED);
		                        bilgisayarskorgöster.setBackground(Color.GREEN);
		                        kullanıcıskorgöster.setText(Integer.toString(kullanıcı1.getSkor()));
		        				bilgisayarskorgöster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonuçgöster.setText("Karşılaştırılıcak durum serbest atış"+"\n Bu tur berabere sonuçlandı kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonuçgöster.setText("Son kartlar olduğu için yeni özellik ile değerlendirilecektir"+"\nLütfen bir daha kart seçimi yapınız");
		                    		kontrol++;
		                    		oyuncu8.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonuçgöster.setText("Kartların değerlendirilen özellikleri aynıdır oyun sona ermiştir");
		                	oyuncu.bbkartlistesi.remove(bilgisayarseçindis);
		                	oyuncu8.setVisible(false);
		                }
		            }
				});
				
				sonuç.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String mesaj;
						if(oyuncu.bbkartlistesi.isEmpty() && oyuncu.bfkartlistesi.isEmpty())
						{
							if (kullanıcı1.getSkor()>bilgisayar1.getSkor())
							{
								mesaj=kullanıcı1.getOyuncuAdı().toUpperCase()+"= "+kullanıcı1.getSkor()+"\n"+bilgisayar1.getOyuncuAdı().toUpperCase()+"= "+bilgisayar1.getSkor()+"\n"+"Oyunu "+kullanıcı1.getOyuncuAdı().toUpperCase()+" kazandı ";
						}
							else if(kullanıcı1.getSkor()<bilgisayar1.getSkor()) {
								mesaj=kullanıcı1.getOyuncuAdı().toUpperCase()+"= "+kullanıcı1.getSkor()+"\n"+bilgisayar1.getOyuncuAdı().toUpperCase()+"= "+bilgisayar1.getSkor()+"\n"+"Oyunu "+bilgisayar1.getOyuncuAdı().toUpperCase()+" kazandı ";
							}
							else {
								mesaj=kullanıcı1.getOyuncuAdı().toUpperCase()+"= "+kullanıcı1.getSkor()+"\n"+bilgisayar1.getOyuncuAdı().toUpperCase()+"= "+bilgisayar1.getSkor()+"\n"+"Oyun berabere bitmiştir";
							} 
							JOptionPane.showMessageDialog(contentPane, mesaj);
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(contentPane, "Oyununuz bitmedi.\nLütfen devam ediniz");
						}
						
					}
				});
				
				 
		
		
		
	}
}
