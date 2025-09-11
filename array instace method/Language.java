class Language {
    public String[] languages = {"English", "Kannada", "Hindi", "Spanish"};

    public void languageName() {
        System.out.println("Total Languages = " + languages.length);
        for (int i = 0; i < languages.length; i++) {
            System.out.println("Language = " + languages[i]);
        }
    }
}