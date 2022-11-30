<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>AJAX CRUD using XHR</h1>
    <form action="javascript:void(0);" method="POST">
        <input type="text" id="customername" placeholder="customer name">
        <button type="submit" id="myBtn" onclick="saveORupdateItem()">Save</button>
    </form>

    <p id="counter"></p>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th></th>
            <th></th>
        </tr>
        <tbody id="customers"></tbody>
    </table>
    <script src="xhr.js" asp-append-version="true"></script>
    <script type="text/javascript">
        getItems();
    </script>
</body>
</html>