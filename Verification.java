import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
//Class for storing credentials of users

class Verification extends PasswordField
{
  protected String [] name = new String [3];
  protected String [] password = new String [3];
  Scanner sc = new Scanner(System.in);
  int flag;
  HashMap<String, String> hmap = new HashMap<String, String>();
  public Verification()
  {
    //Change it to dictionary
  /*  name[0]= "Shivam";
    password[0]= "Shivam@123";
    name[1]= "Mradul";
    password[1] = "Mradul@1122";
    name[2]= "Shanu";
    password[2]= "Shanu@1919";*/

    hmap.put("Shivam","Shivam@123");
    hmap.put("Mradul","Mradul@1122");
    hmap.put("Shanu","Shanu@1919");
    System.out.println("**********LOGIN**********");
  }
  //Method to check whethere the user has entered the right credentials or not.
  void check(String user_name , String user_password)
  {

    /*for(int i=0; i<3;i++)
    {
      if(name[i].equals(user_name) && password[i].equals(user_password))
      {
        flag =1;
        break;
      }
      else
      flag=0;
    }*/
    Set set = hmap . entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
      Map.Entry mentry = (Map.Entry)iterator.next();
      if(mentry.getKey().equals(user_name) && mentry.getValue().equals(user_password))
      {
        flag=1;
        break;
      }
      else
      flag=0;
      }

    if(flag==1)
    {
      System.out.println();
      System.out.println("**********Welcome "+user_name+"********** ");
      System.out.println();
    }
    else
    {
      System.out.println("Invalid login!!! Please try again");
      loginDetails();
    }
  }
  // Inputting login details from user.
  void loginDetails()
  {
    System.out.println();
    System.out.print("Username:");
    String username = sc.nextLine();
     String Password = PasswordField.readPassword("Password:");
   check(username, Password);
  }

}
