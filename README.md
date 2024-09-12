<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.
>FileName: mainscreen.html<br>
>LineNumber:14 Change: Title is changed to 'Trusted Electronics'.<br>
>LineNumber:19 Change: Heading changed to  'Trusted Electronics'.<br>
>LineNumber:21 Change: Heading 'Parts' changed to 'Replacement Parts'.<br>
>LineNumber:53 Change: Heading 'Products' changed to 'Electronics'.<br>

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
>about.html file in src/main/resources/templates/about.html <br>
> FileName: about.html<br>
> LineNumber:5 Change: Title changed to 'About Us'<br>
> LineNumber:7-16 Change: Created About Us description<br>
> LineNumber: 18 Change: Created a button to return to mainscreen<br>
> Controller for About.html created in src/main/java/com/example/demo/controllers/AboutController.java<br>
> FileName: AboutController<br>
> LineNumber: 1 - 14 Change: Created a controller for About.html<br>
> FileName: mainscreen.html<br>
> LineNumber:89 Change: button to about.tml created<br>

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.
>FileName: BootStrapData.java<br>
>LineNumber: 40-122 Change: Added initializers for 5 Parts, 3 Outsorced and 2 Inhouse.<br>
>LineNumber: 141-156 Change: Added initializers for 5 Products.<br>

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.
>FileName: AddProductController.java<br>
>LineNumber: 130-142 Change: Implemented controller for buy now service. Redirects to either confirmationbuyproduct.html or failiurebuyproduct.html<br>
>File confirmationbuyproduct.html and failiurebuyproduct.html created.<br>
>FileName: confirmationbuyproduct.html Change: Implemented page to indicate product is bought successfully.<br>
>FileName: failurebuyproduct.html Change: Implemented page to indicate product was not purchased.<br>


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
>FileName: Part.java <br>
>LineNumber: 37 Change: Created max inventory variable for all parts<br>
>LineNumber: 40 Change: Created min inventory variable for all parts<br>
>LineNumber: 60-67 Change: Created a constructor for Part including max and min inv as parameters.<br>
>LineNumber: 69-71 Change: Getter and Setter methods for max inventory<br>
>LineNumber: 73-75 Change:  Getter and Setter methods for min inventory<br>
>FileName: OutsourcedPart.java<br>
>LineNumber: 18-19 Change: Constructor sets value fo max and min inv for outsourced part.<br>
>FileName: InhousePart.java<br>
>LineNumber: 18-19 Change: Constructor sets value fo max and min inv for inHouse part.<br>
<br>
>FileName: BootStrapData.java<br>
>LineNumber: 47-48 Change: sets max and min value for part ID 1001L.<br>
>LineNumber: 66 Change: set max inv for part ID 1002L.<br>
>Note: Default min and max are already set to the rest of the parts.<br>
<br>
>FileName: InhousePartForm.html<br>
>LineNumber: 24-28 Change: Text Inputs for Max and Min inv<br>
>FileName: OutsourcedPart.java<br>
>LineNumber: 24-28 Change: Text Inputs for Max and Min inv<br>
<br>
>FileName: application.properties<br>
>LineNumber: 6 Change: persistent storage database name changed<br>
<br>
>FileName: Part.java<br>
>LineNumber: 31 Change: @Min and @Max validator tags used to enforce range.<br>
><br>
> ---REVISED---<br>
> FileName: README.md Change: Restructured documentation for part G.<br>
> FileName: mainscreen.html<br>
> LineNumber: 39-40, 52-53 Change: mainscreen now shows Max and Min inventory for parts.<br> 
> FileName: Part.java<br>
> LineNumber: 132-136 Change: Added a boolean method to validate inv is between max and min inventory.<br>
> FileName: AddInhousePartController.java<br>
> LineNumber: 42-46 Change: Enforced Inv range using binding result for Inhouse Part.<br>
> FileName: AddOutsourcedPartController.java<br>
> LineNumber: 46-50 Change: Enforced Inv range using binding result for Outsourced Part.<br>

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.
>New File created: ValidMinInv.java in src/main/java/com/example/demo/validators/ValidMinInv.java<br>
>FileName: ValidMinInv.java<br>
>Line Number: 1-15 Change: Implemented min inv annotation.<br>
>New File created: MinInvValidator.java<br>
>FileName: MinInvValidator.java<br>
>LineNumber:1-25 Change: Implemented validator for ValidMinInv.java<br>
>FileName: Part.java<br>
>LineNumber: 21 Change: added the constraint for inv less than minInv.<br>
>---REVISED---<br>
> FileName: EnufPartsValidator.java<br>
> LineNumber: 36-39 Change: Error message added using constraint-validator-context to show low inventory when adding and
> updating products lowers the part inventory below the minimum.<br>
> New File: ValidMaxInv.java<br>
> LineNumber: 1-16 Change: Implemented max inv annotation.<br>
> New File: MaxInvValidator.java<br>
> LineNumber: 1-25 Change: Implemented validator for ValidMaxInv.java<br>
> FileName: Part.java<br>
> LineNumber: 23 Change: added the constraint for inv more than maxInv.<br>

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
>FileName: PartTest.java<br>
>LineNumber: 86-102 Change: Added two unit test cases testing the max and min inventory.<br>

J.  Remove the class files for any unused validators in order to clean your code.
>File DeletePartValidator.java is removed.<br>