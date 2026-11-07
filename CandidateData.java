package src_voting_system;

import java.util.ArrayList;
import java.io.*;

public class CandidateData {
    
    private static final String VOTE_FILE = "votes.txt";
    private static final ArrayList<Candidate> CANDIDATES = new ArrayList<>();
    
    
    static{
        
        CANDIDATES.add(new Candidate("260000003", "Masekane Tumisho Mmetle", "President", "Improve student facilities and communications. "));
        
        CANDIDATES.add(new Candidate("260000002", "Kebonethebe Matlhole", "President", "Promote student activities and academic support"));
        
        CANDIDATES.add(new Candidate("260000001", "Future Lubisi", "President", "Improve transparency and student engagement"));
        
        CANDIDATES.add(new Candidate("260000000", "Hlulelo Hope Khoza", "General Secretary", "Respond to all the issues invloving students, without any single student left behind"));
        
        CANDIDATES.add(new Candidate("260000008", "Kamogelo Mthimunye", "General Secretary", "Proper management of the budget allocation meant for student projects and financial oversight"));
        
        CANDIDATES.add(new Candidate("260000004", "Prevail Ndlovu", "General Secretary", "Profile necessary financial support to unfunded and vulnerable students"));
        
        CANDIDATES.add(new Candidate("260000005", "Kagiso Shain Mokoka", "Housing & Welfare", "Ensure descent residence for all students"));
        
        CANDIDATES.add(new Candidate("260000006", "Ahlumile Paliso", "Housing & Welfare", "Ensure a 24/7 functionality of studying facilities (e.g. Library)"));
        
        CANDIDATES.add(new Candidate("260000007", "Rico Kaofela", "Housing & Welfare", "Clean, affordable, and safe environment for all students)"));
        
        loadVotes();
    }
    
    public static ArrayList<Candidate> getCandidates(){
        return new ArrayList<>(CANDIDATES);
    }
    
    public static boolean saveVotes(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(VOTE_FILE))){
            
            for(Candidate candidate : CANDIDATES){
                writer.write(candidate.getCandidateId() + ":" + candidate.getVotes());
                writer.newLine();
            }
            return true;
        } catch(IOException e){
            System.err.println("Error saving votes: " + e.getMessage());
            return false;
        }
    }
    

    private static void loadVotes(){
        File file = new File(VOTE_FILE);
        
        if(!file.exists()) return;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            
            while((line = reader.readLine()) != null){
                String[] parts = line.split(":");
                
                if(parts.length == 2){
                    String candidateId = parts[0];
                    int voteCount = Integer.parseInt(parts[1]);
                    
                    for(Candidate c : CANDIDATES){
                        
                        if(c.getCandidateId().equals(candidateId)){
                            for(int i = 0; i < voteCount; i++){
                                c.addVote();
                            }
                            break;
                        }
                    }
                }
            }
        } catch(IOException | NumberFormatException e){
            System.err.println("Error loading votes: " + e.getMessage());
        }
    }
    
    public static boolean resetAllVotes(){
        for(Candidate candidate : CANDIDATES){
            candidate.resetVotes();
        }
        
        File file = new File(VOTE_FILE);
        return !file.exists() || file.delete();
    }
}
