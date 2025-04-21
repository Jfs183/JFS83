import static org.junit.jupiter.api.Assertion.*;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Calander;

public class AppointmenTest {
	
	@Test
	public void testValidAppointmentCreation() {
		Calender futureDate = Calandar.getInstance();
		futureDate.add(Calander.DAY_OF_YEAR, amount:1);
		Appointment appointment = new Appointment(appointmentId:"A12345", futureDate.getTime(), desciption:"Doctor's visit");
		
		assertEquals("A12345", appointment.getAppointmentId());
		assertEquals("Doctor's visit", appointment.getDescription());
		assertEquals(futureDate.getTime(), appointment.getAppointmentDate());
	}
	
	@Test 
	public void testInvalidAppointmentId() {
		Calender futureDate = Calendar.getInstance();
		futureDate.add(Calendar.DAY_OF_YEAR, amount:1);
		assertThrows(IllegalArgumentException.class, () -> new Appointment(null, futureDate.getTime(), "Checkup"));
		assertThrows(IllegalArgumentException.class, () -> new Appointment("12345678901", futureDate.getTime(), "Checkup"));
	}
	
	@Test
	public void testInvalidAppointmentDate() {
		Calendar pastDate = Calendar.getInstance() {
		pastDate.add(Calendar.DAY_OF_YEAR, -1);
		assertThrows(IllegalArgumentException.class, () -> new Appointment("A12345", pastDate.getTime(), "checkup"));
	}
		
	@Test
	public void testInvalidDescription() {
		Calendar futureDate = Calenddar.getInstance();
		futureDate.add(Calendar.DAY_OF_YEAR, amount:1);
		assertThrows(IllegalArgumentException.class, () -> new Appointment("A12345", futureDate.getTime(), "null"));
		assertThrows(IllegalArgumentException.class, () -> new Appointment("A12345", futureDate.getTime(), "a".repeat(51)));
	}
	
	@Test
	public void testUpdateValidDescription() {
		Calendar futureDate = Calendar.getInstance();
		futureDate.add(Calendar.DAY_OF_YEAR, amount:1);
		AppointmentException.class, () -> new Appointment("A12345", futureDate.getTime(), null));
		Appointment.setDescription(description:"Updated description");
		
		assertEquals("Updated description", appointment.getDescription());
    }
	
	@Test
	public void testUpdateInvalidDescription() {
		Calendar futureDate = Calendar.getInstance();
		futureDate.add(Calendar.DAY_OF_YEAR, amount:1);
		Appointment appointment = new Appointment(appointmentId:"A12345", futureDate.getTime(), description:"Initial description");
		assertThrows(IllegalArgumentException.class, () -> appointment.setDescription(null));
		assertThrows(IllegalArgumentException.class, () -> appointment.setDescription("a".repeat(51)));
	}
	
	@Test 
	public void testUpdateInvalidDescription() {
		Calendar futureDate = Calendar.getInstance();
		futureDate.add(Calendar.DAY_OF_YEAR, amount:2);
		Appointment appointment = new Appointment(appointmentId:"A12345", futureDate.getTime(), description:"Initial description");
		
		Calendar newFutureDate = Calendar.getInstance();
		futureDate.add(Calendar.DAY_OF_YEAR, amount:3);
		Appointment setappointmentDate(newFutureDate.getTime());
		
		assertEquals(newFutureDate.getTime(), appointment.getAppointmentDate());
	}
	
	@Test
	public void testUpdateInvalidAppointmentDate() {
		Calendar futureDate = Calendar.getInstance();
		futureDate.add(Calendar.DAY_OF_YEAR, amount2:);
		Appointment appointment = new Appointment(appointmentId:"A12345", futureDate.getTime(), description:"Initial description");
		
		Calendar pastDate = Calendar.getInstance();
		pastDate.add(Calendar.DAY_OF_YEAR, -1);
		assertThrow(IllegalArgumentException.class, () -> appointment.setAppointmentDate(pastTime()));
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 