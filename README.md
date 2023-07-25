# employee-management-system
This is an employee management system designed to help Ivan log employee details, track their compensation,
and organize them based on certain criteria. 
 It includes the following methods:
 add_employee: This method allows Ivan to add new employees to the system by creating instances of the Employee class and storing them in a list.

display_all_employees: Ivan can use this method to view a list of all saved employees with their names, designations, and blood groups etc.

modify_employee: If there are any updates to an employee's details, Ivan can use this method to modify the existing employee data based on their name.

get_overpaid_underpaid: This method shows  employees who are considered overpaid and underpaid based on the formula: CTC / Years of Experience > 1.

get_employees_by_blood_group: In case of emergencies, this method helps Ivan retrieve a list of employees grouped by their blood groups.


For your convenience, I have attached the schema of the Employee Management System. Please review it for reference while working on the project.


CREATE TABLE IF NOT EXISTS public.employee_details
(
    ctc real NOT NULL,
    id integer NOT NULL,
    year_of_experiance integer NOT NULL,
    address character varying(255) COLLATE pg_catalog."default",
    blood_group character varying(255) COLLATE pg_catalog."default",
    designation character varying(255) COLLATE pg_catalog."default",
    email character varying(255) COLLATE pg_catalog."default",
    mobile character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    paid_status character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT employee_details_pkey PRIMARY KEY (id)
)
