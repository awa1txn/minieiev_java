# University Management System

## Project Overview

This project implements a University Management System following the Model-View-Controller (MVC) design pattern. The system includes classes representing a university, faculties, departments, groups, students, and humans. It also provides controllers for creating different entities.

## How to Run

1. Clone the repository.
2. Open the project in your preferred Java IDE.
3. Run the `Run` class to execute the main entry point.

## Features

- **University Class:** Represents the university entity.
- **Faculty Class:** Represents the faculty entity.
- **Department Class:** Represents the department entity.
- **Group Class:** Represents the group entity.
- **Student Class:** Represents the student entity, extending the `Human` class.
- **Human Class:** Represents a human entity with name, surname, patronymic, and sex.
- **Sex Enum:** Represents the gender of a human.
- **StudentCreator Class:** Controller class for creating student entities.
- **FacultyCreator Class:** Controller class for creating faculty entities.
- **DepartmentCreator Class:** Controller class for creating department entities.
- **GroupCreator Class:** Controller class for creating group entities.
- **Run Class:** Main entry point with a method to create a typical university.

## Usage

- Customize the `createTypicalUniversity` method in the `Run` class to fit your specific requirements.
- Add more functionalities as needed.

## License

This project is licensed under the [MIT License](LICENSE).
