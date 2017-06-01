# Clojure Code Demos

This is a list of demos for the Clojure Code extension for Visual Studio Code. It assumes you've followed the setup steps in the README first. Follow the steps in this file to see a demonstration of the different capabilities of Clojure Code.

## Demo: Start the REPL

Click on the debug icon to open the DEBUG viewlet. Then click on the green triangle in the upper left hand corner next to 'Clojure-Debug'. The REPL should start up and you should see 'Starting debugger' in the status bar. If the debug console does not open in bottom of the project window go ahead and click on 'DEBUG CONSOLE' in the bottom panel to reveal it. You should see output from the REPL as it starts. Once it completes start up you shold see the message 'Attached to process' in the status bar and a list of running threads in the 'CALL STACK' viewlet on the left.


## Demo: Send Selected Text to the REPL

Put your cursor somewhere within the form below and press `shift+ctrl+m` to select it - or simply select the form yourself. Then press `shift+ctrl+e` (Win/Linux) or `shift+cmd+e` (Mac) to evaluate it.

```clojure
(+ 1 2 3)
```

## Demo: Refresh all Code in the Project

Any changed code in the project can be loaded and refreshed from the file system by invoking the command palette (`shift+ctrl+p` on Win/Linux or `shift+cmd+p` on Mac) and selecting `Clojure: Refresh Code`. In this project you can also invoke the `reset` function from the `user` namespace to accomplish the same thing by typing `(reset)` in the debug console input box. Any code entered into the debug console input box is evaluated in the `user` namespace. Finally, you can force reload all the code in the project by selecting `Clojure: Super Refresh Code` from the command palette.

*Hint: You can just type `refresh` in the command palette and select the action you want - no need to type the whole command.*

## Demo: Run All Tests

Run all the tests in the project by selecting `Clojure: Run all Tests` from the command palette. You should see the tests executing in the console and a progress bar in the status bar. When the tests comlplete you should see that one of the tests fails, one passes, and one has had an error while running. When the tests have completed click on 'PROBLEMS' in the bottom panel to see all the assertions that failed or encountered an error with a short summary of what went wrong. Click on the one labeled 'FAILURE' and you should see the failing test file open with the cursor on the failing assertion (underlined in red). Hover over the red squiggle beneath it to see a summary of the failure.

## Demo: Run a Single Test File

With the test file open select 'Clojure: Run Tests In Current Namespace' from the command palette. That runs all of the tests in that namespace.

## Demo: Run a Single Test

Put your cursor within the name of a test in the `test/clojure_code_demo/core-test.clj` file. Select `Clojure: Run Test Under Cursor` from the command palette to run the  test under the cursor.

## Demo: Load a single file.

Sometimes you don't want to reload all the code in a project and you don't want to evaluate each block separately. You can load a single file by selection `Clojure: Load File` from the command palette.

## Demo: View Documentation of a Function.

Open the `test/clojure_code_demo/core-test.clj` file. Hover the mouse pointer over `deftest` to see the docstring for that macro. No hover over `testing` to see the docstring for that macro.

## Demo: Preview or Jump to Namespace or Var Definition

Open the `test/clojure_code_demo/core-test.clj` file if it is not already open. Right click on `deftest` and select `Peek Definition` from the popup menu to see a preview of the code for that macro. Press `escape` to close the preview. Now right click on `deftest` again and select `Go to Definition` from the popup menu to jump to the location in the file where `deftest` is defined.

Pretty much anytime you see a var or namespace in Clojure code you can preview or jump to its implementation. `Go to Definition` and `Peek Definition` find the location of a var either on the local file system or in a referenced library. If the var is located in a library the code from the jar containing the library is extracted to `~/.lein/tmp-vscode-jars/` and opened there.

## Demo: Debug Failing Test

Open 