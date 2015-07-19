package main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner s = null;
		try {
			s = new Scanner(new FileReader("entrada.txt"));
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

}
