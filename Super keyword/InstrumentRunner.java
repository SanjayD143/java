class InstrumentRunner {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(2021, "Acoustic Guitar", 'A', 15000.0, 54321L,
                                   2.5f, true,
                                   6, "Yamaha", 'G', 1.2,
                                   9876501234L, 9.5f, false);
        guitar.displayGuitar();
    }
}
