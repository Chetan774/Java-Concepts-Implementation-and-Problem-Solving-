package com.company.Encapsulation;

public class employee {
    private int emp_id;//data hiding
    public void setEmp_id(int emp_id)
    {
        this.emp_id = emp_id;
    }
    public int getEmp_id()
    {
        return emp_id;
    }
}
class main{
    public static void main(String[] args) {
     employee e = new employee();
     e.setEmp_id(1001);
        System.out.println("Employee id is : "+e.getEmp_id());
    }
}

