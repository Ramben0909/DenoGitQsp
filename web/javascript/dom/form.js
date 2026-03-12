// const h1 = document.querySelector("h1");
// const input = document.getElementById("Input");
// const inc = document.getElementById("inc");
// const dec = document.getElementById("dec");
// const reset = document.getElementById("reset");

// let counter = 0;
// function display(){
//     h1.innerText = input.value;
// }

// function increment(){
//     counter++;
//     h1.innerText  = counter;
// }

// function decrement(){
//     counter--;
//     h1.innerText  = counter;
// }

// function resetValue(){
//     counter = 0;
//     h1.innerText  = counter;
// }

// inc.addEventListener("click", increment);
// dec.addEventListener("click", decrement);
// reset.addEventListener("click", resetValue);

// const container = document.getElementById("container");
// const btn = document.getElementById("btn4");

// function clicker(){
//     let color = "#";
//     for(let i=0;i<6;i++){
//         color += parseInt(Math.random()*10);
//     }
//     container.style.backgroundColor = color;
// }

// btn.addEventListener("click", clicker);
// const h1 = document.querySelector("#h1");

// function digitalClock() {
//     let date = new Date(); 
//     let hours = date.getHours(); 
//     let minutes = date.getMinutes();
//     let seconds = date.getSeconds();

//     // Your formatting logic is perfect!
//     hours = hours < 10 ? "0" + hours : hours;
//     minutes = minutes < 10 ? "0" + minutes : minutes;
//     seconds = seconds < 10 ? "0" + seconds : seconds;

//     h1.innerText = hours + ":" + minutes + ":" + seconds;
// }

// // Initial call to show time immediately
// digitalClock(); 

// // Update every second
// setInterval(digitalClock, 1000);


let username = document.getElementById("username");
let phone = document.getElementById("phone");
let uerror = document.getElementById("user-error");
let perror = document.getElementById("phone-error");
let password = document.getElementById("password");
let paerror = document.getElementById("password-error");
let btn = document.getElementById("btn");

btn.addEventListener("click", (e) => {
    e.preventDefault(); 
    if (username.value === "" || username.value.length < 3) {
        uerror.style.display = "inline";
        uerror.innerText = "Invalid Username";
    } else {
        uerror.style.display = "none";
    }
    let phonePattern = /^\d{10}$/;
    if (phone.value === "" || !phonePattern.test(phone.value)) {
        perror.style.display = "inline";
        perror.innerText = "Invalid Phone Number";
    } else {
        perror.style.display = "none";
    }
    if (password.value === "" || password.value.length < 6) {
        paerror.style.display = "inline";
        paerror.innerText = "Invalid Password";
    } else {
        paerror.style.display = "none";
    }
});



