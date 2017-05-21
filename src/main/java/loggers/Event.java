package loggers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {
    private final Random rnd = new Random();

    private int id;
    private String msg;
    private Date date;
    private DateFormat df;

    Event(Date date, DateFormat df) {
        this.date = date;
        this.id = rnd.nextInt(1000) + 1;
        this.df = df;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Event: " +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + date;
    }
}
