package src_voting_system;

import java.util.HashSet;
import java.io.*;

public class VoterData {
    
    private static final String FILE_PATH = "voters.txt";
    private static final HashSet<String> votedStudents = new HashSet<>();
    
    static{
        loadVoters();
    }
    
    public static boolean hasVoted(String studentNumber){
        return votedStudents.contains(studentNumber);
    }
    
    public static boolean recordVoter(String studentNumber){
        if(studentNumber == null || studentNumber.isBlank() || !votedStudents.add(studentNumber)){
            return false;
        }
        if(saveVoters()){
            return true;
        }
        
        votedStudents.remove(studentNumber);
        return false;
    }
    
    private static boolean saveVoters(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))){
            for(String studentId : votedStudents){
                writer.write(studentId);
                writer.newLine();
            }
            return true;
        } catch(IOException e){
            System.err.println("Error saving voters: " + e.getMessage());
            return false;
        }
    }
    
    public static HashSet<String> getVotedStudents(){
        return new HashSet<>(votedStudents);
    }
    
    public static void resetVoters(){
        votedStudents.clear();
        File file = new File(FILE_PATH);
        
        if(file.exists() && !file.delete()){
            System.err.println("Could not delete voter file: " + file.getAbsolutePath());
        }
    }
    
    private static void loadVoters(){
        File file = new File(FILE_PATH);
        if(!file.exists()) return;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            
            while((line = reader.readLine()) != null){
                if(!line.trim().isEmpty()){
                    votedStudents.add(line.trim());
                }
            }
        } catch (IOException e){
            System.err.println("Error loading voters: " + e.getMessage());
        }
    }
}
