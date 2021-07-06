package model;

import java.time.LocalDate;

public class Order {
    private int id;
    private int account_id;
    private int house_id;
    private LocalDate startTime;
    private LocalDate endTime;

    public Order(int id, int account_id, int house_id, LocalDate startTime, LocalDate endTime) {
        this.id = id;
        this.account_id = account_id;
        this.house_id = house_id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }
}
