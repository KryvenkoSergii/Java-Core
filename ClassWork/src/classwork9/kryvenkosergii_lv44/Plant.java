package classwork9.kryvenkosergii_lv44;

public class Plant {
	private enum Color {
		White, Red, Blue
	}

	private enum Type {
		Rose, Lavanda, Peony
	}

	private int size;
	private Color color;
	private Type type;

	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	

	public Plant(int size, String color, String type) throws ColorException, TypeException {
		this.size = size;
		Color enumColor = colorToEnum(color);
		Type enumtype = typeToEnum(type);
		this.color = enumColor;
		this.type = enumtype;
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}

	public Color colorToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.Blue;
		case "red":
			return Color.Red;
		case "white":
			return Color.White;
		default:
			throw new ColorException("You entered the wrong color. Only 'white, red, blue'");
		}
	}
	
	public Type typeToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "lavanda":
			return Type.Lavanda;
		case "peony":
			return Type.Peony;
		case "rose":
			return Type.Rose;
		default:
			throw new TypeException("You entered the wrong type. Only 'lavanda, peony, rose'");
		}
	}


}
