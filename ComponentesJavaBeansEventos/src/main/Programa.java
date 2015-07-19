package main;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import introducao.MyBean;

public class Programa {

	public static void main(String[] args) {
		MyBean bean = new MyBean();
		bean.addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				System.out.println("Evento tratado: " + evt.getPropertyName());
			}
		});
		bean.setTitle("Título");
	}

}
