package com.example.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.twoactivities.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = "";

        if (view.getId() == R.id.button_text_one) {
            message = "The Beatles were an English four-piece rock band, formed in Liverpool in 1960.\n" +
                    "\n" +
                    "The members of the band were John Lennon, Paul McCartney, George Harrison and Ringo Starr, with John and Ringo playing the guitar, Paul on bass guitar and Ringo on the drums.\n" +
                    "\n" +
                    "In March 1956, John Lennon, aged 16, and a few of his friends from school played in a skiffle band called the Quarrymen. After meeting John in the July of that year, Paul McCartney joined the band as a rhythm guitarist and invited his friend George Harrison to watch the band perform. George then auditioned to be in the band, but John thought that he was too young, however, after several months of persistence, he performed lead guitar in a performance as was enlisted as their lead guitarist.\n" +
                    "\n" +
                    "By January 1959, John’s friends from school had left, and he began studying at Liverpool College of Art. The three guitarists, John, Paul and George, were playing under the name Johnny and the Moondogs, and playing rock and roll whenever they could find a drummer. \n" +
                    "\n" +
                    "Stuart Sutcliffe, an art college friend of John and band member, suggested that the band name should be Beatals, as a tribute to Buddy Holly and the Crickets. They used this name until May of 1959, where they went to the Silver Beetles, the Silver Beatles and then in August, shortened to simply The Beatles." +
            "\n" +
                    "\n" +
            "The Beatles’ Separation\n" +
                    "After tensions between the band members grew after disagreements over who would manage their finances, on 20th September 1969, Lennon announced that he would leave the band. It was agreed that he would withhold an announcement to the public, avoiding the potential drop in sales of their upcoming album. This important event is documented in our 1969 timeline, joined with other iconic moments that happened in that year.\n" +
                    "\n" +
                    "Abbey Road was released on 26th September and sold more than four million copies within three months – it also topped the UK charts for seventeen weeks in total. \n" +
                    "\n" +
                    "On the 31st December 1970, Paul McCartney filed for the dissolution of the Beatles’ contractual partnership. It was met with legal difficulties and it was not formalised until 29th December 1974, where John Lennon signed the paperwork whilst on holiday with his family at Walt Disney World Resort, in Florida.";
        } else if (view.getId() == R.id.button_text_two) {
            message = "Kangen Band is an Indonesian pop band from Jakarta that was formed in 2008. The band is best known for their romantic ballads and pop tunes. The group consists of five members: Abdul Rosyad (vocalist), Hengki Kurniawan (guitarist), Micky Telo (drummer), Ferry Ardiansyah (bassist) and Johny Iskandar (keyboard)." +
            "\n" + "\n" +
            "Kangen Band made their first public appearance in 2008, performing at a local event in Jakarta. Since then, the band has been performing regularly at events around Indonesia. Their debut album “Kangen” was released in 2009 and included the hit single “Sayang” which became an instant hit among Indonesian music fans. In 2011, they released their second album “Cinta Terakhir” which featured the song “Cinta Ini Membunuhku” which was also a big hit. In 2013, they released their third album “Jatuh Cinta” which featured the single “Jatuh Cinta” which became a huge success. They have also collaborated with many well-known Indonesian artists such as Siti Nurhaliza and Rina Nose." +
            "\n" + "\n" +
            "Kangen Band has won numerous awards throughout their career including Best Pop Album for their debut album “Kangen” at the 2009 Anugerah Musik Indonesia awards. They were also awarded Best Group at the 2010 Anugerah Musik Indonesia awards. In 2013, they won Best Group at the Anugerah Musik Indonesia awards for the second time." +
            "\n" + "\n" +
            "Kangen Band is one of the most beloved bands in Indonesia and have released several hit albums throughout their career. Their unique style of romantic ballads and pop tunes have captivated audiences around the world.";
        } else if (view.getId() == R.id.button_text_three) {
            message = "Queen is a band from Great Britain that plays the rock genre. It is considered one of the greatest rock bands of all time, with millions of fans around the world and millions of records sold, as well as occupying high positions on the music charts for many weeks. Queen has had a great influence on other artists and world cultures. Their music is very diverse because they incorporated different genres into their style, including hard rock, glam rock, heavy metal, and progressive rock.\n" +
                    "\n" +
                    "Queen was founded in the city of London by its four original members in 1970. The name Queen was proposed by the lead singer Freddie Mercury, who chose it for being a strong, outrageous, universal name and easy to learn and repeat even in countries that do not speak English. Some of their most famous songs are considered anthems, such as \"We Will Rock You\" and \"Bohemian Rhapsody.\"" +
            "\n" + "\n" +
            "Queen originally consisted of Freddie Mercury (lead singer), Brian May (guitar), John Deacon (bass), and Roger Taylor (drums). Originally, Roger Taylor and Brian May played in a band called Smile. A short time later Freddie Mercury joined. John Deacon joined the Queen members in 1971. Before John Deacon, they played with other bassists (Mike Grose, Barry Mitchell, and Doug Bogie). The original Queen lineup performed in the 70s and 80s and achieved great success all over the world. However, in 1991 Freddie Mercury died.\n" +
                    "\n" +
                    "After Mercury's death, the band had sporadic performances with other vocalists. John Deacon had his last appearance with the band in 1997. Taylor and May continued to play as Queen and invited various vocalists like Paul Rodgers to continue with the band. Currently, Queen with Taylor and May play with Adam Lambert as lead singer.";
        }

        intent.putExtra(EXTRA_TEXT, message);
        startActivity(intent);
    }
}
