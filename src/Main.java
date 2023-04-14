import java.util.*;
import java.time.*;
interface NavigateMenu {
    static void NavigateMenu1(DoctorList di,MedicineList d1,PatientsList d2,LaboratoriesList d3,FacilitiesList d4) {
        System.out.println("                                                MAIN MENU                                                                ");
        System.out.println("*************************************************************************************************************************");
        System.out.println("1.DOCTORS           2.MEDICINES           3.PATIENTS             4.LABORATORIES           5.FACILITIES");
        int y=verifyCorrectInput.varify(5);
        switch (y) {
            case 1: {
                doctor d=new doctor();
                d.doctorNavigate(di,d1,d2,d3,d4);
            }
            break;
            case 2: {
                Medicine M=new Medicine();
                M.medicineNavigate(di,d1,d2,d3,d4);
            }
            break;
            case 3: {
                Patients p=new Patients();
                p.PatientsNavigate(di,d1,d2,d3,d4);
            }
            break;
            case 4: {
                Laboratories l=new Laboratories();
                l.LaboratoriesNavigate(di,d1,d2,d3,d4);
            }
            break;
            case 5: {
                Facilities f=new Facilities();
                f.FacilitiesNavigate(di,d1,d2,d3,d4);
            }
            break;

        }
    }
}
interface returnAndExist {
    public static void ReturnAndExistMethod(DoctorList di,MedicineList d1,PatientsList d2,LaboratoriesList d3,FacilitiesList d4, int y)
    {
        int case1=y;
        Scanner input1 = new Scanner(System.in);
        System.out.println("**************Press 1 for privous menu or press 2 for main menu press 3 for exist*********");
        switch (case1)
        {
            case 1:{
                int nextGo=verifyCorrectInput.varify(3);
                if (nextGo==1) {
                    doctor dl=new doctor();
                    dl.doctorNavigate(di,d1,d2,d3,d4);
                } else if (nextGo==2) {
                    NavigateMenu.NavigateMenu1(di,d1,d2,d3,d4);
                } else
                {
                    System.exit(0);
                }
            }
            break;
            case 2:{
                int nextGo=verifyCorrectInput.varify(3);
                if (nextGo==1) {
                    Medicine dd= new Medicine();
                    dd.medicineNavigate(di,d1,d2,d3,d4);
                } else if (nextGo==2) {
                    NavigateMenu.NavigateMenu1(di,d1,d2,d3,d4);
                } else
                {
                    System.exit(0);
                }
            }
            break;
            case 3:{
                int nextGo=verifyCorrectInput.varify(3);
                if (nextGo==1) {
                    Patients dd1= new Patients();
                    dd1.PatientsNavigate(di,d1,d2,d3,d4);
                } else if (nextGo==2) {
                    NavigateMenu.NavigateMenu1(di,d1,d2,d3,d4);
                } else
                {
                    System.exit(0);
                }
            }
            break;
            case 4:{
                int nextGo=verifyCorrectInput.varify(3);
                if (nextGo==1) {
                    Laboratories dd2= new Laboratories();
                    dd2.LaboratoriesNavigate(di,d1,d2,d3,d4);
                } else if (nextGo==2) {
                    NavigateMenu.NavigateMenu1(di,d1,d2,d3,d4);
                } else
                {
                    System.exit(0);
                }
            }
            break;
            case 5:{ int nextGo=verifyCorrectInput.varify(3);
                if (nextGo==1) {
                    Facilities dd3= new Facilities();
                    dd3.FacilitiesNavigate(di,d1,d2,d3,d4);
                } else if (nextGo==2) {
                    NavigateMenu.NavigateMenu1(di,d1,d2,d3,d4);
                } else
                {
                    System.exit(0);
                }
            }
            break;
        }
    }
}
interface verifyCorrectInput {
    public static int varify(int a)
    {
        int entry;
        Scanner input = new Scanner(System.in);
        System.out.println("***************************************************************************************************************************");
        System.out.print("enter number between 1 to " +a +" :");
        try {
            entry= input.nextInt();
            input.nextLine();
            if(entry>0&&entry<=a) {
                return entry;
            }
            else
            {
                Exception e=new Exception();
                throw e;
            }
        }
        catch(Exception e)
        {
            System.out.println("***********************************************************************************************************************");
            System.out.print("you entered wrong input please enter number between 1 to "+a+ " you have two more chance:");
            input.nextLine();
            try {
                entry= input.nextInt();
                if(entry>0&&entry<=a) {
                    return entry;
                }
                else
                {
                    Exception er=new Exception();
                    throw er;
                }
            }
            catch (Exception z)
            {
                System.out.println("***************************************************************************************************************************");
                System.out.print("you entered wrong input please enter number between 1 to 6 you have one more chance:");
                input.nextLine();
                try {
                    entry = input.nextInt();
                    if(entry>0&&entry<=a) {
                        return entry;
                    }
                    else
                    {
                        Exception err=new Exception();
                        throw err;
                    }
                }
                catch (Exception s){
                    System.out.println("*****************************************************************************************************************************");
                    System.out.print("you entered 3 times wrong input so application will terminated ");
                    System.exit(0);
                }
            }
        }
        return 0;
    }
}
class ShowDateAndTime {
    LocalDateTime dt = LocalDateTime.now();
    int ld = dt.getDayOfMonth();
    int dy = dt.getYear();
    Month month = dt.getMonth();
    int hr = dt.getHour();
    int min = dt.getMinute();
    int sec = dt.getSecond();
    ShowDateAndTime() {
        System.out.println("Date:" + month + " " + ld + " " + dy +"                                                                                           "+"Time " + hr + ":" + min + ":" + sec);
    }
}

