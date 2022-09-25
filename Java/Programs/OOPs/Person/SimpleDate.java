package Person;
public class SimpleDate {
    
    private byte day;
    private byte month;
    private short year;

    public SimpleDate(SimpleDate copyVar) {
        this(copyVar.getDay(), copyVar.getMonth(), copyVar.getYear());
    }

    public SimpleDate(byte day, byte month, short year) {
        if(SimpleDate.checkDate(day)) {
            this.day = day;
        }
        if(SimpleDate.checkMonth(month)) {
            this.month = month;
        }
        if(SimpleDate.checkYear(year)) {
            this.year = year;
        }
    }

    public void setDay(byte day) {
        if(SimpleDate.checkDate(day)){
            this.day=day;
        }
    }

    public void setMonth(byte month) {
        if(SimpleDate.checkMonth(month)){
            this.month = month;
        }
    }

    public void setYear(short year) {
        if(SimpleDate.checkYear(year)){
            this.year = year;
        }
    }

    public byte getDay(){
        return day;
    }

    public byte getMonth(){
        return month;
    }

    public short getYear(){
        return year;
    }

    private static boolean checkDate(byte day) {
        if(day> (byte) 0 && day< (byte) 32) {
            return true;
        }
        return false;
    }

    private static boolean checkMonth(byte month) {
        if( month > (byte) 0 && month < (byte) 13) {
            return true;
        }
        return false;
    }

    private static boolean checkYear(short year) {
        if( year > (short) -1) {
            return true;
        }
        return false;
    }

    public boolean compareDate(SimpleDate comparedDate) {
        if(this.year<comparedDate.getYear()) {
            return true;
        }
        if(this.year>comparedDate.getYear()) {
            return false;
        }

        if(this.month<comparedDate.getMonth()) {
            return true;
        }
        if(this.month>comparedDate.getMonth()) {
            return false;
        }

        if(this.day<comparedDate.getDay()) {
            return true;
        }

        return false;
    }

    public boolean equals(Object comparedObject) {
        if(this == comparedObject) {
            return true;
        }
        if(!(comparedObject instanceof SimpleDate)) {
            return false;
        }

        SimpleDate compare = (SimpleDate) comparedObject;

        if(this.day == compare.day && this.month == compare.month && this.year == compare.year) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        this.day++;

        if(this.day>30) {
            this.day = 1;
            this.month++;
        }

        if(this.month>12) {
            this.year++;
            this.day = 1;
            this.month = 1;
        }
    }

    public void howManyDays(int howManyDays) {
        for(int i = 0; i<howManyDays; i++) {
            this.advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate tempDate = new SimpleDate(this);
        tempDate.howManyDays(days);
        return tempDate;
    }
}
