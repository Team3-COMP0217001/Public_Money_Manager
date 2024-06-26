package Exception;

/*
 * COMP217: Java Programming / Team 03
 * Prof: Suh, Young-Kyoon
 *
 * NoPermissionException: Exception called when an object run methods that cannot have permission.
 * @author: Seo, HyeongCheol
 */
public class PermissionException extends RuntimeException {
    public PermissionException(){
        super("No Permission of running this method.");
    }
}