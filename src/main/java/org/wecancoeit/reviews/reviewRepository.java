package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class reviewRepository {

    Map<Long, Review> reviews = new HashMap<>();


    public reviewRepository(Review... reviews) {
        ReviewModel(reviews);
    }

    private void ReviewModel(Review... reviews) {
        for (Review review : reviews) {
            this.reviews.put(review.getId(), review);
        }
    }

    public reviewRepository() {
        Review review1 = new Review(1L,"World of Warcraft","/images/wow.jpg","MMORPG","I personally played this game religiously for a while it was pretty good at one point. its a mmorpg with some of the best pvp for any game of its kind once you play it. \n Its kinda hard to find games that can match its fast pace. 8/10","Initial release date: November 23, 2004");
        Review review2 = new Review(2L, "PlayerUnknown's Battlegrounds","/images/pubg.jpg","Battle Royale","At the time of release even until 2018 it was one of the best battle royales ive played very fun and exciting though due to cheater kinda made the game unplayable but at its peak there was nothing like it. 7/10 ","Initial release date: December 20, 2017");
        Review review3 = new Review(3L, "Escape From Tarkov","/images/Tarkov.jpg"," First-Person Shooter","Talk about nerve wracking theres nothing like this game its a looter shooter with some really insane gun fights your always trying to listen out for foot steps specially if you hear them next to you could be a npc could be a player for all you know. If your not careful you will lose everything always keeps me on my toes 10/10","Closed Beta");
        Review review4 = new Review(4L, "Minecraft","/images/minecraft.jpg","Sandbox Video Game","Oh minecraft its one of those game your probably way too familiar with im sure everyone has either kids, friends, cousins ect have played this. Honestly theres a lot of content that can be had you can add mods and have unlimited possibilities or play vanilla and just zone out and chill either way its a good game that i always return too eventually! 10/10","Initial release date: May 17, 2009");
        Review review5 = new Review(5L, "Path Of Exiles","/images/poe.jpg","Action RPG","You like the diablo series love hack and slash rpgs then look no further path of exiles its amazing soo many builds you can make different abilities a lot of customizable character abilities and best of all its free!!!! currently the best hack and slash or action rpg in the market theres nothing like it def very enjoyable! 10/10","Initial release date: October 23, 2013");


        reviews.put(review1.getId(),review1);
        reviews.put(review2.getId(),review2);
        reviews.put(review3.getId(),review3);
        reviews.put(review4.getId(),review4);
        reviews.put(review5.getId(),review5);
    }

    public Collection<Review> allReviews() {
        return reviews.values();
    }

    public Review getOne(long reviewID){
        return reviews.get(reviewID);
    }

}
