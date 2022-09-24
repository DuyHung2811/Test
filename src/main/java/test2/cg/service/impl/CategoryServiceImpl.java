package test2.cg.service.impl;

import test.cg.model.User;
import test2.cg.model.Category;
import test2.cg.service.CategoryService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    public CategoryServiceImpl() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsanpham", "root", "nth050401");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void add(Category category) throws SQLException {

    }

    @Override
    public Category findById(int id) {
        // using try-with-resources to avoid closing resources (boiler plate code)
        Category category = new Category();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement("select * from category where id = ?");) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name = rs.getString("name");
                category = new Category(id, name);

            }
        } catch (SQLException e) {
        }
        return category;
    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public List<Category> findByName(String name) {
        return null;
    }

    @Override
    public List<Category> getByCId(int id) {
        return null;
    }

    @Override
    public List<Category> findAllOrderByAge() {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Category category) throws SQLException {
        return false;
    }
}
