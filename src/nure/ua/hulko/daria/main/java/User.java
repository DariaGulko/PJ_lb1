package nure.ua.hulko.daria.main.java;


import sun.util.resources.LocaleData;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by User on 23.10.2016.
 */
public class User {
    /**
    * создаем переменные
    * */
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
/**
 * Устанавливаем для переменных методы доступа
 */
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
        /**
         * второй способ написания метода  getAge()
        */
        /*long ageNow = new Date().getTime() - getDateOfBirthteOfBirth().getTime();

        Date age = new Date(ageNow);

        return age.getYear();*/
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
}
