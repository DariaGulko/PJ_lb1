package nure.ua.hulko.daria.main.java;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by User on 23.10.2016.
 */
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public User(String firstname, String lastNam, Date dateOfBirthd) {
        this.firstName = firstname;
        this.lastName = lastNam;
        this.dateOfBirth = dateOfBirthd;
    }

    public User(Long id, String firstname, String lastNam, Date dateOfBirthd) {
        this.id = id;
        this.firstName = firstname;
        this.lastName= lastNam;
        this.dateOfBirth = dateOfBirthd;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public Object getFullName(){
        return getLastName()+","+getFirstName();
    }
    public int getAge(){
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(new Date());
        int currentYear= calendar.get(Calendar.YEAR);
        calendar.setTime(getDateOfBirth());
        int year =calendar.get(Calendar.YEAR);
        return currentYear-year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id != null ? id.equals(user.id) : user.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

