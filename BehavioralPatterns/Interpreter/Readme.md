# Interpreter

Given a language, define a representation for its grammar along with an 
interpreter that uses the representation to interpret sentences in the language.

_Describes how to define a grammar for simple languages, represent sentences in
the language, and interpret them_

## When to use it

* When there is a language to interpret, and we can represent the statements
of the language as abstract syntax trees.
* The grammar is simple.
* Efficiency is not critical.

## Consequence

* It is easy to change the grammars.
* Implementing the grammars is easy too.
* Complex grammars with many rules are hard to maintain.
* The Interpreter design pattern does not explain how to create an abstract 
syntax tree.
* The terminal symbols can be shared using the Flyweight pattern.

## Characteristics

* One class per grammar rule.
* The interpret takes as an argument the context in which to interpret the
expression.
* The abstract syntax tree is an instance of the Composite Pattern.
* Iterator can be used to traverse the structure.


### How it works

0. The example of this chapter is about a SQL like language, which is able
to query a map representing the name of the table, and as values various Rows
objects. Each one contains a "name" and "surname" column.
1. We have a __Client__ object in the App.java file, which creates 3 
__AbstractExpression__ objs, representing 3 different queries. Each of them 
represents an abstract tree made up of all the objects that implement the
__AbstractExpression__ interface.
2. __AbstractExpression__ is the Interpret interface that is common to all the
nodes of the abstract tree.
3. __Context__ contains global information about the interpreter. In our case,
it stores the tables, the rows, and the table, column and whereFilter we are
searching for.
4. When in the __Client__ we call interpret() on the __AbstractExpression__
interface, the action done depends on the object that we have added to the tree.
For example, in the first case, we have a __Select__ and a __From__ object.
The first one is a _NonTerminal operation_, because its _interpret()_ method
always calls the interpret method of the __From__ object. The latter may be
a _NonTerminal operation_ if it calls the interpret method of the __Where__ obj,
or it may be a _Terminal operation_ otherwise; since, it calls the _search()_
operation on the __Context__ obj, and therefore it returns a result. 
Consequently, is always a _Terminal operation_, since it always calls the 
_search()_ operation on the __Context__ obj.
