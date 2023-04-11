package airlineMapPackage;
import java.util.HashMap;

public class Factory
{
    private static airlineMap airline = airlineMap.getInstance();
    
    /**
     * Factory class to create flight with type domestic or international
     * @param temp
     * @param header
     * @return
     */
    public static Flight getFlights(String [] temp, HashMap <String, Integer> header)
    {
        HashMap <String, Airport> airports = airline.getMapAirports();
        Airport airportOrigin = new Airport();
        Airport airportDestination  = new Airport();
        // airports
        if(airports.containsKey(temp[header.get("Destination Code")]))
        {
            String key =  temp[header.get("Destination Code")];
            airportDestination = airports.get(key);
            // check if key already exists
        } 
        else
        {
            airportDestination = new Airport(temp[header.get("Destination Code")], temp[header.get("Destination Airport")], temp[header.get("Destination Airport City")]
            , temp[header.get("Destination Airport State")], temp[header.get("Destination Airport Country")], temp[header.get("Destination Airport Fee")], 
            temp[header.get("Destination Airport Lounge")], 0); 
            airports.put(temp[header.get("Destination Code")], airportDestination); 
            // create key
        }

        if(airports.containsKey(temp[header.get("Origin Code")]))
        {
            String key = temp[header.get("Origin Code")];
            airportOrigin = airports.get(key);
            // check if exists origin
        }
        else
        {
            airportOrigin = new Airport(temp[header.get("Origin Code")], temp[header.get("Origin Airport")], temp[header.get("Origin Airport City")]
            , temp[header.get("Origin Airport State")], temp[header.get("Origin Airport Country")], temp[header.get("Origin Airport Fee")], 
            temp[header.get("Origin Airport Lounge")], 0);
            airports.put(temp[header.get("Origin Code")], airportOrigin); 
            // create key
        }
        
        // factory depending on flight type
        if(temp[header.get("Type")].equalsIgnoreCase("international"))
        {
            Flight international = new International(temp[header.get("ID")], temp[header.get("Flight Number")], temp[header.get("Departing Date")], 
            temp[header.get("Departing Time")], temp[header.get("Duration")], temp[header.get("Distance")], temp[header.get("Time Zone Difference")], 
            temp[header.get("Arrival Date")],temp[header.get("Arrival Time")],  temp[header.get("Surcharge")], 
            temp[header.get("Food Served")], temp[header.get("Route Cost")], temp[header.get("Miner Points")], 
            temp[header.get("Total Seats")], temp[header.get("First Class Seats")], temp[header.get("Business Class Seats")], 
            temp[header.get("Main Cabin Seats")], temp[header.get("First Class Price")], temp[header.get("Business Class Price")], 
            temp[header.get("Main Cabin Price")], airportDestination, airportOrigin);

            return international;
            // return internatiional object if type is international
        } 
     
        Flight domestic = new Domestic(temp[header.get("ID")], temp[header.get("Flight Number")], temp[header.get("Departing Date")],
        temp[header.get("Departing Time")], temp[header.get("Duration")], temp[header.get("Distance")], temp[header.get("Time Zone Difference")], 
        temp[header.get("Arrival Date")],temp[header.get("Arrival Time")], temp[header.get("Surcharge")], 
        temp[header.get("Food Served")], temp[header.get("Route Cost")], temp[header.get("Miner Points")], 
        temp[header.get("Total Seats")], temp[header.get("First Class Seats")], temp[header.get("Business Class Seats")], 
        temp[header.get("Main Cabin Seats")], temp[header.get("First Class Price")], temp[header.get("Business Class Price")], 
        temp[header.get("Main Cabin Price")], airportDestination, airportOrigin);
        // return domestic object if type is domestic

        return domestic;
    }

    /**
     * @param temp
     * @param header
     * @return
     */
    public static Person getPerson(String [] temp, HashMap <String, Integer> header)
    {
        // factory for customer, check role in airline, then return  object 

        if(temp[header.get("Role")].equalsIgnoreCase("customer"))
        {
            Customer customer = new Customer(temp[header.get("ID")], temp[header.get("First Name")],
            temp[header.get("Last Name")], temp[header.get("DOB")], temp[header.get("Money Available")],
            temp[header.get("Flights Purchased")], temp[header.get("MinerAirlines Membership")],
            temp[header.get("Username")], temp[header.get("Password")], false);
            return customer;
        }
        Employee employee = new Employee(temp[header.get("ID")], temp[header.get("First Name")], temp[header.get("Last Name")],
        temp[header.get("DOB")], temp[header.get("Money Available")], temp[header.get("Flights Purchased")],
        temp[header.get("MinerAirlines Membership")], temp[header.get("Username")], temp[header.get("Password")], true);
        return employee;
    }
}

