package event;

public class EventServiceImpl implements EventService {

	@Override
	public void monthEvent() {
		System.out.println("이달의 이벤트");
	}

	@Override
	public void totalEvent() {
		System.out.println("전체 이벤트");

	}
	
	
}
