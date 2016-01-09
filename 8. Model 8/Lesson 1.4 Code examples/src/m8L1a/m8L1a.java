package m8L1a;

public class m8L1a {

public static void main (String [] args){

Person P = new Person("Andrew","Grey");
System.out.println(P.getName() + " has " + P.hairColor +" hair ");
P.greet();
System.out.println("============");
Friend F =new Friend ("tony","blond","help you fix that flat tire");
System.out.println(F.getName() + " has " +F.hairColor + " hair");
F.greet();
F.doFavor();
}

}
