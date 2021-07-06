package dao;

import model.Order;

import java.util.List;

public class OrderDAO implements DAOGeneral<Order>{
    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Order findById(int id) {
        return null;
    }

    @Override
    public List<Order> findByName(String name) {
        return null;
    }

    @Override
    public void add(Order order) {

    }

    @Override
    public void edit(int id, Order order) {

    }

    @Override
    public void delete(int id) {

    }
}
