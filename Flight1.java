public class Flight1{
    
    private int passanger;
    private int seats;   
        
        public boolean hasRoom(Flight1 f2) {
            int total = passanger + f2.passanger;
            return total <= seats;
        }
        public Flight1 createNewWithBoth(Flight1 f2){
            Flight1 newFlight1 = new Flight1();
            newFlight1.passanger = passanger + f2.passanger;
            newFlight1.seats = seats;
            return newFlight1;
        }

        Flight1 lax1 = new Flight1();
        Flight1 lax2 = new Flight1();
        Flight1 lax3 = new Flight1();
        if(lax1.hasRoom(lax2))
            lax3 = lax1.createNewWithBoth(lax2);
        else 
            System.out.println("Program Ended... :-)");
        
}       
    
