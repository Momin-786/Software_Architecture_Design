import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emailId;

    private String recipient;

    public void sendEmail(String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}