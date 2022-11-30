<!DOCTYPE html>
<html lang="en">
<head>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js" integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="index1.js"></script>
</head>
<body>
    <nav>
        <a href="/">Home</a> 
        <a href="/fetch.html">Fetch</a> 
        <a href="/jquery.html">JQuery</a>
    </nav>
    <form action="javascript:void(0;)" method="post">
        <input type="text" id="p_name" placeholder="person_name">
        <button type="button" id="myB" onclick="saveOrupdate()">save</button>
    </form>
    <button type="button" onclick="getItems()">Get</button>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th></th>
            <th></th>
        </tr>
        <tbody id="persons"></tbody>
    </table>
</body>
</html>