# Document-Formatting-DSL : Guide
*************************************************************************
[1] Please ensure you have the jdk installed on your machine.

[2] To run, use the following command

java -jar <datafile.txt> <designfile.html>

[3] The program will interpret both files. It parses through the data file
and inserts into appropriate locations of the designfile. The output 
is resume1.html. 

Data Document

[1] The data document will take sequences that look like

start <type> <order>
<key>:<value>
<key>:<value>
...
stop <type> 

The type can be personal, education, experience, or skils. 
The order parameter is used for sorting. It takes an integer from 1-9, where 1
will be the topmost data section represented in the design document.

Each type has multiple key-value pairs. 

[2] The design document needs to represent the data by generating a template file. For example,

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

Each type of information has a template, specified by a data-id attribute.
The template has a nested hierarchy for key-value pairs. Each pair is 
specified by a data-type attribute.

Once the program is executed, it will inject datafile information into the design 
as html characters (between beginning tag and ending tag).
