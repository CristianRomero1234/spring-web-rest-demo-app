const apiUrl = 'http://localhost:8080/api/testtable';

// Create operation
function createEntry() {
    const name = document.getElementById('createName').value;
    fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({name})
    }).then(response => response.json())
            .then(data => {
                alert('Created: ' + JSON.stringify(data));
                document.getElementById('createName').value = ''; // Clear input
            })
            .catch(error => console.error('Error:', error));
}

// Read operation (Read All)
function readEntries() {
    fetch(apiUrl)
            .then(response => response.json())
            .then(data => {
                const list = document.getElementById('readList');
                list.innerHTML = ''; // Clear existing entries
                data.forEach(item => {
                    console.log(item);
                    const li = document.createElement('li');
                    li.textContent = `ID: ${item.idTestTable}, Name: ${item.name}`;
                    list.appendChild(li);
                });
            })
            .catch(error => console.error('Error:', error));
}

// Update operation
function updateEntry() {
    const id = document.getElementById('updateId').value;
    const name = document.getElementById('updateName').value;

    fetch(`${apiUrl}/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({name})
    }).then(response => response.json())
            .then(data => {
                alert('Updated: ' + JSON.stringify(data));
                document.getElementById('updateId').value = ''; // Clear input
                document.getElementById('updateName').value = ''; // Clear input
            }).catch(error => console.error('Error:', error));
}

// Delete operation
function deleteEntry() {
    const id = document.getElementById('deleteId').value;

    fetch(`${apiUrl}/${id}`, {
        method: 'DELETE'
    }).then(response => {
        if (response.ok) {
            alert(`Deleted entry with ID: ${id}`);
            document.getElementById('deleteId').value = ''; // Clear input
        } else {
            alert('Failed to delete');
        }
    }).catch(error => console.error('Error:', error));
}