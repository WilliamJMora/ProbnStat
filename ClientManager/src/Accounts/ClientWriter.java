package Accounts;

public class ClientWriter {

	Client One, Two, Three;
	ClientLoader cl = new ClientLoader(); {
	
	One = new Client("First1", "Last1", "111-111-1111");
	Two = new Client("First2", "Last2", "222-222-2222");
	Three = new Client("First3", "Last3", "333-333-3333");
	
	cl.clientsList.add(One);
	cl.clientsList.add(Two);
	cl.clientsList.add(Three);
	
	}
}