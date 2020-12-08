public class Person{
  private String name;
  private String email;
  private String phoneNumber;
  
  public Person(String personName, String personEmail, String personNumber)
  {
    name = personName;
    email = personEmail;
    phoneNumber = personNumber;
  }
  
  public void print()
  {
  System.out.println("Name: "+ name);
  System.out.println("Email: "+ email);
  System.out.println("Phone: "+ phoneNumber);
  }
}