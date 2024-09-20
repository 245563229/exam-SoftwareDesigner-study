//public class AdapterPattern {
// public static void main(String[] args){
//     USB usb = new Adapter();
//     usb.Request();
// }
//}
//
//class USB {
//    public void Request(){
//        System.out.println("请求");
//    }
//}
//class Adapter extends USB {
//    private TYPEC typeC = new TYPEC();
//    @Override
//    public void Request(){
//        typeC.SpecifisRequest();
//    }
//}
//class TYPEC {
//    public void SpecifisRequest(){
//        System.out.println("请求二");
//    }
//}
