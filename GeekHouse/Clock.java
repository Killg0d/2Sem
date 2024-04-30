package GeekHouse;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock() {
        this(0, 0, 0);
    }

    public Clock(int theHour, int theMinute, int theSecond) {
        setHour(theHour);
        setMinute(theMinute);
        setSecond(theSecond);
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Clock otherClock = (Clock) o;
        return hour == otherClock.hour && minute == otherClock.minute && second == otherClock.second;
    }
}
