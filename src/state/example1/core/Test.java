package state.example1.core;

public class Test {
	public static void main(String[] args) {
		Context context = new Context();
		context.setListState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}
}
