package com.example.lab2_3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView

class Fragment_list : Fragment() {
    lateinit var adapter: Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)



        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key1","You're no good for me\n" +
                    "Baby, you're no good for me\n" +
                    "You're no good for me\n" +
                    "But baby, I want you, I want\n" +
                    "Diet mountain dew, baby, New York City\n" +
                    "Never was there ever a girl so pretty\n" +
                    "Do you think we'll be in love forever?\n" +
                    "Do you think we'll be in love?\n" +
                    "Diet mountain dew, baby, New York City\n" +
                    "Can we hit it now low down and gritty?\n" +
                    "Do you think we'll be in love forever?\n" +
                    "Do you think we'll be in love?\n" +
                    "Baby, put on heart shaped sunglasses\n" +
                    "'Cause we gonna take a ride\n" +
                    "I'm not gonna listen to what the past says\n" +
                    "I've been waiting up all night\n" +
                    "Take another drag turn me to ashes\n" +
                    "Ready for another lie?\n" +
                    "Says he's gonna teach me just what fast is\n" +
                    "Say it's gonna be alright\n" +
                    "Diet mountain dew, baby, New York City\n" +
                    "Never was there ever a girl so pretty\n" +
                    "Do you think we'll be in love forever?\n" +
                    "Do you think we'll be in love?\n" +
                    "Diet mountain dew, baby, New York City\n" +
                    "Can we hit it now low down and gritty\n" +
                    "Do you think we'll be in love forever?\n" +
                    "Do you think we'll be in love?\n" +
                    "Let's take Jesus off the dashboard\n" +
                    "Got enough on his mindㅤ\n" +
                    "We both know just what we're here for\n" +
                    "Saved too many times\n" +
                    "Maybe I like this roller coaster\n" +
                    "Maybe it keeps me high\n" +
                    "Maybe the speed it brings me closer\n" +
                    "I could sparkle up your eye\n" +
                    "Diet mountain dew, baby, New York City\n" +
                    "Never was there ever a girl so pretty\n" +
                    "Do you think we'll be in love forever?\n" +
                    "Do you think we'll be in love?\n" +
                    "Diet mountain dew, baby, New York City\n" +
                    "Can we hit it now low down and gritty?\n" +
                    "Do you think we'll be in love forever?\n" +
                    "Do you think we'll be in love?\n" +
                    "You're no good for me\n" +
                    "Baby, you're no good for me\n" +
                    "You're no good for me\n" +
                    "But baby, I want you, I want you\n" +
                    "You're no good for me\n" +
                    "Baby, you're no good for me\n" +
                    "You're no good for me\n" +
                    "But baby, I want you, I want you, I want you\n" +
                    "Diet mountain dew, baby, New York City\n" +
                    "Never was there ever a girl so pretty\n" +
                    "Do you think we'll be in love forever?\n" +
                    "Do you think we'll be in love?\n" +
                    "Baby, stoppin' at 7-Eleven\n" +
                    "There in his white Pontiac heaven\n" +
                    "Do you think we'll be in love forever?\n" +
                    "Do you think we'll be in love?\n" +
                    "Diet mountain dew, baby, New York City\n" +
                    "Never was there ever a girl so pretty\n" +
                    "Do you think we'll be in love forever?\n" +
                    "Do you think we'll be in love?\n" +
                    "Diet mountain dew, baby, New York City\n" +
                    "Can we hit it now low down and gritty?\n" +
                    "Do you think we'll be in love forever?\n" +
                    "Do you think we'll be in love?\n" +
                    "You're no good for me\n" +
                    "Baby, you're no good for me\n" +
                    "You're no good for me\n" +
                    "But baby, I want you, I want\n" +
                    "You're no good for me\n" +
                    "Baby, you're no good for me\n" +
                    "You're no good for me\n" +
                    "But baby, I want you, I want\n" +
                    "You're no good for me\n" +
                    "Baby, you're no good for me\n" +
                    "You're no good for me\n" +
                    "But baby, I want you, I want")
            findNavController().navigate(R.id.action_fragment_list_to_fragment_data, bundle)
}



        val button2 = view.findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val bundle2 = Bundle()
            bundle2.putString("key2", "I'm just a little bit caught in the middle\n" +
                    "Life is a maze and love is a riddle\n" +
                    "I don't know where to go I can't do it alone I've tried\n" +
                    "And I don't know why\n" +
                    "\n" +
                    "Slow it down\n" +
                    "Make it stop\n" +
                    "Or else my heart is going to pop\n" +
                    "'Cause it's too much\n" +
                    "Yeah, it's a lot\n" +
                    "To be something I'm not\n" +
                    "\n" +
                    "I'm a fool\n" +
                    "Out of love\n" +
                    "'Cause I just can't get enough\n" +
                    "\n" +
                    "I'm just a little bit caught in the middle\n" +
                    "Life is a maze and love is a riddle\n" +
                    "I don't know where to go I can't do it alone I've tried\n" +
                    "And I don't know why\n" +
                    "\n" +
                    "I am just a little girl lost in the moment\n" +
                    "I'm so scared but I don't show it\n" +
                    "I can't figure it out\n" +
                    "It's bringing me down I know\n" +
                    "I've got to let it go\n" +
                    "And just enjoy the show\n" +
                    "\n" +
                    "\n" +
                    "The sun is hot\n" +
                    "In the sky\n" +
                    "Just like a giant spotlight\n" +
                    "The people follow the signs\n" +
                    "And synchronize in time\n" +
                    "It's a joke\n" +
                    "Nobody knows\n" +
                    "They've got a ticket to that show\n" +
                    "Yeah\n" +
                    "\n" +
                    "I'm just a little bit caught in the middle\n" +
                    "Life is a maze and love is a riddle\n" +
                    "I don't know where to go I can't do it alone I've tried\n" +
                    "And I don't know why\n" +
                    "\n" +
                    "I am just a little girl lost in the moment\n" +
                    "I'm so scared but I don't show it\n" +
                    "I can't figure it out\n" +
                    "It's bringing me down I know\n" +
                    "I've got to let it go\n" +
                    "And just enjoy the show\n" +
                    "Just enjoy the show\n" +
                    "\n" +
                    "I'm just a little bit caught in the middle\n" +
                    "Life is a maze and love is a riddle\n" +
                    "I don't know where to go I can't do it alone I've tried\n" +
                    "And I don't know why\n" +
                    "\n" +
                    "I am just a little girl lost in the moment\n" +
                    "I'm so scared but I don't show it\n" +
                    "I can't figure it out\n" +
                    "It's bringing me down I know\n" +
                    "I've got to let it go\n" +
                    "And just enjoy the show\n" +
                    "Just enjoy the show\n" +
                    "\n" +
                    "Dum de dum\n" +
                    "dudum de dum\n" +
                    "\n" +
                    "Just enjoy the show\n" +
                    "\n" +
                    "Dum de dum\n" +
                    "dudum de dum\n" +
                    "\n" +
                    "Just enjoy the show\n" +
                    "\n" +
                    "I want my money back\n" +
                    "I want my money back\n" +
                    "I want my money back\n" +
                    "\n" +
                    "Just enjoy the show\n" +
                    "\n" +
                    "I want my money back\n" +
                    "I want my money back\n" +
                    "I want my money back\n" +
                    "\n" +
                    "Just enjoy the show ")
            findNavController().navigate(R.id.action_fragment_list_to_fragment_data, bundle2)
        }

        val button3 = view.findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val bundle3 = Bundle()
            bundle3.putString("key3", "I'm like the water when your ship rolled in that night\n" +
                    "Rough on the surface but you cut through like a knife\n" +
                    "And if it was an open-shut case\n" +
                    "I never would've known from that look on your face\n" +
                    "Lost in your current like a priceless wine\n" +
                    "The more that you say\n" +
                    "The less I know\n" +
                    "Wherever you stray\n" +
                    "I follow\n" +
                    "I'm begging for you to take my hand\n" +
                    "Wreck my plans\n" +
                    "That's my man\n" +
                    "Life was a willow and it bent right to your wind (oh)\n" +
                    "Head on the pillow, I could feel you sneaking in\n" +
                    "As if you were a mythical thing\n" +
                    "Like you were a trophy or a champion ring\n" +
                    "And there was one prize I'd cheat to win\n" +
                    "The more that you say\n" +
                    "The less I know\n" +
                    "Wherever you stray\n" +
                    "I follow\n" +
                    "I'm begging for you to take my hand\n" +
                    "Wreck my plans\n" +
                    "That's my man\n" +
                    "You know that my train could take you home\n" +
                    "Anywhere else is hollow\n" +
                    "I'm begging for you to take my hand\n" +
                    "Wreck my plans\n" +
                    "That's my man\n" +
                    "Life was a willow and it bent right to your wind (oh)\n" +
                    "They count me out time and time again\n" +
                    "Life was a willow and it bent right to your wind (oh)\n" +
                    "But I come back stronger than a 90's trend\n" +
                    "Wait for the signal and I'll meet you after dark\n" +
                    "Show me the places where the others gave you scars\n" +
                    "Now this is an open-shut case\n" +
                    "Guess I should've known from the look on your face\n" +
                    "Every bait and switch was a work of art\n" +
                    "The more that you say\n" +
                    "The less I know\n" +
                    "Wherever you stray\n" +
                    "I follow\n" +
                    "I'm begging for you to take my hand\n" +
                    "Wreck my plans\n" +
                    "That's my man\n" +
                    "You know that my train could take you home\n" +
                    "Anywhere else is hollow\n" +
                    "I'm begging for you to take my hand\n" +
                    "Wreck my plans\n" +
                    "That's my man\n" +
                    "The more that you say\n" +
                    "The less I know\n" +
                    "Wherever you stray\n" +
                    "I follow\n" +
                    "Begging for you to take my hand\n" +
                    "Wreck my plans\n" +
                    "That's my man\n" +
                    "You know that my train could take you home\n" +
                    "Anywhere else is hollow\n" +
                    "Begging for you to take my hand\n" +
                    "Wreck my plans\n" +
                    "That's my man\n" +
                    "Hey, that's my man\n" +
                    "That's my man\n" +
                    "Yeah, that's my man\n" +
                    "Every bait and switch was a work of art\n" +
                    "That's my man\n" +
                    "Hey, that's my man\n" +
                    "I'm begging for you to take my hand\n" +
                    "Wreck my plans\n" +
                    "That's my man")

            findNavController().navigate(R.id.action_fragment_list_to_fragment_data, bundle3)
        }






        adapter = Adapter()
        adapter.setNewData(createSongs())
        val rv = view?.findViewById<RecyclerView>(R.id.rv)
        rv?.adapter = adapter

return view
    }




    fun createSongs():List<Song>{


        return listOf(
            Song1(
                "Diet Mountain Dew",
                " Lana Del Rey",
                "https://cdns-images.dzcdn.net/images/cover/de9496f611d6d7391fa57401bac99d5b/500x500.jpg"
            ),
            Song2(
                "The Show",
                "Kerris Dorsey",
                "https://images.genius.com/bf0eece2d5bab14f558ebeca57491097.500x500x1.jpg"
            ),
            Song3(
                "Willow",
                "Taylor Swift",
                "https://i.scdn.co/image/ab67616d0000b27325751b4b32829d6bbfe6be7f"
            )
        )

    }


}
