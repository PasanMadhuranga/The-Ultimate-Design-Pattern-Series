package test;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try {
//            FileWriter writer = new FileWriter("./src/test/Hello.txt");
//            writer.write("Dimalsha Madushani\n");
//            writer.write("Pasan Madhuranga\n");
//            writer.write("Sexy Madhuranga\n");
//            writer.close();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

        try{
            FileWriter fileWriter = new FileWriter("./src/test/text_file.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("\nBla Bla Bla");
            bufferedWriter.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

//        try{
//            FileReader fileReader = new FileReader("./src/test/text_file.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
//            }
//            bufferedReader.close();
//        }catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//

//        FileReader r = null;
//        try {
//            r = new FileReader("./src/test/Hello.txt");
//            int c;
//            while ((c = r.read()) != -1){
//                System.out.print((char) c);
//            }
//        }catch (IOException ex){
//           ex.printStackTrace();
//        }finally {
//            if (r != null){
//                try {
//                    r.close();
//                } catch (IOException e) {
//                    System.out.println("Can't close the file");
//                }
//            }
//        }

        FileReader r = null;
        BufferedReader br = null;
        try {
            r = new FileReader("./src/test/Hello.txt");
            br = new BufferedReader(r);
            String str = null;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }finally {
            if (br != null){
                try {
                    br.close();
                    r = null;
                }catch (IOException ex){}
                br = null;
            }
            if (r != null){
                try{
                    r.close();
                }catch (Exception ex){}
                r = null;
            }
        }

        try{
            Person dimalsha = new Person("Dimalsha", 10);
            Person pasan = new Person("Pasan", 13);
            dimalsha.setCar(new Car("Audi"));

            FileOutputStream fileStream = new FileOutputStream("./src/test/persons.ser");
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);

            objectStream.writeObject(dimalsha);
            objectStream.writeObject(pasan);
            objectStream.close();
        }catch (NotSerializableException ex){
            System.out.println("The class is not Serializable");
        }catch (IOException ex){
            System.out.println("Error");
            ex.printStackTrace();
        }

        try{
            FileInputStream fileInputStream = new FileInputStream("./src/test/persons.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person p1 = (Person) objectInputStream.readObject();
            Person p2 = (Person) objectInputStream.readObject();

            p1.showDetails();
            p2.showDetails();

            objectInputStream.close();
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("./src/test/children.ser");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            ChildClass child = new ChildClass("Pasan", "Amma", new Car("Audi"));
//            objectOutputStream.writeObject(child);
//            objectOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            FileInputStream fileInputStream = new FileInputStream("./src/test/children.ser");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            ChildClass deserializedChild = (ChildClass) objectInputStream.readObject();
//
//            System.out.println(deserializedChild.getChild());
//            System.out.println(deserializedChild.getParent());
//            System.out.println(deserializedChild.getCar());
//
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        var test = new TestExceptions();
//        try{
//            test.func(1);
//        } catch (FileNotFoundException ex){
//            System.out.println();
//        } catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();



    }
}

class TestExceptions{
    public void func(int num) throws FileNotFoundException, InterruptedIOException{
        if (num == 0){
            throw new FileNotFoundException("File not found!!!");
        }else if(num == 1){
            throw new InterruptedIOException("File is interrupted!!!");
        }else if (num == 2){
            throw new IllegalArgumentException();
        }
        System.out.println(num);

    }

    public int divide(int num1, int num2) throws FileNotFoundException {
        if (num2 == 0) {
            throw new FileNotFoundException();
        }
        return num1/num2;
    }

    public void file(){
        try {
            FileReader fileReader = new FileReader("Ted.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class Person implements Serializable{
    private String name;
    private int age;

    private transient Car car;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (car != null){
            System.out.println("Car: " + car.getName());
        }else {
            System.out.println("Car: -");
        }
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


class ParentClass{
    private String parent;

    private Car car;

//    public ParentClass(String parent, Car car) {
//        this.parent = parent;
//        this.car = car;
//    }

    public void parentMehtod(){
        System.out.println("Parent Class Method");
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

class ChildClass extends ParentClass implements Serializable{
    private String child;

    public ChildClass(String child, String parent, Car car) {
//        super(parent, car);
        this.child = child;
        setParent(parent);
        setCar(car);
    }


    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }
}