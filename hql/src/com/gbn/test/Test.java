package com.gbn.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gbn.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Configuration config = new Configuration().addAnnotatedClass(com.gbn.entity.Employee.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		/*String selectAll = "from Employee";
		Query query = session.createQuery(selectAll);
		List<Employee> empList = query.list();
		
		for(Employee e : empList) {
			System.out.println(e);
		}*/
		
		/*String selectAll = "from Employee where empName = :empname";
		Query query = session.createQuery(selectAll);
		query.setString("empname", "Ramesh");
		List<Employee> empList = query.list();
		
		for(Employee e : empList) {
			System.out.println(e);
		}
		*/
		
		/*String selectAll = "from Employee where empName = :empname";
		Query query = session.createQuery(selectAll);
		query.setString("empname", "Ramesh");
		Employee e = (Employee) query.uniqueResult();
			System.out.println(e);
*/

		//update

		/*String selectAll = "update Employee set empName=:empname where empId = :empid";
		Query query = session.createQuery(selectAll);
		query.setString("empname", "rajesh");
		query.setInteger("empid", 1);
		query.executeUpdate();*/
		
		//expression
		
		/*String selectAll = "from Employee where empId > 2";
		Query query = session.createQuery(selectAll);
		List<Employee> empList = query.list();
		
		for(Employee e : empList) {
			System.out.println(e);
		}*/
		
		//aggregations
		
		/*Query query7 = session.createQuery("select sum(empSalary) from Employee");
		long sumSalary = (Long) query7.uniqueResult();
		System.out.println("Sum of all Salaries= "+sumSalary);
		*/
		//delete
		
		/*Query query7 = session.createQuery("delete employee where empId=:empid");
		query7.setInteger("empid", 2);
		query7.executeUpdate();*/
		
		//pagination
	/*	String selectAll = "from Employee";
		Query query = session.createQuery(selectAll);
		query.setFirstResult(0);
		query.setMaxResults(2);
		List<Employee> empList = query.list();
		
		for(Employee e : empList) {
			System.out.println(e);
		}
	*/	
	
		// group by
		/*Query query9 = session.createQuery("select e.empName, sum(e.empSalary), count(e)"
				+ " from Employee e where e.empName like 'r%' group by e.empName");
		List<Object[]> groupList = query9.list();
		for(Object[] arr : groupList){
			System.out.println(Arrays.toString(arr));
		}*/
		
		//order by
		
		Query query10 = session.createQuery("from Employee e order by e.empId desc");
		List<Employee> empList = query10.list();
		for(Employee emp : empList){
			System.out.println(emp);
		}
		
		
		
			tx.commit();
		session.close();
		factory.close();
	}
}
