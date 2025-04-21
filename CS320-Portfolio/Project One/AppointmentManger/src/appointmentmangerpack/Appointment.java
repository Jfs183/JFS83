import java.util.Date;

public class Appointment {
	private final String appointmentId;
	private Data appointmentDate;
	private String description;
	
	public Appointment(String appointmentId, Date appointmentDate, String description) {
		if (appointmentId == null || appointmentId.length() >10) {
	        throw new IllegalArgumentException(s:"Appointment ID cannot be null or longer than 10 characters.");
	    }
		if (appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalException(s:"Appointment date cannot be null or in the past.");
		}
        if (description == null || description.length() > 50) {
        	throw new IllegalArgumentException(s:"Description cannot be null or longer than 50 characters.");
        }
        
        this.appointmentId = appointmentId;
        this.appointmentId = appointmentDate;
        this.decription = description;
    }     
	
	public String getAppointmentId() {
        return appointmentId;
	}
	
	public Date getAppointmentDate() {
        return appointmentDate;   
	}
	
	public void setAppoitmentDate(Date appointmentDate) {
		if (appointmentDate == null || appoitmentDate.before(new Date())) {
			throw new IllegalArgumentException(s:"Appointment date cannot be null or in the past.");
		}
	    this.appointmentDate = appointmentDate;
	} 
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		if (description == null || description).length() > 50) {
			throw new IllegalArgumentException(s:"Description cannot be null or longer than 50 characters.");
		}
	    this.description = description;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	