import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {

        TestExecution testExecution = new TestExecution();
        try {
            testExecution.start(Test1.class);
            testExecution.start(Test2.class);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
