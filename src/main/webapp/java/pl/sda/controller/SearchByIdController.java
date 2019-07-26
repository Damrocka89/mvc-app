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

@WebServlet("/search-by-id")
public class SearchByIdController extends HttpServlet {

    private final StudentDao studentDao = new StudentDao();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("studentId");
        Student student = studentDao.getStudentById(isNotBlank(id) ? Integer.valueOf(id) : 1);
        List<Student> students=new ArrayList<>();
        students.add(student);
        req.setAttribute("students", students);
        req.getRequestDispatcher("/WEB-INF/view/student-info.jsp").forward(req, resp);
    }
}
