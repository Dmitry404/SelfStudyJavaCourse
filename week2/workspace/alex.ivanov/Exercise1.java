
class LocalTest {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }
}

class LocalTest2{
    public void pupAge() {
        int age;
        age = age + 7;//variable age might not have been initialized
        System.out.println("Puppy age is : " + age);
    }
}

class InstanceTest{
    int i;
    String s;
    public void print(){
        System.out.println("Default value: i="+i+" s="+s);
    }
}
public class Exercise1{
    public static void main(String args[]){
        LocalTest localTest = new LocalTest();
        localTest.pupAge();
        LocalTest2 localTest2 = new LocalTest2();
        localTest2.pupAge();

        InstanceTest instanceTest = new InstanceTest();
        instanceTest.print();
    }
}