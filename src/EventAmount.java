import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class EventAmount extends Event implements Observer {

	List<Event> events;

	public EventAmount() {
		this.started = false;
	}

	public void start() {
		this.started = true;
		notifyObservers("soy EventAmount");
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}
