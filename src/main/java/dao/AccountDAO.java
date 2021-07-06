package dao;

import model.Account;

import java.util.List;

public class AccountDAO implements DAOGeneral<Account> {
    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account findById(int id) {
        return null;
    }

    @Override
    public List<Account> findByName(String name) {
        return null;
    }

    @Override
    public void add(Account account) {

    }

    @Override
    public void edit(int id, Account account) {

    }

    @Override
    public void delete(int id) {

    }
}
