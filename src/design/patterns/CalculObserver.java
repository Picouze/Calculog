package design.patterns;

import java.util.Observable;
import java.util.Observer;

public class CalculObserver implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg);
	}
}
