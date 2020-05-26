using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Hacker1 : MonoBehaviour
{
    private string[] Level1Passwords {"books","aisle","Self","password","font","boo" };

    int level;
    enum Screen { MainMenu, Password, WIN };
    Screen currentScreen;
    string Password;

    // Start is called before the first frame update
    void Start()
    {
        print(level1Passwords[0]);
        ShowMainMenu("Hello Daniel");

    }

    void ShowMainMenu(string greeting)
    {
        currentScreen = Screen.MainMenu;
        Terminal.ClearScreen();
        Terminal.WriteLine(greeting);
        Terminal.WriteLine("DEDSEC ENTER COMMAND");
        Terminal.WriteLine("press 1 for library");
        Terminal.WriteLine("press 2 for police station");
        Terminal.WriteLine("type clear to return to the menu");
        Terminal.WriteLine("Enter your selection");

    }

    void OnUserInput(string input)
    {
        if (input == "clear")
        {
            ShowMainMenu("Hello Daniel");
        }
        else if (currentScreen == Screen.MainMenu)
        {
            RunMainMenu(input);
        }
        else if (currentScreen == Screen.Password)
        {
            CheckPassword(input);
        }



    }

    private void CheckPassword(string input)
    {
        if (input == Password)
        {
            Terminal.WriteLine("SYSTEM CONNECTED");
        }
        else
        {
            Terminal.WriteLine("ERROR");
        }
    }

    void RunMainMenu(string input)
    {
        if (input == "2")
        {
            level = 2;
            Password = "abc123";
            Startgame();
        }

        else if (input == "1")
        {
            level = 1;
            Password = "qwerty";
            Startgame();
        }

        else if (input == "21")
        {
            Terminal.WriteLine("winner winner chicken chicken dinner   BLACK JACK");
        }

        else if (input == "DEDSEC")
        {
            Terminal.WriteLine("Hello Wrench");
        }

        else
        {
            Terminal.WriteLine("ERROR");
        }
        void Startgame()
        {
            currentScreen = Screen.Password;
            Terminal.WriteLine("you have chosen level " + level);
            Terminal.WriteLine("please enter your password:");
        }

    }
}


    
    






