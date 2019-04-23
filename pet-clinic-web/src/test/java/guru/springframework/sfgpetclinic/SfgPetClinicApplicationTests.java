package guru.springframework.sfgpetclinic;

// Lecture 189 - Convert for JUnit 5. Removed imports
//                     org.junit.jupiter.api.Test
//                     org.junit.jupiter.RunWith
//                  Remove @RunWith. Added @ExtendWith and added new import
//                     for @Test

// Original version
//public class SfgPetClinicApplicationTests {
//
//    public void contextLoads() {
//
//    }
//
//}

// Came back to this code in lecture 189. This was commented out. The
// code above was uncommented

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SfgPetClinicApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("");
        System.out.println("******************* Executing contextLoads test *******************");
        System.out.println("");
    }

}

