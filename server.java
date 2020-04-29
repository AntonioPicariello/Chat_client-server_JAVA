public class server {
    public String indirizzoIP;
    public String  numPorta;
    
    
    public server(){
        this.indirizzoIP = "196.100.100.2";
        this.numPorta = "10000";
    }
    
    public String getIndirizzo(){
        return this.indirizzoIP;
    }
    
    public String getPorta(){
        return this.numPorta;
    }
    
    public void Accept(){
        System.out.printf("\nConnessione accettata dal server... --> INVIO SYN=1 & ACK=1 al client");
    }
    
    public void Receive(){
        System.out.printf("\nMessaggio ricevuto");
    }
    
    public void CloseS(){
        System.out.printf("\nRichiesta chiusura connessione accettata dal server...\n FIN RECEIVED\n INOLTRO ACK = 1 AL CLIENT");
    }
}
