<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User Registration Form </title>
	<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7; IE=EmulateIE9">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" type="text/css" href="style.css" media="all" />
    <link rel="stylesheet" type="text/css" href="demo.css" media="all" />
</head>
<body>
<div class="container">
			<!-- freshdesignweb top bar -->
            <!--<div class="freshdesignweb-top">
                <a href="http://www.freshdesignweb.com" target="_blank">Home</a>
                <span class="right">
                    <a href="http://www.freshdesignweb.com/beautiful-registration-form-with-html5-and-css3.html">
                        <strong>Back to the freshdesignweb Article</strong>
                    </a>
                </span>
                <div class="clr"></div>
            </div>/ freshdesignweb top bar -->
			<header>
				<h1><span>HMS</span> User Registration Form </h1>
            </header>       
      <div  class="form">
    		
    		<form:form id="contactform" method="POST" action="registerUser.html">
    		<%-- <form id="contactform"> --%> 
 <!--    			<p class="contact"><label for="name">Name</label></p> 
    			<input id="name" name="name" placeholder="First and last name" required="" tabindex="1" type="text"> 
     			 
    			<p class="contact"><label for="email">Email</label></p> 
    			<input id="email" name="email" placeholder="example@domain.com" required="" type="email"> -->
                
                <p class="contact"><label for="username">Create a username</label></p> 
    			<input id="username" name="username" placeholder="username" required="" tabindex="2" type="text"> 
    			 
                <p class="contact"><label for="password">Create a password</label></p> 
    			<input type="password" id="password" name="password" required=""> 
        
        		<p class="contact"><label for="email">Primary Email</label></p> 
    			<input id="email" name="primaryEmail" placeholder="example@domain.com" required="" type="email"> 
              
              	<p class="contact"><label for="email">Secondary Email</label></p> 
    			<input id="email" name="secondaryEmail" placeholder="example@domain.com" required="" type="email"> 
              
        
               <!-- <fieldset>
                 <label>Birthday</label>
                  <label class="month"> 
                  <select class="select-style" name="BirthMonth">
                  <option value="">Month</option>
                  <option  value="01">January</option>
                  <option value="02">February</option>
                  <option value="03" >March</option>
                  <option value="04">April</option>
                  <option value="05">May</option>
                  <option value="06">June</option>
                  <option value="07">July</option>
                  <option value="08">August</option>
                  <option value="09">September</option>
                  <option value="10">October</option>
                  <option value="11">November</option>
                  <option value="12" >December</option>
                  </label>
                 </select>    
                <label>Day<input class="birthday" maxlength="2" name="BirthDay"  placeholder="Day" required=""></label>
                <label>Year <input class="birthyear" maxlength="4" name="BirthYear" placeholder="Year" required=""></label>
              </fieldset> -->
  
            <select class="select-style gender" name="groupId">
            <option value="">-Select-</option>
            <option value="1">Admin</option>
            <option value="2">Staff</option>
            <option value="3">Other</option>
            </select><br><br>
 
            <p class="contact"><label for="remarks">Remarks</label></p> 
    		<input id="remarks" name="remarks" placeholder="Remarks" required="" tabindex="2" type="text"> 
            
            <p class="contact"><label for="phone">Primary Mobile Number</label></p> 
            <input id="phone" name="primaryCell" placeholder="phone number" required="" type="text"> <br>
            
            <p class="contact"><label for="phone">Seconday Mobile Number</label></p> 
            <input id="phone" name="secondaryCell" placeholder="phone number" required="" type="text"> <br>
            
            <input class="buttom" name="submit" id="submit" tabindex="5" value="Sign me up!" type="submit"> 	 
   </form:form> 
</div>      
</div>

</body>
</html>
