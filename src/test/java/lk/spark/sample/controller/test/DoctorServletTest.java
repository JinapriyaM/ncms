package lk.spark.sample.controller.test;

import lk.spark.sample.controller.DoctorServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.mock;

public class DoctorServletTest {
    public void testDoPost(){
        DoctorServlet doctorServlet = mock(DoctorServlet.class);
        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
        HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);

    }
}
