package akka.actor.example.java.gradle;

// #imports
import akka.actor.typed.ActorSystem;

public interface App {

  public static void main(String[] args) throws Exception {
    
    final ActorSystem<HelloWorldMain.SayHello> system =
        ActorSystem.create(HelloWorldMain.create(), "hello");

    system.tell(new HelloWorldMain.SayHello("World"));
    system.tell(new HelloWorldMain.SayHello("Akka"));

    Thread.sleep(3000);
    system.terminate();
  }

}