package akka.actor.example.java.gradle;

// #imports
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

// #imports

import akka.actor.typed.Props;
import akka.actor.typed.DispatcherSelector;

// #hello-world-main-with-dispatchers
interface CustomDispatchersExample {
	
	public class HelloWorldMain extends AbstractBehavior<HelloWorldMain.SayHello> {

		// Start message...
		public static class SayHello {
			public final String name;

			public SayHello(String name) {
				this.name = name;
			}
		}

		public static Behavior<SayHello> create() {
			return Behaviors.setup(HelloWorldMain::new);
		}

		private final ActorRef<HelloWorld.Greet> greeter;

		private HelloWorldMain(ActorContext<SayHello> context) {
			super(context);

			final String dispatcherPath = "akka.actor.default-blocking-io-dispatcher";
			Props greeterProps = DispatcherSelector.fromConfig(dispatcherPath);
			greeter = getContext().spawn(HelloWorld.create(), "greeter", greeterProps);
		}

		// createReceive ...
		@Override
		public Receive<SayHello> createReceive() {
			return null;
		}
	}
}