/*
 * No NoAnonimous Inner Classes
 */
package multeclase;

public class NoAnonimous {
    // Inner interface HelloWorld

    interface HelloWorld {

        public void greet();

        public void greetSomeone(String someone);
    }
    // Method sayHello prints

    public void sayHello() {
        // Local class EnglishGreetings implemented in the method sayHello()
        class EnglishGreeting implements HelloWorld {

            String name = "world";

            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        } // end of EnglishGreeting local class
        // create an EnglishGreeting object/instance
        HelloWorld englishGreeting = new EnglishGreeting();

        // Local class FrenchGreetings implemented in the method sayHello()
        class FrenchGreeting implements HelloWorld {

            String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        }// end of FrenchGreeting local class
        // create an FrenchGreeting object/instance
        HelloWorld frenchGreeting = new FrenchGreeting();
        

        // Local class SpanishGreetings implemented in the method sayHello()
        class SpanishGreeting implements HelloWorld {

            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        }// end of SpanishGreeting local class
        // create an SpanishGreeting object/instance
        HelloWorld spanishGreeting = new SpanishGreeting();
        

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }
    // main method

    public static void main(String... args) {
        NoAnonimous myApp
                = new NoAnonimous();
        myApp.sayHello();
    }
}
