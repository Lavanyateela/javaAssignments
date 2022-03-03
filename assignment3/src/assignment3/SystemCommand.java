package assignment3;

public class SystemCommand {
    public static Process run(String IP){
        Process process=null;
        try {
            String command="ping "+IP;
            process=Runtime.getRuntime().exec(command);
            return process;
        }catch (Exception e){
            e.printStackTrace();
        }
        return process;
    }
}
