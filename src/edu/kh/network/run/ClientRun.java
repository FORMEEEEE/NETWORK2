package edu.kh.network.run;

import edu.kh.network.model.service.TCPClient;

public class ClientRun {

	public static void main(String[] args) {
		TCPClient tc = new TCPClient();
		tc.clientStart();
	}

}
