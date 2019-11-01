/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    public void userWithMostLikes(){
        Map<Integer,Integer> userLikecount =new HashMap<Integer,Integer>();
        Map<Integer,User> users =DataStore.getInstance().getUsers();
        for(User user:users.values())
        {
         int likes=0;
        for(Comment c:user.getComments())
        { 
        
        if(userLikecount.containsKey(user.getId()))
            likes=userLikecount.get(user.getId());
        likes+=c.getLikes();
       userLikecount.put(user.getId(), likes);
    }         
        }
        int max=0;
        int maxId=0;
        for(int id:userLikecount.keySet())
        {
           // System.out.println("id "+id+" likes : "+userLikecount.get(id));
            if(userLikecount.get(id)>max){
                
                max=userLikecount.get(id);
            maxId=id;}
        }
        System.out.println("User with most likes : "+max+"\n"+users.get(maxId));
        
    }
    public void topFiveComents(){
                Map<Integer,Comment> comments =DataStore.getInstance().getComments();
        List<Comment> commentList=new ArrayList<>(comments.values());
        Collections.sort(commentList,new Comparator<Comment>(){
        @Override
        public int compare(Comment o1,Comment o2)
        {
            return o2.getLikes()-o1.getLikes();
        }
        });
        
        
    }
     public void averageLikesPerComment()
   {
       Map<Integer,Comment> comments =DataStore.getInstance().getComments();
       double sum=0;
       int tot=0;
       for(Comment c: comments.values())
       {
           sum+=c.getLikes();
       }
       double average= sum/comments.size();
       System.out.println("Average number of likes per comment :"+(int)average);
   }
     public  void postWithMostLikedComments()
   {
       Map<Integer,Post> post =DataStore.getInstance().getPosts();
      Map<Integer,Integer> postLikecount =new HashMap<Integer,Integer>();
       for(Post p:post.values())
       {
           int likes=0;
           for(Comment c:p.getComments())
           {
               if(postLikecount.containsKey(p.getPostId()))
                   likes=postLikecount.get(p.getPostId());
              likes+=c.getLikes();
              postLikecount.put(p.getPostId(), likes);
           }
       }
       int max=0;
        int maxId=0;
        for(int id:postLikecount.keySet())
        {
           // System.out.println("id "+id+" likes : "+userLikecount.get(id));
            if(postLikecount.get(id)>max){
                
                max=postLikecount.get(id);
            maxId=id;
            }
        }
        System.out.println("Post with most liked Comments is: "+maxId+ " and the maximum likes is : "+max);
   }          
     
}
    
