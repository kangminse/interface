package member;

public class MemberServiceImpl implements MemberService {

	@Override
	public void save() {
		System.out.println("회원정보를 등록합니다.");
	}

	@Override
	public void showMember() {
		System.out.println("회원멤버를 보여드립니다.");
	}
	

}
