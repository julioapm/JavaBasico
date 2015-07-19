package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

import geometria.Circulo;

public class Programa {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")));
            out.writeObject(Calendar.getInstance());
        } finally {
        	if(out!=null)
        		out.close();
        }
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("data.bin")));
            Calendar date = (Calendar) in.readObject();
            System.out.format ("%tA, %<tB %<te, %<tY:%n", date);
        } finally {
        	if(in!=null)
        		in.close();
        }

        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("circulo.bin")));
            out.writeObject(new Circulo());
        } finally {
        	if(out!=null)
        		out.close();
        }
        try {
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("circulo.bin")));
            Circulo circ = (Circulo) in.readObject();
            System.out.println(circ);
        } finally {
        	if(in!=null)
        		in.close();
        }
	}
}
