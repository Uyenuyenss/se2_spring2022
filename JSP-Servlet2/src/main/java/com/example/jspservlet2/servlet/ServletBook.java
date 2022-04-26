package com.example.jspservlet2.servlet;

import com.example.jspservlet2.dao.BookDAO;
import com.example.jspservlet2.entity.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/")
public class ServletBook extends HttpServlet {
    private BookDAO bookDao;

    public void init(){
        bookDao = new BookDAO();
    }
    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        getBookList(req, resp);
    }

    private void getBookList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Book> listBook = bookDao.selectAllBooks();
        request.setAttribute("books", listBook);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("booklist.jsp");
        requestDispatcher.forward(request, response);

    }

}
