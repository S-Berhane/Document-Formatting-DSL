# Document-Formatting-DSL 

Intro
*************************************************************************
Author: Simon Berhane

This is my project for Syntax-Based Tools and Compilers (CS4F03) at McMaster 
University.

It is a simple programming language that interprets 'data files' and 'design files'
which follow specific syntax.

It outputs a new file with both data and design integrated.
At the moment it only supports resume-style documents, and the syntax reflects this.

Implementation
*************************************************************************
At a high-level, the objective is to create a method of extracting information 
from two input files, and combining them. This means some mechanism for interpreting 
text is necessary.  

For this project, ANTLR4 handles the interpretation by generating a lexer and 
parser from a grammar. It also generates extra files that allow 'tree walking'
the abstract syntax tree. ANTLR4 generated code resides in ResumeParser.


Running
*************************************************************************
[1] Please ensure you have the jdk installed on your machine.

[2] To run, use the following command

java -jar <datafile.txt> <designfile.html>

[3] The program will interpret both files. It parses through the data file
and inserts into appropriate locations of the designfile. The output 
is resume1.html. 

Creating Data Documents
***************************************************************************
[1] The data document will take sequences that look like

start <type> <order>
<key>:<value>
<key>:<value>
...
stop <type> 

[2] The type can be personal, education, experience, or skils. The order parameter 
is used for sorting. It takes an integer from 1-9, where 1 will be the topmost data 
section represented in the design document. Each type has multiple key-value pairs. 

[3] An example of a data document exists in the jar folder of HTMLGenerator.


Creating Design Documents
*****************************************************************************
[1] The design document needs to represent the data by generating a template 
file. For example,

<body>
	<div data-id="personal-template">
		<h1 data-type="name"></h1>
		<li data-type="email"></li>
		<li data-type="address"></li>
		<li data-type="phone"></li>
	</div>
	<div>
		<section data-id="education-template">
		<h1 data-type="school"></h1>
		<h5 data-type="degree"></h5>
		<p data-type="startyear"></p>
		</section>
	</div>
	<div data-id="experience-template">
		<div data-type="title"></div>
		<div data-type="company"></div>
	</div>
	<div data-id="skills-template">
		<p data-type="general"></p>
	</div>
</body>

[2] Each type of information has a template, specified by a data-id attribute.
The template has a nested hierarchy for key-value pairs. Each pair is 
specified by a data-type attribute.

[3] An example of this exists in HTMLGenerator/jar.

[4] Once the program is executed, it will inject datafile information into the design 
as html characters (between beginning tag and ending tag).
