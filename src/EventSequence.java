public class EventSequence extends EventAmount {

	public void start() {
		this.started = true;
		notifyObservers("soy EventSequence");
	}

}
