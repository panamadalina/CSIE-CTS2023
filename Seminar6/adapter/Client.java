package adapter2;

import java.util.Arrays;

public class Client {
	private String name;
	private int noEvents;
	private int[] costsEvents;
	public Client(String name, int noEvents, int[] costsEvents) {
		super();
		this.name = name;
		this.noEvents = noEvents;
		this.costsEvents = costsEvents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoEvents() {
		return noEvents;
	}
	public void setNoEvents(int noEvents) {
		this.noEvents = noEvents;
	}
	public int[] getCostsEvents() {
		return costsEvents;
	}
	public void setCostsEvents(int[] costsEvents) {
		this.costsEvents = costsEvents;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", noEvents=" + noEvents + ", costsEvents=" + Arrays.toString(costsEvents)
				+ "]";
	}

}
