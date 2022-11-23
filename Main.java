import java.util.*;

class Hospital{
private int patid;
private String pname;
private String tname;
private String bloodgroup;
private String dob;
private String mobileno;
private String mailid;
private String address;
private String gender;
private String dname;

Hospital(int patid, String pname, String tname, String bloodgroup, String dob, String mobileno, String mailid, String address, String gender, String dname )
{
this.patid =patid;
this.pname =pname;
this.tname =tname;
this.bloodgroup =bloodgroup;
this.dob= dob;
this.mobileno = mobileno;
this.mailid = mailid;
this.address = address;
this.gender =gender;
this.dname = dname;
}
public int getPatid()
{
return patid;
}
public String getPname()
{
return pname;
}
public String getTname()
{
return tname;
}
public String getBloodgroup()
{
return bloodgroup;
}
public String getDob()
{
return dob;
}
public String getMobileno()
{
return mobileno;
}
public String getMailid()
{
return mailid;
}
public String getGender()
{
return gender;
}
public String getDname()
{
return dname;
}
public String getAddress()
{
return address;
}

public void setPatid(int patid)
{
    this.patid=patid;
}
public void setPname(String pname)
{
    this.pname=pname;
}
public void setTname(String tname)
{
    this.tname=tname;
}
public void setBloodgroup(String bloodgroup)
{
    this.bloodgroup=bloodgroup;
}
public void setDob(String dob)
{
    this.dob=dob;
}
public void setMobileno(String mobileno)
{
    this.mobileno=mobileno;
}
public void setMailid(String mailid)
{
    this.mailid=mailid;
}
public void setAddress(String address)
{
    this.address=address;
}
public void setGender(String gender)
{
    this.gender=gender;
}
public void setDname(String dname)
{
    this.dname=dname;
}


public String toString(){
return patid+" "+pname+" "+tname+" "+bloodgroup+" "+dob+" "+mobileno+ " "+mailid+" "+address+" "+gender+" "+dname;
}
}

