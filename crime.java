import java.util.Scanner;

class CrimeRecord {
   private String caseNumber;
   private String offenderName;
   private String crimeDescription;
   private String dateOfIncident;
   private String dateOfArrest;

   public CrimeRecord(String caseNumber, String offenderName, String crimeDescription, String dateOfIncident, String dateOfArrest) {
      this.caseNumber = caseNumber;
      this.offenderName = offenderName;
      this.crimeDescription = crimeDescription;
      this.dateOfIncident = dateOfIncident;
      this.dateOfArrest = dateOfArrest;
   }

   public String getCaseNumber() {
      return caseNumber;
   }

   public String getOffenderName() {
      return offenderName;
   }

   public String getCrimeDescription() {
      return crimeDescription;
   }

   public String getDateOfIncident() {
      return dateOfIncident;
   }

   public String getDateOfArrest() {
      return dateOfArrest;
   }

   public void setCaseNumber(String caseNumber) {
      this.caseNumber = caseNumber;
   }

   public void setOffenderName(String offenderName) {
      this.offenderName = offenderName;
   }

   public void setCrimeDescription(String crimeDescription) {
      this.crimeDescription = crimeDescription;
   }

   public void setDateOfIncident(String dateOfIncident) {
      this.dateOfIncident = dateOfIncident;
   }

   public void setDateOfArrest(String dateOfArrest) {
      this.dateOfArrest = dateOfArrest;
   }

   public String toString() {
      return "Case Number: " + caseNumber + "\nOffender Name: " + offenderName + "\nCrime Description: " + crimeDescription + "\nDate of Incident: " + dateOfIncident + "\nDate of Arrest: " + dateOfArrest;
   }
}

class CrimeRecordManagement {
   private static CrimeRecord[] records = new CrimeRecord[100];
   private static int count = 0;

   public static void addRecord(CrimeRecord record) {
      records[count++] = record;
   }

   public static void displayRecords() {
      for (int i = 0; i < count; i++) {
         System.out.println(records[i]);
      }
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int choice;

      do {
         System.out.println("\n1. Add Record");
         System.out.println("\n2. Display Records");
         System.out.println("\n3. Exit");
         System.out.print("\nEnter your choice: ");

         choice = input.nextInt();

         switch (choice) {
            case 1:
               System.out.print("Enter Case Number: ");
               String caseNumber = input.next();

               System.out.print("Enter Offender Name: ");
               String offenderName = input.next();

               System.out.print("Enter Crime Description: ");
               String crimeDescription = input.next();

               System.out.print("Enter Date of Incident (dd/mm/yyyy): ");
               String dateOfIncident = input.next();

               System.out.print("Enter Date of Arrest (dd/mm/yyyy): ");
               String dateOfArrest = input.next();

               CrimeRecord record = new CrimeRecord(caseNumber, offenderName, crimeDescription, dateOfIncident, dateOfArrest);

               addRecord(record);
               break;

            case 2:
               displayRecords();
               break;

            case 3:
               System.out.println("Exiting...");
               break;

            default:
               System.out.println("Invalid Choice!");
         }

      } while (choice != 0);
input.close();
}
}