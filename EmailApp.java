package Email;

public class EmailApp{

public static void main(String[] args) {
    Email obj= new Email("John","DuraiRaj");
   System.out.println(obj.showInfo());
   obj.setalternateEmail("@StudioDiseno.com");
   System.out.println(obj.getAlternateEmail());
}


}