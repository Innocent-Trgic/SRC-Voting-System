package src_voting_system;

public class Candidate {
    
    private final String candidateId;
    private final String name;
    private final String position;
    private final String manifesto;
    private int votes;
    
    public Candidate(String candidateId, String name, String position, String manifesto){
    this.candidateId = candidateId;
    this.name = name;
    this.position = position;
    this.manifesto = manifesto;
    this.votes = 0;
}
    
    public void removeVote(){
        if(votes > 0){
            votes--;
        }
    }
    
    public void resetVotes(){
        votes = 0;
    }
    
    public String getCandidateId(){
        return candidateId;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPosition(){
        return position;
    }
    
    public String getManifesto(){
        return manifesto;
    }
    
    public int getVotes(){
        return votes;
    }
    
    public void addVote(){
        votes++;
    }
    
}
