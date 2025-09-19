public class Person {
        // Super Class //
        String firstName ;
        int phoneNumber ;


        public void Set_firstName (String First_Name) {
            firstName = First_Name ;
        }

        public void Set_phoneNumber (int phone_Number) {
            phoneNumber = phone_Number ;
        }

        public String firstName (String First_Name) {
            return First_Name ;
        }

        public int Get_phoneNumber (int phone_Number) {
            return phone_Number ;
        }

//    interface Electronics {
//            void PowerButton () ;
//    }
//
//    class Television implements Electronics {
//            @Override
//         public void PowerButton () {
//                System.out.println("Power Button to open the TV");
//            }
//    }
//
//    class MobilePhone implements Electronics {
//            @Override
//        public void PowerButton () {
//                System.out.println("Power Button to open and close the mobile");
//            }
//    }
}

