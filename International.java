/*
    April 7, 2023 (CASS Extended Deadline - Original: April 4, 2023)
    Programming Assignment 4
    Christina A. Valtierra - 80714931
    CS 3331 - Advanced Object-Oriented Programming
    Dr. Daniel Mejia

    Honesty statement:
    I completed this work entirely on
    my own without any outside sources including peers, experts, online sources, or the
    like. I only received assistance from the instructor, TA, or IA.  

    Lab description: 
    I have recently been hired to work for MinerAir, an airline company. I am asked to analyze a file and display
    information based off the content that allows for modifications and updates on the flight data. Additionally, there
    are some customers interested in the AirLine, for whom I am given a csv file as well with all their information.

*/

// This class extends from the Flight class -> Gets its attributes from Airport
// It focuses on the city and country (from it being international) of both arrival and departing destinations
public class International extends Flight {

    // Attributes
    private Boolean isInternational;

    // Default constructor
    /**
     * Default constructor
     */
    public International() {

    }
    
    /**
     * Constructor with given attributes
     * @param flightIDIn
     * @param flightNumberIn
     * @param originAirportIn
     * @param destinationAirportIn
     * @param timeZoneDifferenceIn
     * @param departureDateIn
     * @param departureTimeIn
     * @param durationIn
     * @param distanceIn
     * @param arrivalDateIn
     * @param arrivalTimeIn
     * @param surchargeIn
     * @param foodServedIn
     * @param routeCostIn
     * @param minerPointsIn
     * @param totalSeatsIn
     * @param firstClassSeatsIn
     * @param businessClassSeatsIn
     * @param mainCabinSeatsIn
     * @param firstClassPriceIn
     * @param businessClassPriceIn
     * @param mainCabinPriceIn
     */
    public International(int flightIDIn, int flightNumberIn, Airport originAirportIn, Airport destinationAirportIn, int timeZoneDifferenceIn, String departureDateIn, String departureTimeIn, int durationIn, int distanceIn, String arrivalDateIn, String arrivalTimeIn, double surchargeIn, boolean foodServedIn, double routeCostIn, int minerPointsIn, int totalSeatsIn, int firstClassSeatsIn, int businessClassSeatsIn, int mainCabinSeatsIn, double firstClassPriceIn, double businessClassPriceIn, double mainCabinPriceIn) {
        super(flightIDIn, flightNumberIn, originAirportIn, destinationAirportIn, timeZoneDifferenceIn, departureDateIn, departureTimeIn, durationIn, distanceIn, arrivalDateIn, arrivalTimeIn, surchargeIn, foodServedIn, routeCostIn, minerPointsIn, totalSeatsIn, firstClassSeatsIn, businessClassSeatsIn, mainCabinSeatsIn, firstClassPriceIn, businessClassPriceIn, mainCabinPriceIn);
        this.isInternational = true; 
    }

    // Getters and setters
    /**
     * @return if flight is international
     */
    public Boolean getIsInternational() {
        return this.isInternational;
    }

    /**
     * @param isInternational
     * set if flight is international
     */
    public void setIsInternational(Boolean isInternational) {
        this.isInternational = isInternational;
    }
  //  
}