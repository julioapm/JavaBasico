package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream("arq.bin"));
			out.writeInt(1);
			out.writeBoolean(false);
			out.writeFloat(1F);
		} finally {
			if (out != null) {
				out.close();
			}
		}
		try {
			in = new DataInputStream(new FileInputStream("arq.bin"));
			System.out.println(in.readInt());
			System.out.println(in.readBoolean());
			System.out.println(in.readFloat());
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

}
