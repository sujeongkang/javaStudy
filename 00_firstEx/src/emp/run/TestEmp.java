package emp.run;
import emp.model.vo.Employee;
import product.model.vo.Products;
public class TestEmp {
	//실행용 클래스
	public static void main(String[] args) {
		//emp.model.vo.Employee  printEmployee
		new Employee().printEmployee();
		new Products().printProduct();
	}
}


