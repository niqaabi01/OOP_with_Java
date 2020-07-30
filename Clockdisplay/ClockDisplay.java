package Zaio.deliverables;

public class ClockDisplay {
    private CounterDisplay hours;
    private CounterDisplay minutes;

    public ClockDisplay(int pHours, int pMinutes) {
        hours = new CounterDisplay(24);
        hours.setValue(pHours);
        minutes = new CounterDisplay(60);
        minutes.setValue(pMinutes);
    }

    public void setHours(int pHours, int pMinutes ) {
        hours = new CounterDisplay(24);
        hours.setValue(pHours);
        minutes = new CounterDisplay(60);
        minutes.setValue(pMinutes);

    }
    public void tick(){
        minutes.increment();
    }
    public String getDisplayValue(){

        return hours.getDisplayValue()+":"+minutes.getDisplayValue();
    }

}
