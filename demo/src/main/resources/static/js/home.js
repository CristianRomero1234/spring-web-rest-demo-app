const URL = 'http://localhost:8080/api/testtable';
function changeButton() {
    var button = document.getElementById("myButton");
    if (button.value == "You clicked!") {
        button.value = "Click it!";
    } else {
        button.value = "You clicked!";
    }
}
function createNewRecordInDataBase() {
    var name = document.getElementById("myInputForData");
    fetch(URL, {
        method: 'POST', // Specify the method
        headers: {
            'Content-Type': 'application/json' // Inform the server that you're sending JSON data
        },
        body: JSON.stringify({// Convert the JavaScript object to a JSON string
            name: name.value // Your body content (in this case, "name": "test")
        })
    }).then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok ' + response.statusText);
        }
        return response.json(); // Parse the JSON from the response
    }).then(data => {
        console.log('Success:', data); // Log success response
    }).catch((error) => {
        console.error('Error:', error); // Log any error in the process
    });

}