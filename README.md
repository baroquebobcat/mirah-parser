Mirah Parser
===============

Mirah Parser is the parser for the Mirah programming language.

Development
-------
Working on Mirah Parser requires JRuby and Mirah. Sometimes, building the parser may depend on features that are not yet released. So, you may need to pull JRuby and Mirah from their repositories to build the parser.

To build the parser from source run( requires JRuby, and Mirah )

     rake build_parser

This will create `dist/mirah-parser.jar` which you can then copy into a checkout of Mirah's `/javalib` directory to use it in Mirah.

