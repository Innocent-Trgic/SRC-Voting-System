# SRC-Voting-System
A Java Swing administrator login screen for the CPUT SRC Voting System. It provides username and password fields, validates credentials using the SRC_ADMIN_USERNAME and SRC_ADMIN_PASSWORD environment variables, and opens the results screen after a successful login. The window is designed to open maximized while retaining its title bar.

CPUT SRC Voting System

A Java Swing application for the Cape Peninsula University of Technology (CPUT) Student Representative Council (SRC) voting system.

Features

•	Student and administrator login screens
•	Candidate information and voting screens.
•	Ballot review and vote confirmation
•	Election results and voter audit screens

Requirements

•	Java Development Kit (JDK)
•	Apache NetBeans IDE 

Team Contributions

Our eight group members contributed to the coding, interface design, presentation, review, and documentation of the systems.

System Code
•	*Kamogelo Innocent Mthimunye* contributed to the main user screens:
- WelcomeFrame.java – displays the welcome screen and provides navigation.
- AdminLoginFrame.java – check administrator credentials and provides access to the results screen after a successful login.
- StudentLoginFrame.java – provides the student sign-in screen.
- ResultsFrame.java – displays election results.

•	*Kebonethebe Matlhole* contributed to application startup and voter auditing:
- Main.java – starts the application.
- VoterAuditFrame.java – displays or manages information used to review voting activity.

•	*Kagiso Shain Mokoka* contributed to the voting process:
- ReviewBallotFrame.java – lets a voter review their ballot before submission.
- VoteRecordedFrame.java – confirms that a vote has been recorded.
- VoterData.java – stores or manages voter information.

•	*Masekane Tumisho Mmetle* contributed to candidate management:
- Candidate.java- represents a candidate and stores candidate information.
- CandidateData.java – stores or manages candidate data.
- Candidateframe.java – displays candidate information and candidate-related options.
- 
     JFrame design
  
•	*Prevail Ndlovu and Future Lubisi* designed the JFrame screens, arranging the interface components and supporting navigating and user actions throughout the voting system.

 Presentation, review, and report
 
•	*Hlulelo Hope Khoza* prepared the PowerPoint presentation and helped review the designs to check that the screens and their functions worked as expected.
•	*Ahlumilo Paliso* prepared the project report, describing the system, how it works.

How the System Works

The application is built with Java Swing. Its JFrame classes provide the screens, while the data classes hold or manage information used by those screens.
When the application starts, Main.java opens the welcome screen. From there, a user can proceed to the student voting flow or the administrator login. In the voting flow, the student signs in, views candidate information, reviews the ballot, and receives confirmation after submitting a vote. An administrator can sign in to view election results and voter audit information (Using username: admin & password: CPUT@0123).

Class Descriptions

•	*Main.java *- Entry point of the application. It starts the program and opens the welcome screen.
•	*WelcomeFrame.java* - Displays the opening screen and lets users navigate to the available systems functions.
•	*StudentLoginFrame.java* - Displays the student login screen and handles the student sign-in process.
•	*Candidate.java* - Represents a candidate and holds the candidate’s information.
•	*CandidateData.java* - provides candidate information for use by other parts of the application.
•	*CandidateFrame.java* - Displays candidate information and supports the candidate selection stage of voting.
•	*ReviewBallotFrame.java* - Shows the voter’s selection so they can review the before submitting the ballot.
•	*VoteRecordedFrame.java* - Displays confirmation after a vote has been recorded.
•	*VoterData.java* - Holds or manages voter information used by the application.
•	*AdminLoginFrame.java* - Displays the administrator login screen and checks the entered credentials against the SRC_ADMIN_USERNAME and SRC_ADMIN_PASSWORD environment variables. After a successful login, it opens the results screen.
•	*ResultsFrame.java* - Displays election results for the administrator.
•	*VoterAuditFrame.java* - Displays or manages voter audit information for reviewing voting activity.

Application Flow

1.	Main.java launches WelcomeFrame.java.
2.	A student enters the voting flow through StudentLoginFrame.java.
3.	Candidate details are supplied by CandidateData.java and represented by Candidate.java, then shown through CandidateFrame.java.
4.	The voter reviews their selections in ReviewBallotFrame.java.
5.	After submission, VoteRecordedFrame.java confirms that the vote. 
6.	An administrator signs in through AdminLoginFrame.java to access ResultsFrame.java and VoterAuditFrame.java.


