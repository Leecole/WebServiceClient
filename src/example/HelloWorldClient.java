package example;

import com.oracle.EnglishChineseLocator;
import com.oracle.HelloWorldServiceLocator;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
//          HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
//          String result=locator.getHelloWorld().sayHelloWorldFrom("leecole");
//          System.out.println(result);

          EnglishChineseLocator locator=new EnglishChineseLocator();
          String[]  arr=locator.getEnglishChineseSoap().translatorString("激活");
          for(String  ar:arr){
              System.out.println(ar.toString());

          }



         /* Activator service = locator.get();
          // If authorization is required
          //((HelloWorldSoapBindingStub)service).setUsername("user3");
          //((HelloWorldSoapBindingStub)service).setPassword("pass3");
          // invoke business method
          service.businessMethod();*/
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }
  }
}
