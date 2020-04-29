import java.util.Scanner;
public class client {
    public String indirizzoIP;
    public String numPorta;
    
    public client(String indirizzoIP, String numPorta){
        System.out.printf("\nCreazione socket in corso..\nAssociazione indirizzo IP e numero di porta del client");
        this.indirizzoIP = indirizzoIP;
        this.numPorta = numPorta;
    }
    
    public void Connect(){
        System.out.printf("\nApertura connessione al server[SEND SYN=1 & ACK=0] con i seguenti indirizzoIP e numero di porta :");
        server server = new server();
        System.out.printf("\n %s , %s ", server.getIndirizzo(), server.getPorta() );
    }
    
    public int write(){
        System.out.printf("\nInviare dati =");
        Scanner tastiera = new Scanner(System.in);
        String dati = tastiera.nextLine();
        
        System.out.printf("\nINSERIRE quit PER TERMINARE LA COMUNICAZIONE ");
        if(dati.equals("quit")){
            return 0;
        }else{
            return 1;
        }
    }
    
    public void CloseC(){
        System.out.printf("\nRichiesta chiusura connessione dal client..\nSEND FIN ");
    }
    
    public void inoltroACK(){
        System.out.printf("\nINOLTRO ACK=1 al server..");
    }
    
    
    
}