package se.albin.m3;

/**
 * Klassen best??r av ett antal hj??lpmetoder f??r att f??renkla 
 * fysikaliska ber??kningar.
 *
 * @author Henrik Bygren
 * @version 1.0
 * @since 2017-02-14
 */
public final class Physics {
     	private Physics(){}
     	
     	/**
     	 * Ber??knar str??ckan vid konstant hastighet
     	 *
     	 * @param  velocity Hastigheten
     	 * @param  time	  F??rdtiden
     	 * @return Str??ckan
     	 */
     	public static double distance(double velocity, double time){
           return velocity*time;
     	}
     	
     	/**
     	 * Ber??knar medelhastigheten.
     	 *
     	 * @param  distance Str??cka som tillryggalagts
     	 * @param  time Tiden f??r f??rden
     	 * @return Medelhastigheten
     	 */
     	public static double velocity(double distance, double time){
           return distance/time;
     	}
     	
     	/**
     	 * Ber??knar str??mmen vid en krets
     	 *
     	 * @param voltage sp??nning
     	 * @param restistance motst??nd
     	 * @return str??m
     	 */
     	public static double current(double voltage, double resistance){
           return voltage/resistance;
     	}
     	
     	/**
     	 * Ber??knar tiden vid r??relse med konstant hastighet
     	 *
     	 * @param distance Str??ckan
     	 * @param velocity Medelhastigheten
     	 * @return tiden som f??rden tagit
     	 */
     	public static double voltage(double current, double resistance){
           return current*resistance;
     	}
     	
     	/**
     	 * Ber??knar tiden vid r??relse med konstant hastighet
     	 *
     	 * @param distance Str??ckan
     	 * @param velocity Medelhastigheten
     	 * @return tiden som f??rden tagit
     	 */
     	public static double resistance(double voltage, double current){
           return voltage/current;
     	}
     	
     	/**
     	 * Ber??knar tiden vid r??relse med konstant hastighet
     	 *
     	 * @param distance Str??ckan
     	 * @param velocity Medelhastigheten
     	 * @return tiden som f??rden tagit
     	 */
     	public static double time(double distance, double velocity){
           return distance/velocity;
     	}
     	
     	
}

