import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
int c;
	Scanner t = new Scanner(System.in);
	System.out.printf("\nInserisci indirizzo IP = ");
	String indirizzoIP = t.nextLine(); 
	System.out.printf("\nInserisci numero di porta = ");
	String numPorta = t.nextLine();
	
	client client1 = new client(indirizzoIP,numPorta);
	client1.Connect();
	server server1 = new server();
	server1.Accept();
	client1.inoltroACK();
	
	
	System.out.printf("\nInserisci indirizzo IP = ");
	indirizzoIP = t.nextLine(); 
	System.out.printf("\nInserisci numero di porta = ");
	numPorta = t.nextLine();
	
	client client2 = new client(indirizzoIP,numPorta);
	client2.Connect();
	server server2 = new server();
	server2.Accept();
	client2.inoltroACK();
	
	System.out.printf("\nInserisci indirizzo IP = ");
	indirizzoIP = t.nextLine(); 
	System.out.printf("\nInserisci numero di porta = ");
	numPorta = t.nextLine();
	
	client client3 = new client(indirizzoIP,numPorta);
	client3.Connect();
	server server3 = new server();
	server3.Accept();
	client3.inoltroACK();

System.out.printf("\n\nSIMULAZIONE TRASMISSIONE CLIENT 1");

do{
    c = client1.write();
    server1.Receive();
}while(c != 0);
client1.CloseC();
server1.CloseS();

System.out.printf("\n\nSIMULAZIONE TRASMISSIONE CLIENT 2 ");

do{
    c = client2.write();
    server2.Receive();
}while(c != 0);
client2.CloseC();
server2.CloseS();

System.out.printf("\n\nSIMULAZIONE TRASMISSIONE CLIENT 3 ");

do{
    c = client3.write();
    server3.Receive();
}while(c != 0);
client3.CloseC();
server3.CloseS();
    
System.out.printf("\n\nPROGRAMMA TERMINATO");   



	}
}
