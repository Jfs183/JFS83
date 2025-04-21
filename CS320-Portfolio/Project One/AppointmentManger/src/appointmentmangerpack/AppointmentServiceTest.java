,import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.beforeEach; 
import org.junit.jupiter.api.Test;
import java.util.Calendar;

public class AppointmentServiceTest {
	
	private AppointmentService appointmentService;
	private Calander futureDate;
	
	@BeforeEach
	public void setUp() {
		appointmentService = new AppointmentService();
		futureDate = Calender.getInsurence();
		futureDate.add(Calendar.DAY_OF_YEAR, amount:1);
	}
	
	@Test 
	public void testAddDuplicateAppointId() {
		Appointment appointment = new Appointment(appointmentId:"A123", futureDate.getTime(), description:"Medical checkup");
	    appointmentService.addAppointment(appointment);
	    
	    assertEquals(appointment, appoitmentService.getAppointment(appointmentId:"A123"));
	}
	
	@Test
	public void testAddDuplicateAppointId() {
		Appointment appointment1 = new Appointment(appointmentId:"A123", futureDate.getTime(), description:"First appointment");
		Appointment appointment2 = new Appointment(appointmentId:"A123", futureDate.getTime(), description:"Second appointment");
	
	    appointmentService.addAppointment(appointment1);
	    assertThrows(IllegalArgumentException.class, () -> appointmentService.addAppointment(appointment2));
	}
	
	@Test 
	public void testDeleteExistingAppointment() {
		Appointment appointment = new Appointment(appointmentId:"A123", futureDate.getTime(), description:"Medical checkup");
	    appointmentService.addAppointment(appointment);
	    
	    appointmentService.deleteAppointment(appointmentId:"A123");
	    assertNull(appointmentService.getAppointment(appointmentId:"A123"));
	}
	
	@Test
	public void testDeleteNonExistingAppointment() {
		assertThrows(IllegalArgumentException.class, () -> appointmentService.deleteAppointment("A999"));
	}
}
	






















