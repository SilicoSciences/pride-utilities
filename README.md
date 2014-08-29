pride-utilities
===============

# About PRIDE Utilities

The primary purpose of PRIDE Utilities library is to provide commonly used classes shared by all the PRIDE Tool Suite. You may also find it useful for your own computational proteomics projects.

# How to cite it:

Wang, R., Fabregat, A., Ríos, D., Ovelleiro, D., Foster, J. M., Côté, R. G., ... & Vizcaíno, J. A. (2012). PRIDE Inspector: a tool to visualize and validate MS proteomics data. Nature biotechnology, 30(2), 135-137.

# Main Features



# The library provides four key modules:

**mol**: contains classes describing entities at the molecular level, such as: amino acids, neutrual losses, peptides and fragment ions.
**gui**: contains several GUI components, you can use them if you want to replicate some of the features in PRIDE Inspector.
**data**: contains data structures classes are missing from JDK, such as: Tuple.
**util**: contains a selection of conveninent classes. For examples: for formatting protein related informations, for checking Internet availability or for verfiy email addresses.

Note: the library is still evolving, we are committed to expand this library and add more useful classes.

# Getting PRIDE Utilities

The zip file in the downloads section contains the PRIDE Utilities jar file and all other required libraries.

Maven Dependency
PRIDE Utilities library can be used in Maven projects, you can include the following snippets in your Maven pom file.

 <dependency>
   <groupId>uk.ac.ebi.pride.util</groupId>
   <artifactId>pride-utilities</artifactId>
   <version>0.0.8</version>
 </dependency> 
 <repository>
   <id>ebi-repo</id>
   <name>The EBI internal repository</name>
   <url>http://www.ebi.ac.uk/~maven/m2repo</url>
   <releases>
     <enabled>true</enabled>
   </releases>
   <snapshots>
     <enabled>false</enabled>
   </snapshots>
 </repository>
Note: you need to change the version number to the latest version.

For developers, the latest source code is available from our SVN repository.

top of page

Using PRIDE Utilities
Here we will show you how to use the PRIDE Utilitites library to calculate m/z delta and calculate theoretical mass of a given peptide.

Calculate m/z Delta
You can find the method for calculating m/z delta from MoleculeUtilitites in uk.ac.ebi.pride.mol package. It requires four input parameters:

sequence is the peptide sequence in String,
precursorMz is the precusor m/z in double,
precursorCharge is the precursor charge in double,
ptmMasses is a list of post translational modifications in double.
The following lines of code shows you how:

// Direct call on the method
Double mzDelta = MolecularUtilitites.calculateDeltaMz(sequence, precursorMz, precursorCharge, ptmMasses);
Calculate Theoretical Mass
You can also find the method for calculating theoretical mass value from MoleculeUtilitites. It needs two input parameters:

sequence is the peptide sequence in String,
masses is a optional list array of masses you want to add as extras.
The following lines of code shows you how:

// Direct call on the method
double result = MolecularUtilitites.calculateTheoreticalMass(sequence, masses);
Tip: Take a close look at other methods within MoleculeUtilitites, you might find them useful. top of page

API Reference
To come in the future

PRIDE Utilities library is currently used by three projects:

PRIDE Inspector
PRIDE mzGraph Browser
PRIDE Quality Chart
This library is written in Java, brought to you by the PRIDE team.


FAQs
To come in the future


Getting Help
If you have questions or need additional help, please contact the PRIDE Helpdesk at the EBI: pride-support at ebi.ac.uk (replace at with @).

Please send us your feedback, including error reports, improvement suggestions, new feature requests and any other things you might want to suggest to the PRIDE team.


Source Code
