
[[GEQNJ]][[jaxb-technology-overview]]

1.2.7 JAXB Technology Overview
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

The {TechnologyShortName} TCK {TechnologyVersion} test suite comprises six test
categories:

* Schema to Java mapping tests
* Java to schema mapping tests
* JAXB framework API tests
* Content tree tests
* XML-to-Java name convention tests
* XML validation tests

Schema Compiler Tests
+++++++++++++++++++++

The schema compiler tests verify the following:
1. The schema compiler finds errors in invalid schema.
2. The schema compiler successfully compiles valid schema and the signatures of
generated Java classes are appropriate.
3. The schema compiler appropriately compiles schema annotated with {TechnologyShortName}
custom binding declarations:
* Successfully compiles valid source schema with well-formed binding
declarations.
* Fails to compile valid source schema with non-well-formed binding
declarations.

JAXB Framework API Tests
+++++++++++++++++++++++

The JAXB framework API tests cover public classes and interfaces defined in the
`javax.xml.bind` package and sub-packages.

Content Tree Tests
++++++++++++++++++

The content tree tests test the classes generated by the {TechnologyShortName}
schema compiler, including:

1. Unmarshalling valid documents: the documents must be unmarshalled and
   validated correctly.
2. Marshalling documents: invokes marshalling for valid documents and checks
   that no errors are reported.
3. Content tree evaluating: check data in content tree after unmarshalling.
4. Content tree validating: modify data in content tree to make the
   tree invalid and, if the modification does not report an error, then
   enable {TechnologyShortName} {TechnologyVersion} validation on
   Marshaller, and verify that Marshaller reports the error.

XML-to-Java Name Conversion Tests
+++++++++++++++++++++++++++++++++

The XML-to-Java name conversion tests check that XML-to-Java name
conversion rules are implemented correctly and support most of the
Unicode characters that are allowed for XML names.

Schema Generator Tests
++++++++++++++++++++++

The schema generator tests verify that:

1. The schema generator supports all the Java Types to XML mapping.
2. The schema generator appropriately maps Java program elements to XML
Schema constructs.
3. The schema generator appropriately maps Java program elements that are
customized using mapping annotations and program annotations that are based
on JSR–175 program annotation facility:
+
* Successfully generates valid target schema from correctly annotated Java
program element.
* Fails to process annotated Java program elements that have constraint
violations as specified in the `Java Types to XML` section of the {TechnologyShortName}
{TechnologyVersion} specification and `javax.xml.bind.annotation` javadocs.
* The schema generator successfully produces a well-formed schema; all
documents expected to be valid against generated schema are valid and all
documents expected to be invalid against generated schema are invalid.

XML Validation Tests
++++++++++++++++++++

XML Validation tests are designed to check schema validation when a mechanisms
other than JAXP is used. Note that XML validation tests are mandatory when XML
validation is not performed via JAXP.