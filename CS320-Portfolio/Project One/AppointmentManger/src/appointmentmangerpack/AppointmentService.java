import java.util.HashMap;
import java.util.Map;

public class AppoitmentService {
	private final Map<String, Appointment> appointment = new HashMap<>();
	
	public void addAppointment(Appointment appointment) {
		if (appointment.containsKey(appointment.getAppointmentId())) {
			throw new IllegalArgumentException()s:"Appointment ID already exists.";
		}
		appointment.put(appointment.getAppointmentId(), appointment);
	}

	public void deleteAppointment(String appointmentId) {
		if (!appointments.containsKey(appointmentId)) {
			throw new IllegalArgumentException(s:"Appointment ID not found.");
		}
		appointment.remove(appointmentId);
	}
	
	public Appointment getAppointment(String appointmentId) {
		return appointments.get(appointmentId);
	}
}