package test2.cg.controller;

import test2.cg.model.Category;
import test2.cg.model.Product;
import test2.cg.service.CategoryService;
import test2.cg.service.ProductService;
import test2.cg.service.impl.CategoryServiceImpl;
import test2.cg.service.impl.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/Product")
public class ProductServlet extends HttpServlet {
    ProductService productService = new ProductServiceImpl();
    CategoryService categoryService = new CategoryServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product/list.jsp");
        List<Product> productList = productService.findAll();
        List<Category> categoryList = findAllCategory(productList);
        String cateID = request.getParameter("category");
        if (cateID!=null) productList = productService.getByCId(Integer.parseInt(cateID));
        request.setAttribute("listcategory", categoryList);
        request.setAttribute("listproduct", productList);
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    List<Category> findAllCategory(List<Product> products){
        List<Category> list = new ArrayList<>();
        for(int i=0; i<products.size(); i++){
         Category category =   categoryService.findById(products.get(i).getCategoryId());
         list.add(category);
        }
        return list;
    }

}
