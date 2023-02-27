package solid.i;

public interface IPrintTask {

	boolean printContent(String content);
	boolean scanContent(String content);
	boolean faxContent(String content);
	boolean printContentExternalDevice(String content);
	boolean authBadge(String content);
}
