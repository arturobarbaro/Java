public class Ojo {
    private Color color;

    public Ojo(Color color) {
        setColor(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ojo{" +
                "color=" + color +
                '}';
    }
}
