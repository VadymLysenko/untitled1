package day_32_array_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("----- Starting deploying of etsy app to AWS zones..... ");
        String[] zonesArray = zones.split(",");
        for(String eachZone : zonesArray){
            System.out.println("Deploying ["+app+"] to " + eachZone + "...");
            System.out.println("------Deployment completed for " + eachZone + "...");
        }
        System.out.println("----All deployments complete, traffic enable----");
    }
}
