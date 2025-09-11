class Color {
    public String[] colors = {"Red", "Blue", "Green", "Yellow"};

    public void colorName() {
        System.out.println("Total Colors = " + colors.length);
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Color = " + colors[i]);
        }
    }
}