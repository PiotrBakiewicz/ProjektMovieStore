public class Customers {
    private String name;
    private String adress;
    private String sex;
    private String email;
    private int phone;
    private int age;

    Customers(String name,
            String adress,
            String sex,
            String email,
            int phone,
            int age) {
        this.name = name;
        this.adress = adress;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.age = age;

    }






    public void showCustomers() {
        System.out.println("Nazwisko: " + name);
        System.out.println("Adres: " + adress);
        System.out.println("Płeć: " + sex);
        System.out.println("E-mail: " + email);
        System.out.println("Telefon: " + phone);
        System.out.println("Wiek: " + age);
    }

    public boolean sprawdzNazwisko(String tytul) {
        return this.adress == name;
    }

}
