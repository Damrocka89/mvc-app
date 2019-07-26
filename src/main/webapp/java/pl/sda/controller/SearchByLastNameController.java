package pl.sda.controller;

import pl.sda.dao.StudentDao;
import pl.sda.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

@WebServlet("/search-by-lastName")
public class SearchByLastNameController extends HttpServlet {

    private final StudentDao studentDao = new StudentDao();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lastName = req.getParameter("lastName");
        List<Student> students = new ArrayList<>();
        students.addAll(studentDao.getStudentByLastName(lastName));
        req.setAttribute("students", students);
        req.getRequestDispatcher("/WEB-INF/view/student-info.jsp").forward(req, resp);
    }
}
