# Duplication Katas

A repository to practice refactoring to remove duplication.

## Opportunities
- Understand IntelliJ refactoring tools
- Apply techniques for extracting duplication

## Useful Tools
These IntelliJ refactoring actions help you reduce the code duplication.

```
Extract Method (⌘ ⌥ M)
The Extract Method refactoring lets you 
take a code fragment that can be grouped, 
move it into a separated method, and replace 
the old code with a call to the method.
```
```
Introduce Variable (⌘ ⌥ V)
If you come across an expression that is hard to 
understand or it is duplicated in several places 
throughout your code, the Extract Variable 
refactoring ⌘ ⌥ V can help you deal with those problems
placing the result of such expression or its part into 
a separate variable that is less complex and easier to
understand. Plus, it reduces the code duplication.
```
```
Safe Delete (⌘ ⌦)
Makes sure that you do not delete files that are referenced 
in your source code.
```




## Project Setup
System dependencies required:

    Latest JDK LTS version (currently JDK 17)

nice to have:

    git
    IntelliJ IDEA (Community Edition or Ultimate)

Set Up (pulling down dependencies)

    clone the repository
    run ./gradlew clean build in the root directory
