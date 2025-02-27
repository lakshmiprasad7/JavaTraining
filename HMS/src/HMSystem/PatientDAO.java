package HMSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {

    // Method to add a patient
    public void addPatient(Patient patient) throws SQLException {
        String query = "INSERT INTO Patient (fname, lname, age, gender, contact_number) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {

            psmt.setString(1, patient.getFname());
            psmt.setString(2, patient.getLname());
            psmt.setInt(3, patient.getAge());
            psmt.setString(4, patient.getGender());
            psmt.setString(5, patient.getContact_number());

            psmt.executeUpdate();
        }
    }

    public List<Patient> getAllPatients() throws SQLException {
        List<Patient> patients = new ArrayList<>();
        String query = "SELECT * FROM Patient";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Patient patient = new Patient(
                        rs.getInt("id"),
                        rs.getString("fname"),
                        rs.getString("lname"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("contact_number")
                );
                patients.add(patient);
            }
        }
        return patients;
    }

    // Method to update a patient
    public void updatePatient(Patient patient) throws SQLException {
        String query = "UPDATE Patient SET fname = ?, lname = ?, age = ?, gender = ?, contact_number = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {

            psmt.setString(1, patient.getFname());
            psmt.setString(2, patient.getLname());
            psmt.setInt(3, patient.getAge());
            psmt.setString(4, patient.getGender());
            psmt.setString(5, patient.getContact_number());
            psmt.setInt(6, patient.getId());

            psmt.executeUpdate();
        }
    }

    // Method to delete a patient
    public void deletePatient(int id) throws SQLException {
        String query = "DELETE FROM Patient WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {

            psmt.setInt(1, id);
            psmt.executeUpdate();
        }
    }
}
