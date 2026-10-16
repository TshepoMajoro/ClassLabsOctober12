package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws Exception {
        StudentDetails naledi = new StudentDetails(
                "Naledi",
                20,
                76.5,
                true
        );
        naledi.displayStudentDetails();

        //Without discount
        ShoppingTotal shoppingTotal = new ShoppingTotal(
                "HP Pavillion Gaming 15",
                15000.00,
                1
        );
        shoppingTotal.calculateTotalCost();

        //With a 10% discount
        ShoppingTotal shoppingTotal2 = new ShoppingTotal(
                "HP Pavillion Gaming 15",
                15000.00,
                1,
                0.10
        );
        shoppingTotal2.calculateTotalCost();

        TemperatureConverter convertedTemp = new TemperatureConverter(
                32,
                true
        );
        convertedTemp.convert();

        TemperatureConverter convertedTemp2 = new TemperatureConverter(
                60,
                false
        );
        convertedTemp2.convert();

        PassOrFail pass = new PassOrFail(65.0);
        pass.verdict();
        PassOrFail fail = new PassOrFail(45.0);
        fail.verdict();
        PassOrFail invalidInput = new PassOrFail(135);
        invalidInput.verdict();

        GradeCalculator invalidMark = new GradeCalculator(-76);
        invalidMark.outcome();
        GradeCalculator distinction = new GradeCalculator(94);
        distinction.outcome();
        GradeCalculator merit = new GradeCalculator(70);
        merit.outcome();
        GradeCalculator passs = new GradeCalculator(55);
        passs.outcome();
        GradeCalculator faill = new GradeCalculator(34);
        faill.outcome();

        NumberAnalysis analyseNumber = new NumberAnalysis(8);
        analyseNumber.analyze();
        NumberAnalysis analyseNumber2 = new NumberAnalysis(0);
        analyseNumber2.analyze();
        NumberAnalysis analyseNumber3 = new NumberAnalysis(-24);
        analyseNumber3.analyze();
        NumberAnalysis analyseNumber4 = new NumberAnalysis(7);
        analyseNumber4.analyze();
        NumberAnalysis analyseNumber5 = new NumberAnalysis(-11);
        analyseNumber5.analyze();

        LoginCheck credentialsPass = new LoginCheck("John@Doe","IamJohnDoe");
        credentialsPass.validateCredentials("John@Doe","IamJohnDoe");

        LoginCheck credentialsFailUsername = new LoginCheck("Jane_Doe","I@mJaneDoe");
        credentialsFailUsername.validateCredentials("jane_doe","I@mJaneDoe");

        LoginCheck credentialsFailPassword = new LoginCheck("Jane_Doe","I@mJaneDoe");
        credentialsFailPassword.validateCredentials("Jane_Doe","!@mJaneDoe");


        StudentMarks marks = new StudentMarks(new int[]{56, 65, 87, 60, 44});
        marks.getStats();

        ArrayStatistics stats = new ArrayStatistics(new int[]{2,5,7,86,90,65,43,67,12,34});
        stats.acquireStatistics();

        ArraySearch search = new ArraySearch(new int[]{2,5,7,32,5,3,5,6,64,2,35,6,7});
        search.showIndex(2);

        EvenOddArray mixedAray = new EvenOddArray(new int[]{2,5,7,32,5,3,5,6,64,2,35,6,7});
        mixedAray.Display();

        ReverseArray reverse = new ReverseArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        reverse.performReversal();

        Student studentPass = new Student("Marky Mark","2024819471",65);
        studentPass.displayDetails();
        Student studentFail = new Student("Jane Doe","2025927582",49);
        studentFail.displayDetails();

        BankAccount accountValid = new BankAccount("Jane Doe","123456789",1250);
        System.out.println("Pre deposit balance: "+accountValid.getBalance());
        accountValid.deposit(430);
        System.out.println("Post deposit (i.e.R 430) balance: "+accountValid.getBalance());
        accountValid.withdraw(50);
        System.out.println("Post withdrawal (i.e. 50) balance: "+accountValid.getBalance());

        Product product = new Product(1,"Casio",1300,5);
        product.displayDetails();
        product.makeASale(3);
        product.displayDetails();
        product.stockInventory(5);
        product.displayDetails();

        Rectangle rectangle = new Rectangle(100, 70);
        rectangle.displayAreaAndPerimeter();
        rectangle = new Rectangle(23, 50);
        rectangle.displayAreaAndPerimeter();

        Lab5Student student1 = new Lab5Student("123456789","John Doe",new double[]{65,70,67});
        student1.display();
        Lab5Student student2 = new Lab5Student("214366789","Jane Doe",new double[]{58,73,79});
        student2.display();
        Lab5Student student3 = new Lab5Student("202356984","Joe Cage",new double[]{53,45,50});
        student3.display();
        student3.comparePerformance(new Lab5Student[]{student1,student2});

        Lab5Product[] products = new Lab5Product[]{
                new Lab5Product("T-shirt",200,3),
                new Lab5Product("Trouser",350,1),
                new Lab5Product("Belt",100,1),
                new Lab5Product("Blazor",600,1)
                };

        Lab5Product.CartOfProducts cart = new Lab5Product.CartOfProducts(products);
        cart.displayReceipt();

        Employee[] employees = new Employee[]{
                new Employee("HR00MNG","John Doe",35000),
                new Employee("FIN01DPTYMNG","Jane Doe",25000),
                new Employee("OP08SPVSR","Jackson Jenkins",19450),
                new Employee("OP14GNRL","Dan Dorrison",8000)
        };
        Employee.EmployeeDashboard dashboard = new Employee.EmployeeDashboard(employees);
        dashboard.display();

    }
}
