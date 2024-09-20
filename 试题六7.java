//public class 试题六7 {
//}
//
//class Address {
//    public void street(){
//
//    }
//    public void zip(){
//
//    }
//    public void city(){
//
//    }
//}
//
//class DutchAddress{
//    public void straat(){};
//    public void postcode(){};
//    public void plaats(){};
//}
//class DuctAdddressAdapter extends DutchAddress{
//    private  Address address ;
//    public DuctAdddressAdapter(Address addr){
//        address = addr;
//    }
//    public void straat(){
//        address.street();
//    }
//    public void postcode(){
//        address.zip();
//    }
//    public void plaats(){
//        address.city();
//    }
//}
//class Test {
//    public static void main(String[] args){
//        Address addr = new Address();
//        DutchAddress addrAdapter = new DuctAdddressAdapter(addr);
//    }
//}