class Main{
public static void main(String[] args)
{
Collection<Hospital> c = new ArrayList<Hospital>();
Scanner s = new Scanner(System.in);
Scanner s1 = new Scanner(System.in);
int ch;
do{
System.out.println("----------------------------------------");
System.out.println("1.ADD PATIENT DETAILS");
System.out.println("2.DISPLAY ALL PATIENT DETAILS");
System.out.println("3.VIEW SINGLE PATIENT DETAILS");
System.out.println("4.DELETE A PATIENT DETAILS");
System.out.println("5.UPDATE A PATIENT DETAILS");
System.out.println("6.exit");
System.out.println("Enter your Choice: ");
ch = s.nextInt();
switch(ch){
case 1: System.out.print("Enter patid :");
        int patid=s.nextInt();
        System.out.print("Enter Patient Name : ");
        String pname = s1.nextLine();
        System.out.print("Enter tname : ");
        String tname = s1.nextLine();
        System.out.print("Enter bloodgroup : ");
        String bloodgroup = s1.nextLine();
        System.out.print("Enter dob : ");
        String dob = s1.nextLine();
        System.out.print("Enter mobileno : ");
        String mobileno= s1.nextLine();
        System.out.print("Enter mailid : ");
        String mailid = s1.nextLine();
        System.out.print("Enter address : ");
        String address = s1.nextLine();
        System.out.print("Enter gender : ");
        String gender = s1.nextLine();
        System.out.print("Enter dname : ");
        String dname = s1.nextLine();
        System.out.println("----------------------------------------");
        
        c.add(new Hospital(patid,pname,tname,bloodgroup,dob,mobileno,mailid,address,gender,dname));
break;

case 2: System.out.println("-----------------------------------------");
        Iterator<Hospital> i = c.iterator();
        while(i.hasNext()){
        Hospital e = i.next();
        System.out.println(e);
        System.out.println("------------------------------------------");
        
        }
        System.out.println("------------------------------------------");
break;

case 3: boolean found = false;
        System.out.println("Enter patid to Search :");
        int pid = s.nextInt();
        System.out.println("-----------------------------------------");
        i = c.iterator();
        while(i.hasNext()){
        Hospital e = i.next();
        if(e.getPatid()==pid){
        System.out.println(e);
        System.out.println("------------------------------------------");
        found = true;
        }
        }
        if(!found){
        System.out.println("Record Not Found");
        }
        System.out.println("----------------------------------------");
break;

case 4: found = false;
        System.out.print("Enter patid to Delete :");
        pid = s.nextInt();
        System.out.println("-----------------------------------------");
        i = c.iterator();
        while(i.hasNext()){
        Hospital e = i.next();
        if(e.getPatid()==pid){
        i.remove();
        found = true;
        }
        }
        if(!found){
        System.out.println("Record Not Found");
        System.out.println("------------------------------------------");
        }
        else{
        System.out.println("Record is Deleted Successfully");
        }
        System.out.println("----------------------------------------");
break;

case 5:
        System.out.println("Enter Patid to update :");
        pid = s.nextInt();
        int j =0;
        System.out.println("-----------------------------------------");
        i = c.iterator();
        while(i.hasNext()){
        Hospital e = i.next();
        if(e.getPatid()==pid){
          j++;
      
        do{
            int ch1=0;
          System.out.println("\nUPDATE PATIENT DETAILS :\n" +
                                  "1)Patient id\n" +
                                  "2)Patient Name\n" +
                                  "3)Tname\n "+
                                  "4)Bloodgroup\n"+
                                  "5)dob\n"+
                                  "6)mobileno\n"+
                                  "7)mailid\n"+
                                  "8)address\n"+
                                  "9)gender\n"+
                                  "10)dname\n"+
                                  "11)exit ");
          System.out.println("Enter your choice : ");
          ch1 = s.nextInt();
          switch(ch1)
          {
           case 1 : System.out.println("\nenter Patient No:");
                    int no = s.nextInt();
                    e.setPatid(no);
                    System.out.println(e+"\n");
                    System.out.println("----------------------------------------");
          break;
         case 2:   System.out.println("Enter Patient name: ");
                   String str = s1.nextLine();
                   e.setPname(str);
                   System.out.println(e+"\n");
                   System.out.println("----------------------------------------");
         break;

         case 3: System.out.println("Enter Tname :");
                   tname = s.nextLine();
                  e.setTname(tname);
                  System.out.println(e+"\n");
                  System.out.println("----------------------------------------");
         break;
         case 4: System.out.println("Enter bloodgroup :");
                   bloodgroup = s.nextLine();
                  e.setBloodgroup(bloodgroup);
                  System.out.println(e+"\n");
                  System.out.println("----------------------------------------");
         break;
         case 5: System.out.println("Enter dob :");
                  String d = s1.nextLine();
                  e.setDob(d);
                  System.out.println(e+"\n");
                  System.out.println("----------------------------------------");
         break;
         case 6: System.out.println("Enter mobileno :");
                  String mob = s.nextLine();
                  e.setMobileno(mob);
                  System.out.println(e+"\n");
                  System.out.println("----------------------------------------");
         break;
         case 7: System.out.println("Enter mailid :");
                  String mail = s1.nextLine();
                  e.setMailid(mail);
                  System.out.println(e+"\n");
                  System.out.println("----------------------------------------");
         break;
         case 8: System.out.println("Enter address :");
                  String  ad = s1.nextLine();
                  e.setAddress(ad);
                  System.out.println(e+"\n");
                  System.out.println("----------------------------------------");
         break;
         case 9: System.out.println("Enter gender :");
                 String gen = s1.nextLine();
                  e.setGender(gen);
                  System.out.println(e+"\n");
                  System.out.println("----------------------------------------");
         break;
         case 10: System.out.println("Enter doctor name :");
                  String dn = s1.nextLine();
                  e.setDname(dn);
                  System.out.println(e+"\n");
                  System.out.println("----------------------------------------");
         break;
         
         
         case 11: j++;
                  System.out.println("----------------------------------------");
         break;
         default : System.out.println("\n Enter a correct choice from the list:");
         System.out.println("--------------------------------------------");
         break;
}
}
while(j==1);
}
if (j ==0)
{
 System.out.println("\n Patient Details are not available, please enter a valid id!");
 System.out.println("----------------------------------------");
}



}
break;

case 6:System.exit(1);
       System.out.println("----------------------------------------");
break;

}
}while(ch!=0);
}
}