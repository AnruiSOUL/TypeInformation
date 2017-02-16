/**
 * Created by randallcrame on 2/15/17.
 */
public class TypeInformation {

    public static boolean classImplementsInterface(Class<?> name,Class<?> interfaceName) {
        Class[] classArr = name.getInterfaces();
        for (Class c : classArr) {
            if (interfaceName.toString().equals(c.toString()))
                return true;
        }
        return false;
    }

    public static String listAllMembers(Object object) {
        return null;
    }

}
