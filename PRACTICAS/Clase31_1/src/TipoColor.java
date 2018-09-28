public enum TipoColor {
    ROJO        (0xFF,0,0),
    AMARILLO    (0xFF, 0xFF, 0),
    VERDE       (0, 0xFF, 0),
    AZUL        (0, 0, 0xFF),
    NARANJA     (0xFF, 0x80, 0),
    BLANCO      (0xFF, 0xFF, 0xFF),
    NEGRO       (0,0,0);

    private int[] RGB;  // {RE, GREEN, BLUE}

    TipoColor(int red, int green, int blue){
        this.RGB=new int[]{red,green,blue};
    }

    @Override
    public String toString() {
        return this.name().toString().charAt(0)+this.name().toString().substring(1).toLowerCase()
                +String.format("[%X,%X,%X]",RGB[0], RGB[1], RGB[2]);
    }
}
