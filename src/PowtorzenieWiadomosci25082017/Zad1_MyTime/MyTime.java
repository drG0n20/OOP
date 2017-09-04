package PowtorzenieWiadomosci25082017.Zad1_MyTime;

public class MyTime {
    private int _hour = 0;
    private int _minute = 0;
    private int _second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        if (hour < 24 && hour >= 0) {
            _hour = hour;
        } else {
            _hour = -10000;
        }
    }

    public void setMinute(int minute) {
        if (minute < 60 && minute >= 0) {
            _minute = minute;
        } else {
            _minute = -10000;
        }
    }

    public void setSecond(int second) {
        if (second < 60 && second >= 0) {
            _second = second;
        } else {
            _second = -10000;
        }
    }

    public int getHour() {
        return _hour;
    }

    public int getMinute() {
        return _minute;
    }

    public int getSecond() {
        return _second;
    }

    public MyTime nextSecond() {
        if (_second != 59) {
            _second = _second + 1;
        } else {
            nextMinute();
            _second = 0;
        }
        return this;
    }

    public MyTime nextMinute() {
        if (_minute != 59) {
            _minute = _minute + 1;
        } else {
            _minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        _hour = (_hour + 1) % 24;
        return this;
    }

    public MyTime previousSecond() {
        if (_second != 0) {
            _second = _second - 1;
        } else {
            _second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        if (_minute != 0) {
            _minute = _minute - 1;
        } else {
            _minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        if (_hour != 0) {
            _hour = _hour - 1;
        } else {
            _hour = 23;
        }
        return this;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", _hour, _minute, _second);
    }
}



