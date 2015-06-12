import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class boardgame extends JFrame{
	
	private int cardorder = 6;
	private int uporder4 = 0;
	private int uporder5 = 0;

	
	private ImageIcon card0 = new ImageIcon("src/image/0.jpg");
	private ImageIcon card1 = new ImageIcon("src/image/1.jpg");
	private ImageIcon card2 = new ImageIcon("src/image/2.jpg"); 
	private ImageIcon card3 = new ImageIcon("src/image/3.jpg");
	private ImageIcon card4 = new ImageIcon("src/image/4.jpg");
	private ImageIcon card5 = new ImageIcon("src/image/5.jpg");
	private ImageIcon card6 = new ImageIcon("src/image/6.jpg");
	private ImageIcon card7 = new ImageIcon("src/image/7.jpg");
	private ImageIcon card8 = new ImageIcon("src/image/8.jpg");
	
	private ImageIcon card11 = new ImageIcon("src/image/11.jpg");
	private ImageIcon card12 = new ImageIcon("src/image/12.jpg"); 
	private ImageIcon card13 = new ImageIcon("src/image/13.jpg");
	private ImageIcon card14 = new ImageIcon("src/image/14.jpg");
	private ImageIcon card15 = new ImageIcon("src/image/15.jpg");
	private ImageIcon card16 = new ImageIcon("src/image/16.jpg");
	private ImageIcon card17 = new ImageIcon("src/image/17.jpg");
	private ImageIcon card18 = new ImageIcon("src/image/18.jpg");
	
	private JLabel[] jlbs = new JLabel[16];
	{
	jlbs[0] = new JLabel(card1);
	jlbs[1] = new JLabel(card1);
	jlbs[2] = new JLabel(card1);
	jlbs[3] = new JLabel(card1);
	jlbs[4] = new JLabel(card1);
	jlbs[5] = new JLabel(card2);
	jlbs[6] = new JLabel(card2);
	jlbs[7] = new JLabel(card3);
	jlbs[8] = new JLabel(card3);
	jlbs[9] = new JLabel(card4);
	jlbs[10] = new JLabel(card4);
	jlbs[11] = new JLabel(card5);
	jlbs[12] = new JLabel(card5);
	jlbs[13] = new JLabel(card6);
	jlbs[14] = new JLabel(card7);
	jlbs[15] = new JLabel(card8);
	}
	
	private JLabel jlbDetail = new JLabel();
	private JLabel jlbDeck[] = new JLabel[16];
	
	private JLabel jlb0 = new JLabel();
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();
	private JLabel jlb3 = new JLabel();
	private JLabel jlb4[] = new JLabel[7];
	private JLabel jlb5[] = new JLabel[7];
	private JLabel jlb6 = new JLabel();
	private JLabel jlb7 = new JLabel();
	private JLabel jlb8 = new JLabel();
	private JLabel jlb9 = new JLabel();
	
	private JLabel jlbcom = new JLabel();
	private JLabel jlbcom2 = new JLabel();
	
	JTextField Text1 = new JTextField("情書");
	JTextField Text2 = new JTextField("開始遊戲");
	
	private JTextField blockText1 = new JTextField();
	private JTextField blockText2 = new JTextField();
	private JTextField blockText3 = new JTextField();
	private JTextField blockText4 = new JTextField();
	
	private JLabel jlbfuck;
	
	private JLabel jlbguess = new JLabel("猜對方手牌是(1~8):");
	private JTextField guess = new JTextField();
	private JButton jbtguess = new JButton("確定");
	
	private JButton jbtpeep = new JButton("偷看");
	
	private JButton jbtcompare = new JButton("比大小");
	
	private JButton jbtchoose1 = new JButton("選電腦");
	
	private JButton jbtchoose2 = new JButton("選自己");
	
	private JButton jbtchange = new JButton("交換");
	
	private JButton jbtresult = new JButton("最後結果");
	
	private JButton jbtStart = new JButton("開始");
	
	private JButton jbtRule = new JButton("規則");
	
	private GuessListener guesslistener1 = new GuessListener();
	private PeepListener peepListener1 = new PeepListener();
	private Choose1Listener choose1Listener1 = new Choose1Listener();
	private Choose2Listener choose2Listener1 = new Choose2Listener();
	JLabel lbl;
	
	private JPanel JP1 = new JPanel();
	
	public boardgame(){
		JP1.setLayout(null);
		add(JP1);
		
		initDeck(jlbDeck);
		setDeck(jlbDeck);
		shuffle(jlbs);
		
		initDeck2(jlb4);
		initDeck3(jlb5);
		
		jlbDetail.setBounds(740, 40, 200, 280);
		JP1.add(jlbDetail);
		
		jlb0.setBounds(70, 540, 100, 140);
		JP1.add(jlb0);
		
		jlb1.setBounds(270, 540, 100, 140);
		JP1.add(jlb1);
		
		jlb2.setBounds(70, 40, 100, 140);
		JP1.add(jlb2);
		
		jlb3.setBounds(270, 40, 100, 140);
		JP1.add(jlb3);
		
		jlb6.setBounds(360, 210, 100, 140);
		JP1.add(jlb6);
		
		jlb7.setBounds(465, 210, 100, 140);
		JP1.add(jlb7);
		
		jlb8.setBounds(360, 370, 100, 140);
		JP1.add(jlb8);
		
		jlb9.setBounds(465, 370, 100, 140);
		JP1.add(jlb9);
	
		jbtStart.setFont(new Font("Courie", Font.BOLD, 30));
		jbtStart.setBounds(800, 400, 100, 60);
		JP1.add(jbtStart);
		jbtStart.addActionListener(new StartListener());
		
		jbtRule.setFont(new Font("Courie", Font.BOLD, 30));
		jbtRule.setBounds(800, 490, 100, 60);
		JP1.add(jbtRule);
		jbtRule.addActionListener(new RuleListener());

		
		blockText1.setFont(new Font("Courie", Font.BOLD, 50));
		blockText1.setBorder(new LineBorder(new Color(153, 104, 255), 3));
		blockText1.setEditable(false);
		blockText1.setBounds(700, 0, 3, 768);
		
		blockText2.setFont(new Font("Courie", Font.BOLD, 50));
		blockText2.setBorder(new LineBorder(new Color(153, 104, 255), 3));
		blockText2.setEditable(false);
		blockText2.setBounds(0, 190, 700, 3);
		
		blockText3.setFont(new Font("Courie", Font.BOLD, 50));
		blockText3.setBorder(new LineBorder(new Color(153, 104, 255), 3));
		blockText3.setEditable(false);
		blockText3.setBounds(0, 530, 700, 3);

		blockText4.setFont(new Font("Courie", Font.BOLD, 50));
		blockText4.setBorder(new LineBorder(new Color(153, 104, 255), 3));
		blockText4.setEditable(false);
		blockText4.setBounds(350, 190, 3, 340);
		
		JP1.add(blockText1);
		JP1.add(blockText2);
		JP1.add(blockText3);
		JP1.add(blockText4);
		
		lbl= new JLabel();
		JP1.add(lbl);
		lbl.setBounds(0, 0, 300, 400);	
	
		jlb0.addMouseListener(new ClickMouseListener0());
		jlb0.addMouseListener(new EnterMouseListener0());
		jlb0.addMouseListener(new ExitMouseListener0());
		jlb1.addMouseListener(new ClickMouseListener1());
		jlb1.addMouseListener(new EnterMouseListener1());
		jlb1.addMouseListener(new ExitMouseListener1());
	}
	
	private class StartListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			jlb6.setIcon(jlbs[0].getIcon());
			jlb7.setIcon(jlbs[1].getIcon());
			jlb8.setIcon(jlbs[2].getIcon());
			jlb9.setIcon(card0);//3
			
			jlb0.setIcon(jlbs[4].getIcon());
			jlb2.setIcon(card0);//5
			jlbcom.setIcon(jlbs[5].getIcon());
			
			for(int i =0;i<6;i++){
				JP1.remove(jlbDeck[i]);
			}
			
			jlbDeck[cardorder].addMouseListener(new ClickMouseListener00());
			
			repaint();
			jbtStart.setEnabled(false);
		}
	}
	private class RuleListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame frame2 = new JFrame();
			JLabel lb1 = new JLabel("情書");
			lb1.setFont(new Font("Courie", Font.BOLD, 20));
			JLabel lb2 = new JLabel("聽到母后因叛國罪被逮捕的消息，最難過的莫過於安妮塔公主。她的眾多追求者試圖為她的生活帶來一些愛情能量，好讓他走過傷痛。");
			JLabel lb3 = new JLabel("你身為其中1位追求者，試圖要把親筆情書送到公主手上，然而，她把自己關在深宮內院裡，因此你必須透過一些相關人士代你轉交。");
			JLabel lb4 = new JLabel("在遊戲中，你手上會保有一張牌，她代表當前在幫你轉交情書的人。物比確保你把情書交給最接近公主的人以勝過其他追求者。");
			JLabel lb5 = new JLabel("1 - 衛兵 (5張)");
			JLabel lb6 = new JLabel("2 - 神父 (2張)");
			JLabel lb7 = new JLabel("3 - 男爵 (2張)");
			JLabel lb8 = new JLabel("4 - 侍女 (2張)");
			JLabel lb9 = new JLabel("5 - 王子 (1張)");
			JLabel lb10 = new JLabel("6 - 國王 (1張)");
			JLabel lb11= new JLabel("7 - 伯爵夫人 (1張)");
			JLabel lb12= new JLabel("8 - 公主 (1張)");
			JPanel panel = new JPanel(new GridLayout(12,1));
			frame2.add(panel);
			frame2.setTitle("Rule");
			panel.add(lb1);
			panel.add(lb2);
			panel.add(lb3);
			panel.add(lb4);
			panel.add(lb5);
			panel.add(lb6);
			panel.add(lb7);
			panel.add(lb8);
			panel.add(lb9);
			panel.add(lb10);
			panel.add(lb11);
			panel.add(lb12);
			frame2.setSize(800, 600);;
			frame2.setLocationRelativeTo(null); // Center the frame 
			frame2.setDefaultCloseOperation(1);
			frame2.setVisible(true);
		}
	}
	
	private class GuessListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int a = Integer.parseInt(guess.getText());
			ImageIcon guesscard = new ImageIcon("src/image/" + a +".jpg");
			
			if(jlbcom.getIcon() == guesscard){
				win();
				
			}
			else{
				JP1.remove(jlbguess);
				JP1.remove(guess);
				jbtguess.removeActionListener(guesslistener1);
				JP1.remove(jbtguess);
				guessfail();
				repaint();
				computer();
			}

		}
	}
	
	private class PeepListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			jlb3.setIcon(jlbcom.getIcon());
			jbtpeep.removeActionListener(peepListener1);;
			JP1.remove(jbtpeep);
			repaint();
			
			computer();
		}
	}
	
	private class CompareListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			jlb2.setIcon(jlbcom.getIcon());
			JP1.remove(jbtcompare);
			if(getcardnumber(jlb2) <= getcardnumber(jlb0)){
				win();
			}
			else {
				lose();
			}
			repaint();
			
		}
	}
	
	private class Choose1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			cardorder++;
			jlb4[uporder4].setIcon(jlbcom.getIcon());
			jlbcom.setIcon(jlbs[cardorder].getIcon());
			JP1.remove(jlbDeck[cardorder]);
			jbtchoose1.removeActionListener(choose1Listener1);
			jbtchoose2.removeActionListener(choose2Listener1);
			JP1.remove(jbtchoose1);
			JP1.remove(jbtchoose2);
			uporder4++;
			repaint();
			
			computer();
		}
	}
	
	private class Choose2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			cardorder++;
			uporder5++;
			jlb5[uporder5].setIcon(jlb0.getIcon());
			jlb0.setIcon(jlbs[cardorder].getIcon());
			JP1.remove(jlbDeck[cardorder]);
			jbtchoose1.removeActionListener(choose1Listener1);
			jbtchoose2.removeActionListener(choose2Listener1);
			JP1.remove(jbtchoose1);
			JP1.remove(jbtchoose2);
			
			repaint();
			
			computer();
		}
	}
	

	private class ChangeListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			jlbcom2.setIcon(jlbcom.getIcon());
			jlbcom.setIcon(jlb0.getIcon());
			jlb0.setIcon(jlbcom2.getIcon());
			
			jlbcom2.setIcon(null);
			
			JP1.remove(jbtchange);
			repaint();
			
			computer();
		}
	}
	private class ResultListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			jlb2.setIcon(jlbcom.getIcon());
			JP1.remove(jbtresult);
			
			if(getcardnumber(jlb2) <= getcardnumber(jlb0)){
				win();
			}
			else {
				lose();
			}
			
			repaint();
		}
	}
	
	private class ClickMouseListener00 extends MouseAdapter {
		@Override /** Handle mouse click on a cell */
		public void mouseClicked(MouseEvent e) {
			if(jlbfuck!=null){
				jlbfuck.setText(null);
			}
			if(jlbcom2!=null){
				jlbcom2.setIcon(null);;
			}
			jlb1.setIcon(jlbs[cardorder].getIcon());
			JP1.remove(jlbDeck[cardorder]);
			repaint();
		}
	}
	
	private class ClickMouseListener0 extends MouseAdapter {
		@Override /** Handle mouse click on a cell */
		public void mouseClicked(MouseEvent e) {
			if(jlb1.getIcon()!=null){
				jlb5[uporder5].setIcon(jlb0.getIcon());
				jlb0.setIcon(jlb1.getIcon());
				jlb1.setIcon(null);
				
				play();
			}
		}
	}

	private class EnterMouseListener0 extends MouseAdapter {
		@Override /** Handle mouse click on a cell */
		public void mouseEntered(MouseEvent e) {
	         jlb0.setBounds(70, 540-20, 100, 140);
	         displayCardDetail(jlb0);
		}
	}
	
	private class ExitMouseListener0 extends MouseAdapter {
		@Override /** Handle mouse click on a cell */
		public void mouseExited(MouseEvent e) {
	         jlb0.setBounds(70, 540, 100, 140);
	         jlbDetail.setIcon(null);
		}
	}
	
	private class ClickMouseListener1 extends MouseAdapter {
		@Override /** Handle mouse click on a cell */
		public void mouseClicked(MouseEvent e) {
			if(jlb1.getIcon()!=null){
				jlb5[uporder5].setIcon(jlb1.getIcon());
				jlb1.setIcon(null);
				
				play();
			}
		}
	}
	
	private class EnterMouseListener1 extends MouseAdapter {
		@Override /** Handle mouse click on a cell */
		public void mouseEntered(MouseEvent e) {
	         jlb1.setBounds(270, 540-20, 100, 140);
	         displayCardDetail(jlb1);
		}
	}
	
	private class ExitMouseListener1 extends MouseAdapter {
		@Override /** Handle mouse click on a cell */
		public void mouseExited(MouseEvent e) {
	         jlb1.setBounds(270, 540, 100, 140);
	         jlbDetail.setIcon(null);
		}
	}
	
	
	public void initDeck(JLabel[] j) {
		for(int i =0;i<16;i++){
			j[i] = new JLabel(card0);
		}
	}
	
	public void initDeck2(JLabel[] j) {
		for(int i =0;i<7;i++){
			j[i] = new JLabel();
			j[i].setBounds(240-i*40, 210, 100, 140);
			JP1.add(j[i]);
		}
	}
	
	public void initDeck3(JLabel[] j) {
		for(int i =0;i<7;i++){
			j[i] = new JLabel();
			j[i].setBounds(240-i*40, 370, 100, 140);
			JP1.add(j[i]);
		}
	}
	
	public void setDeck(JLabel[] j) {
		for(int i =0;i<16;i++){
			j[i].setBounds(570+i, 300+i, 100, 140);
			JP1.add(j[i]);
		}
	}
	
	public void displayCardDetail(JLabel j) {
		if(j.getIcon() == card1){
			jlbDetail.setIcon(card11);
		}
		else if(j.getIcon() == card2){
			jlbDetail.setIcon(card12);
		}
		else if(j.getIcon() == card3){
			jlbDetail.setIcon(card13);
		}
		else if(j.getIcon() == card4){
			jlbDetail.setIcon(card14);
		}
		else if(j.getIcon() == card5){
			jlbDetail.setIcon(card15);
		}
		else if(j.getIcon() == card6){
			jlbDetail.setIcon(card16);
		}
		else if(j.getIcon() == card7){
			jlbDetail.setIcon(card17);
		}
		else if(j.getIcon() == card8){
			jlbDetail.setIcon(card18);
		}
	}
	
	public int getcardnumber(JLabel j) {
		if(j.getIcon() == card1){
			return 1;
		}
		else if(j.getIcon() == card2){
			return 2;
		}
		else if(j.getIcon() == card3){
			return 3;
		}
		else if(j.getIcon() == card4){
			return 4;
		}
		else if(j.getIcon() == card5){
			return 5;
		}
		else if(j.getIcon() == card6){
			return 6;
		}
		else if(j.getIcon() == card7){
			return 7;
		}
		else if(j.getIcon() == card8){
			return 8;
		}
		else {
			return 0;
		}
	}
	
	public void shuffle(JLabel[] j) {
		
		for (int i = 0; i < 16; i++) {
			int index = (int)(Math.random() * j.length);
			JLabel temp = j[i];
			j[i] = j[index]; 
			j[index] = temp;
		}
		
	}
	
	public void play() {
		
		if(jlb5[uporder5].getIcon()==card1){
			
			jlbguess.setBounds(400, 500, 200, 140);
			jlbguess.setFont(new Font("Courie", Font.BOLD, 18));
			JP1.add(jlbguess);
			
			guess.setBounds(480, 600, 50, 50);
			guess.setFont(new Font("Courie", Font.BOLD, 20));
			JP1.add(guess);
			
			jbtguess.setBounds(550, 600, 80, 50);
			jbtguess.setFont(new Font("Courie", Font.BOLD, 20));
			JP1.add(jbtguess);
			jbtguess.addActionListener(guesslistener1);
			repaint();
			
		}
		
		else if(jlb5[uporder5].getIcon()==card2){

			jbtpeep.setBounds(550, 600, 80, 50);
			jbtpeep.setFont(new Font("Courie", Font.BOLD, 20));
			JP1.add(jbtpeep);
			jbtpeep.addActionListener(peepListener1);
			repaint();
		}
		
		else if(jlb5[uporder5].getIcon()==card3){

			jbtcompare.setBounds(550, 600, 120, 50);
			jbtcompare.setFont(new Font("Courie", Font.BOLD, 20));
			JP1.add(jbtcompare);
			jbtcompare.addActionListener(new CompareListener());
			repaint();
		}
		
		else if(jlb5[uporder5].getIcon()==card4){
			jlbfuck = new JLabel("無敵1回合!");
			jlbfuck.setBounds(400, 500, 200, 140);
			jlbfuck.setFont(new Font("Courie", Font.BOLD, 28));
			JP1.add(jlbfuck);
			
			computer();
		}
		
		else if(jlb5[uporder5].getIcon()==card5){
			jbtchoose1.setBounds(550, 550, 120, 50);
			jbtchoose1.setFont(new Font("Courie", Font.BOLD, 20));
			JP1.add(jbtchoose1);
			jbtchoose1.addActionListener(choose1Listener1);
			
			jbtchoose2.setBounds(550, 630, 120, 50);
			jbtchoose2.setFont(new Font("Courie", Font.BOLD, 20));
			JP1.add(jbtchoose2);
			jbtchoose2.addActionListener(choose2Listener1);
			repaint();
		}
		
		else if(jlb5[uporder5].getIcon()==card6){
			jbtchange.setBounds(550, 600, 120, 50);
			jbtchange.setFont(new Font("Courie", Font.BOLD, 20));
			JP1.add(jbtchange);
			jbtchange.addActionListener(new ChangeListener());
		}
		
		else if(jlb5[uporder5].getIcon()==card7){
			computer();
		}
		
		else if(jlb5[uporder5].getIcon()==card8){
			lose();
		}
		
	
	}
	
	public void computer(){

		cardorder++;
		if(cardorder>=16){
			finalresult();
		}
		else{
			jlbcom2.setIcon(jlbs[cardorder].getIcon());
			JP1.remove(jlbDeck[cardorder]);
		
			int a = (int)(Math.random() * 2);
		
			if(a==1){
				jlb4[uporder4].setIcon(jlbcom2.getIcon());
				jlbcom2.setIcon(null);
			}
			else{
				jlb4[uporder4].setIcon(jlbcom.getIcon());
				jlbcom.setIcon(jlbcom2.getIcon());
				jlbcom2.setIcon(null);
			}
		
			cardorder++;
			uporder4++;
			uporder5++;
			repaint();
		
			if(cardorder>=16){
				finalresult();
			}
			else{
				jlbDeck[cardorder].addMouseListener(new ClickMouseListener00());
			}
		}
	}
	
	public void finalresult(){
		jbtresult.setBounds(550, 600, 150, 50);
		jbtresult.setFont(new Font("Courie", Font.BOLD, 20));
		JP1.add(jbtresult);
		jbtresult.addActionListener(new ResultListener());
		repaint();
	}
	
	public void win(){
		JFrame frame = new JFrame();
		JLabel lb1 = new JLabel("Win!!!");
		lb1.setFont(new Font("Courie", Font.BOLD, 150));
		lb1.setForeground(Color.MAGENTA);
		
		frame.setTitle("Result");
		frame.add(lb1);
		frame.pack();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void lose(){
		JFrame frame = new JFrame();
		JLabel lb1 = new JLabel("Lose!!!");
		lb1.setFont(new Font("Courie", Font.BOLD, 150));
		lb1.setForeground(Color.MAGENTA);
		
		frame.setTitle("Result");
		frame.add(lb1);
		frame.pack();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void guessfail(){
		
		jlbfuck = new JLabel("猜錯了!!!");
		jlbfuck.setBounds(400, 500, 200, 140);
		jlbfuck.setFont(new Font("Courie", Font.BOLD, 28));
		JP1.add(jlbfuck);
	}
	
	public static void main(String[] args) {
		JFrame frame = new boardgame();
		frame.setTitle("boardgame");
		frame.setSize(1024, 768);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
