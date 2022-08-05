package main.Team.History;

public class History {

    private Year[] years;
    private int totalYearsTracked;

    public History(){
        totalYearsTracked = 0;
        years = new Year[1];
    }
    public void addYear(Year y){
        if(totalYearsTracked + 1 >= years.length){
            Year[] temp = new Year[2*years.length];
            System.arraycopy(years, 0, temp, 0, totalYearsTracked);
            years = temp;
        }
        years[totalYearsTracked] = y;
        totalYearsTracked++;
    }

    public Year[] getYears() {
        return years;
    }

    public int getTotalYearsTracked() {
        return totalYearsTracked;
    }
}
