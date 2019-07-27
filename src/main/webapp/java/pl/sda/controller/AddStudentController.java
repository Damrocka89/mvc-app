package pl.sda.controller;

import pl.sda.dao.StudentDao;
import pl.sda.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add-student")
public class AddStudentController extends HttpServlet {

    private final StudentDao studentDao = new StudentDao();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String lastName = req.getParameter("lastName");
        String firstName=req.getParameter("firstName");
        int id=Integer.parseInt(req.getParameter("id"));

        studentDao.addStudent(new Student(id, firstName, lastName));

        req.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(req, resp);

    }
}
