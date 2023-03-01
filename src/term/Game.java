//201620684 김혜지

package term;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class Game extends JFrame {
	Font basic = new Font("맑은 고딕", Font.BOLD, 30);
	Font big = new Font("맑은 고딕", Font.BOLD, 40);
	JPanel wp;
	JPanel dp[] = new JPanel[50];
	JButton dl[] = new JButton[50];
	ImageIcon bg = new ImageIcon("Image/기말과제.png");
	
	public Game() {
		setTitle("변명문");
		setSize(1080,720);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setContentPane(new BGPanel());
		BGM(new File("Image/3763-five-card-shuffle-by-kevin-macleod.wav"));
		
		dp[0] = new JPanel();
		dp[0].setBackground(Color.white);
		dl[0] = new JButton("\"아니?? 기획서랑 다른데 이거??\"");
		Setting(dl[0]);
		dp[0].add(dl[0]);
		add(dp[0]);
		
		dl[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second();	
			}
		});
		
		setVisible(true);
	}

	public void Second() {
		dp[0].setVisible(false);
		dp[1] = new JPanel();
		dp[1].setBackground(Color.white);
		dl[1] = new JButton("맞습니다… 기획서랑 무척 다르죠.");
		Setting(dl[1]);
		dp[1].add(dl[1]);
		add(dp[1]);
		
		dl[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Third();	
			}
		});
		
	}
	
	public void Third() {
		dp[1].setVisible(false);
		dp[2] = new JPanel();
		dp[2].setBackground(Color.white);
		dl[2] = new JButton("이건 일종의 변명같은 겁니다…");
		Setting(dl[2]);
		dp[2].add(dl[2]);
		add(dp[2]);
		
		dl[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Forth();	
			}
		});
	}
	
	public void Forth() {
		dp[2].setVisible(false);
		dp[3] = new JPanel();
		dp[3].setBackground(Color.white);
		dl[3] = new JButton("제가 이걸 계속 붙잡고 있었지만");
		Setting(dl[3]);
		dp[3].add(dl[3]);
		add(dp[3]);
		
		dl[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fifth();	
			}
		});
	}
	
	public void Fifth() {
		dp[3].setVisible(false);
		dp[4] = new JPanel();
		dp[4].setBackground(Color.white);
		dl[4] = new JButton("버튼이 도무지 움직일 생각을 않더라고요.");
		Setting(dl[4]);
		dp[4].add(dl[4]);
		add(dp[4]);
		
		dl[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sixth();	
			}
		});
	}
	
	public void Sixth() {
		dp[4].setVisible(false);
		dp[5] = new JPanel();
		dp[5].setBackground(Color.white);
		dl[5] = new JButton("FlowLayout 때문이냐??");
		Setting(dl[5]);
		dp[5].add(dl[5]);
		add(dp[5]);
		
		dl[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seventh();	
			}
		});
	}
	
	public void Seventh() {
		dp[5].setVisible(false);
		dp[6] = new JPanel();
		dp[6].setBackground(Color.white);
		dl[6] = new JButton("안 되니까 포기하고 쓴 거예요");
		Setting(dl[6]);
		dp[6].add(dl[6]);
		add(dp[6]);
		
		dl[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eighth();	
			}
		});
	}
	
	public void Eighth() {
		dp[6].setVisible(false);
		dp[7] = new JPanel();
		dp[7].setBackground(Color.white);
		dl[7] = new JButton("네… 그렇습니다.");
		Setting(dl[7]);
		dp[7].add(dl[7]);
		add(dp[7]);
		
		dl[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nineth();	
			}
		});
	}
	
	public void Nineth() {
		dp[7].setVisible(false);
		dp[8] = new JPanel();
		dp[8].setBackground(Color.white);
		dl[8] = new JButton("저는 직접 그린, 절 닮은 캐릭터를 내세워");
		Setting(dl[8]);
		dp[8].add(dl[8]);
		add(dp[8]);
		
		dl[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tenth();	
			}
		});
	}
	
	public void Tenth() {
		dp[8].setVisible(false);
		dp[9] = new JPanel();
		dp[9].setBackground(Color.white);
		dl[9] = new JButton("뭐라도 한 척을 하고 있는거죠.");
		Setting(dl[9]);
		dp[9].add(dl[9]);
		add(dp[9]);
		
		dl[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleventh();	
			}
		});
	}
	
	public void Eleventh() {
		dp[9].setVisible(false);
		dp[10] = new JPanel();
		dp[10].setBackground(Color.white);
		dl[10] = new JButton("말그대로 꼼수입니다.");
		Setting(dl[10]);
		dp[10].add(dl[10]);
		add(dp[10]);
		
		dl[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Twelveth();	
			}
		});
	}
	
	public void Twelveth() {
		dp[10].setVisible(false);
		dp[11] = new JPanel();
		dp[11].setBackground(Color.white);
		dl[11] = new JButton("그러나 이 말에는 어폐가 있죠!");
		Setting(dl[11]);
		dp[11].add(dl[11]);
		add(dp[11]);
		
		dl[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thirteenth();	
			}
		});
	}
	
	public void Thirteenth() {
		dp[11].setVisible(false);
		dp[12] = new JPanel();
		dp[12].setBackground(Color.white);
		dl[12] = new JButton("이게 고작 버튼 안 움직이는 것 때문에");
		Setting(dl[12]);
		dp[12].add(dl[12]);
		add(dp[12]);
		
		dl[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fourteenth();	
			}
		});
	}
	
	public void Fourteenth() {
		dp[12].setVisible(false);
		dp[13] = new JPanel();
		dp[13].setBackground(Color.white);
		dl[13] = new JButton("나올 만한 결과물은 아닐텐데…");
		Setting(dl[13]);
		dp[13].add(dl[13]);
		add(dp[13]);
		
		dl[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fifteenth();	
			}
		});
	}
	
	public void Fifteenth() {
		dp[13].setVisible(false);
		dp[14] = new JPanel();
		dp[14].setBackground(Color.white);
		dl[14] = new JButton("메타픽션은? 어디로 간 거야?");
		Setting(dl[14]);
		dp[14].add(dl[14]);
		add(dp[14]);
		
		dl[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sixteenth();	
			}
		});
	}
	
	public void Sixteenth() {
		dp[14].setVisible(false);
		dp[15] = new JPanel();
		dp[15].setBackground(Color.white);
		dl[15] = new JButton("그럼 이제부터 본격적인 변명입니다.");
		Setting(dl[15]);
		dp[15].add(dl[15]);
		add(dp[15]);
		
		dl[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seventeenth();	
			}
		});
	}
	
	public void Seventeenth() {
		dp[15].setVisible(false);
		dp[16] = new JPanel();
		dp[16].setBackground(Color.white);
		dl[16] = new JButton("제가 비록 코딩하는 머리는 딸려도");
		Setting(dl[16]);
		dp[16].add(dl[16]);
		add(dp[16]);
		
		dl[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eighteenth();	
			}
		});
	}
	
	public void Eighteenth() {
		dp[16].setVisible(false);
		dp[17] = new JPanel();
		dp[17].setBackground(Color.white);
		dl[17] = new JButton("스토리 쓰는 건 조금 할 줄 아니까");
		Setting(dl[17]);
		dp[17].add(dl[17]);
		add(dp[17]);
		
		dl[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ninteenth();	
			}
		});
	}
	
	public void Ninteenth() {
		dp[17].setVisible(false);
		dp[18] = new JPanel();
		dp[18].setBackground(Color.white);
		dl[18] = new JButton("진심으로 스토리를 쓰려고 했거든요?");
		Setting(dl[18]);
		dp[18].add(dl[18]);
		add(dp[18]);
		
		dl[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Twentieth();	
			}
		});
	}
	
	public void Twentieth() {
		dp[18].setVisible(false);
		dp[19] = new JPanel();
		dp[19].setBackground(Color.white);
		dl[19] = new JButton("근데 메타픽션을 써본 적도 없고…");
		Setting(dl[19]);
		dp[19].add(dl[19]);
		add(dp[19]);
		
		dl[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TwentyFirst();	
			}
		});
	}
	
	public void TwentyFirst() {
		dp[19].setVisible(false);
		dp[20] = new JPanel();
		dp[20].setBackground(Color.white);
		dl[20] = new JButton("뭘 해도 기존작의 아류 같아서요…");
		Setting(dl[20]);
		dp[20].add(dl[20]);
		add(dp[20]);
		
		dl[20].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TwentySecond();	
			}
		});
	}
	
	public void TwentySecond() {
		dp[20].setVisible(false);
		dp[21] = new JPanel();
		dp[21].setBackground(Color.white);
		dl[21] = new JButton("아니 창작자로서의 자존심이 있지…");
		Setting(dl[21]);
		dp[21].add(dl[21]);
		add(dp[21]);
		
		dl[21].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TwentyThird();	
			}
		});
	}
	
	public void TwentyThird() {
		dp[21].setVisible(false);
		dp[22] = new JPanel();
		dp[22].setBackground(Color.white);
		dl[22] = new JButton("어떻게 아류작을 쓴단 말인가요??");
		Setting(dl[22]);
		dp[22].add(dl[22]);
		add(dp[22]);
		
		dl[22].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TwentyFourth();	
			}
		});
	}
	
	public void TwentyFourth() {
		dp[22].setVisible(false);
		dp[23] = new JPanel();
		dp[23].setBackground(Color.white);
		dl[23] = new JButton("네… 작업을 시작한 이래로 쭉");
		Setting(dl[23]);
		dp[23].add(dl[23]);
		add(dp[23]);
		
		dl[23].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TwentyFifth();	
			}
		});
	}
	
	public void TwentyFifth() {
		dp[23].setVisible(false);
		dp[24] = new JPanel();
		dp[24].setBackground(Color.white);
		dl[24] = new JButton("변명할 생각뿐이었던 거죠… 하지만!");
		Setting(dl[24]);
		dp[24].add(dl[24]);
		add(dp[24]);
		
		dl[24].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TwentySixth();	
			}
		});
	}
	
	public void TwentySixth() {
		dp[24].setVisible(false);
		dp[25] = new JPanel();
		dp[25].setBackground(Color.white);
		dl[25] = new JButton("지금 제가 창 너머로 변명하고 있단 점에서");
		Setting(dl[25]);
		dp[25].add(dl[25]);
		add(dp[25]);
		
		dl[25].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TwentySeventh();	
			}
		});
	}
	
	public void TwentySeventh() {
		dp[25].setVisible(false);
		dp[26] = new JPanel();
		dp[26].setBackground(Color.white);
		dl[26] = new JButton("일단 '메타'는 맞는 거 아닐까요?");
		Setting(dl[26]);
		dp[26].add(dl[26]);
		add(dp[26]);
		
		dl[26].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TwentyEighth();	
			}
		});
	}
	
	public void TwentyEighth() {
		dp[26].setVisible(false);
		dp[27] = new JPanel();
		dp[27].setBackground(Color.white);
		dl[27] = new JButton("제겐 이 상황이 믿기지 않고 픽션 같으니");
		Setting(dl[27]);
		dp[27].add(dl[27]);
		add(dp[27]);
		
		dl[27].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TwentyNineth();	
			}
		});
	}
	
	public void TwentyNineth() {
		dp[27].setVisible(false);
		dp[28] = new JPanel();
		dp[28].setBackground(Color.white);
		dl[28] = new JButton("나름 '픽션'도 충족한 셈이네요!");
		Setting(dl[28]);
		dp[28].add(dl[28]);
		add(dp[28]);
		
		dl[28].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thirtieth();	
			}
		});
	}
	
	public void Thirtieth() {
		setTitle("정말 쉽다! 메타픽션!");
		dp[28].setVisible(false);
		dp[29] = new JPanel();
		dp[29].setBackground(Color.white);
		dl[29] = new JButton("정말 쉽다! 메타픽션!");
		Setting(dl[29]);
		dl[29].setFont(big);
		dp[29].add(dl[29]);
		add(dp[29]);
		
		dl[29].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirtyFirst();	
			}
		});
		Effect(new File("Image/YEAH.wav"));
	}
	
	public void ThirtyFirst() {
		dp[29].setVisible(false);
		dp[30] = new JPanel();
		dp[30].setBackground(Color.white);
		dl[30] = new JButton("하지만 기획서도 썼는데 양심적으로");
		Setting(dl[30]);
		dp[30].add(dl[30]);
		add(dp[30]);
		
		dl[30].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirtySecond();	
			}
		});
	}
	
	public void ThirtySecond() {
		dp[30].setVisible(false);
		dp[31] = new JPanel();
		dp[31].setBackground(Color.white);
		dl[31] = new JButton("선택지는 고를 수 있어야지 않나?");
		Setting(dl[31]);
		dp[31].add(dl[31]);
		add(dp[31]);
		
		dl[31].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirtyThird();	
			}
		});
	}
	
	public void ThirtyThird() {
		dp[31].setVisible(false);
		dp[32] = new JPanel();
		dp[32].setBackground(Color.white);
		dl[32] = new JButton("그래서 준비한 깜짝 퀴즈!");
		Setting(dl[32]);
		dp[32].add(dl[32]);
		add(dp[32]);
		
		dl[32].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirtyFourth();	
			}
		});
		Effect(new File("Image/짜잔.wav"));
	}
	
	public void ThirtyFourth() {
		dp[32].setVisible(false);
		dp[33] = new JPanel();
		dp[33].setBackground(Color.white);
		dl[33] = new JButton("제가 다니는 학교는 어디일까요?");
		Setting(dl[33]);
		dp[33].add(dl[33]);
		add(dp[33]);
		
		dl[33].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirtyFifth();	
			}
		});
	}
	
	public void Wrong() {
		dp[33].setVisible(false);
		dp[34].setVisible(false);
		wp = new JPanel();
		wp.setBackground(Color.white);
		JButton wrong3= new JButton("아, 아닌데요?! 자세히 보세요!!");
		Setting(wrong3);
		wp.add(wrong3);
		add(wp);
		
		wrong3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wp.setVisible(false);
				ThirtyFifth();
			}
		});
		Effect(new File("Image/띠용.wav"));
	}
	
	public void ThirtyFifth() {
		dp[33].setVisible(false);
		dp[34] = new JPanel();
		dp[34].setVisible(true);
		dp[34].setBackground(Color.white);
		dl[34] = new JButton("1.상명대");
		JButton wrong1= new JButton("2.상띵대");
		JButton wrong2= new JButton("3.상명머");
		Setting(dl[34]); Setting(wrong1); Setting(wrong2);
		dp[34].add(dl[34]); dp[34].add(wrong1); dp[34].add(wrong2);
		add(dp[34]);
		
		
		dl[34].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirtySixth();	
			}
		});
		wrong1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Wrong();	
			}
		});
		wrong2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Wrong();	
			}
		});
	}
	
	public void ThirtySixth() {
		dp[34].setVisible(false);
		dp[35] = new JPanel();
		dp[35].setBackground(Color.white);
		dl[35] = new JButton("이야~ 이런 고도의 눈속임을 간파하시다니!");
		Setting(dl[35]);
		dp[35].add(dl[35]);
		add(dp[35]);
		
		dl[35].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirtySeventh();	
			}
		});
		Effect(new File("Image/박수.wav"));
	}
	
	
	public void ThirtySeventh() {
		dp[35].setVisible(false);
		dp[36] = new JPanel();
		dp[36].setBackground(Color.white);
		dl[36] = new JButton("역시! 정말 대단하세요!");
		Setting(dl[36]);
		dp[36].add(dl[36]);
		add(dp[36]);
		
		dl[36].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirtyEighth();	
			}
		});
	}
	
	public void ThirtyEighth() {
		dp[36].setVisible(false);
		dp[37] = new JPanel();
		dp[37].setBackground(Color.white);
		dl[37] = new JButton("장난스러워보였을지도 모르겠지만…");
		Setting(dl[37]);
		dp[37].add(dl[37]);
		add(dp[37]);
		
		dl[37].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirtyNineth();	
			}
		});
	}
	
	public void ThirtyNineth() {
		dp[37].setVisible(false);
		dp[38] = new JPanel();
		dp[38].setBackground(Color.white);
		dl[38] = new JButton("여기까지 와주셔서 감사합니다.");
		Setting(dl[38]);
		dp[38].add(dl[38]);
		add(dp[38]);
		
		dl[38].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fourtieth();	
			}
		});
	}
	
	public void Fourtieth() {
		dp[38].setVisible(false);
		dp[39] = new JPanel();
		dp[39].setBackground(Color.white);
		dl[39] = new JButton("제 구구절절 변명문은 이걸로 끝이에요.");
		Setting(dl[39]);
		dp[39].add(dl[39]);
		add(dp[39]);
		
		dl[39].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FourtyFirst();	
			}
		});
	}
	
	public void FourtyFirst() {
		dp[39].setVisible(false);
		dp[40] = new JPanel();
		dp[40].setBackground(Color.white);
		dl[40] = new JButton("그럭저럭 재미있으셨나요?");
		Setting(dl[40]);
		dp[40].add(dl[40]);
		add(dp[40]);
		
		dl[40].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FourtySecond();	
			}
		});
	}
	
	public void FourtySecond() {
		dp[40].setVisible(false);
		dp[41] = new JPanel();
		dp[41].setBackground(Color.white);
		dl[41] = new JButton("코드가 밑도 끝도 없이 길어져서");
		Setting(dl[41]);
		dp[41].add(dl[41]);
		add(dp[41]);
		
		dl[41].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FourtyThird();	
			}
		});
	}
	
	public void FourtyThird() {
		
		dp[41].setVisible(false);
		dp[42] = new JPanel();
		dp[42].setBackground(Color.white);
		dl[42] = new JButton("이만 줄여야겠네요…");
		Setting(dl[42]);
		dp[42].add(dl[42]);
		add(dp[42]);
		
		dl[42].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FourtyFourth();	
			}
		});
	}
	
	public void FourtyFourth() {
		dp[42].setVisible(false);
		dp[43] = new JPanel();
		dp[43].setBackground(Color.white);
		dl[43] = new JButton("행복한 방학 보내시고 건강하세요!");
		Setting(dl[43]);
		dp[43].add(dl[43]);
		add(dp[43]);
		
		dl[43].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FourtyFifth();	
			}
		});
	}
	
	public void FourtyFifth() {
		dp[43].setVisible(false);
		dp[44] = new JPanel();
		dp[44].setBackground(Color.white);
		dl[44] = new JButton("그럼… 안녕히~!!");
		Setting(dl[44]);
		dp[44].add(dl[44]);
		add(dp[44]);
		
		dl[44].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		});
	}

	public class BGPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Image img = bg.getImage();
			g.drawImage(img, 0, 0, 1080, 720, this);
		}
	}
	
	public void Setting(JComponent b) {
		b.setFont(basic);
		b.setBackground(Color.white);
		b.setForeground(Color.black);
	}
	
	public void BGM(File f) {
		try {
			AudioInputStream bgm = AudioSystem.getAudioInputStream(f);
			Clip clip = AudioSystem.getClip();
			clip.open(bgm);
			clip.start();
			clip.loop(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Effect(File f) {
		try {
			AudioInputStream bgm = AudioSystem.getAudioInputStream(f);
			Clip clip = AudioSystem.getClip();
			clip.open(bgm);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Game();
	}

}