package GeekHouse;

public class AlarmClock extends Clock {
    private int alarmHour;
    private int alarmMinute;
    private int alarmSecond;

    public AlarmClock() {
        super();
        alarmHour = 0;
        alarmMinute = 0;
        alarmSecond = 0;
    }

    public AlarmClock(int theHour, int theMinute, int theSecond, int alarmH, int alarmM, int alarmS) {
        super(theHour, theMinute, theSecond);
        setAlarmHour(alarmH);
        setAlarmMinute(alarmM);
        setAlarmSecond(alarmS);
    }

    public void setAlarmHour(int alarmH) {
        if (alarmH >= 0 && alarmH <= 24) {
            alarmHour = alarmH;
        } else {
            throw new IllegalArgumentException("Invalid alarm hour");
        }
    }

    public void setAlarmMinute(int alarmM) {
        if (alarmM >= 0 && alarmM <= 59) {
            alarmMinute = alarmM;
        } else {
            throw new IllegalArgumentException("Invalid alarm minute");
        }
    }

    public void setAlarmSecond(int alarmS) {
        if (alarmS >= 0 && alarmS <= 59) {
            alarmSecond = alarmS;
        } else {
            throw new IllegalArgumentException("Invalid alarm second");
        }
    }

    public int getAlarmHour() {
        return alarmHour;
    }

    public int getAlarmMinute() {
        return alarmMinute;
    }

    public int getAlarmSecond() {
        return alarmSecond;
    }

    public String getCurrentAlarmTime() {
        return "The alarm is set to " + alarmHour + ":" + alarmMinute + ":" + alarmSecond;
    }

    public String toString() {
        return super.toString() + "\nThe alarm is set to " + alarmHour + ":" + alarmMinute + ":" + alarmSecond;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        AlarmClock otherAlarmClock = (AlarmClock) o;
        return alarmHour == otherAlarmClock.alarmHour && alarmMinute == otherAlarmClock.alarmMinute
                && alarmSecond == otherAlarmClock.alarmSecond;
    }
}
