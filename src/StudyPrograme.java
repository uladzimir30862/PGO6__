public  class StudyPrograme {
    private String direction;
    private String name;
    private int countOfSemesters;
    private static int liczbaMozliwychITN;

    public StudyPrograme(String direction, String name, int semesrt, int liczbaMozliwychITN) {
        this.direction = direction;
        this.name = name;
        this.countOfSemesters = semesrt;
        this.liczbaMozliwychITN = liczbaMozliwychITN;
    }

    public int getCountOfSemesters() {
        return countOfSemesters;
    }
}