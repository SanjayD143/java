class FestivalRunner {
    public static void main(String[] args) {
        int days = Festival.totalDays(5);
        boolean national = Festival.isNationalFestival(true);
        String name = Festival.festivalName("Diwali");
        long visitors = Festival.visitorsCount(100000);
        double budget = Festival.festivalBudget(500000.50);
        char code = Festival.festivalCode('F');
        float prepTime = Festival.preparationTime(2.5f);

        System.out.println(days);
        System.out.println(national);
        System.out.println(name);
        System.out.println(visitors);
        System.out.println(budget);
        System.out.println(code);
        System.out.println(prepTime);
    }
}