class DoctorList
{
    List<ArrayList> al=new ArrayList();
    Scanner s=new Scanner(System.in);
    DoctorList()
    {
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add("anuradha");
        a1.add("peds");
        a1.add("9am-12pm");
        a1.add("mbbs");
        a1.add(23);
        ArrayList a2=new ArrayList();
        a2.add(2);
        a2.add("praveen");
        a2.add("surgry");
        a2.add("10am-12pm");
        a2.add("mbbs");
        a2.add(25);
        ArrayList a3=new ArrayList();
        a3.add(3);
        a3.add("naveen");
        a3.add("ent");
        a3.add("11am-2pm");
        a3.add("mbbs");
        a3.add(24);
        ArrayList a4=new ArrayList();
        a4.add(4);
        a4.add("Sriniu");
        a4.add("gyno");
        a4.add("12pm-3pm");
        a4.add("mbbs");
        a4.add(26);
        al.add(a1);
        al.add(a2);
        al.add(a3);
        al.add(a4);
    }
    public void Show()
    {
        System.out.println("***********************************************************************************************************");
        System.out.printf("-------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-3s | %-20s | %-15s | %-10s | %-15s | %-9s |%n","ID","NAME","DEPARTMENT","TIMING","QUALIFICATION","R00M NO");
        System.out.printf("-------------------------------------------------------------------------------------------%n");
        for (ArrayList a:al) {
            System.out.printf("| %-3s | %-20s | %-15s | %-10s | %-15s | %-9s |%n",a.get(0),a.get(1),a.get(2),a.get(3),a.get(4),a.get(5));
        }
        System.out.printf("-------------------------------------------------------------------------------------------%n");
    }
    public void addEntry()
    {
        ArrayList elements=new ArrayList();
        System.out.println("**********************************************************************************************");
        System.out.print("ENTER YOUR NAME:");
        String name1=s.nextLine();
        System.out.print("ENTER THE BRANCH:");
        String branch=s.nextLine();
        System.out.print("ENTER TIMING OF DOCTOR IN FORMET(ex:9am-12pm):");
        String timing=s.nextLine();
        System.out.print("ENTER TIMING OF DOCTOR QUALIFICATION:");
        String qalification=s.nextLine();
        System.out.print("Enter room no:");
        String room=s.nextLine();
        int c=(int)al.get(al.size()-1).get(0);
        elements.add(++c);
        elements.add(name1);
        elements.add(branch);
        elements.add(timing);
        elements.add(qalification);
        elements.add(room);
        al.add(elements);
        System.out.println("your registration id is : "+c);
    }
    public void updataeDoctorList()
    {
        System.out.print("enter doctor id you want update:");
        int id=s.nextInt();
        s.nextLine();
        System.out.print("ENTER YOUR NAME:");
        String name=s.nextLine();
        System.out.print("ENTER THE BRANCH:");
        String branch=s.nextLine();
        System.out.print("ENTER TIMING OF DOCTOR IN FORMET(ex:9am-12pm):");
        String timing=s.nextLine();
        System.out.print("ENTER TIMING OF DOCTOR QUALIFICATION:");
        String qalification=s.nextLine();
        System.out.print("Enter room no:");
        String room=s.nextLine();
        for (int i=0;i< al.size();i++)
        {
            if((int)al.get(i).get(0)==id)
            {
                al.get(i).set(1,name);
                al.get(i).set(2,branch);
                al.get(i).set(3,timing);
                al.get(i).set(4,qalification);
                al.get(i).set(5,room);
                break;
            }
            else
            {
                if(i>=al.size()){
                    System.out.println("you entered wrong input");
                    break;
                }
            }
        }
    }
    public void deleteDoctorList()
    {
        System.out.print("enter doctor id you want delete:");
        int id=s.nextInt();
        s.nextLine();
        for (int i=0;i< al.size();i++)
        {
            if((int)al.get(i).get(0)==id)
            {
                al.remove(i);
                System.out.println("your id is deleted");
                break;
            }
            else
            {
                if(i>=al.size()){
                    System.out.println("you entered wrong input");
                    break;}
            }
        }
    }
}
class doctor
{
    int val;
    public void doctorNavigate(DoctorList di,MedicineList d1,PatientsList d2,LaboratoriesList d3,FacilitiesList d4)
    {
        System.out.println("*************************************************DOCTORS MENU*************************************************************");
        System.out.println("**************************************************************************************************************************");
        System.out.println("1.ADD NEW ENTRY               2.UPDATE DOCTOR LIST               3.DELETE DCTORLIST                4.EXISTING DOCTOR LIST");
        val= verifyCorrectInput.varify(4);
        switch (val){
            case 1:{
                di.addEntry();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,1);
            }
            break;
            case 2:{
                di.updataeDoctorList();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,1);
            }
            break;
            case 3:{
                di.deleteDoctorList();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,1);
            }
            break;
            case 4:{
                di.Show();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,1);
            }
        }
    }
}
class  MedicineList {
    List<ArrayList> al=new ArrayList();
    Scanner s=new Scanner(System.in);
    MedicineList()
    {
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add("PCM");
        a1.add("Cino pvt");
        a1.add("09-05-24");
        a1.add("55");
        ArrayList a2=new ArrayList();
        a2.add(2);
        a2.add("nytra");
        a2.add("ace pvt");
        a2.add("04-04-2025");
        a2.add("155");
        ArrayList a3=new ArrayList();
        a3.add(3);
        a3.add("brufa");
        a3.add("rackitt");
        a3.add("12-07-2025");
        a3.add("456");
        ArrayList a4=new ArrayList();
        a4.add(4);
        a4.add("pride");
        a4.add("ddf pvt");
        a4.add("12-04-2028");
        a4.add("234");
        al.add(a1);
        al.add(a2);
        al.add(a3);
        al.add(a4);
    }
    public void Show()
    {
        System.out.println("***********************************************************************************************************");
        System.out.printf("---------------------------------------------------------------------------------%n");
        System.out.printf("| %-3s | %-20s | %-15s | %-10s | %-9s |%n","ID","NAME","COMPANY","EXP-DATE","COST");
        System.out.printf("-------------------------------------------------------------------------------------------%n");
        for (ArrayList a:al) {
            System.out.printf("| %-3s | %-20s | %-15s | %-10s | %-9s |%n",a.get(0),a.get(1),a.get(2),a.get(3),a.get(4));
        }
        System.out.printf("-------------------------------------------------------------------------------------------%n");
    }
    public void addEntry()
    {
        ArrayList elements=new ArrayList();
        System.out.println("**********************************************************************************************");
        System.out.print("ENTER YOUR MEDICINE NAME:");
        String name1=s.nextLine();
        System.out.print("ENTER THE COMPANY NAME:");
        String company=s.nextLine();
        System.out.print("ENTER EXPIRDATE OF MEDICINE IN FORMET(ex:09-09-25):");
        String expid=s.nextLine();
        System.out.print("ENTER MEDICINE COST:");
        String cost=s.nextLine();
        int c=(int)al.get(al.size()-1).get(0);
        elements.add(++c);
        elements.add(name1);
        elements.add(company);
        elements.add(expid);
        elements.add(cost);
        al.add(elements);
        System.out.println("your registration id OF MEDICINE IS : "+c);
    }
    public void updataeDoctorList()
    {
        System.out.print("enter Medicine  id you want update:");
        int id=s.nextInt();
        s.nextLine();
        System.out.print("ENTER MEDICINE NAME:");
        String name=s.nextLine();
        System.out.print("ENTER COMPANY NAME:");
        String branch=s.nextLine();
        System.out.print("ENTER EXPIRDATE OF MEDICINE IN FORMET(ex:09-09-25):");
        String timing=s.nextLine();
        System.out.print("ENTER MEDICINE COST:");
        String qalification=s.nextLine();
        for (int i=0;i< al.size();i++)
        {
            if((int)al.get(i).get(0)==id)
            {
                al.get(i).set(1,name);
                al.get(i).set(2,branch);
                al.get(i).set(3,timing);
                al.get(i).set(4,qalification);
                break;
            }
            else
            {
                if(i>=al.size()){
                    System.out.println("you entered wrong input");
                    break;
                }
            }
        }
    }
    public void deleteDoctorList()
    {
        System.out.print("enter medicine id is:");
        int id=s.nextInt();
        s.nextLine();
        for (int i=0;i< al.size();i++)
        {
            if((int)al.get(i).get(0)==id)
            {
                al.remove(i);
                System.out.println("your id is deleted");
                break;
            }
            else
            {
                if(i>=al.size()){
                    System.out.println("you entered wrong input");
                    break;}
            }
        }
    }
}
class Medicine
{
    int val;
    int RepetOrNot;
    public void medicineNavigate(DoctorList di,MedicineList d1,PatientsList d2,LaboratoriesList d3,FacilitiesList d4)
    {
        System.out.println("*************************************************MEDICINE SECTION*************************************************************");
        System.out.println("**************************************************************************************************************************");
        System.out.println("1.ADD NEW ENTRY               2.UPDATE MEDICINE LIST               3.DELETE MEDICINE                4.EXISTING MEDICINE LIST");
        val= verifyCorrectInput.varify(4);
        switch (val){
            case 1:{
                d1.addEntry();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,2);
            }
            break;
            case 2:{
                d1.updataeDoctorList();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,2);
            }
            break;
            case 3:{
                d1.deleteDoctorList();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,2);
            }
            break;
            case 4:{
                d1.Show();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,2);
            }
        }
    }
}
class PatientsList{
    List<ArrayList> al=new ArrayList();
    Scanner s=new Scanner(System.in);
    PatientsList()
    {
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add("anuradha");
        a1.add("cancer");
        a1.add("female");
        a1.add("Y");
        a1.add(23);
        ArrayList a2=new ArrayList();
        a2.add(2);
        a2.add("praveen");
        a2.add("cold");
        a2.add("male");
        a2.add("Y");
        a2.add(25);
        ArrayList a3=new ArrayList();
        a3.add(3);
        a3.add("naveen");
        a3.add("maleriya");
        a3.add("male");
        a3.add("Y");
        a3.add(24);
        ArrayList a4=new ArrayList();
        a4.add(4);
        a4.add("Sriniu");
        a4.add("diabetes");
        a4.add("male");
        a4.add("Y");
        a4.add(26);
        al.add(a1);
        al.add(a2);
        al.add(a3);
        al.add(a4);
    }
    public void Show()
    {
        System.out.println("***********************************************************************************************************");
        System.out.printf("-------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-3s | %-20s | %-15s | %-10s | %-15s | %-9s |%n","ID","NAME","DISEASE","GENDER","ADMIT STATUS","AGE");
        System.out.printf("-------------------------------------------------------------------------------------------%n");
        for (ArrayList a:al) {
            System.out.printf("| %-3s | %-20s | %-15s | %-10s | %-15s | %-9s |%n",a.get(0),a.get(1),a.get(2),a.get(3),a.get(4),a.get(5));
        }
        System.out.printf("-------------------------------------------------------------------------------------------%n");
    }
    public void addEntry()
    {
        ArrayList elements=new ArrayList();
        System.out.println("**********************************************************************************************");
        System.out.print("ENTER YOUR NAME:");
        String name1=s.nextLine();
        System.out.print("ENTER THE DISEASE:");
        String branch=s.nextLine();
        System.out.print("GENDER:");
        String timing=s.nextLine();
        System.out.print("ENTER ADMIT STATUS:");
        String qalification=s.nextLine();
        System.out.print("AGE:");
        String room=s.nextLine();
        int c=(int)al.get(al.size()-1).get(0);
        elements.add(++c);
        elements.add(name1);
        elements.add(branch);
        elements.add(timing);
        elements.add(qalification);
        elements.add(room);
        al.add(elements);
        System.out.println("your registration id is : "+c);
    }
    public void updataeDoctorList()
    {
        System.out.print("enter doctor id you want update:");
        int id=s.nextInt();
        s.nextLine();
        System.out.print("ENTER YOUR NAME:");
        String name=s.nextLine();
        System.out.print("ENTER THE DISEASE:");
        String branch=s.nextLine();
        System.out.print("GENDER:");
        String timing=s.nextLine();
        System.out.print("ENTER ADMIT STATUS:");
        String qalification=s.nextLine();
        System.out.print("AGE:");
        String room=s.nextLine();
        for (int i=0;i< al.size();i++)
        {
            if((int)al.get(i).get(0)==id)
            {
                al.get(i).set(1,name);
                al.get(i).set(2,branch);
                al.get(i).set(3,timing);
                al.get(i).set(4,qalification);
                al.get(i).set(5,room);
                break;
            }
            else
            {
                if(i>=al.size()){
                    System.out.println("you entered wrong input");
                    break;
                }
            }
        }
    }
    public void deleteDoctorList()
    {
        System.out.print("enter patients id you want delete:");
        int id=s.nextInt();
        s.nextLine();
        for (int i=0;i< al.size();i++)
        {
            if((int)al.get(i).get(0)==id)
            {
                al.remove(i);
                System.out.println("your id is deleted");
                break;
            }
            else
            {
                if(i>=al.size()){
                    System.out.println("you entered wrong input");
                    break;}
            }
        }
    }
}
class Patients
{
    int val;
    public void PatientsNavigate(DoctorList di,MedicineList d1,PatientsList d2,LaboratoriesList d3,FacilitiesList d4)
    {
        System.out.println("*************************************************PATIENTS MENU*************************************************************");
        System.out.println("**************************************************************************************************************************");
        System.out.println("1.ADD PATIENTS NEW ENTRY               2.UPDATE PATIENTS LIST               3.DELETE PATIENT LIST                4.EXISTING PATIENT LIST");
        val= verifyCorrectInput.varify(4);
        switch (val){
            case 1:{
                d2.addEntry();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,3);
            }
            break;
            case 2:{
                d2.updataeDoctorList();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,3);
            }
            break;
            case 3:{
                d2.deleteDoctorList();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,3);
            }
            break;
            case 4:{
                d2.Show();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,3);
            }
        }
    }
}
class LaboratoriesList{
    List<ArrayList> al=new ArrayList();
    Scanner s=new Scanner(System.in);
    LaboratoriesList()
    {
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add("x-ray");
        a1.add(400);
        ArrayList a2=new ArrayList();
        a2.add(2);
        a2.add("ct scan");
        a2.add(500);
        ArrayList a3=new ArrayList();
        a3.add(3);
        a3.add("dr scan");
        a3.add(24);
        ArrayList a4=new ArrayList();
        a4.add(4);
        a4.add("blood bank");
        a4.add(26);
        al.add(a1);
        al.add(a2);
        al.add(a3);
        al.add(a4);
    }
    public void Show()
    {
        System.out.println("***********************************************************************************************************");
        System.out.printf("------------------------------------%n");
        System.out.printf("| %-3s| %-20s | %-4s |%n","ID","FACILITIES","COST");
        System.out.printf("------------------------------------%n");
        for (ArrayList a:al) {
            System.out.printf("| %-3s| %-20s | %-4s |%n",a.get(0),a.get(1),a.get(2));
        }
        System.out.printf("------------------------------------%n");
    }
    public void addEntry()
    {
        ArrayList elements=new ArrayList();
        System.out.println("**********************************************************************************************");
        System.out.print("ENTER FACILITES NAME:");
        String name1=s.nextLine();
        System.out.print("ENTER THE COST:");
        String branch=s.nextLine();
        int c=(int)al.get(al.size()-1).get(0);
        elements.add(++c);
        elements.add(name1);
        elements.add(branch);
        al.add(elements);
        System.out.println("your registration id is : "+c);
    }
    public void updataeDoctorList()
    {
        System.out.print("enter doctor id you want update:");
        int id=s.nextInt();
        s.nextLine();
        System.out.print("ENTER FACILITES NAME:");
        String name=s.nextLine();
        System.out.print("ENTER THE COST:");
        String branch=s.nextLine();
        for (int i=0;i< al.size();i++)
        {
            if((int)al.get(i).get(0)==id)
            {
                al.get(i).set(1,name);
                al.get(i).set(2,branch);
                break;
            }
            else
            {
                if(i>=al.size()){
                    System.out.println("you entered wrong input");
                    break;
                }
            }
        }
    }
    public void deleteDoctorList()
    {
        System.out.print("enter LaboratoriesList id you want delete:");
        int id=s.nextInt();
        s.nextLine();
        for (int i=0;i< al.size();i++)
        {
            if((int)al.get(i).get(0)==id)
            {
                al.remove(i);
                System.out.println("your id is deleted");
                break;
            }
            else
            {
                if(i>=al.size()){
                    System.out.println("you entered wrong input");
                    break;}
            }
        }
    }
}
class Laboratories
{
    int val;
    public void LaboratoriesNavigate(DoctorList di,MedicineList d1,PatientsList d2,LaboratoriesList d3,FacilitiesList d4)
    {
        System.out.println("******************************************************LABORATORIES MENU*******************************************************************");
        System.out.println("*********************************************************************************************************************************************");
        System.out.println("1.ADD NEW ENTRY               2.UPDATE LABORATORIES LIST               3.DELETE LABORATORIES LIST                4.EXISTING LABORATORIES LIST");
        val= verifyCorrectInput.varify(4);
        switch (val){
            case 1:{
                d3.addEntry();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,4);
            }
            break;
            case 2:{
                d3.updataeDoctorList();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,4);
            }
            break;
            case 3:{
                d3.deleteDoctorList();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,4);
            }
            break;
            case 4:{
                d3.Show();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,4);
            }
        }
    }
}
class FacilitiesList {
    List<ArrayList> al=new ArrayList();
    Scanner s=new Scanner(System.in);
    FacilitiesList()
    {
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add("ambulance");

        ArrayList a2=new ArrayList();
        a2.add(2);
        a2.add("admit facilites");

        ArrayList a3=new ArrayList();
        a3.add(3);
        a3.add("canteen");

        ArrayList a4=new ArrayList();
        a4.add(4);
        a4.add("emergency");

        al.add(a1);
        al.add(a2);
        al.add(a3);
        al.add(a4);
    }
    public void Show()
    {
        System.out.println("***********************************************************************************************************");
        System.out.printf("-----------------------------%n");
        System.out.printf("| %-3s| %-20s |%n","ID","FACILITIES");
        System.out.printf("-----------------------------%n");
        for (ArrayList a:al) {
            System.out.printf("| %-3s| %-20s |%n",a.get(0),a.get(1));
        }
        System.out.printf("-----------------------------%n");
    }
    public void addEntry()
    {
        ArrayList elements=new ArrayList();
        System.out.println("**********************************************************************************************");
        System.out.print("ENTER FACILITES NAME:");
        String name1=s.nextLine();
        int c=(int)al.get(al.size()-1).get(0);
        elements.add(++c);
        elements.add(name1);
        al.add(elements);
        System.out.println("your registration id is : "+c);
    }
    public void updataeDoctorList()
    {
        System.out.print("enter doctor id you want update:");
        int id=s.nextInt();
        s.nextLine();
        System.out.print("ENTER FACILITES NAME:");
        String name=s.nextLine();
        for (int i=0;i< al.size();i++)
        {
            if((int)al.get(i).get(0)==id)
            {
                al.get(i).set(1,name);
                break;
            }
            else
            {
                if(i>=al.size()){
                    System.out.println("you entered wrong input");
                    break;
                }
            }
        }
    }
    public void deleteDoctorList()
    {
        System.out.print("enter facilites id you want delete:");
        int id=s.nextInt();
        s.nextLine();
        for (int i=0;i< al.size();i++)
        {
            if((int)al.get(i).get(0)==id)
            {
                al.remove(i);
                System.out.println("your id is deleted");
                break;
            }
            else
            {
                if(i>=al.size()){
                    System.out.println("you entered wrong input");
                    break;
                }
            }
        }
    }
}
class Facilities{
    int val;
    public void FacilitiesNavigate(DoctorList di,MedicineList d1,PatientsList d2,LaboratoriesList d3,FacilitiesList d4)
    {
        System.out.println("******************************************************FACILITIES MENU*******************************************************************");
        System.out.println("*********************************************************************************************************************************************");
        System.out.println("1.ADD NEW FACILITIES               2.UPDATE FACILITIES LIST               3.DELETE FACILITIES LIST                4.EXISTING FACILITIES LIST");
        val= verifyCorrectInput.varify(4);
        switch (val){
            case 1:{
                d4.addEntry();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,5);
            }
            break;
            case 2:{
                d4.updataeDoctorList();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,5);
            }
            break;
            case 3:{
                d4.deleteDoctorList();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,5);
            }
            break;
            case 4:{
                d4.Show();
                returnAndExist.ReturnAndExistMethod(di,d1,d2,d3,d4,5);
            }
        }
    }

}
public class Main {
    public static DoctorList MainMethodAdress()
    {
        DoctorList d3=new DoctorList();
        return d3;
    }
    public static MedicineList MainMethodAdress1()
    {
        MedicineList d4=new MedicineList();
        return d4;
    }
    public static PatientsList MainMethodAdress2()
    {
        PatientsList d5=new PatientsList();
        return d5;
    }
    public static LaboratoriesList MainMethodAdress3()
    {
        LaboratoriesList d6=new LaboratoriesList();
        return d6;
    }
    public static FacilitiesList MainMethodAdress4()
    {
        FacilitiesList d7=new FacilitiesList();
        return d7;
    }
    public static void main(String[] args) {
        new ShowDateAndTime();
        DoctorList de=Main.MainMethodAdress();
        MedicineList de1=Main.MainMethodAdress1();
        PatientsList de2=Main.MainMethodAdress2();
        LaboratoriesList de3=Main.MainMethodAdress3();
        FacilitiesList de4=Main.MainMethodAdress4();
        NavigateMenu.NavigateMenu1(de,de1,de2,de3,de4);
    }
}