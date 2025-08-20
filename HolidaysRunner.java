class HolidaysRunner {
    public static void main(String[] args) {
        int total = Holidays.totalHolidays(15);
        boolean approved = Holidays.holidayApproved(true);
        char fest = Holidays.festivalName('H');
        double govt = Holidays.govtHoliday(3.5);
        float leave = Holidays.personalLeave(1.5f);
        long loss = Holidays.totalLoss(10000);
        String manager = Holidays.managerName("Raj");

        System.out.println(total);
        System.out.println(approved);
        System.out.println(fest);
        System.out.println(govt);
        System.out.println(leave);
        System.out.println(loss);
        System.out.println(manager);
    }
}
