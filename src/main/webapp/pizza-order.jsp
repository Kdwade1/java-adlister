<%--
  Created by IntelliJ IDEA.
  User: levengrim
  Date: 7/14/22
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Shop</title>
</head>
<body>

<form action="/pizza-order" method="post">
    <label for="size">Choose a size</label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br><br>
    <label for=" crust">What type of crust</label>
    <select name="crust" id=" crust">
        <option value="thin">Thin</option>
        <option value="regular">Regular</option>
        <option value="pan">Pan</option>
    </select>
    <br><br>
    <label for="sauce"></label>
    <select name="sauce" id="sauce">
    <option value="regular">Tomato</option>
    <option value="alfredo">Alfredo sauce</option>
    <option value="no">No Sauce</option>
    </select>
    <br><br>

    <input type="checkbox"id="pepperoni" value="pepperoni" name="topping">
    <label for="pepperoni" >Pepperoni</label>
    <input type="checkbox"id="chicken" value="chicken"name ="toppings">
    <label for="chicken">Chicken</label>
    <input type="checkbox"id="cheese" value="cheese" name="topps">
    <label for="cheese">Cheese</label>
    <br><br> <br>

    <input type="text" id="delivery" name="delivery">
    <label for="delivery">What is your address?</label>
    <button type="submit">Submit</button>

</form>
</body>
</html>
