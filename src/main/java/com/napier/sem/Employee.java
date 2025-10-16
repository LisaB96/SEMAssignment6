package com.napier.sem;

    /**
     * Represents an employee
     */
    public class Employee
    {
        /**
         * Employee number
         */
        public int emp_no;

        /**
         * Employee's first name
         */
        public String first_name;

        /**
         * Employee's last name
         */
        public String last_name;

        /**
         * Employee's job title
         */
        public String title;

        /**
         * Employee's salary
         */
        public int salary;

        /**
         * Employee's current department
         */
        public String dept_name;

        /**
         * Employee's manager
         */
        public String manager;


    }

    /*
    public Employee(int empNo, String firstName, String lastName) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public int getEmpNo() {
        return empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empNo=" + empNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
*/