Prerequisite:

    Install JRE if you haven't already 
    
    If you want to check if you have it installed or not, open command line (or terminal) and type "java -version" (without the quotes), the version installed should be 1.8 or higher.
    
    If nothing shows up you can install it from one of the links below (installion takes a couple of seconds)
    
    For the newest version (160mb download):
    https://adoptium.net/ (click on latest LTS Release)
    
    For an older version that should still work (80mb download)
    https://www.java.com/en/download/manual.jsp


Running the app if you are on WINDOWS (If you are on MAC/LINUX scroll down)

    Step 1:
    Install the project files(ZIP) from github.

    Step 2:
    Extract the "Client and Software App" folder from the zip folder (You can place it anywhere you want)

    Step 3:
    Go To: "Client and Software App" >> "Executables"
    You should see the following files: Server1.bat; Server2.bat; Server3.bat; Client.bat
    (You can ignore the other files however do NOT delete them)

    Step 4:
    Run Server1.bat, Server2.bat, Server3.bat (double click the files to run them)
    You should see a terminal window pop up for each of them, where it is written: 
    "Waiting for client"

    Step 5:
    Run Client.bat
    Important: You need to run ALL server instances (step 4) before running the client, otherwisee the client terminal will CRASH

    Step 6:
    After doing Step 4 and 5, you should see the message "Client Connected" on all server terminals and the message "Enter a number:" on client terminal.

    You may enter any number, and one of the randomly picked servers will display that number doubled. 
    IMPORTANT: If you enter a non-number(string) the application will CRASH

    Step 7:
    You may exit by simply closing the client terminal window, and all the server terminals will close automatically. 
    

Running the app if you are on MAC/LINUX

    Step 1:
    Install the project files(ZIP) from github.

    Step 2:
    Extract the "Client and Software App" folder from the zip folder (You can place it anywhere you want)

    Step 3:
    Go To: "Client and Software App" >> "Executables"
    You should see the following files: Server.jar; Client.jar;
    (You can ignore the other files)

    Step 4:
    Copy the file path to the "Executables" folder

    Step 5:
    Open a new terminal window, change the directory to the executables folder (with "cd" command)
    
    Step 6:
    type in "java -jar server.jar 9001" (without the quotes)
    A message should appear that says "Waiting for client..."
    
    Step 7:
    Repeat the steps 5 and 6 TWO more times, 
    however replace the 9001 in "java -jar server.jar 9001" with 9002 for the second time, and with 9003 for the third time.

    Step 8:
    You should have 3 terminals open each having a message "Waiting for client..."
    Now run the client simply by repeating step 5, and now typing in "java -jar client.jar"
    message should appear saying "Enter a number:"

    Important: You need to run ALL THREE server instances before running the client, otherwisee the client terminal will CRASH

    Step 9:
    You may enter any number, and one of the randomly picked servers will display that number doubled. 
    IMPORTANT: If you enter a non-number(string) the application will CRASH

    You may exit by simply closing the client terminal window, and all the server terminals will close automatically. 


    
