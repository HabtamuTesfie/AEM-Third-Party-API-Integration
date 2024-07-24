package et.com.aem.core.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Credentials {
        @SerializedName("medical_school")
        private String medicalSchool;
        @SerializedName("board_certifications")
        private List<String> boardCertifications;
        @SerializedName("years_of_experience")
        private int yearsOfExperience;

        // Getters and setters
        public String getMedicalSchool() {
            return medicalSchool;
        }

        public void setMedicalSchool(String medicalSchool) {
            this.medicalSchool = medicalSchool;
        }

        public List<String> getBoardCertifications() {
            return boardCertifications;
        }

        public void setBoardCertifications(List<String> boardCertifications) {
            this.boardCertifications = boardCertifications;
        }

        public int getYearsOfExperience() {
            return yearsOfExperience;
        }

        public void setYearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
        }
    }
