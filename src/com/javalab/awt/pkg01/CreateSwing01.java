package com.javalab.awt.pkg01;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 버튼(Button) 만들기
 *  - 하나의 버튼을 생성하고 이를 JFrame 객체에 추가
 *  - setDefaultCloseOperation(JFrame.EXIT.ON.CLOSE); 프레임 닫기
 */
public class CreateSwing01 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame(); 	// 프레임 생성 (윈도우 '창')
		
		//창이 닫히지만 JVM에는 남아 있음. 그래서 (X표시 눌러서 닫았을때)창을 완전하게 닫아줌.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b = new JButton("click");	//버튼 생성
		//버튼 위치좌표랑 크기
		b.setBounds(130, 100, 100, 40);	// x axis, y axis, width, height 
		
		f.add(b);	// 버튼을 프레임에 추가 (생성하고 프레임에 붙어줘야 됨)
		
		f.setSize(400, 500); 	// 400 width and 500 height
		f.setLayout(null); 		//별도의 레이아웃은 없음으로 설정
		f.setVisible(true);		//보이기
	}
}
