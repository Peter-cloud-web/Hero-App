import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class HeroTest {
    @Before
    public void setUp() throws Exception {
    }

    private Hero setupHero() {
        return new Hero("Superman", 180, "Almost everything", "Kryptonite");
    }

    @Test
    //Our first test passes so we know that we can create an instance of a Hero
    public void NewHeroObjectGetsCorrectlyCreated_true() throws Exception {
        Hero hero = setupHero();
        assertTrue( hero instanceof Hero);
    }
    @Test
    public void getHeroName_String() {
        Hero hero = setupHero();
        assertEquals("Superman",hero.getName());
    }

    @Test
    public void getHeroAge_int() {
        Hero hero = setupHero();
        assertEquals(180, hero.getAge());
   }

    @Test
    public void getHeroPower_true() {
        Hero hero = setupHero();
        assertEquals("Almost everything",hero.getPower());
    }
//
    @Test
    public void getHeroWeakness_true() {
        Hero hero = setupHero();
        assertEquals("Kryptonite",hero.getWeakness());
    }
//    @Test
//    public void PostInstantiatesWithContent_true() throws Exception {
//     Hero post = new Hero("Day 1:Intro");
//     assertEquals("Day 1:Intro", post.getContent());
//    }
//    @Test
//    public void getPublished_isFalseAfterInstantiation_false() throws Exception {
//        Hero myPost = new Hero("Day 1: Intro");
//        assertEquals(false, myPost.getPublished()); //should never start as published
//    }
//    @Test
//    public void getCreatedAt_instantiatesWithCurrentTime_today() throws Exception{
//        Hero myPost = setupNewPost(); //see below
//        assertEquals(LocalDateTime.now().getDayOfWeek(), myPost.getCreatedAt().getDayOfWeek());
//    }
//    @Test
//    public void getId_postsInstantiateWithAnID_1() throws Exception{
//        Hero.clearAllPosts();  // Remember, the test will fail without this line! We need to empty leftover Posts from previous tests!
//        Hero myPost = new Hero("Day 1: Intro");
//        assertEquals(1, myPost.getId());
//    }
//    @Test
//    public void findReturnsCorrectPost() throws Exception {
//        Hero post = setupNewPost();
//        assertEquals(1, Hero.findById(post.getId()).getId());
//    }
//    @Test
//    public void findReturnsCorrectPostWhenMoreThanOnePostExists() throws Exception {
//        Hero post = setupNewPost();
//        Hero otherPost = new Hero("How to pair successfully");
//        assertEquals(2, Hero.findById(otherPost.getId()).getId());
//    }
//    @Test
//    public void updateChangesPostContent() throws Exception{
//        Hero post = setupNewPost();
//        String formerContent = post.getContent();
//        LocalDateTime formerDate = post.getCreatedAt();
//        int formerId = post.getId();
//
//        post.update("Android: Day 40");
//
//        assertEquals(formerId, post.getId());
//        assertEquals(formerDate, post.getCreatedAt());
//        assertNotEquals(formerContent, post.getContent());
//    }
//    @Test
//    public void deleteDeletesASpecificPost() throws Exception {
//        Hero post = setupNewPost();
//        Hero otherPost = new Hero("How to pair successfully");
//        post.deletePost();
//        assertEquals(1, Hero.getAll().size()); //one is left
//        assertEquals(Hero.getAll().get(0).getId(), 2); //the one that was deleted has the id of 2. Why do we care?
//    }
//    @Test
//    public void deleteAllPostsDeletesAllPosts() throws Exception {
//        Hero post = setupNewPost();
//        Hero otherPost = setupNewPost();
//
//        Hero.clearAllPosts();
//        assertEquals(0, Hero.getAll().size());
//    }
//
//    public Hero setupNewPost(){
//        return new Hero("Day 1: Introduction");
//    }

//        @After
//        public void tearDown () throws Exception {
//
//        }

    }
