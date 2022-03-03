package assignment3;

import java.util.*;
import java.io.*;

public class MedianTimeToPing {
    public static void main(String[] args) throws Exception {
        String ip;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter IP address");
        ip=sc.nextLine();
        Process process=SystemCommand.run(ip);
        BufferedReader messageStream=new BufferedReader(new InputStreamReader(process.getInputStream()));
        System.out.println("Enter number of Packets to be send");
        int numberOfPackets=sc.nextInt();

        ArrayList<Float> timings=new ArrayList<>();
        String pingMessage=messageStream.readLine();
        while (((pingMessage=messageStream.readLine())!=null) &&(numberOfPackets-- >0)){
            System.out.println(pingMessage);
            String[] pingMessageArray=pingMessage.split(" ");
            String[] timeMessage=pingMessageArray[pingMessageArray.length -2].split("=");
            timings.add(Float.parseFloat(timeMessage[1]));
        }
        Collections.sort(timings);
        if(timings.size()%2==1){
            System.out.println("Median= "+(timings.get((int)(timings.size()/2))));
        }
        else if(timings.size()>0){
            float m1= timings.get((int)(timings.size()/2));
            float m2= timings.get((int)(timings.size()/2)-1);
            System.out.println("Median= "+(m1+m2)/2+" ms");
        }
    }
}
