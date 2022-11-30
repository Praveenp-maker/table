var cars=[];
function myFunction() {
 var updateIndex=0;
console.log({a: 'foo', b: 'bar'});
console.info('Many messages, such logging, wow!');
console.warn('Warning, warning!');
console.error('Oh noes, y u do dis?');
document.getElementById("demo").innerHTML = "Paragraph changed.";
//xhttp.open("GET", "/http://localhost:8080/new");
//  xhttp.send();
}


function getAll() {
// alert();
const xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function () {
if (this.readyState == 4 && this.status == 200) {
let booklist = JSON.parse(this.responseText);
console.log(booklist);
displayItems(booklist);
}
};
xhttp.open("GET", "http://localhost:8080/new",true);
xhttp.send();
}



function loadDoc() {
const xhttp = new XMLHttpRequest();
xhttp.onload = function() {
document.getElementById("demo").innerHTML = this.responseText;
};
xhttp.open("GET", "http://localhost:8080/new", true);
xhttp.send();
}



function displayItems(data) {

  console.log("it is coming");
  const tBody = document.getElementById("goes");

  const button = document.createElement("button");

  data.forEach((item) => {
    // let editButton = button.cloneNode(false);
    // editButton.innerText = "Edit";
    // editButton.setAttribute("onclick", editItem(${item.id})');
    // editButton.setAttribute("onclick", "editItem(${item.id})");
  //  editButton.setAttribute("onclick", 'editItem(${item.id})');

  
let editButton = button.cloneNode(false);
editButton.innerText = "Edit";
 editButton.setAttribute("onclick", `editItem(${item.id})`);


 let deleteButton = button.cloneNode(false);
 deleteButton.innerText = "Delete";
  deleteButton.setAttribute("onclick", `deleteItem(${item.id})`);
    // let deleteButton = button.cloneNode(false);
    // deleteButton.innerText = "Delete";
    // deleteButton.setAttribute("onclick", 'deleteItem(${item.id})');

    let tr = tBody.insertRow();

    let td1 = tr.insertCell(0);
    let id = document.createTextNode(item.id);
    td1.appendChild(id);

    let td2 = tr.insertCell(1);
    let title = document.createTextNode(item.title);
    td2.appendChild(title);

    let td3 = tr.insertCell(2);
    let author= document.createTextNode(item.author);
    td3.appendChild(author);

    let td4 = tr.insertCell(3);
    let price= document.createTextNode(item.price);
    td4.appendChild(price);

    let td5 = tr.insertCell(4);
    td5.appendChild(editButton);

    let td6 = tr.insertCell(5);
    td6.appendChild(deleteButton);
   
  });

 
}


function save() {
  console.log("save()");
  var newitem = {
      id: 0,
     // title: document.getElementById("title").value,
      // var str1 = document.getElementById("year").value;
      title :document.getElementById("title").value,
      author:document.getElementById("author").value,
      price:document.getElementById("price").value
  };

  console.log(newitem);
  var xhttp = new XMLHttpRequest();
  xhttp.open("POST", "http://localhost:8080/new", true);
  xhttp.setRequestHeader("Content-Type", "application/json");
  xhttp.send(JSON.stringify(newitem));
}


function saveORupdateItem() {
 
  if (document.getElementById("myBtn").innerHTML == "Save") {
    addItem();
  } else {
    updateItem();
  }
}


function editItem(id) {
  console.log("edit came daa");
  document.getElementById("myBtn").innerHTML = "Update";

  const item = cars.find((item) => item.id === id);
  document.getElementById("title").value = item.title;
  document.getElementById("author").value = item.author;
  document.getElementById("price").value = item.price;
  updateIndex = id;

}

function updateItem() {
  console.log("update came");
  var updateitem = {
      id: updateIndex,
      title: document.getElementById("title").value,
      author: document.getElementById("author").value,
      price: document.getElementById("price").value
  };
  console.log(updateitem);
  var xhttp = new XMLHttpRequest();
  xhttp.open("PUT", "http://localhost:8080/new", true);
  xhttp.setRequestHeader("Content-type", "application/json");
  xhttp.send(JSON.stringify(updateitem));
  updateIndex=0;

}


function deleteItem(id) { 
  console.log("delete()");
  var deleteitem = {
      id: id,
      title: "",
      author: "",
      price: 0
  };
  console.log(deleteitem);
  var xhttp = new XMLHttpRequest();
  xhttp.open("DELETE", "http://localhost:8080/new", true);
  xhttp.setRequestHeader("Content-type", "application/json");
  xhttp.send(JSON.stringify(deleteitem));
  getAll();
}