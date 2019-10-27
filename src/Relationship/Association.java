package Relationship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Rajendhiran Easu
 * @date 27, October-2019
 */
public class Association {
    public static void main(String[] args) {

        PublicRepo publicRepo1 = new PublicRepo("1234", "FaceX API", "Java");
        PublicRepo publicRepo2 = new PublicRepo("2232", "C# Mastering", "C#");
        PublicRepo publicRepo3 = new PublicRepo("4242", "Turtle 2.0", "turtle");
        PublicRepo publicRepo4 = new PublicRepo("5324", "Webx", "Silverlight");

        List<PublicRepo> repos = new ArrayList<>();
        Collections.addAll(repos, publicRepo1, publicRepo2, publicRepo3, publicRepo4);

        Users user2 = new Users("1000", "sGanesh");
        user2.grantRepoAccess(publicRepo1.repoId);

        Users user1 = new Users("1234", "sMuru");
        user1.grantRepoAccess(publicRepo1.repoId, publicRepo2.repoId, publicRepo3.repoId, publicRepo4.repoId);

        List<String> user1RepoIds = user1.getAccessibleRepoIds();
        final List<String> userR1RepoNames = new ArrayList<>();
        /*for (String user1RepoId : user1RepoIds) {
            for (Relationship.PublicRepo repo : repos) {
                if(repo.repoId.equals(user1RepoId)){
                    userR1RepoNames.add(repo.repoName);
                }
            }
        }*/
        //user1 = null; // Destroying the objects
        if (user1 != null) {
            user1RepoIds.forEach(e -> repos.stream()
                    .filter(g -> g.repoId.equals(e))
                    .map(l -> l.repoName)
                    .forEach(userR1RepoNames::add));

       /* List<Relationship.PublicRepo> repoNew = new ArrayList<>();

        user1RepoIds.forEach(e -> repos.stream()
                .filter(g -> g.repoId.equals(e))
                .forEach(repoNew::add));*/


            System.out.println("User1 Name " + user1.userName + " & his/her Repo Access Details are:");
            userR1RepoNames.forEach(System.out::println);
        }
        // repoNew.forEach(e-> System.out.println(e.repoId));
    }
}

class PublicRepo {
    public String repoId, repoName, repoPrimaryLanguage;

    public PublicRepo(String repoId, String repoName, String repoPrimaryLanguage) {
        this.repoId = repoId;
        this.repoName = repoName;
        this.repoPrimaryLanguage = repoPrimaryLanguage;
    }
}

class Users {
    public String userId, userName;
    private List<String> accessibleRepoIds = new ArrayList<>();

    public List<String> getAccessibleRepoIds() {
        return accessibleRepoIds;
    }

    public void grantRepoAccess(String repoId) {
        if (accessibleRepoIds != null) {
            accessibleRepoIds.add(repoId);
        } else {
            accessibleRepoIds = new ArrayList<>();
            accessibleRepoIds.add(repoId);
        }
    }

    public void grantRepoAccess(String... repoIds) {
        if (accessibleRepoIds == null) {
            accessibleRepoIds = new ArrayList<>();
        }
        Collections.addAll(accessibleRepoIds, repoIds);
    }

    public Users(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
