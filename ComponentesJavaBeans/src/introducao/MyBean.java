package introducao;

public class MyBean {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String[] lines;

	public String[] getLines() {
		return lines;
	}

	public void setLines(String[] lines) {
		this.lines = lines;
	}

	public String getLines(int index) {
		return this.lines[index];
	}

	public void setLines(int index, String lines) {
		this.lines[index] = lines;
	}

}
