# Desktop Arcade
A desktop-based entertainment hub that possesses a number of text-based games.
<br>It's meant to mimic the spirit of plug-and-play games and the old, flash-based websites that housed multiple games.
<p><b>Iteration 1:</b> Introduces 2 games that can be accessed and played via the terminal.
<br><b>Iteration 2:</b> Introduces a 3rd game, alongside the option to play the games via a GUI.
<br><b>Iteration 3:</b> Introduces local multiplayer and minor customization options.
</p>
<hr>
<h2>Authors</h2>
Emma "Jay" Jordan
<br>Helen Bassett
<br>Tia Self

<h2>Dependencies</h2>
• Java 19+
<br>• Gradle 7.6+
<br>• JavaFX

<h2>Instructions</h2>
• The Latest edition of IntelliJ IDEA Community Edition installed
<br>• Java 19 SDK installed
<br>• The Latest release of this repository cloned in IntelliJ
<h3>Run Instructions</h3>
<b>Iteration 1:</b> To start the program, run the edu.bsu.cs222.PlayDesktopArcade Class. It will execute via the terminal.
<br><b>Iteration 2:</b> To start the program via the terminal, follow the <i>Iteration 1</i> run instructions. To start the program via the GUI, navigate to Grade > finalRetribution > Tasks > Application > Run

<h2>Warnings</h2>
<br>• Suppressed Warning "'while' statement cannot complete without throwing an exception" within edu.bsu.cs222.Bunco.BuncoSingleplayer.java Class as it completed fine without an exception.
<br>• Suppressed Warning "Result of 'InputStream.read()' is ignored" within edu.bsu.cs222.Bunco.BuncoDice.java class as InputStream.read() is necessary for the application to run and is used.
<br>• Suppressed Warning "Result of 'System.in.read()' is ignored" within edu.bsu.cs222.DesktopArcadeDialogue.java class as InputStream.read() as it allows users to press enter to play.
<br>• Suppressed Warning "Method always returns the same value inspection" within edu.bsu.cs222.Bunco.BuncoDice.java as it is meant to return the same value.
<br>• Suppressed Warning "Method always returns the same value inspection" within edu.bsu.cs222.DesktopArcadeDialogue.java as it is meant to return the same value.
<br>• Suppressed Warning "Method always returns the same value inspection" within edu.bsu.cs222.Bunco.BuncoDialogue.java as it is meant to return the same value.
<br>• Suppressed Warning "Method always returns the same value inspection" within edu.bsu.cs222.RPS.RPSDialogue.java as it is meant to return the same value.
<br>• Suppressed Warning "Method always returns the same value inspection" within edu.bsu.cs222.TTT.TTTDialogue.java as it is meant to return the same value.
<br>• Suppressed Warning "Redundant 'throws' clause" within edu.bsu.cs222.GUITTTPlaySingle.java as the exception is thrown in the Initialize method.
<br>• Suppressed Warning "Loop variable not updated inside loop" within edu.bsu.cs222.TTT.TTTGame.java as it is an infinite loop.



