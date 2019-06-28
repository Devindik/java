package design.pattern.kkb.adapter;

public class DesignPatternDemo {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.setDBSocket(new DBSocketAdapter(new GBSocketImpl()));
		hotel.charge();
	}

}
