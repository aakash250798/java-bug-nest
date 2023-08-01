package employee_management;
import java.util.List;

/**
 * TODO : a department is a collection of employees. It has a name and a set of employees in it.
 */



public class Department {
    /**
     * TODO : Employees should never ever be duplicated in a single department.
     * Please check if it already exists in the department before inserting if need be. Duplicate
     * here means : their employee id and name are the same.
     *
     * TODO : for our HR officer, give a function to show all details about employees, including
     * their pay.
     */
	
	private List<PartTimeEmployee> partTimeEmployee;
	private List<FullTimeEmployee> fullTimeEmployee;
	
	public void setPartTimeEmployee(List<PartTimeEmployee> partTimeEmployee) {
		this.partTimeEmployee=partTimeEmployee;
	}
	public List<PartTimeEmployee> getPartTimeEmployee() {
		return partTimeEmployee;
	}
	
	
	public void setFullTimeEmployee(List<FullTimeEmployee> fullTimeEmployee) {
		this.fullTimeEmployee=fullTimeEmployee;
	}
	
	public List<FullTimeEmployee> getFullTimeEmployee() {
		return fullTimeEmployee;
	}
	@Override
	public String toString() {
		return "Department [partTimeEmployee=" + partTimeEmployee + ", fullTimeEmployee=" + fullTimeEmployee + "]";
	}
	
	
}
	
	