package Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        MusicPlayer musicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);
//
//        musicPlayerBean.playMusic();
//        System.out.println(musicPlayerBean.getName());
//        System.out.println(musicPlayerBean.getVolume());

        RockMusic rockMusicBean = context.getBean("rockMusicBean", RockMusic.class);
        RockMusic rockMusicBean2 = context.getBean("rockMusicBean", RockMusic.class);
        rockMusicBean.getMusic();
        rockMusicBean2.getMusic();

        context.close();
        
    }
}
