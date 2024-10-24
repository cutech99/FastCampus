package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("손명준",26,"010-8383-5102");
        PersonVO vo1 = new PersonVO("허재원", 26,"010-6207-9830");
        PersonVO vo2 = new PersonVO("김재영", 26,"010-4939-5422");

        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo1.getName()+"\t"+ vo1.getAge()+"\t"+ vo1.getPhone());
        System.out.println(vo2.getName()+"\t"+ vo2.getAge()+"\t"+ vo2.getPhone());
    }
}
