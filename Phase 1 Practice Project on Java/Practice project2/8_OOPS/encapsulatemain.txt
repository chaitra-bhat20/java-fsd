 class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate1 obj = new Encapsulate1(); 
        obj.setName("Chaitra"); 
        obj.setAge(22); 
        obj.setRoll(50); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 
}
