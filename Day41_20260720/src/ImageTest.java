import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// 이미지 가져오는 클래스!

public class ImageTest {

	public ImageTest() {
		System.out.println("이미지 가져오기!");
// 창 만들기
		JFrame 화면 = new JFrame();

// 화면 설정
		화면.setSize(400, 300);
		화면.setLayout(new FlowLayout());

// 이미지를 가져오는 도구!
// 경로 설정 
//  항상 프로젝트 폴더 안에 넣어놓기 
//  그러면 파일명으로 저장 가능하다.
//  단! 실무에서는 폴더를 나눠 놓습니다.
//  image폴더 그 안에  이미지들 넣어놓고 
//  상대경로 - 파일 자기 자신위치에서 경로를 찾는다.
// 1. 사진 가져오기
		ImageIcon 라이언 = new ImageIcon("ryan.png");
		ImageIcon 무지 = new ImageIcon("muji.png");
		ImageIcon 어피치 = new ImageIcon("muji.png");

// 2. 버튼에 넣기
		JButton 버튼 = new JButton(라이언);
		JButton 무지버튼 = new JButton(무지);
		JButton 어피치버튼 = new JButton(어피치);
		
		버튼.addActionListener(e->{
			System.out.println("라이언 클릭");
		});
		무지버튼.addActionListener(e->{
			System.out.println("무지 클릭");
		});
		어피치버튼.addActionListener(e->{
			System.out.println("어피치 클릭");
		});

// 3. 화면에 추가하기
		화면.add(버튼);
		화면.add(무지버튼);
		화면.add(어피치버튼);

// 보이기
		화면.setDefaultCloseOperation(3);
		화면.setVisible(true);
	}
}