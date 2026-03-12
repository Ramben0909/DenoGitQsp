const container = document.getElementById("main"); 
const listItems = document.getElementsByClassName("list-item");
let b = document.querySelector("#skills");
let tag = document.getElementsByTagName("li");
const header = document.getElementById("skills");
let c = document.querySelectorAll(".list-item");
let ul = document.querySelector("ul");



header.style.color = 'blue';
for(let i = 0; i < listItems.length; i++){
    listItems[i].style.fontWeight = 'bold';
}


let list1 = Array.from(listItems);
console.log("Is Array:", Array.isArray(list1)); 
list1.forEach(element => {
    console.log(element.textContent); 
});

console.log(tag);
listTag = Array.from(tag);
listTag.map((item) => {
    item.style.backgroundColor = 'lightgray';
});

console.log(b);
b.style.color = 'red'; 

console.log(c);
c.forEach((item) => {
    item.style.fontSize = '18px';
    console.log(item.textContent);
});

let li = document.createElement("li");
// li.innerText = `<h1>New Skill</h1>`;
// li.textContent = "New Skill";
li.innerHTML = "<strong>New Skill</strong>";
console.log(li);


ul.appendChild(li);
console.log(ul);


console.log(window.navigator.userAgent);
console.log(window.navigator.onLine);

let btn = document.createElement("button");
btn.innerText = "Click Me";
document.body.appendChild(btn);
btn.addEventListener("click", function() {
    alert("Button was clicked!");
});

console.log(location.href);
console.log(location.port);


let btn1 = document.getElementById("forward");
let btn2 = document.getElementById("backward");

btn1.addEventListener("click", function() {
    history.forward();
});

btn2.addEventListener("click", function() {
    history.back();
});

console.log(history.length);


