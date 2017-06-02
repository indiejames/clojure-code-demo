# Clojure Code Demos

This is a list of demos for the Clojure Code extension for Visual Studio Code. It assumes you've followed the setup steps in the README first. Follow the steps in this file to see a demonstration of the different capabilities of Clojure Code. It is recommended to split the editor into two panes by selection `Split Editor` from the `View` menu so that you can keep this file visible as you work through the demos in the Clojure files.

## Demo: Start the REPL

Click on the debug icon to open the `DEBUG` viewlet. Then click on the green triangle in the upper left hand corner next to `Clojure-Debug`. The REPL should start up and you should see `Starting debugger` in the status bar. If the debug console does not open in bottom of the project window go ahead and click on `DEBUG CONSOLE` in the bottom panel to reveal it. You should see output from the REPL as it starts. Once it completes start up you should see the message `Attached to process` in the status bar and a list of running threads in the `CALL STACK` viewlet on the left.


## Demo: Send Selected Text to the REPL

Put your cursor somewhere within this form `(+ 1 2 3 )` and press `shift+ctrl+m` to select it - or simply select the form yourself. Then press `shift+ctrl+e` (Win/Linux) or `shift+cmd+e` (Mac) to evaluate it. You should see the result in the debug console. *Hint this won't work if you are viewing this file in Markdown Preview mode*

Code may be executed in three different ways. The first way which you just used is to execute code from within the editor. Code executed in this way executes in the namespace of the file from which you executed the code (or `user` if the file does not define a namespace). The second way to execute code is to type it directly into the debug console input box (located below the debug console). Code entered here executes in the `user` namespace. The third way to execute code is to type it into the debug console input box when stopped at a breakpoint. Code entered this way executes in the context of the current stack frame, so vars bound there can be referenced in the code you enter.

## Demo: Refresh all Code in the Project

Any changed code in the project can be loaded and refreshed from the file system by invoking the command palette (`shift+ctrl+p` on Win/Linux or `shift+cmd+p` on Mac) and selecting `Clojure: Refresh Code`. In this project you can also invoke the `reset` function from the `user` namespace to accomplish the same thing by typing `(reset)` in the debug console input box. Any code entered into the debug console input box is evaluated in the `user` namespace. Finally, you can force reload all the code in the project by selecting `Clojure: Super Refresh Code` from the command palette.

*Hint: You can just type `refresh` in the command palette and select the action you want - no need to type the whole command.*

## Demo: Run All Tests

Run all the tests in the project by selecting `Clojure: Run all Tests` from the command palette. You should see the tests executing in the console and a progress bar in the status bar. When the tests comlplete you should see in the debug console that one of the tests fails, one passes, and one has had an error while running.

 When the tests have completed click on `PROBLEMS` in the bottom panel to see all the assertions that failed or encountered an error with a short summary of what went wrong. If you have two editor panes open, click in the pane that does not have this file open to give it focus. Then click in the `PROBLEMS` pane on the one labeled `FAILURE` and you should see the failing test file open with the cursor on the failing assertion (underlined with a red squiggly line). Hover over the red squiggle line beneath it to see a summary of the failure.

## Demo: Run a Single Test File

With the test file open select `Clojure: Run Tests In Current Namespace` from the command palette. That runs all of the tests in that namespace.

## Demo: Run a Single Test

Put your cursor within the name of a test in the `test/clojure_code_demo/core-test.clj` file. Select `Clojure: Run Test Under Cursor` from the command palette to run the test under the cursor. After the test completes you see that the `PROBLEMS` panel now reflects only the state of that test. Each time you re-run tests the `PROBLEMS` panel is reset.

## Demo: Load a single file.

Let's fix the test causing the error. If you did not run it last go ahead and run it now. Then hover over the red underline to see the error. You should see a message like `java.lang.ClassCastException: java.lang.Long cannot be cast to clojure.lang.IFn`. This is indicating that we are attmempting to invoke a number as a function. Looking at our test we see that where we meant to call `multiply` with two arguments we instead wrote `(2 2)`. Go ahead and change that to `(multiply 2 2)`, save the file, then select `Clojure: Load File` from the command palette to reload this file. Now rerun the test and see that it passes.

## Demo: View Documentation of a Function.

Open the `test/clojure_code_demo/core-test.clj` file. Hover the mouse pointer over `deftest` to see the docstring for that macro. Now hover over `testing` to see the docstring for *that* macro.

## Demo: Preview or Jump to Namespace or Var Definition

Open the `test/clojure_code_demo/core-test.clj` file if it is not already open. Right click on `deftest` and select `Peek Definition` from the popup menu to see a preview of the code for that macro. Press `escape` to close the preview. Now right click on `deftest` again and select `Go to Definition` from the popup menu to jump to the location in the file where `deftest` is defined.

Pretty much anytime you see a var or namespace in Clojure code you can preview or jump to its implementation. `Go to Definition` and `Peek Definition` find the location of a var either on the local file system or in a referenced library. If the var is located in a library the code from the jar containing the library is extracted to `~/.lein/tmp-vscode-jars/` and opened there.

## Demo: Debug Failing Test

Open the `DEBUG` viewlet by clicking on the debug icon on the left vertical toolbar in VS Code. Now open the file `src/clojure_code_demo/core.clj`. Set a breakpont on line 7 by clicking in the `gutter` to the left of the line number. You should see a red circle appear. Now run all the tests and see the execution pause at your breakpoint. In the `VARIABLES` section of the `DEBUG` viewlet expand the `Argument` tree. You should see vars `x` and `y` with the values `1` and `3`.

You can use these vars in the input box to the debug console (the input box just below the console). Try entering `(- x y)` and pressing `return`. This is the value being returned to our test, if you recall. Clearly we don't want to use `-` in an `add` function. Continue the execution by pressing the green triangle in the debugger controls at the top of the editor (not the green triangle in `DEBUG` viewlet to the left). Remove the breakpoint by clicking on it. Now edit file to change `(- x y)` to `(+ x y)` and reload. Run all the tests and everyting should be passing at this point.

## More

There are more features to explore. Try adding some functionality to the project to get a feel for working with the extension.