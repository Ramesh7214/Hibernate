package com.gbn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import com.gbn.model.Employee;

public class PaginationServlet extends HttpServlet {
	
	SessionFactory factory;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		factory = new Configuration().configure().buildSessionFactory();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int pageIndex = 0;
		int totalNumberOfRecords = 0;
		int numberOfRecordsPerPage = 4;
		 
		String sPageIndex = req.getParameter("pageIndex");
		 
		if(sPageIndex ==null)
		{
		pageIndex = 1;
		}else
		{
		pageIndex = Integer.parseInt(sPageIndex);
		}
		 
		Session ses = factory.openSession();
		int s = (pageIndex*numberOfRecordsPerPage) -numberOfRecordsPerPage;
		 
		Criteria crit = ses.createCriteria(Employee.class);
		crit.setFirstResult(s);
		crit.setMaxResults(numberOfRecordsPerPage);
		 
		List l = crit.list();
		Iterator it = l.iterator();
		 
		PrintWriter pw = resp.getWriter();
		pw.println("<table border=1>");
		pw.println("<tr>");
		pw.println("<th>Employee Id</th><th>Employee Name </th><th>Employee Sal</th>");
		pw.println("</tr>");
		 
		while(it.hasNext())
		{
			Employee p = (Employee)it.next();
		pw.println("<tr>");
		pw.println("<td>"+p.getEmpId()+"</td>");
		pw.println("<td>"+p.getEmpName()+"</td>");
		pw.println("<td>"+p.getEmpSal()+"</td>");
		pw.println("</tr>");
		}
		 
		pw.println("<table>");
		
		//-----Code start for pagination links-----
		 
		Criteria crit1 = ses.createCriteria(Employee.class);
		crit1.setProjection(Projections.rowCount());
		 
		List l1=crit1.list();
		 
		Iterator it1 = l1.iterator();
		 
		if(it1.hasNext())
		{
		Object o=it1.next();
		totalNumberOfRecords = Integer.parseInt(o.toString());
		}
		 
		int noOfPages = totalNumberOfRecords/numberOfRecordsPerPage;
		if(totalNumberOfRecords > (noOfPages * numberOfRecordsPerPage))
		{
		noOfPages = noOfPages + 1;
		}
		 
		for(int i=1;i<=noOfPages;i++)
		{
		String myurl = "ind?pageIndex="+i;
		pw.println("<a href="+myurl+">"+i+"</a>");
		}
		 
		ses.close();
		pw.close();}
	
	@Override
	public void destroy() {
		factory.close();
	}

}
