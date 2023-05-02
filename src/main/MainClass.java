package main;

import java.util.Scanner;

import event.EventService;
import event.EventServiceImpl;
import member.MemberService;
import member.MemberServiceImpl;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	EventService e = null;
	MemberService m = null;
	
	System.out.println("1.회원이동 2.이벤트이동");
	System.out.print(">>> ");
	
	int num = input.nextInt();
	
	if(num == 1) {
		m = new MemberServiceImpl();
		System.out.println("1.회원저장 2.멤버항목");
		System.out.print(">>> ");
		int memNum = input.nextInt();
		
		if(memNum == 1) {
			m.save();
		}else {
			m.showMember();
		}
		
	}else {
		e = new EventServiceImpl();
		System.out.println("1.이달의이벤트 2.전체이벤트");
		System.out.print(">>> ");
		int eventNum = input.nextInt();
		
		if(eventNum == 1) {
			e.monthEvent();
		}else {
			e.totalEvent();
		}
	}
	
	
	
}
}
