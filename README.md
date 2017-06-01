# clojure-code-demo

This is a demo project for the [Clojure Code](https://marketplace.visualstudio.com/items?itemName=jamesnorton.continuum) [Visual Studio Code](https://github.com/Microsoft/vscode) extension for Clojure development.

## Prerequisites

* [Clojure](https://clojure.org/) 1.8 or better.
* [Leiningen][https://github.com/technomancy/leiningen] 2.0.0 or above installed.
* [Visual Studio Code](https://github.com/Microsoft/vscode)
* [Clojure Code](https://marketplace.visualstudio.com/items?itemName=jamesnorton.continuum) installed in VS Code. 

## Setup

1. Clone this repository `git clone https://github.com/indiejames/clojure-code-demo.git`
2. Open it in Visual Studio Code `code clojure-code-demo`
3. Open `Preferences->Settings` from the menu and set 
  * `"clojure.leinPath"` to the absolute path to the `lein` executable on your system
  * `"clojure.toolsJar"` to the absolute path to the `tools.jar` file on your system (typially under the `lib` of your Java installation)
3. Open `demos.md` from the project and follow the instructions.


## License

Copyright © 2017 James Norton
