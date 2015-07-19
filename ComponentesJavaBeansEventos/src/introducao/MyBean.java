package introducao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MyBean {
	private String title;
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		String old = this.title;
		this.title = title;
		this.pcs.firePropertyChange("title", old, title);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.pcs.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		this.pcs.removePropertyChangeListener(listener);
	}

}
