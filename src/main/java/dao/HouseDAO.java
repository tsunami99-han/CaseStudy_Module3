package dao;

import connection.ConnectionJDBC;
import model.House;

import javax.servlet.RequestDispatcher;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HouseDAO implements DAOGeneral<House> {
    private Connection connection = ConnectionJDBC.getConnection();
    @Override
    public List<House> findAll() {
        List<House> list = new ArrayList<>();
        String sql ="select ";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public House findById(int id) {
        return null;
    }

    @Override
    public List<House> findByName(String name) {
        return null;
    }

    @Override
    public void add(House house) {

    }

    @Override
    public void edit(int id, House house) {

    }

    @Override
    public void delete(int id) {

    }
}
