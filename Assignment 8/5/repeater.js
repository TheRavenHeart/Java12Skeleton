document.addEventListener('DOMContentLoaded', ready);

function ready() {
    let input_one = document.getElementById("input_one");
    let input_two = document.getElementById("input_two");
    input_one.addEventListener("input", changeHandlerOne); // makes it so it does something when input is detected
    input_two.addEventListener("input", changeHandlerTwo)

    function changeHandlerOne(event) { // the event, when text is detetecd in the first textbox it changes its text box to match
        input_two.value = input_one.value;
    }
    function changeHandlerTwo(event) { // same as above but reversed
        input_one.value = input_two.value
    }
}